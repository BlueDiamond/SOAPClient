
package com.huawei.spg2800.v100r002c03;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="ResultDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericResponseType", propOrder = {
    "resultCode",
    "resultDesc"
})
@XmlSeeAlso({
    QuerySnowBirdResponse.class,
    QuerySiFCResponse.class,
    QuerySBResponse.class,
    QueryCFSResponse.class,
    QuerySub4HSSResponse.class,
    QueryCFNRResponse.class,
    QuerySpeedDialResponse.class,
    QueryChargeIDResponse.class,
    QueryReferralMSGResponse.class,
    QueryRepDataResponse.class,
    QueryPSISubResponse.class,
    QueryCFUResponse.class,
    QueryCFBResponse.class,
    QuerySCRResponse.class,
    QueryCFVMResponse.class,
    QueryDevRegStatusResponse.class,
    QueryRegisteredServiceResponse.class,
    QueryFMFMResponse.class,
    QueryCapResponse.class,
    QuerySSResponse.class,
    QueryTNTASAddrResponse.class,
    QuerySubResponse.class,
    QueryESRNResponse.class,
    QueryBARResponse.class,
    QueryServiceDataResponse.class,
    QueryLRIResponse.class,
    QueryCFDAResponse.class,
    QueryNPSSBRResponse.class,
    QueryCAPSCSCFResponse.class,
    QueryDRCWResponse.class
})
public class GenericResponseType {

    @XmlElement(name = "ResultCode", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger resultCode;
    @XmlElement(name = "ResultDesc", required = true)
    protected String resultDesc;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResultCode(BigInteger value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * Sets the value of the resultDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDesc(String value) {
        this.resultDesc = value;
    }

}
