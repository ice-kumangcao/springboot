package com.ice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ice
 * @date 19-3-21
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ice.mapper")
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class);
    }
}
