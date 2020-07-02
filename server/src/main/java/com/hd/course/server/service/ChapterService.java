package com.hd.course.server.service;

import com.hd.course.server.domain.Chapter;
import com.hd.course.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<Chapter> list(){
        return chapterMapper.selectByExample(null);
    }
}
