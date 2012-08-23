
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
    "irsid"
})
@XmlRootElement(name = "DeactNPAS4HSSRequest")
public class DeactNPAS4HSSRequest {

    @XmlElement(name = "OTELIMPU", required = true)
    protected String otelimpu;
    @XmlElement(name = "OSIPIMPU", required = true)
    protected String osipimpu;
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
