package com.bookmark.api;

import org.springframework.boot.SpringApplication;

public class TestBookMarkApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookMarkApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
