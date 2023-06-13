package com.sist.haebollangce.user.controller;

import org.springframework.stereotype.Controller;
import com.sist.haebollangce.config.token.CookieUtil;
import com.sist.haebollangce.config.token.JwtTokenizer;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserEntryPointViewController {

    private final JwtTokenizer jwtTokenizer;

    @GetMapping("/login")
    public String formLogin() {
        return "/userEntryPoint/login";
    }

    @GetMapping("/signup")
    public String formSignup1() {
        return "/userEntryPoint/signup";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    @GetMapping("/tiles-test")
    public String tiles(HttpServletRequest request) {

        String accessToken = CookieUtil.getToken(request,"accessToken");
        if(accessToken != null) {
            System.out.println(jwtTokenizer.getUseridFromToken(accessToken));
        }
        return "tiles_test_1.tiles1";
    }

}
