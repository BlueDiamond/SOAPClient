package com.bd.ws.client.cxf;

import java.net.URL;

import com.bd.soap.cxf.ws.connector.soai.UserProfileService;
import com.bd.soap.cxf.ws.connector.soai.UserProfileServicePort;
import com.soai.types.UserProfileResponse;

public final class UserProfileServiceClient {

	public static void main(String args[]) throws java.lang.Exception {

//		URL wsdlURL = new URL("http://localhost:8080/soap-service/UserProfileService?wsdl");
		
		URL wsdlURL = new URL("http://localhost:8080/soap-service/UserProfileService?wsdl");

		UserProfileService userProfileService = new UserProfileService(wsdlURL);
		
		
//		UserProfileService userProfileService = new UserProfileService();
		
		UserProfileServicePort port = userProfileService.getUserProfileServicePort();

		System.out.println("Invoking getUserProfile...");

		UserProfileResponse userProfile = port.getUserProfile();

		System.out.println("getUserProfile.result = " + userProfile);
	}

}
