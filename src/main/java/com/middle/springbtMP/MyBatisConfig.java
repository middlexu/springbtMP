package com.middle.springbtMP;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: middle
 * @Date: 2019/9/29 12:13
 * @Description:
 */
@Configuration
@MapperScan("com.middle.springbootMP.mapper")
public class MyBatisConfig {
    // 分页必须写下面这个
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();

    }
}
