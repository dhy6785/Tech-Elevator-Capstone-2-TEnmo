package com.techelevator.tenmo.services;

import java.math.BigDecimal;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.techelevator.tenmo.models.Transfer;

public class AccountService {
	
	private String BASE_URL;
	private RestTemplate restTemplate = new RestTemplate();
	
	public AccountService(String baseUrl) {
		this.BASE_URL = baseUrl + "account/";
	}

	public BigDecimal getBalance(String authToken) {
		HttpEntity<?> entity = new HttpEntity<>(auth(authToken));
		ResponseEntity<BigDecimal> response = restTemplate.exchange(BASE_URL + "balance", HttpMethod.GET, entity, BigDecimal.class);
		return response.getBody();
	}
	
	public Transfer[] getAllTransfers(String authToken) {
		HttpEntity<?> entity = new HttpEntity<>(auth(authToken));
		ResponseEntity<Transfer[]> response = restTemplate.exchange(BASE_URL + "transfers",  HttpMethod.GET, entity, Transfer[].class);
		return response.getBody();
	}
	
	private HttpHeaders auth(String authToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.setBearerAuth(authToken);
		return headers;
	}
	
	
	
}
