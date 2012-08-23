
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPSSBRData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPSSBRData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="US" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPSSBRData", propOrder = {
    "impu",
    "us"
})
public class NPSSBRData {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "US")
    protected String us;

    /**
     * Gets the value of the impu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPU() {
        return impu;
    }

    /**
     * Sets the value of the impu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPU(String value) {
        this.impu = value;
    }

    /**
     * Gets the value of the us property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUS() {
        return us;
    }

    /**
     * Sets the value of the us property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUS(String value) {
        this.us = value;
    }

}
