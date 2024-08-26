package riwi.bezos.virtual_book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class VirtualBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualBookApplication.class, args);
	}

}
