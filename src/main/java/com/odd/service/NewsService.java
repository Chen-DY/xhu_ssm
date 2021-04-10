package com.odd.service;

import com.odd.pojo.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsService {
    int addNews(News news);

    int updateNews(News news);

    int deleteBooksByID(@Param("new_id")int id);

    News findNewsByID(@Param("news_id")int id);

    List<News> queryAllNews();
}
