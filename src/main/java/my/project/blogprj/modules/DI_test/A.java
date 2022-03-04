package my.project.blogprj.modules.DI_test;

import org.springframework.stereotype.Component;

/**
 * Created by rasoolzadeh
 */
@Component
public class A {
    private String message;
    private int size;

    public A() {
        System.out.println("--> null Constructor : A");// with message=hello!");
        //message = "hello!";
    }

    public A(String message, int size) {
        System.out.println("--> Constructor : A:"+message);
        this.message = message;
        this.size = size;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void print(){
        System.out.println("message = "+message+" , size= "+size);
    }
}
