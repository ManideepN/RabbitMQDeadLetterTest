package com.example.demo.consumer;

import java.util.Date;
import java.util.Random;

import javax.naming.InsufficientResourcesException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.example.demo.constants.Constants;
import com.example.demo.message.PaymentOrder;

@Component
public class Consumer {

	@Autowired
	Constants Constants;

	@RabbitListener(queues = "Order.incoming.queue")
	public void process(@Payload PaymentOrder paymentOrder) throws InsufficientResourcesException {
	   System.out.println("Processing at \'"+new Date()+"\' payload \'"+paymentOrder+"\'");
		if (new Random().nextBoolean()) {
			throw new InsufficientResourcesException("insufficient funds on account " + paymentOrder.getFrom());
		}
	}

}