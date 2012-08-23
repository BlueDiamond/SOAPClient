
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LriInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LriInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LRI" type="{http://www.huawei.com/SPG2800/V100R002C03}tLRI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LriInfoType", propOrder = {
    "lri"
})
public class LriInfoType {

    @XmlElement(name = "LRI", required = true)
    protected String lri;

    /**
     * Gets the value of the lri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRI() {
        return lri;
    }

    /**
     * Sets the value of the lri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRI(String value) {
        this.lri = value;
    }

}
