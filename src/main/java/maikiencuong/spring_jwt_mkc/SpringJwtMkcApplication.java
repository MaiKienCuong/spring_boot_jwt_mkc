package maikiencuong.spring_jwt_mkc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringJwtMkcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtMkcApplication.class, args);
    }

}
