package com.jju.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class MainAppServer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MainAppServer.class, args);
	}

}
