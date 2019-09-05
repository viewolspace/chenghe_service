package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IAdClickDAO;
import com.chenghe.parttime.dao.IAdDAO;
import com.chenghe.parttime.dao.IAdStatDAO;
import com.chenghe.parttime.pojo.Ad;
import com.chenghe.parttime.pojo.AdClick;
import com.chenghe.parttime.pojo.AdStat;
import com.chenghe.parttime.query.AdStatQuery;
import com.chenghe.parttime.service.IAdStatService;
import com.chenghe.parttime.util.LruCache;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lenovo on 2019/9/5.
 */
@Service("adStatService")
public class AdStatServiceImpl implements IAdStatService{

    private LruCache<Integer,String> lruCache = new LruCache<Integer,String>(1000);

    @Resource
    private IAdStatDAO adStatDAO;

    @Resource
    private IAdDAO adDAO;

    @Resource
    private IAdClickDAO adClickDAO;

    @Override
    public int addAdStat(AdStat adStat) {
        return adStatDAO.addAdStat(adStat);
    }

    @Override
    public AdStat findByAdIdAndStatDate(int adId, String statDate) {
        return adStatDAO.findByAdIdAndStatDate(adId, statDate);
    }

    @Override
    public PageHolder<AdStat> queryPartTimeStat(AdStatQuery query) {
        return adStatDAO.queryAdStat(query);
    }

    @Override
    public int userClick(int userId, int adId) {
        int userNum = 0;
        if(userId > 0){
            AdClick adClick = adClickDAO.getAdClick(userId, adId, 1);
            if(adClick==null){
                adClick = new AdClick();
                adClick.setAdId(adId);
                adClick.setType(1);
                adClick.setUserId(userId);
                int result = adClickDAO.addAdClick(adClick);
                if(result>0){
                    userNum = 1;
                }
            }
        }
        return this.updateBrowseNum(adId,1,userNum);
    }

    @Override
    public int updateBrowseNum(int adId, int num, int userNum) {
        try{
            this.dateDecide(adId);
            return adStatDAO.updateBrowseNum(adId, lruCache.get(adId), num,userNum);
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }


    private void dateDecide(int adId) throws Exception{
        String statDate = lruCache.get(adId);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = sdf.format(new Date());
        if(statDate==null || !nowDate.equals(statDate)){
            synchronized (this){
                statDate = lruCache.get(adId);
                if(statDate==null || !nowDate.equals(statDate)){
                    AdStat adStat =  adStatDAO.findByAdIdAndStatDate(adId, nowDate);
                    if(adStat==null){
                        Ad ad = adDAO.getAd(adId);
                        if(ad!=null){
                            //新建
                            adStat = new AdStat();
                            adStat.setTitle(ad.getTitle());
                            adStat.setCompanyId(ad.getCompanyId());
                            adStat.setBrowseNum(0);
                            adStat.setCopyNum(0);
                            adStat.setJoinNum(0);
                            adStat.setBrowseUserNum(0);
                            adStat.setAdId(adId);
                            adStat.setStatDate(sdf.parse(nowDate));
                            adStatDAO.addAdStat(adStat);
                        }

                    }
                    lruCache.put(adId,nowDate);
                }

            }
        }
    }
}
