package com.kfit.controller;

import com.kfit.socket.MyWebSocket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.Session;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String, Session> list() {

        return MyWebSocket.map;
    }

}
