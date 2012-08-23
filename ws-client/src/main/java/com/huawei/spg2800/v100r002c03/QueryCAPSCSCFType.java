
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCAPSCSCFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCAPSCSCFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAPSCSCF" type="{http://www.huawei.com/SPG2800/V100R002C03}tString1-127"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCAPSCSCFType", propOrder = {
    "capscscf"
})
public class QueryCAPSCSCFType {

    @XmlElement(name = "CAPSCSCF", required = true)
    protected String capscscf;

    /**
     * Gets the value of the capscscf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPSCSCF() {
        return capscscf;
    }

    /**
     * Sets the value of the capscscf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPSCSCF(String value) {
        this.capscscf = value;
    }

}
