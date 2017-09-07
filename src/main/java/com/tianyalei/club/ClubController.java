package com.tianyalei.club;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubController {

    @RequestMapping("club")
    public String index() {
        return "hello，我来自Club客户端";
    }
}
