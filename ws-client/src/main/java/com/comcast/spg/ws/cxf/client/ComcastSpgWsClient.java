package com.comcast.spg.ws.cxf.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huawei.spg2800.v100r002c03.ObjectFactory;
import com.huawei.spg2800.v100r002c03.QueryFMFMRequest;
import com.huawei.spg2800.v100r002c03.QueryFMFMResponse;
import com.huawei.spg2800.v100r002c03.QueryFMFMType;
import com.huawei.spg2800.v100r002c03.SPG2800Port;
import com.huawei.spg2800.v100r002c03.SPG2800Service;

public class ComcastSpgWsClient {

	private static Logger logger = LoggerFactory.getLogger(ComcastSpgWsClient.class);

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

			// extract data from response
			QueryFMFMResponse.ResultData resultData = queryFMFMResponse.getResultData();
			QueryFMFMResponse.ResultData.Table1 table = resultData.getTable1();
			QueryFMFMType queryFMFMType = table.getItem();

			Integer CWRTONE = queryFMFMType.getCWRTONE();
			String IMPU = queryFMFMType.getIMPU();
			Integer PROMODE302 = queryFMFMType.getPROMODE302();
			Integer RINGTONE = queryFMFMType.getRINGTONE();
			Integer RTYPE = queryFMFMType.getRTYPE();

			logger.debug("WS call returned with Result:: CWRTONE:" + CWRTONE + ", IMPU:" + IMPU + ", PROMODE302:" + PROMODE302 + ", RINGTONE:" + RINGTONE
					+ ", RTYPE:" + RTYPE);
		} catch (Exception e) {
			logger.error("Exception received: ", e);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug("Starting ComcastSpgWsClient... ");

		ComcastSpgWsClient comcastSpgWsClient = new ComcastSpgWsClient();
		comcastSpgWsClient.invokeSPG2800Service();
		logger.debug("Done ComcastSpgWsJaxbClient call.");
	}

}