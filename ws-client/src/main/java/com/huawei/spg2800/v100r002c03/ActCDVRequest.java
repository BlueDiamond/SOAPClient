
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="TASADDR" type="{http://www.huawei.com/SPG2800/V100R002C03}tAsAddr" minOccurs="0"/>
 *         &lt;element name="SIFCSETID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="TEMPLATEIDX" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="VMAIND" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="PRON" type="{http://www.huawei.com/SPG2800/V100R002C03}tPRON" minOccurs="0"/>
 *         &lt;element name="ESRN" type="{http://www.huawei.com/SPG2800/V100R002C03}tESRN" minOccurs="0"/>
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
    "tasaddr",
    "sifcsetid",
    "templateidx",
    "vmaind",
    "pron",
    "esrn"
})
@XmlRootElement(name = "ActCDVRequest")
public class ActCDVRequest {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "TASADDR")
    protected String tasaddr;
    @XmlElement(name = "SIFCSETID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer sifcsetid;
    @XmlElement(name = "TEMPLATEIDX", required = true)
    protected Object templateidx;
    @XmlElement(name = "VMAIND")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vmaind;
    @XmlElement(name = "PRON")
    protected String pron;
    @XmlElement(name = "ESRN")
    protected String esrn;

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
     * Gets the value of the tasaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTASADDR() {
        return tasaddr;
    }

    /**
     * Sets the value of the tasaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTASADDR(String value) {
        this.tasaddr = value;
    }

    /**
     * Gets the value of the sifcsetid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIFCSETID() {
        return sifcsetid;
    }

    /**
     * Sets the value of the sifcsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIFCSETID(Integer value) {
        this.sifcsetid = value;
    }

    /**
     * Gets the value of the templateidx property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTEMPLATEIDX() {
        return templateidx;
    }

    /**
     * Sets the value of the templateidx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTEMPLATEIDX(Object value) {
        this.templateidx = value;
    }

    /**
     * Gets the value of the vmaind property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVMAIND() {
        return vmaind;
    }

    /**
     * Sets the value of the vmaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVMAIND(Long value) {
        this.vmaind = value;
    }

    /**
     * Gets the value of the pron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRON() {
        return pron;
    }

    /**
     * Sets the value of the pron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRON(String value) {
        this.pron = value;
    }

    /**
     * Gets the value of the esrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRN() {
        return esrn;
    }

    /**
     * Sets the value of the esrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRN(String value) {
        this.esrn = value;
    }

}
