package emmanuel.dev.runners;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import emmanuel.dev.runners.run.Location;
import emmanuel.dev.runners.run.Run;

@SpringBootApplication
public class RunnersApplication {
	private static final Logger log = LoggerFactory.getLogger(RunnersApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
		log.info("Application starter");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "Run 1", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 100,
					Location.OUTDOOR);
			log.info(run.toString());

		};
	}

}
