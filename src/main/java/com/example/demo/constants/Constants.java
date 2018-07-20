package com.example.demo.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constants {

	@Value("${exchange.EXCHANGE_NAME}")
	public String EXCHANGE_NAME;

	@Value("${routing.ROUTING_KEY_NAME}")
	public String ROUTING_KEY_NAME;

	@Value("${queue.INCOMING_QUEUE_NAME}")
	public String INCOMING_QUEUE_NAME;

	@Value("${deadletter.DEAD_LETTER_QUEUE_NAME}")
	public String DEAD_LETTER_QUEUE_NAME;

	public String getEXCHANGE_NAME() {
		return EXCHANGE_NAME;
	}

	public String getROUTING_KEY_NAME() {
		return ROUTING_KEY_NAME;
	}

	public String getINCOMING_QUEUE_NAME() {
		return INCOMING_QUEUE_NAME;
	}

	public String getDEAD_LETTER_QUEUE_NAME() {
		return DEAD_LETTER_QUEUE_NAME;
	}

	@Override
	public String toString() {
		return "Constants [EXCHANGE_NAME=" + EXCHANGE_NAME + ", ROUTING_KEY_NAME=" + ROUTING_KEY_NAME
				+ ", INCOMING_QUEUE_NAME=" + INCOMING_QUEUE_NAME + ", DEAD_LETTER_QUEUE_NAME=" + DEAD_LETTER_QUEUE_NAME
				+ "]";
	}

}
