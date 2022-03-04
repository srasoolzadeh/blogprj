package my.project.blogprj.modules.DI_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by rasoolzadeh
 */
@Component
public class B {
    private A objA2;
    private A objA3;

    public B(){
        System.out.println("--> null Constructor : B");
    }

    @Autowired
    public B(@Qualifier("bean2") A objA2, @Qualifier("bean3") A objA3) {
        this.objA2 = objA2;
        this.objA3 = objA3;
        System.out.println("--> Constructor : B with A2.msg=" +objA2.getMessage()
        +" , A3.msg="+objA3.getMessage());
    }

    public void print(){
        System.out.println("B.print(): A2.msg= "+ objA2.getMessage()+" , A3.msg="+
                objA3.getMessage());
    }
}
