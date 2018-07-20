package com.example.demo.message;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentOrder {

	String from;
	String to;
	BigDecimal amount;

	@JsonCreator
	public PaymentOrder(@JsonProperty("from") String from, @JsonProperty("to") String to,
			@JsonProperty("amount") BigDecimal amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PaymentOrder [from=" + from + ", to=" + to + ", amount=" + amount + "]";
	}

}
