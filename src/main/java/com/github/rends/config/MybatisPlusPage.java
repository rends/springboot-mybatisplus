package com.github.rends.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 配置需要分页的地方
 */
@Configuration
public class MybatisPlusPage {
    //mybatis 分页
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return  new  PaginationInterceptor();
    }
}
