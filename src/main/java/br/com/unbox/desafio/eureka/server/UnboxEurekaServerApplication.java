package br.com.unbox.desafio.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UnboxEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnboxEurekaServerApplication.class, args);
	}

}
