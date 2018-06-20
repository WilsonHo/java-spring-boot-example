package com.bao.ho.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

/**
 * Created on 6/20/18.
 */
@EnableWebMvc
@Configuration
@ComponentScan
public class MvcConfig implements WebMvcConfigurer {

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.freeMarker();
////        registry.jsp("/WEB-INF/views/", ".jsp");
//    }
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        //this will map uri to jsp view directly without a controller
//        registry.addViewController("/")
//                .setViewName("index");
//    }



//    @Bean
//    public FreeMarkerConfigurer freemarkerConfig() {
//
//        FreeMarkerConfigurer conf = new FreeMarkerConfigurer();
//        conf.setConfiguration();
//        conf.setTemplateLoaderPath("classpath:/mytemplates/");
//        conf.setDefaultEncoding("UTF-8");
//        return conf;
//    }
//
//    @Bean
//    public FreeMarkerViewResolver freemarkerViewResolver() {
//        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
//        resolver.setCache(false);
//        resolver.setSuffix(".ftl");
//
//        return resolver;
//    }
}
