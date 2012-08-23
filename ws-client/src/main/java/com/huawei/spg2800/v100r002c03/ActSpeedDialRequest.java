
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
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="SpeedDialList" type="{http://www.huawei.com/SPG2800/V100R002C03}SpeedDialListType"/>
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
    "impu",
    "speedDialList"
})
@XmlRootElement(name = "ActSpeedDialRequest")
public class ActSpeedDialRequest {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "SpeedDialList", required = true)
    protected SpeedDialListType speedDialList;

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
     * Gets the value of the speedDialList property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedDialListType }
     *     
     */
    public SpeedDialListType getSpeedDialList() {
        return speedDialList;
    }

    /**
     * Sets the value of the speedDialList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedDialListType }
     *     
     */
    public void setSpeedDialList(SpeedDialListType value) {
        this.speedDialList = value;
    }

}
