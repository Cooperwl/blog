package cn.cooper.blog.dao;

import cn.cooper.blog.entity.ExtendPage;

public interface ExtendPageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExtendPage record);

    int insertSelective(ExtendPage record);

    ExtendPage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExtendPage record);

    int updateByPrimaryKeyWithBLOBs(ExtendPage record);

    int updateByPrimaryKey(ExtendPage record);
}