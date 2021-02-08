package com.example.demo.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.Country;

@Service
public class ServiceClass {
	RestTemplate template = new RestTemplate();

	public ResponseEntity<List<Country>> collectAll() {

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Country> entity = new HttpEntity<Country>(headers);
		ResponseEntity<List<Country>> list = template.exchange("http://localhost:8081/getAll", HttpMethod.GET, entity,
				new ParameterizedTypeReference<List<Country>>() {
				});
		list.getBody();

		return list;
	}

}
