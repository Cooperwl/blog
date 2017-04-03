package cn.cooper.blog.dao;

import cn.cooper.blog.entity.RelArticleTag;

public interface RelArticleTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RelArticleTag record);

    int insertSelective(RelArticleTag record);

    RelArticleTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RelArticleTag record);

    int updateByPrimaryKey(RelArticleTag record);
}