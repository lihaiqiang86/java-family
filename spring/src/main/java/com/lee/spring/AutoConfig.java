package com.lee.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.lee.spring"})
public class AutoConfig {

}
