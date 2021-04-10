package com.odd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {
    private int news_id;
    private String news_title;
    private String news_content;
    private String news_desc;
    private String news_type;
    private int is_deleted;
    private Date create_time;
    private Date update_time;
}
