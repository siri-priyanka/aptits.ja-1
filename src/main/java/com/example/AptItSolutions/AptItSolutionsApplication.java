// package com.example.AptItSolutions;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ComponentScan;

// @SpringBootApplication
// public class AptItSolutionsApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(AptItSolutionsApplication.class, args);

// 		System.out.println("HELLO APT IT SOLUTIONS");
package com.example; // Use the same package as your main application

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AptItSolutionsApplication.class); // Your main class name
    }
}
	
		
		
		
		
// 	}

// }
