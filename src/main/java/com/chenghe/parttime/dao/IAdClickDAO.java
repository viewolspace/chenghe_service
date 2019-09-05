package com.chenghe.parttime.dao;

import com.chenghe.parttime.pojo.AdClick;

/**
 * describe:
 *
 * @date: 2019/07/20 17:10:17:10
 * @version: V1.0
 * @review:
 */
public interface IAdClickDAO {
    int addAdClick(AdClick adClick);

    AdClick getAdClick(int userId, int adId, int type);


}
