package eng.lab.eurekaclientb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2020/3/6 15:00
 * @Description:
 */
@Service
@FeignClient("eureka-client-a")
public interface TestService {

    @GetMapping("/show")
    public String show();
}
