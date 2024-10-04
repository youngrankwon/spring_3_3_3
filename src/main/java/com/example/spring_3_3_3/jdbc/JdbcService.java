package com.example.spring_3_3_3.jdbc;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JdbcService {

    private JdbcRepository jdbcRepository;

    public JdbcService(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    List<JdbcModel> select() {
        return jdbcRepository.select();
    }
}
