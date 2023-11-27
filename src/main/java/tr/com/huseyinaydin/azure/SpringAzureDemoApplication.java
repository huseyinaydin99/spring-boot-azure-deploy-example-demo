package tr.com.huseyinaydin.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//بسم الله الرحمن الرحيم

/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Java, Spring Boot Azure Deployment.
 *
 */

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/mesaj")
	public String message(){
		return "Başarılı! Bu Spring Boot projesini başarı ile Azure ortamında deploy ettin!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}
}