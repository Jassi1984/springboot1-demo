package com.gemini1.springboot1demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com/gemini1/springboot1demo/controller","com/gemini1/springboot1demo/service", "com/gemini1/springboot1demo/repo", "com/gemini1/springboot1demo/model"})
public class Springboot1DemoApplication{

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(Springboot1DemoApplication.class, args);
		System.out.println("Hello World");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO demo1(Name, email, eId) VALUES (?, ?, ?)";
//
//		int result = jdbcTemplate.update(sql, "Jasvinder Singh", "singh.jasvinder1998@gmail.com", "614");
//		if (result > 0) {
//			System.out.println("A new row has been inserted.");
//		}
//	}
}
