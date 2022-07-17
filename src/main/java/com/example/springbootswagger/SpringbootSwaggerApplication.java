package com.example.springbootswagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
	title = "Hello API", 
	version = "3.0", 
	description = "Hello Information",
	extensions = @Extension(name = "x-logo", 
				properties = {@ExtensionProperty(name = "url", value="https://img.icons8.com/fluency/48/000000/docker.png"),
								@ExtensionProperty(name = "backgroundColor", value="#FFFFFF"),
								@ExtensionProperty(name = "altText", value="Example logo")
							}
			)))
public class SpringbootSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwaggerApplication.class, args);
	}

}
