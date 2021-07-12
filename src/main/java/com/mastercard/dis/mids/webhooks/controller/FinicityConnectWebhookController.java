package com.mastercard.dis.mids.webhooks.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/webhook")
public class FinicityConnectWebhookController {

	@PostMapping(value = "/status/{customerId}", produces = "application/json")
	public Map<String, String> getConnectStatus(@RequestBody String payload, @PathVariable String customerId) {
		log.info("{}", payload);
		return Collections.singletonMap("status", "received");
	}

	@GetMapping("/message")
	public String message() {
		return "im alive!";
	}

}
