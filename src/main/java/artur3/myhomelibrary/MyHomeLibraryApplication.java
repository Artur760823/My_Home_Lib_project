package artur3.myhomelibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyHomeLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHomeLibraryApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Hello Library";
	}
}
