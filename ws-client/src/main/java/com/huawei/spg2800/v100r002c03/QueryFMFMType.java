
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryFMFMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryFMFMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="ASSDATA" type="{http://www.huawei.com/SPG2800/V100R002C03}AssDataType"/>
 *         &lt;element name="PROMODE302" type="{http://www.huawei.com/SPG2800/V100R002C03}tEnumPROMODE302" minOccurs="0"/>
 *         &lt;element name="RTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tEnumRTYPE" minOccurs="0"/>
 *         &lt;element name="RINGTONE" type="{http://www.huawei.com/SPG2800/V100R002C03}tPATTERN" minOccurs="0"/>
 *         &lt;element name="CWRTONE" type="{http://www.huawei.com/SPG2800/V100R002C03}tPATTERN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryFMFMType", propOrder = {
    "impu",
    "assdata",
    "promode302",
    "rtype",
    "ringtone",
    "cwrtone"
})
public class QueryFMFMType {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "ASSDATA", required = true)
    protected AssDataType assdata;
    @XmlElement(name = "PROMODE302")
    protected Integer promode302;
    @XmlElement(name = "RTYPE")
    protected Integer rtype;
    @XmlElement(name = "RINGTONE")
    protected Integer ringtone;
    @XmlElement(name = "CWRTONE")
    protected Integer cwrtone;

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
     * Gets the value of the assdata property.
     * 
     * @return
     *     possible object is
     *     {@link AssDataType }
     *     
     */
    public AssDataType getASSDATA() {
        return assdata;
    }

    /**
     * Sets the value of the assdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssDataType }
     *     
     */
    public void setASSDATA(AssDataType value) {
        this.assdata = value;
    }

    /**
     * Gets the value of the promode302 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPROMODE302() {
        return promode302;
    }

    /**
     * Sets the value of the promode302 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPROMODE302(Integer value) {
        this.promode302 = value;
    }

    /**
     * Gets the value of the rtype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRTYPE() {
        return rtype;
    }

    /**
     * Sets the value of the rtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRTYPE(Integer value) {
        this.rtype = value;
    }

    /**
     * Gets the value of the ringtone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRINGTONE() {
        return ringtone;
    }

    /**
     * Sets the value of the ringtone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRINGTONE(Integer value) {
        this.ringtone = value;
    }

    /**
     * Gets the value of the cwrtone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCWRTONE() {
        return cwrtone;
    }

    /**
     * Sets the value of the cwrtone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCWRTONE(Integer value) {
        this.cwrtone = value;
    }

}
