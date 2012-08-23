package com.comcast.spg.ws.cxf.client;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.Marshaller;
import javax.xml.bind.util.JAXBResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

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
	private Jaxb2Marshaller jaxb2Marshaller;

	@Autowired
	@Qualifier("jaxbContext")
	private javax.xml.bind.JAXBContext jaxbContext;

	public void invokeSPG2800Service() {

		try {
			// get the service and port
			// SPG2800Service service = new SPG2800Service(URL wsdlLocation);
			SPG2800Service service = new SPG2800Service();
			SPG2800Port port = service.getSPG2800Port();

			// build request object
			ObjectFactory objectFactory = new ObjectFactory();
			objectFactory.createAuthentication().setUsername("username");
			objectFactory.createAuthentication().setPassword("pwd");
			QueryFMFMRequest queryFMFMRequest = objectFactory.createQueryFMFMRequest();
			queryFMFMRequest.setIMPU("etgegege");

			// make the service with the request
			logger.debug("Invoking Comcast Spg Ws with apache CXF generated Client... ");
			QueryFMFMResponse queryFMFMResponse = port.queryFMFM(queryFMFMRequest);

			JAXBResult result = new JAXBResult(jaxbContext);

			Map<String, Object> properties = new HashMap<String, Object>();
			properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxb2Marshaller.setMarshallerProperties(properties);
			jaxb2Marshaller.marshal(queryFMFMResponse, result);

			String wsResponse = result.toString();

			logger.debug("SPG WS returned XML Response::" + wsResponse);
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
		comcastSpgWsJaxbClient.invokeSPG2800Service();
		logger.debug("Done ComcastSpgWsJaxbClient call.");

	}

}
