package com.wuhulala.spring.annotation;

import com.wuhulala.config.PropConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 组合注解
 * @ComponentScan 扫描包
 * @Configuration 配置类
 * @link @Import(PropConfig.class) 加载属性配置
 * Created by xueah20964 on 2017/4/24.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(PropConfig.class)
@ComponentScan
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true) //为了能够拿到当前线程的aop上下文
public @interface AoHuiAppAnnotation {
}
