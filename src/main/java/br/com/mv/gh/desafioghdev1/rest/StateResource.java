package br.com.mv.gh.desafioghdev1.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.gh.desafioghdev1.model.Person;
import br.com.mv.gh.desafioghdev1.model.State;
import br.com.mv.gh.desafioghdev1.service.PersonService;
import br.com.mv.gh.desafioghdev1.service.StateService;

@RestController
@RequestMapping(value="api/state")
public class StateResource {

	@Autowired
	private StateService stateService;

	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<State> list() {
		return stateService.list();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public void update() {
		stateService.update();
	}
	
}


