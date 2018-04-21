package javis.app.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author JavisChen
 * @desc UserController
 * @date 2018/4/16 下午11:16
 */
@RestController
public class UserController {

    @GetMapping("users")
    public Object users() {
        return "hello world";
    }
}
