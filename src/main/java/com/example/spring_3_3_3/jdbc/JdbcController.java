package com.example.spring_3_3_3.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/jdbc")
@RestController
public class JdbcController {

    private JdbcService jdbcService;

    public JdbcController(JdbcService jdbcService) {
        this.jdbcService = jdbcService;
    }

    @GetMapping("/select")
    public List<JdbcModel> select() {

        return jdbcService.select();
    }
}
