package moe.everything.scribe.common.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ScribeRequestService {
	
	private final RestTemplate restTemplate;
	
	public ScribeRequestService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public String getReq(String url) {
		return restTemplate.getForObject(url, String.class);
	}

}
