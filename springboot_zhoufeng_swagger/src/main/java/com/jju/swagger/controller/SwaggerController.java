package com.jju.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(value = "/swagger", description = "Swagger测试接口")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {
	@RequestMapping("/index")
	public String index() {
		return null;
	}
}
