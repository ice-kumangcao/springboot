package com.ice.common.config;

import com.ice.common.interceptor.TestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ice
 * @date 19-3-21
 */
@Configuration
public class MybatisConfig {

    @Bean
    public TestInterceptor testInterceptor() {
        return new TestInterceptor();
    }
}
