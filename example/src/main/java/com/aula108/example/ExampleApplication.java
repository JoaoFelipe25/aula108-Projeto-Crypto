package com.aula108.example;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleApplication {

	private static final Logger LOG = LoggerFactory.getLogger(ExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(CryptoRepository repo){
		return (args) -> {

			repo.save(new Cryptocurrency("Bitcoin","BTC"));
			repo.save(new Cryptocurrency("Ethereum","ETH"));
			repo.save(new Cryptocurrency("Ethereum Classic","ETC"));
			repo.save(new Cryptocurrency("Litcoin","LTC"));
			repo.save(new Cryptocurrency("Monero","XMR"));

			LOG.info("----------------------");
			LOG.info("Lista de criptomoedas");
			LOG.info("----------------------");

			for(Cryptocurrency crypto : repo.findAll()){

				LOG.info(crypto.toString());
			}

			Cryptocurrency crypto = repo.findById(2);
			LOG.info("----------------------");
			LOG.info("criptomoeda encontrada com ID 2");
			LOG.info("----------------------");
			LOG.info(crypto.toString());

			Cryptocurrency bitcoin = repo.findBySymbol("BTC");
			LOG.info("----------------------");
			LOG.info("criptomoeda encontrada com simbolo 'BTC' ");
			LOG.info("----------------------");
			LOG.info(bitcoin.toString());


		};
	}

}
