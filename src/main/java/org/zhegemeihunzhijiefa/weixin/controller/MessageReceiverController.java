package org.zhegemeihunzhijiefa.weixin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//控制器：负责接受用户的请求参数，调用业务逻辑层代码，返回视图、结果给客户端（浏览器）
@RestController
@RequestMapping("/Jzp/weixin/receiver")
public class MessageReceiverController {
  @GetMapping
  public String echo(//
		  String singnature,
		  String timestamp,
		  String nonce,
		  String echostr
		  ){
	  return echostr;
  }
}
