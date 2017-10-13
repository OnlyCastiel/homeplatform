package com.maofengqiang.mapper;

import com.maofengqiang.domain.DecCase;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DecCaseMapper {

    int deleteByPrimaryKey(String id);

    int insert(DecCase record);

    int insertSelective(DecCase record);


    DecCase selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(@Param("record") DecCase record);

    int updateByPrimaryKey(DecCase record);
}