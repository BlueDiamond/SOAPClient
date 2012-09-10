package com.comcast.spg.ws.cxf.client;

import java.net.URL;

import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

import com.huawei.spg2800.v100r002c03.Authentication;
import com.huawei.spg2800.v100r002c03.ObjectFactory;
import com.huawei.spg2800.v100r002c03.QueryFMFMRequest;
import com.huawei.spg2800.v100r002c03.SPG2800Port;
import com.huawei.spg2800.v100r002c03.SPG2800Service;

@Component
public class CXFWsClient {
	private static ApplicationContext context;
	private static Logger logger = LoggerFactory.getLogger(ComcastSpgWsJaxbClient.class);

	@Autowired
	@Qualifier("oxmJaxbMarshaller")
	private Jaxb2Marshaller oxmJaxbMarshaller;

	@Autowired
	@Qualifier("jaxbMarshaller")
	private javax.xml.bind.Marshaller jaxb2Marshaller;

	@Autowired
	@Qualifier("jaxbContext")
	private javax.xml.bind.JAXBContext jaxbContext;

	public void invokeSPG2800Service() {

		try {

			// get the service and port
			// URL url = new URL("http://10.253.141.93:8080/spg");
			// URL url = new URL("http://10.253.141.93:8888/spg/wsdl/spg_service.wsdl");
			URL url = new URL("http://localhost:8088/mockSPG2800Binding?wsdl");

			SPG2800Service service = new SPG2800Service(url);

			SPG2800Port port = service.getSPG2800Port();

			// build request object
			ObjectFactory objectFactory = new ObjectFactory();

			Authentication authentication = objectFactory.createAuthentication();
			
			
			authentication.setUsername("voice2go");
			authentication.setPassword("D73C5E52366686E60067A1876488DFC1");
			
			
			jaxb2Marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxb2Marshaller.marshal(authentication, System.out);
			
			

			QueryFMFMRequest queryFMFMRequest = objectFactory.createQueryFMFMRequest();
			queryFMFMRequest.setIMPU("tel:+16094865643");

			// print request
			// jaxb2Marshaller.marshal(queryFMFMRequest, result);

			// output pretty printed
			jaxb2Marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxb2Marshaller.marshal(queryFMFMRequest, System.out);
			// jaxb2Marshaller.marshal(queryFMFMRequest, new File("SPG_QueryFMFM_Request.xml"));

			// logger.debug("SPG WS XML Request::" + result.toString());

			// make the service with the request
			logger.debug("Invoking Comcast Spg Ws with apache CXF generated Client... ");
			port.queryFMFM(queryFMFMRequest, authentication, 2);
//			QueryFMFMResponse queryFMFMResponse = port.queryFMFM(queryFMFMRequest, authentication, 2);

			// print to console
//			jaxb2Marshaller.marshal(queryFMFMResponse, System.out);

			// print to file
			// jaxb2Marshaller.marshal(queryFMFMResponse, new File("SPG_QueryFMFM_Reponse.xml"));

			// String wsResponse = result.toString();

			// logger.debug("SPG WS returned XML Response::" + wsResponse);
		} catch (Exception e) {
			logger.error("Exception received: ", e);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("Starting ComcastSpgWsJaxbClient... ");

		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CXFWsClient comcastSpgWsJaxbClient = context.getBean(CXFWsClient.class);
		comcastSpgWsJaxbClient.invokeSPG2800Service();
		logger.debug("Done ComcastSpgWsJaxbClient call.");

	}

}
