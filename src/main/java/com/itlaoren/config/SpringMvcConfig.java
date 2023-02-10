package com.itlaoren.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.itlaoren.controller","com.itlaoren.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
