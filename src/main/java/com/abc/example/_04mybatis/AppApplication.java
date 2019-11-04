package com.abc.example._04mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.abc.example._04mybatis.mapper")//具体到mapper包下，否则扩大扫描路径会给service和controller生成代理对象，service就有2个实现类
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
