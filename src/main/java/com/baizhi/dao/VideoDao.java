package com.baizhi.dao;

import com.baizhi.entity.Video;

import java.util.List;

public interface VideoDao {

    List<Video>  queryAll();

    Video queryById(String id);

    String query();

}
