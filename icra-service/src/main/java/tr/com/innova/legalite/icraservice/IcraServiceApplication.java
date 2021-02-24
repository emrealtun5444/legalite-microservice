package tr.com.innova.legalite.icraservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IcraServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcraServiceApplication.class, args);
	}

}
