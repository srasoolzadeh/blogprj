package my.project.blogprj.modules.DI_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by rasoolzadeh
 */
@Configuration
public class ConfigBean  {

    @Bean
    @Primary
    public A classABean1(){
        return new A("hello1!", 5);
    }

    @Bean(value = "bean2")
    public A classABean2(){
        return new A("hello2!", 5);
    }

    @Bean(value = "bean3")
    public A classABean3(){
        return new A("hello3!", 5);
    }

}
