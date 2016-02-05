package me.calebking.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by caleb.king on 2/5/16.
 */
@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }
}
