package rabbitMqConcumer.example.rabbitMqConcumer.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements MessageListener {
	
	
	@Override
	public void onMessage(Message message) {
		System.out.println("New Consuming Message - " + new String(message.getBody()));
	}

	

}
