
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
 *         &lt;element name="IMPUList" type="{http://www.huawei.com/SPG2800/V100R002C03}IMPUListType"/>
 *         &lt;element name="US">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "impuList",
    "us"
})
@XmlRootElement(name = "SetNPSSBRRequest")
public class SetNPSSBRRequest {

    @XmlElement(name = "IMPUList", required = true)
    protected IMPUListType impuList;
    @XmlElement(name = "US")
    protected int us;

    /**
     * Gets the value of the impuList property.
     * 
     * @return
     *     possible object is
     *     {@link IMPUListType }
     *     
     */
    public IMPUListType getIMPUList() {
        return impuList;
    }

    /**
     * Sets the value of the impuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPUListType }
     *     
     */
    public void setIMPUList(IMPUListType value) {
        this.impuList = value;
    }

    /**
     * Gets the value of the us property.
     * 
     */
    public int getUS() {
        return us;
    }

    /**
     * Sets the value of the us property.
     * 
     */
    public void setUS(int value) {
        this.us = value;
    }

}
