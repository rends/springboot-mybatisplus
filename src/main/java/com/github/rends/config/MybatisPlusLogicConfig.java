package com.github.rends.config;


import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将逻辑删除让spring管理
 */
@Configuration
public class MybatisPlusLogicConfig {

    //逻辑主键
    @Bean
    public LogicSqlInjector logicSqlInjector(){
        return new LogicSqlInjector();
    }
}
