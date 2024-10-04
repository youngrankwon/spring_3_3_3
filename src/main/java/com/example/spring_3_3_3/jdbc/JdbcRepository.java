package com.example.spring_3_3_3.jdbc;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JdbcRepository {
    List<JdbcModel> select();
}
