package com.codepresso.team2app.mapper;

import com.codepresso.team2app.vo.HashTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HashTagMapper {
    Integer saveHashTag(@Param("HashTag")HashTag hashTag);
    List<HashTag> findHashTag();
}
