package com.cooper.blog.ws.service;

import com.cooper.blog.ws.dto.ArticleDTO;

import java.util.List;

/**
 * Created by Cooper on 2017/4/2.
 */
public interface ArticleService {

    List<ArticleDTO> getAllArticle(String name);
}
