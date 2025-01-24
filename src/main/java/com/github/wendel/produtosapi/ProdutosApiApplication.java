package com.github.wendel.produtosapi;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProdutosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
	}


	@Component
	public static class Runner implements ApplicationRunner{

		@Override
		public void run(ApplicationArguments args) throws Exception {
			System.out.println("A aplicação está rodando");
			System.out.println("teste");
		}
	}

}
