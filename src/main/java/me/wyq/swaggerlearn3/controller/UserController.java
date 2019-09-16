package me.wyq.swaggerlearn3.controller;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author wangyuanqing1
 * 2019-09-16
 */
@RestController
public class UserController {
    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @GetMapping("list")
    public ApiResponse<List<User>> list(@RequestBody User user) {
        return ApiResponse.success(Lists.newArrayList());
    }
}
