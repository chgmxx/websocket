package com.lumacong.websocket.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lumacong.websocket.server.WebSocketServer;

@Controller
@RequestMapping("/index")
public class IndexController {
	static Log log = LogFactory.getLog(WebSocketServer.class);

	@RequestMapping("/Echars")
	public String index() {
		return "Echars";
	}

	@RequestMapping("/websocketEcharts")
	public String websocketEcharts() {
		return "websocketEcharts";
	}

}