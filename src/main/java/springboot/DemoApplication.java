package springboot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 公司
 * 文件名 DemoApplication
 * 作者 Excellenthabit
 * 日期 2019/9/24 20:31
 */

//@RestController
@SpringBootApplication
@MapperScan(basePackages = "com.bj58.springboot.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //    @RequestMapping("/")
//    String index() {
//        return "hello spring boot";
//    }
}
