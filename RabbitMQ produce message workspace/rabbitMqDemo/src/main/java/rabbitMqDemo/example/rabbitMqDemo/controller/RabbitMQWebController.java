package rabbitMqDemo.example.rabbitMqDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rabbitMqDemo.example.rabbitMqDemo.service.RabbitMQService;


@RestController
@RequestMapping(value = "/rabbitmq")
public class RabbitMQWebController {
	
	
	@Autowired
	RabbitMQService rabbitMQService;
	
	@GetMapping(value = "/producer")
//	public String producer(@RequestParam("message") String message) {     
	public String producer( @RequestBody  String message) { 	
		rabbitMQService.send(message);

		return "Message sent to the RabbitMQ  Successfully";
	}
	
	
	
	

}
