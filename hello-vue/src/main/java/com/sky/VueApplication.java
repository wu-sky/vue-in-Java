package com.sky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan({"com.sky.dao", "com.sky.mapper"}) //mapperScan是必须要写的, 这个不仅仅归spring管, 还归mybatis管
@SpringBootApplication
public class VueApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueApplication.class, args);
	}

}
