
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PSISUBInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PSISUBInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PISI" type="{http://www.huawei.com/SPG2800/V100R002C03}tString1-127"/>
 *         &lt;element name="PUSIList" type="{http://www.huawei.com/SPG2800/V100R002C03}PUSIInfoListType" minOccurs="0"/>
 *         &lt;element name="MCAP" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-352" minOccurs="0"/>
 *         &lt;element name="OCAP" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-352" minOccurs="0"/>
 *         &lt;element name="SCSCFList" type="{http://www.huawei.com/SPG2800/V100R002C03}SCSCFListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSISUBInfo", propOrder = {
    "pisi",
    "pusiList",
    "mcap",
    "ocap",
    "scscfList"
})
public class PSISUBInfo {

    @XmlElement(name = "PISI", required = true)
    protected String pisi;
    @XmlElement(name = "PUSIList")
    protected PUSIInfoListType pusiList;
    @XmlElement(name = "MCAP")
    protected String mcap;
    @XmlElement(name = "OCAP")
    protected String ocap;
    @XmlElement(name = "SCSCFList")
    protected SCSCFListType scscfList;

    /**
     * Gets the value of the pisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPISI() {
        return pisi;
    }

    /**
     * Sets the value of the pisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPISI(String value) {
        this.pisi = value;
    }

    /**
     * Gets the value of the pusiList property.
     * 
     * @return
     *     possible object is
     *     {@link PUSIInfoListType }
     *     
     */
    public PUSIInfoListType getPUSIList() {
        return pusiList;
    }

    /**
     * Sets the value of the pusiList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUSIInfoListType }
     *     
     */
    public void setPUSIList(PUSIInfoListType value) {
        this.pusiList = value;
    }

    /**
     * Gets the value of the mcap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCAP() {
        return mcap;
    }

    /**
     * Sets the value of the mcap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCAP(String value) {
        this.mcap = value;
    }

    /**
     * Gets the value of the ocap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCAP() {
        return ocap;
    }

    /**
     * Sets the value of the ocap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCAP(String value) {
        this.ocap = value;
    }

    /**
     * Gets the value of the scscfList property.
     * 
     * @return
     *     possible object is
     *     {@link SCSCFListType }
     *     
     */
    public SCSCFListType getSCSCFList() {
        return scscfList;
    }

    /**
     * Sets the value of the scscfList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCSCFListType }
     *     
     */
    public void setSCSCFList(SCSCFListType value) {
        this.scscfList = value;
    }

}
