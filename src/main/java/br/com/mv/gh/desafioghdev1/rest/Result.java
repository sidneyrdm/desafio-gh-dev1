package br.com.mv.gh.desafioghdev1.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.mv.gh.desafioghdev1.model.StateDTO;


@RestController
public class Result {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/estadosDTO")
	public List<StateDTO> getState() {
		      
      String uri = "https://www.healthcare.gov/api/states.json";
      
      ResponseEntity<StateDTO> result = restTemplate.getForEntity(uri, StateDTO.class);      
      
      return result.getBody().getStates();
	}

}
