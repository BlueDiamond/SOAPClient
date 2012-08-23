
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
 *         &lt;element name="OTELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELURI"/>
 *         &lt;element name="OSIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="NTELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELURI"/>
 *         &lt;element name="NSIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="TELIMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELIMPUTYPE" minOccurs="0"/>
 *         &lt;element name="SIPIMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPIMPUTYPE" minOccurs="0"/>
 *         &lt;element name="IRSID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
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
    "otelimpu",
    "osipimpu",
    "ntelimpu",
    "nsipimpu",
    "telimputype",
    "sipimputype",
    "irsid"
})
@XmlRootElement(name = "ActNPAS4HSSRequest")
public class ActNPAS4HSSRequest {

    @XmlElement(name = "OTELIMPU", required = true)
    protected String otelimpu;
    @XmlElement(name = "OSIPIMPU", required = true)
    protected String osipimpu;
    @XmlElement(name = "NTELIMPU", required = true)
    protected String ntelimpu;
    @XmlElement(name = "NSIPIMPU", required = true)
    protected String nsipimpu;
    @XmlElement(name = "TELIMPUTYPE")
    protected Integer telimputype;
    @XmlElement(name = "SIPIMPUTYPE")
    protected Integer sipimputype;
    @XmlElement(name = "IRSID")
    protected short irsid;

    /**
     * Gets the value of the otelimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTELIMPU() {
        return otelimpu;
    }

    /**
     * Sets the value of the otelimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTELIMPU(String value) {
        this.otelimpu = value;
    }

    /**
     * Gets the value of the osipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSIPIMPU() {
        return osipimpu;
    }

    /**
     * Sets the value of the osipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSIPIMPU(String value) {
        this.osipimpu = value;
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
     * Gets the value of the telimputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTELIMPUTYPE() {
        return telimputype;
    }

    /**
     * Sets the value of the telimputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTELIMPUTYPE(Integer value) {
        this.telimputype = value;
    }

    /**
     * Gets the value of the sipimputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIPIMPUTYPE() {
        return sipimputype;
    }

    /**
     * Sets the value of the sipimputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIPIMPUTYPE(Integer value) {
        this.sipimputype = value;
    }

    /**
     * Gets the value of the irsid property.
     * 
     */
    public short getIRSID() {
        return irsid;
    }

    /**
     * Sets the value of the irsid property.
     * 
     */
    public void setIRSID(short value) {
        this.irsid = value;
    }

}
