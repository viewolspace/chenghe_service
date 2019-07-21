package com.chenghe.parttime.pojo;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.chenghe.parttime.pojo.PartTime;

public interface PartTimeDao {

    int insert(@Param("pojo") PartTime pojo);

    int insertList(@Param("pojos") List< PartTime> pojo);

    List<PartTime> select(@Param("pojo") PartTime pojo);

    int update(@Param("pojo") PartTime pojo);

}
