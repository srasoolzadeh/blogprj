package my.project.blogprj.modules.DI_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rasoolzadeh
 */
@RestController
public class MainController {

    private B objB;

    @Autowired
    public MainController(B objectB) {
        this.objB = objectB;
        System.out.print("--> Constructor : M.C. with B.print(): ");
        //objB.print();
    }

    @RequestMapping("/")
    public String reply(){
        objB.print();
        return("");
    }
}
