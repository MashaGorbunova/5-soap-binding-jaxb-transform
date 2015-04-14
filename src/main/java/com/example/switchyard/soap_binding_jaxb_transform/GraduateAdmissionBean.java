package com.example.switchyard.soap_binding_jaxb_transform;

import org.switchyard.component.bean.Service;

@Service(GraduateAdmission.class)
public class GraduateAdmissionBean implements GraduateAdmission {

	@Override
	public AdmissionResponse processAdmission(AdmissionRequest request) {
		AdmissionResponse response = new AdmissionResponse();
		if(request.getScore() > 60) {
			response.setEligible(true);
			System.out.println(request.getName() + " is eligible for admission");
		} else {
			System.out.println(request.getName() + " is  NOT eligible for admission");
			response.setEligible(false);
		}
		return response;
	}

}
