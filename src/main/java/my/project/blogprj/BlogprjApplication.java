package my.project.blogprj;

import my.project.blogprj.modules.DI_test.A;
import my.project.blogprj.modules.DI_test.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogprjApplication {

    public static void main(String[] args) {

        SpringApplication.run(BlogprjApplication.class, args);
        System.out.println("start...");


        //B B1 = new B();
        //B1.print();
    }

}
