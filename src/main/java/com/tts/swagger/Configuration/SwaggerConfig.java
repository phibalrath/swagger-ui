package com.tts.swagger.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.DocExpansion;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()                                  
		        .apis(RequestHandlerSelectors.any())  
		        //.apis(RequestHandlerSelectors.basePackage("com.tts.swagger.Models")) 
		        .paths(PathSelectors.any())                          
		        .build()
				.apiInfo(buildApiInfo());
	}
	
	@Bean
	UiConfiguration buildUiConfig() {
	    return UiConfigurationBuilder.builder() 
	        .docExpansion(DocExpansion.FULL)
	        .build();
	}
	
	private ApiInfo buildApiInfo() {
		return new ApiInfoBuilder()
				.title("Menu Items API")
		        .description("REST API for interacting with menu items")
		        .version("1.0.0")
		        .contact(new Contact("Developer Name", "website.com", "developer@website.com"))
		        .license("Apache License Version 2.0")
		        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
		        .build();	
	}
	
	
	
	
	
	
}
