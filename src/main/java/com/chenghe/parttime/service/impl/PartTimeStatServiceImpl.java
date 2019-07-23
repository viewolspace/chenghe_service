package com.chenghe.parttime.service.impl;

import com.chenghe.parttime.dao.IPartTimeStatDAO;
import com.chenghe.parttime.pojo.PartTimeStat;
import com.chenghe.parttime.query.PartTimeStatQuery;
import com.chenghe.parttime.service.IPartTimeStatService;
import com.youguu.core.util.PageHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * describe:
 *
 * @date: 2019/07/20 17:21:17:21
 * @version: V1.0
 * @review:
 */
@Service("partTimeStatService")
public class PartTimeStatServiceImpl implements IPartTimeStatService {

    private String statDate;

    @Resource
    private IPartTimeStatDAO partTimeStatDAO;

    @Override
    public int addPartTimeStat(PartTimeStat partTimeStat) {
        return partTimeStatDAO.addPartTimeStat(partTimeStat);
    }



    @Override
    public PartTimeStat findByPartTimeIdAndStatDate(int partTimeId, String statDate) {
        return partTimeStatDAO.findByPartTimeIdAndStatDate(partTimeId, statDate);
    }

    @Override
    public PageHolder<PartTimeStat> queryPartTimeStat(PartTimeStatQuery query) {
        return partTimeStatDAO.queryPartTimeStat(query);
    }



    private void dateDecide(int partTimeId) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = sdf.format(new Date());
        if(statDate==null || !nowDate.equals(statDate)){
            synchronized (this){
                if(statDate==null || !nowDate.equals(statDate)){
                    PartTimeStat partTimeStat =  partTimeStatDAO.findByPartTimeIdAndStatDate(partTimeId, nowDate);
                    if(partTimeStat==null){
                        //新建
                        partTimeStat = new PartTimeStat();
                        partTimeStat.setBrowseNum(0);
                        partTimeStat.setCopyNum(0);
                        partTimeStat.setJoinNum(0);
                        partTimeStat.setPartTimeId(partTimeId);
                        partTimeStat.setStatDate(sdf.parse(nowDate));
                        partTimeStatDAO.addPartTimeStat(partTimeStat);
                    }
                    statDate = nowDate;
                }

            }
        }
    }

    @Override
    public int updateBrowseNum(int partTimeId, int num) {
        try{
            this.dateDecide(partTimeId);
            return partTimeStatDAO.updateBrowseNum(partTimeId, statDate, num);
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int updateCopyNum(int partTimeId, int num) {
        try{
            this.dateDecide(partTimeId);
            return partTimeStatDAO.updateCopyNum(partTimeId, statDate, num);
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int updateJoinNum(int partTimeId,  int num) {
        try{
            this.dateDecide(partTimeId);
            return partTimeStatDAO.updateJoinNum(partTimeId, statDate, num);
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }
}
