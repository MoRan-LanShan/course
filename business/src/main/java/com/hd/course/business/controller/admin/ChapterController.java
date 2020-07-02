package com.hd.course.business.controller.admin;

import com.hd.course.server.dto.ChapterDTO;
import com.hd.course.server.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {

    @Resource
    private ChapterService chapterService;

    @GetMapping( "/chapter")
    public List<ChapterDTO> chapter(){
        return chapterService.list();
    }
}
