
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
 *         &lt;element name="REGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="NEWIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="IMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPUTYPE" minOccurs="0"/>
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
    "regimpu",
    "newimpu",
    "imputype",
    "irsid"
})
@XmlRootElement(name = "AddTN2IRSRequest")
public class AddTN2IRSRequest {

    @XmlElement(name = "REGIMPU", required = true)
    protected String regimpu;
    @XmlElement(name = "NEWIMPU", required = true)
    protected String newimpu;
    @XmlElement(name = "IMPUTYPE")
    protected Integer imputype;
    @XmlElement(name = "IRSID")
    protected short irsid;

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
     * Gets the value of the newimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNEWIMPU() {
        return newimpu;
    }

    /**
     * Sets the value of the newimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNEWIMPU(String value) {
        this.newimpu = value;
    }

    /**
     * Gets the value of the imputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIMPUTYPE() {
        return imputype;
    }

    /**
     * Sets the value of the imputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIMPUTYPE(Integer value) {
        this.imputype = value;
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
