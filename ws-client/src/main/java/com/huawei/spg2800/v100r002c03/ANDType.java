
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ANDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ANDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AN" type="{http://www.huawei.com/SPG2800/V100R002C03}tString1-128"/>
 *         &lt;element name="UT" type="{http://www.huawei.com/SPG2800/V100R002C03}tENUMUT" minOccurs="0"/>
 *         &lt;element name="NA" type="{http://www.huawei.com/SPG2800/V100R002C03}tENUM01" minOccurs="0"/>
 *         &lt;element name="NRT" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0-255" minOccurs="0"/>
 *         &lt;element name="PRI" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0-255" minOccurs="0"/>
 *         &lt;element name="COR" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0-255" minOccurs="0"/>
 *         &lt;element name="TT" type="{http://www.huawei.com/SPG2800/V100R002C03}tTT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ANDType", propOrder = {
    "an",
    "ut",
    "na",
    "nrt",
    "pri",
    "cor",
    "tt"
})
public class ANDType {

    @XmlElement(name = "AN", required = true)
    protected String an;
    @XmlElement(name = "UT")
    protected Integer ut;
    @XmlElement(name = "NA")
    protected Integer na;
    @XmlElement(name = "NRT")
    protected Integer nrt;
    @XmlElement(name = "PRI")
    protected Integer pri;
    @XmlElement(name = "COR")
    protected Integer cor;
    @XmlElement(name = "TT")
    protected Integer tt;

    /**
     * Gets the value of the an property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAN() {
        return an;
    }

    /**
     * Sets the value of the an property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAN(String value) {
        this.an = value;
    }

    /**
     * Gets the value of the ut property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUT() {
        return ut;
    }

    /**
     * Sets the value of the ut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUT(Integer value) {
        this.ut = value;
    }

    /**
     * Gets the value of the na property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNA() {
        return na;
    }

    /**
     * Sets the value of the na property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNA(Integer value) {
        this.na = value;
    }

    /**
     * Gets the value of the nrt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNRT() {
        return nrt;
    }

    /**
     * Sets the value of the nrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNRT(Integer value) {
        this.nrt = value;
    }

    /**
     * Gets the value of the pri property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPRI() {
        return pri;
    }

    /**
     * Sets the value of the pri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPRI(Integer value) {
        this.pri = value;
    }

    /**
     * Gets the value of the cor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCOR() {
        return cor;
    }

    /**
     * Sets the value of the cor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCOR(Integer value) {
        this.cor = value;
    }

    /**
     * Gets the value of the tt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTT() {
        return tt;
    }

    /**
     * Sets the value of the tt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTT(Integer value) {
        this.tt = value;
    }

}
