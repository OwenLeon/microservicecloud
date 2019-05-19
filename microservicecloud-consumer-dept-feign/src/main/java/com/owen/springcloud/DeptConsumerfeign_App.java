package com.owen.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.owen.springcloud"})
@ComponentScan("com.owen.springcloud")
public class DeptConsumerfeign_App
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptConsumerfeign_App.class, args);
	}
}
