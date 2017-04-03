package cn.cooper.blog.dao;

import cn.cooper.blog.entity.ArticleTag;

public interface ArticleTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ArticleTag record);

    int insertSelective(ArticleTag record);

    ArticleTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ArticleTag record);

    int updateByPrimaryKeyWithBLOBs(ArticleTag record);

    int updateByPrimaryKey(ArticleTag record);
}