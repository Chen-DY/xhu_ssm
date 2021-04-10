package com.odd.service;

import com.odd.mapper.NewsMapper;
import com.odd.pojo.News;
import com.odd.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper mapper;

    @Override
    public int addNews(News news) {
        return 0;
    }

    @Override
    public int updateNews(News news) {
        return 0;
    }

    @Override
    public int deleteBooksByID(int id) {
        return 0;
    }

    @Override
    public News findNewsByID(int id) {
        return null;
    }

    @Override
    public List<News> queryAllNews() {
        List<News> news = mapper.queryAllNews();
        System.out.println("服务层：find all");
        return news;
    }
}
