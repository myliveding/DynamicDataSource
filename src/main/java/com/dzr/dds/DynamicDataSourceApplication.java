package com.dzr.dds;

import com.dzr.dds.config.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//注册动态多数据源
@Import({DynamicDataSourceRegister.class})
public class DynamicDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicDataSourceApplication.class, args);
	}
}
