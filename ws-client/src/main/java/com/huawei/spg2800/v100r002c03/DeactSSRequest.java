
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
 *         &lt;element name="DSTR" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0" minOccurs="0"/>
 *         &lt;element name="SB" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0" minOccurs="0"/>
 *         &lt;element name="ONENUM" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0" minOccurs="0"/>
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
    "dstr",
    "sb",
    "onenum"
})
@XmlRootElement(name = "DeactSSRequest")
public class DeactSSRequest {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "DSTR")
    protected Short dstr;
    @XmlElement(name = "SB")
    protected Short sb;
    @XmlElement(name = "ONENUM")
    protected Short onenum;

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
     * Gets the value of the dstr property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDSTR() {
        return dstr;
    }

    /**
     * Sets the value of the dstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDSTR(Short value) {
        this.dstr = value;
    }

    /**
     * Gets the value of the sb property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSB() {
        return sb;
    }

    /**
     * Sets the value of the sb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSB(Short value) {
        this.sb = value;
    }

    /**
     * Gets the value of the onenum property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getONENUM() {
        return onenum;
    }

    /**
     * Sets the value of the onenum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setONENUM(Short value) {
        this.onenum = value;
    }

}
