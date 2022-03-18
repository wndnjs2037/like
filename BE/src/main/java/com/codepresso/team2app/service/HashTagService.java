package com.codepresso.team2app.service;

import com.codepresso.team2app.mapper.HashTagMapper;
import com.codepresso.team2app.vo.HashTag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HashTagService {
    private HashTagMapper hashTagMapper;

    public List<HashTag> getAllHashTag() {
       return hashTagMapper.findHashTag();
    }
}
