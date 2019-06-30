package org.zhegemeihunzhijiefa.weixin.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




//控制器：负责接受用户的请求参数，调用业务逻辑层代码，返回视图、结果给客户端（浏览器）
@RestController
@RequestMapping("/weinxin/weixin/receiver")
public class MessageReceiverController {
	
	private static final Logger LOG = LoggerFactory.getLogger(MessageReceiverController.class);
  @GetMapping
  public String echo(//
		  @RequestParam("signature")String singnature,
		  @RequestParam("timestamp")String timestamp,
		  @RequestParam("nonce")String nonce,
		  @RequestParam("echostr")String echostr
		  ){
	  return echostr;
  }
  
  
  @PostMapping
  //@RequestBody注解表示把请求内容获取出来，并且转换为String传入给xml参数。
  public String onMessage(@RequestBody String xml) {
	  // 收到消息
	  LOG.trace("收到的消息原文：\n{}\n--------------------------",xml);
	  // 转换消息
	  // 把消息丢入队列
	  // 消费队列中的消息
	  // 产生客服消息
	  return "success";
  }
  
}
