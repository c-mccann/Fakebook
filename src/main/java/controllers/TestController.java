package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by carlmccann2 on 17/07/2017.
 */

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
