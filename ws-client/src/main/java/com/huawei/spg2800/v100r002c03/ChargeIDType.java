
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHARGTPLID" type="{http://www.huawei.com/SPG2800/V100R002C03}tCHARGTPLID" minOccurs="0"/>
 *         &lt;element name="PECFID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SECFID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PCCFID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SCCFID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeIDType", propOrder = {
    "chargtplid",
    "pecfid",
    "secfid",
    "pccfid",
    "sccfid"
})
public class ChargeIDType {

    @XmlElement(name = "CHARGTPLID")
    protected Integer chargtplid;
    @XmlElement(name = "PECFID", required = true)
    protected String pecfid;
    @XmlElement(name = "SECFID", required = true)
    protected String secfid;
    @XmlElement(name = "PCCFID", required = true)
    protected String pccfid;
    @XmlElement(name = "SCCFID", required = true)
    protected String sccfid;

    /**
     * Gets the value of the chargtplid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCHARGTPLID() {
        return chargtplid;
    }

    /**
     * Sets the value of the chargtplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCHARGTPLID(Integer value) {
        this.chargtplid = value;
    }

    /**
     * Gets the value of the pecfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECFID() {
        return pecfid;
    }

    /**
     * Sets the value of the pecfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECFID(String value) {
        this.pecfid = value;
    }

    /**
     * Gets the value of the secfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSECFID() {
        return secfid;
    }

    /**
     * Sets the value of the secfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSECFID(String value) {
        this.secfid = value;
    }

    /**
     * Gets the value of the pccfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPCCFID() {
        return pccfid;
    }

    /**
     * Sets the value of the pccfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPCCFID(String value) {
        this.pccfid = value;
    }

    /**
     * Gets the value of the sccfid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCCFID() {
        return sccfid;
    }

    /**
     * Sets the value of the sccfid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCCFID(String value) {
        this.sccfid = value;
    }

}
