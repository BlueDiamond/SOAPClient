package com.comcast.spg.ws.cxf.client;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.cxf.headers.Header;
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
import com.huawei.spg2800.v100r002c03.QueryFMFMResponse;
import com.huawei.spg2800.v100r002c03.SPG2800Port;
import com.huawei.spg2800.v100r002c03.SPG2800Service;

@Component
public class ComcastSpgWsJaxbClient {
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
			// URL url = new URL("http://10.253.141.93:8888/spg/wsdl/spg_service.wsdl");
			URL url = new URL("http://localhost:8088/mockSPG2800Binding?wsdl");
//			 URL url = new URL("http://localhost:8088/mockSPG2800Binding/spg/wsdl/spg_service.wsdl");

			SPG2800Service service = new SPG2800Service(url);
			SPG2800Port port = service.getSPG2800Port();
			ObjectFactory objectFactory = new ObjectFactory();

			// set headers
			Authentication authentication = objectFactory.createAuthentication();
			authentication.setUsername("voice2go");
			authentication.setPassword("D73C5E52366686E60067A1876488DFC1");

			List<Header> headers = new ArrayList<Header>();
			Header authenticationHeader = new Header(new QName("Authentication"), authentication);
			headers.add(authenticationHeader);

			BindingProvider bindingProvider = (BindingProvider) port;
			bindingProvider.getRequestContext().put(Header.HEADER_LIST, headers);

			// end headers

			// build request body
			QueryFMFMRequest queryFMFMRequest = objectFactory.createQueryFMFMRequest();
			queryFMFMRequest.setIMPU("tel:+16094865643");

			// print request
			// jaxb2Marshaller.marshal(queryFMFMRequest, result);

			// output pretty printed
			jaxb2Marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxb2Marshaller.marshal(queryFMFMRequest, System.out);

			// logger.debug("SPG WS XML Request::" + result.toString());

			// make the service with the request
			logger.debug("Invoking Comcast Spg Ws with apache CXF generated Client... ");
			// QueryFMFMResponse queryFMFMResponse =
			// port.queryFMFM(queryFMFMRequest);

//			QueryFMFMResponse queryFMFMResponse = port.queryFMFM(queryFMFMRequest);

//			jaxb2Marshaller.marshal(queryFMFMResponse, System.out);

			/*
			 * JAXBResult result = new JAXBResult(jaxbContext);
			 * 
			 * Map<String, Object> properties = new HashMap<String, Object>(); properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			 * jaxb2Marshaller.setMarshallerProperties(properties); jaxb2Marshaller.marshal(queryFMFMResponse, result);
			 */

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
		ComcastSpgWsJaxbClient comcastSpgWsJaxbClient = context.getBean(ComcastSpgWsJaxbClient.class);
		// ComcastSpgWsJaxbClient comcastSpgWsJaxbClient =
		// (ComcastSpgWsJaxbClient)context.getBean("comcastSpgWsJaxbClient");
		comcastSpgWsJaxbClient.invokeSPG2800Service();
		logger.debug("Done ComcastSpgWsJaxbClient call.");

	}

}
