package com.example.switchyard.soap_binding_jaxb_transform;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AdmissionRequest {
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
