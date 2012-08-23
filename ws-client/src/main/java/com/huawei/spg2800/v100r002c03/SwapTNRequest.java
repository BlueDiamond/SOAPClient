
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
 *         &lt;element name="TELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="SIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="NTELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="NSIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="TEMPTELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="TEMPSIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
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
    "telimpu",
    "sipimpu",
    "ntelimpu",
    "nsipimpu",
    "temptelimpu",
    "tempsipimpu"
})
@XmlRootElement(name = "SwapTNRequest")
public class SwapTNRequest {

    @XmlElement(name = "TELIMPU", required = true)
    protected String telimpu;
    @XmlElement(name = "SIPIMPU", required = true)
    protected String sipimpu;
    @XmlElement(name = "NTELIMPU", required = true)
    protected String ntelimpu;
    @XmlElement(name = "NSIPIMPU", required = true)
    protected String nsipimpu;
    @XmlElement(name = "TEMPTELIMPU", required = true)
    protected String temptelimpu;
    @XmlElement(name = "TEMPSIPIMPU", required = true)
    protected String tempsipimpu;

    /**
     * Gets the value of the telimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELIMPU() {
        return telimpu;
    }

    /**
     * Sets the value of the telimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELIMPU(String value) {
        this.telimpu = value;
    }

    /**
     * Gets the value of the sipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPIMPU() {
        return sipimpu;
    }

    /**
     * Sets the value of the sipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPIMPU(String value) {
        this.sipimpu = value;
    }

    /**
     * Gets the value of the ntelimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTELIMPU() {
        return ntelimpu;
    }

    /**
     * Sets the value of the ntelimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTELIMPU(String value) {
        this.ntelimpu = value;
    }

    /**
     * Gets the value of the nsipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSIPIMPU() {
        return nsipimpu;
    }

    /**
     * Sets the value of the nsipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSIPIMPU(String value) {
        this.nsipimpu = value;
    }

    /**
     * Gets the value of the temptelimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPTELIMPU() {
        return temptelimpu;
    }

    /**
     * Sets the value of the temptelimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPTELIMPU(String value) {
        this.temptelimpu = value;
    }

    /**
     * Gets the value of the tempsipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPSIPIMPU() {
        return tempsipimpu;
    }

    /**
     * Sets the value of the tempsipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPSIPIMPU(String value) {
        this.tempsipimpu = value;
    }

}
