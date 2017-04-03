package cn.cooper.blog.dao;

import cn.cooper.blog.entity.ArticleCategory;

public interface ArticleCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    ArticleCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKeyWithBLOBs(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);
}