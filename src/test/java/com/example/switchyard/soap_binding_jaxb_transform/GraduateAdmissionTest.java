package com.example.switchyard.soap_binding_jaxb_transform;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins = { CDIMixIn.class })
public class GraduateAdmissionTest {

	private SwitchYardTestKit testKit;
	private CDIMixIn cdiMixIn;
	@ServiceOperation("GraduateAdmission")
	private Invoker service;

	@Test
	public void testProcessAdmission() throws Exception {
		// TODO Auto-generated method stub
		// initialize your test message
		AdmissionRequest message = new AdmissionRequest();
		message.setName("George");
		message.setScore(50);
		AdmissionResponse result = service.operation("processAdmission")
				.sendInOut(message).getContent(AdmissionResponse.class);

		// validate the results
		Assert.assertTrue("Implement me", false);
	}

}
