package com.hd.course.server.service;

import com.hd.course.server.domain.Chapter;
import com.hd.course.server.domain.ChapterExample;
import com.hd.course.server.dto.ChapterDTO;
import com.hd.course.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    private ChapterMapper chapterMapper;

    public List<ChapterDTO> list(){
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapterList = chapterMapper.selectByExample(chapterExample);
        List<ChapterDTO> chapterDTOList = new ArrayList<>();
        for (int i = 0,l=chapterList.size(); i < l; i++) {
            Chapter chapter = chapterList.get(i);
            ChapterDTO chapterDTO = new ChapterDTO();
            BeanUtils.copyProperties(chapter,chapterDTO);
            chapterDTOList.add(chapterDTO);
        }
        return chapterDTOList;
    }
}
