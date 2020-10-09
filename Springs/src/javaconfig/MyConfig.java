package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
