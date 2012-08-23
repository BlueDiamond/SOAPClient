
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActPreProvIMPUSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActPreProvIMPUSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IRSID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
 *         &lt;element name="REGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="REGIMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tREGIMPUTYPE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActPreProvIMPUSetType", propOrder = {
    "irsid",
    "regimpu",
    "regimputype"
})
public class ActPreProvIMPUSetType {

    @XmlElement(name = "IRSID")
    protected short irsid;
    @XmlElement(name = "REGIMPU", required = true)
    protected String regimpu;
    @XmlElement(name = "REGIMPUTYPE")
    protected Integer regimputype;

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

    /**
     * Gets the value of the regimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIMPU() {
        return regimpu;
    }

    /**
     * Sets the value of the regimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIMPU(String value) {
        this.regimpu = value;
    }

    /**
     * Gets the value of the regimputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREGIMPUTYPE() {
        return regimputype;
    }

    /**
     * Sets the value of the regimputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREGIMPUTYPE(Integer value) {
        this.regimputype = value;
    }

}
