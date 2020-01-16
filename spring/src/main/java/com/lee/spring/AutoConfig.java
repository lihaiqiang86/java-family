package com.lee.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lihaiqiang
 * @since 2020/1/14
 */
@Configuration
@ComponentScan(basePackages = {"com.lee.spring.service"})
public class AutoConfig {

}
