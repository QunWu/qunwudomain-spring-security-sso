package qunwudomain.spring.security.sso.sso_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    @GetMapping("/user")
	public Authentication user(Authentication user) {
		return user;
	}
}
