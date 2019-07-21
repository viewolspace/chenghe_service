package com.chenghe.parttime.pojo;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.chenghe.parttime.pojo.PartTime;
import com.chenghe.parttime.pojo.PartTimeDao;

@Service
public class PartTimeService {

    @Resource
    private PartTimeDao partTimeDao;

    public int insert(PartTime pojo){
        return partTimeDao.insert(pojo);
    }

    public int insertList(List< PartTime> pojos){
        return partTimeDao.insertList(pojos);
    }

    public List<PartTime> select(PartTime pojo){
        return partTimeDao.select(pojo);
    }

    public int update(PartTime pojo){
        return partTimeDao.update(pojo);
    }

}
