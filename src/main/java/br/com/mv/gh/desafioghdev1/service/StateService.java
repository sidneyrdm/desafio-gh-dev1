package br.com.mv.gh.desafioghdev1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mv.gh.desafioghdev1.model.State;
import br.com.mv.gh.desafioghdev1.model.StateDTO;
import br.com.mv.gh.desafioghdev1.repository.StateRepository;
import br.com.mv.gh.desafioghdev1.rest.Result;


@Service
public class StateService {

    @Autowired
	public StateRepository stateRepository;	
	Result result = new Result();


	public List<State> list() {
	  return stateRepository.findAll();
	}
	
	public void update() {
		this.estadosEN();
	}
	
	
	public List<State> estadosEN(){
		
		List<State> estados = new ArrayList<State>();
		List<StateDTO> estadosDTO = new ArrayList<StateDTO>();
		
		estadosDTO = result.getState();
		
		if(!stateRepository.findAll().isEmpty()) {
			stateRepository.deleteAll();
		}
		for (StateDTO stateDTO : estadosDTO) {
			if(stateDTO.getLang().equals("en")){
				State state = new State();
				state.setTitle(stateDTO.getTitle());
				state.setUrl(stateDTO.getUrl());
						
                stateRepository.save(state);
				estados.add(state);
			}
		}

		return estados;	
	}
	
}
