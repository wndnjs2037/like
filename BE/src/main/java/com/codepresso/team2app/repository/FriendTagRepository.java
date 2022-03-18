package com.codepresso.team2app.repository;

import com.codepresso.team2app.vo.FriendTag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FriendTagRepository {
    Integer saveFriendTag(@Param("FriendTag")FriendTag friendTag);
}
