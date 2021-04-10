package com.odd.mapper;

import com.odd.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {
    int addNews(News news);

    int updateNews(News news);

    int deleteBooksByID(@Param("new_id")int id);

    News findNewsByID(@Param("news_id")int id);

    List<News> queryAllNews();
}
