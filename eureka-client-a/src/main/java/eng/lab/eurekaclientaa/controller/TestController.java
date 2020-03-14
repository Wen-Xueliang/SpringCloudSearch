package eng.lab.eurekaclientaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/3/5 22:12
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("/print")
    public void print() {
        System.out.println("This is A system!");
    }

    @GetMapping("/show")
    public String show() {
        return "This is A system!";
    }
}
