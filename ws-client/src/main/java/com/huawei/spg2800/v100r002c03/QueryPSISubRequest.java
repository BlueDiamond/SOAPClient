
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PISI" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-127" minOccurs="0"/>
 *         &lt;element name="PUSI" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-127" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pisi",
    "pusi"
})
@XmlRootElement(name = "QueryPSISubRequest")
public class QueryPSISubRequest {

    @XmlElement(name = "PISI")
    protected String pisi;
    @XmlElement(name = "PUSI")
    protected String pusi;

    /**
     * Gets the value of the pisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPISI() {
        return pisi;
    }

    /**
     * Sets the value of the pisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPISI(String value) {
        this.pisi = value;
    }

    /**
     * Gets the value of the pusi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUSI() {
        return pusi;
    }

    /**
     * Sets the value of the pusi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUSI(String value) {
        this.pusi = value;
    }

}
