
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MCAP" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-352" minOccurs="0"/>
 *         &lt;element name="OCAP" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-352" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCapType", propOrder = {
    "mcap",
    "ocap"
})
public class QueryCapType {

    @XmlElement(name = "MCAP")
    protected String mcap;
    @XmlElement(name = "OCAP")
    protected String ocap;

    /**
     * Gets the value of the mcap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCAP() {
        return mcap;
    }

    /**
     * Sets the value of the mcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCAP(String value) {
        this.mcap = value;
    }

    /**
     * Gets the value of the ocap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCAP() {
        return ocap;
    }

    /**
     * Sets the value of the ocap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCAP(String value) {
        this.ocap = value;
    }

}
