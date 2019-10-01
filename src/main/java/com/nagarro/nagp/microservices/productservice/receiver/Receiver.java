package com.nagarro.nagp.microservices.productservice.receiver;

import org.springframework.stereotype.Component;

@Component
public class Receiver {

	public void receiveMessage(String message) {
		System.out.println("Received <" + message + ">");
		doSomething();
	}

	private void doSomething() {

	}

}
