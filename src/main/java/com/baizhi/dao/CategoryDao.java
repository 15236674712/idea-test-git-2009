package com.baizhi.dao;

import com.baizhi.entity.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> queryAll();

    Category queryById(String id);

    Integer query();

    void delete();
}
