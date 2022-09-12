package com.xiaozheng.crud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author 郑元龙
 * @description: 解决static下的静态资源，找不到的问题
 * @date 2022年09月12日 11:53
 */

@Configuration
public class WebResoucesConfig extends WebMvcConfigurationSupport
{

    @Override
    protected void addResourceHandlers(
            ResourceHandlerRegistry registry
    ) {
        registry.addResourceHandler("/static/**").
                addResourceLocations("classpath:/static/");
    }
}