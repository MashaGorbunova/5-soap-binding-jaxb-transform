package com.example.switchyard.soap_binding_jaxb_transform;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AdmissionResponse {
	
	private boolean eligible;

	public boolean isEligible() {
		return eligible;
	}

	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}
	
}
