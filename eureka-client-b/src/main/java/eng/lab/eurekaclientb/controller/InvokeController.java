package eng.lab.eurekaclientb.controller;

import eng.lab.eurekaclientb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/3/6 15:03
 * @Description:
 */
@RestController
public class InvokeController {

    @Autowired
    private TestService testService;

    @GetMapping("/invoke")
    public String invoke() {
        return testService.show();
    }
}
