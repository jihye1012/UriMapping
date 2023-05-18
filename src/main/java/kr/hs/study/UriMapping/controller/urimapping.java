package kr.hs.study.UriMapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class urimapping {
    @GetMapping("/test3")
    public String index3() {
        return "sub/test3";
    }
    @GetMapping("/test4")
    public String index4() {
        return "sub/test4";
    }
    @GetMapping("/test5")
    public String index5() {
        return "sub/test5";
    }
}