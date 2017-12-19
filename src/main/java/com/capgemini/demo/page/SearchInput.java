package com.capgemini.demo.page;

public class SearchInput {
	
	
	public SearchInput() {
	}

	private String id;
	private PagiNamtion pagiNamtion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PagiNamtion getPagiNamtion() {
		return pagiNamtion;
	}

	public void setPagiNamtion(PagiNamtion pagiNamtion) {
		this.pagiNamtion = pagiNamtion;
	}

	@Override
	public String toString() {
		return "SearchInput [id=" + id + ", pagiNamtion=" + pagiNamtion + "]";
	}
	

}
