package com.wts.njp.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wts.njp.model.UserView;

@Service
public class UserManagerImpl implements UserManager{
	
	// This webapp server is 8083 the backend is 8082
	private final String restURL = "http://localhost:8082/";
	
	@Autowired
	private RestTemplate restTemplate; //= new RestTemplate(requestFactory);

	
	public List<UserView> listAllUsers() {
		String requestUri  = restURL + "user/";
		UserView[] response = restTemplate.getForObject(requestUri , UserView[].class);
		List<UserView> users = new ArrayList<>();
		
		for(UserView user : response) {
			users.add(user);
		}
		
		return users;
	}

	
	public void saveUser(UserView user) {
		String requestUri  = restURL + "user/";
		restTemplate.postForObject(requestUri , user, UserView.class);
	}
	
	
	public void updateUser(UserView user) {
		String requestUri  = restURL + "user/{id}";
		restTemplate.put(requestUri, user);
	}	

	
	public UserView findUserById(Long id) {
		String requestUri  = restURL + "user/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", Long.toString(id));
		
		return restTemplate.getForObject(requestUri , UserView.class, params);
	}

	
	public void deleteUser(Long id) {
		String requestUri  = restURL + "user/{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", Long.toString(id));
		
		restTemplate.delete(requestUri, params);
	}

	
//	Map<String, String> params = new HashMap<>();
//	params.put("id", Long.toString(user.getId()));
//	restTemplate.put(requestUri, user, params);
}
