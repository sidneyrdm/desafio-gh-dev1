package br.com.mv.gh.desafioghdev1.model;

import java.util.List;

public class StateDTO {
	
	
	private String url;
	private String title;
	private String lang;
	private List<StateDTO> states;
	
	
	public List<StateDTO> getStates() {
		return states;
	}
	public void setStates(List<StateDTO> states) {
		this.states = states;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
