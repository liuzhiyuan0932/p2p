import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.p2p.controller"})
@MapperScan("com.p2p.mapper")
public class P2PFrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(P2PFrontApplication.class, args);
    }
}
