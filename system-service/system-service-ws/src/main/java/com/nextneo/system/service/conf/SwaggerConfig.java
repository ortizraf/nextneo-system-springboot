package com.nextneo.system.service.conf;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
* @author  Rafael M Ortiz
*/
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	/**
	 * Swagger config
	 * @return
	 */
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()       
          .apis(RequestHandlerSelectors.basePackage("com.nextneo.system.service.ws"))            
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiInfo());
    }
	
	private ApiInfo apiInfo() {
	    return new ApiInfo(
	      "System Service API", 
	      "Some custom description of API.", 
	      "0.0.1", 
	      "https://github.com/ortizraf", 
	      new Contact("Rafael Ortiz", "https://github.com/ortizraf", "name@company.com"), 
	      "License of API", "API license URL", Collections.emptyList());
	}

}
