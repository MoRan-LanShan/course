package com.hd.course.business.controller;

import com.hd.course.server.domain.Chapter;
import com.hd.course.server.domain.ChapterExample;
import com.hd.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @GetMapping(value = "/chapter")
    public List<Chapter> chapter(){
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("1");
        chapterExample.setOrderByClause("id desc");
        return chapterService.list();
    }
}
