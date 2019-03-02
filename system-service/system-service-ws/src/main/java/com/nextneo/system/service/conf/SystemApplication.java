package com.nextneo.system.service.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
* @author  Rafael M Ortiz
*/
@SpringBootApplication
@ComponentScan(basePackages={"com.nextneo.system.service.*"})
@EntityScan("com.nextneo.system.framework.models.*")
@EnableJpaRepositories("com.nextneo.system.service.*")
@Controller
public class SystemApplication {
	
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "System";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}
	
	/**
	 * Conf RestTemplate
	 * @return
	 */
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
