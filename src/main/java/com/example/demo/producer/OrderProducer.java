package com.example.demo.producer;

import java.math.BigDecimal;
import java.util.Random;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.Constants;
import com.example.demo.message.PaymentOrder;

@Component
@RestController
@RequestMapping(value="/producer")
public class OrderProducer {
	
	@Autowired
	Constants Constants;
	
	private AmqpTemplate amqpTemplate;

    public OrderProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    //@Scheduled(fixedDelay = 2000L)
    @GetMapping(value="/send")
    public void send() {
    	System.out.println("*** Order sending..");

        PaymentOrder paymentOrder = new PaymentOrder(
                String.valueOf(Math.random()),
                String.valueOf(Math.random()),
                new BigDecimal(1D + new Random().nextDouble() * 100D).setScale(2, BigDecimal.ROUND_FLOOR));

        amqpTemplate.convertAndSend(Constants.EXCHANGE_NAME, Constants.ROUTING_KEY_NAME, paymentOrder);
    }
}
