package sg.edu.nus.iss.day12_workshop;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day12WorkshopApplication {

	public static void main(String[] args) {

		// SpringApplication app = new SpringApplication(Day12WorkshopApplication.class);
		// String port = "8080";
		// ApplicationArguments cliOpts= new DefaultApplicationArguments(args);
		// if (cliOpts.containsOption("port")){
		// 	port = cliOpts.getOptionValues("port").get(0);
		// }
		
		// app.setDefaultProperties(Collections.singletonMap("server.port", port));
		// System.out.printf("Application started on port %d\n", port);
		// app.run(args);


		SpringApplication.run(Day12WorkshopApplication.class, args);
	}

}
