package javal.example.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import javal.example.io.JavaEdgeserviceZuulFilters;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class JavaEdgeserviceZuulApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(JavaEdgeserviceZuulApplication.class, args);
		
	}
	
	@Bean
	public JavaEdgeserviceZuulFilters simpleFilter() {
		
		return new JavaEdgeserviceZuulFilters();
		
	}
}
