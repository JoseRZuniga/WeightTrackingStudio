package com.wts.njp.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wts.njp.model.UserView;

@Service
public class UserManagerImpl implements UserManager{
	
	// This webapp server is 8083 the backend is 8082
	private final String restURL = "http://localhost:8082/";
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<UserView> listAllUsers() {
		String url = restURL + "list";
		UserView[] response = restTemplate.getForObject(url, UserView[].class);
		List<UserView> users = new ArrayList<>();
		
		for(UserView user : response) {
			users.add(user);
		}
		
		return users;
	}

	@Override
	public void saveUser(UserView user) {
		String url = restURL + "save";
		restTemplate.postForObject(url, user, UserView.class);
	}
	
	@Override
	public void updateUser(UserView user) {
		String url = restURL + "update";
		restTemplate.put(url, user);
	}	

	@Override
	public UserView findUserById(Long id) {
		String url = restURL + "{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", Long.toString(id));
		
		return restTemplate.getForObject(url, UserView.class, params);
	}

	@Override
	public void deleteUser(Long id) {
		String url = restURL + "delete-{id}";
		Map<String, String> params = new HashMap<>();
		params.put("id", Long.toString(id));
		
		restTemplate.delete(url, params);
	}

}
