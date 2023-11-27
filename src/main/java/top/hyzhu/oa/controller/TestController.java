package top.hyzhu.oa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TestController
 * @Author zhy
 * @Date 2023/11/27 19:32
 */
@RestController  //表示这是一个REST风格的接口
@RequestMapping("/api")   //代表访问这个文件的所有接口都要加上api前缀
public class TestController {

    @GetMapping("/test") //表示这是一个git请求的接口
    public String test(){
        return "Hello Spring Boot";
    }

}
