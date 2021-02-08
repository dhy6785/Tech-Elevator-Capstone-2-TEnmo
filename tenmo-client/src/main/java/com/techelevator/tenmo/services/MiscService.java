package com.techelevator.tenmo.services;

import java.math.BigDecimal;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.techelevator.tenmo.models.Account;
import com.techelevator.tenmo.models.Transfer;
import com.techelevator.tenmo.models.User;

//public class MiscService {
//	
//	public static String AUTH_TOKEN = "";
//	private String BASE_URL;
//	private RestTemplate restTemplate = new RestTemplate();
//	
//	public MiscService(String url) {
//		this.BASE_URL = url;
//	}
//
//	public BigDecimal getBalance(int userId) {
//		return restTemplate.exchange(BASE_URL + "user/" + userId + "/account", HttpMethod.GET, makeAuthEntity(), BigDecimal.class).getBody();
//	}
//	
//	public User[] getAllUsers() {
//		User[] users = null;
//		users = restTemplate.exchange(BASE_URL + "user", HttpMethod.GET, makeAuthEntity(), User[].class).getBody();
//		return users;
//	}
//	
//	public Transfer[] getAllTransfers(int userId) {
//		Transfer[] transfers = null;
//		transfers = restTemplate.exchange(BASE_URL + "user/" + userId + "/transfers",  HttpMethod.GET, makeAuthEntity(), Transfer[].class).getBody();
//		return transfers;
//	}
//	
//	public void updateBalance(BigDecimal balance, int userId) {
//		Account account = new Account();
//		account.setBalance(balance);
//		account.setUserId(userId);
//		restTemplate.put(BASE_URL + "user/" + userId + "/account", account);
//	}
//	
//	public Transfer[] getAllTransfersById(int userId) {
//		Transfer[] transfers = null;
//		transfers = restTemplate.exchange(BASE_URL + "user/" + userId + "transfers", HttpMethod.GET, makeAuthEntity(), Transfer[].class).getBody();
//		return transfers;
//	}
//	
//	private HttpEntity makeAuthEntity() {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setBearerAuth(AUTH_TOKEN);
//		HttpEntity entity = new HttpEntity<>(headers);
//        return entity;
//    }
//	
//}
