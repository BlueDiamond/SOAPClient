
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PUSISetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PUSISetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PUSI" type="{http://www.huawei.com/SPG2800/V100R002C03}tString1-127"/>
 *         &lt;element name="PUSITYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tPUSITYPE"/>
 *         &lt;element name="AS" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-127" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PUSISetType", propOrder = {
    "pusi",
    "pusitype",
    "as"
})
public class PUSISetType {

    @XmlElement(name = "PUSI", required = true)
    protected String pusi;
    @XmlElement(name = "PUSITYPE")
    protected int pusitype;
    @XmlElement(name = "AS")
    protected String as;

    /**
     * Gets the value of the pusi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUSI() {
        return pusi;
    }

    /**
     * Sets the value of the pusi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUSI(String value) {
        this.pusi = value;
    }

    /**
     * Gets the value of the pusitype property.
     * 
     */
    public int getPUSITYPE() {
        return pusitype;
    }

    /**
     * Sets the value of the pusitype property.
     * 
     */
    public void setPUSITYPE(int value) {
        this.pusitype = value;
    }

    /**
     * Gets the value of the as property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAS() {
        return as;
    }

    /**
     * Sets the value of the as property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAS(String value) {
        this.as = value;
    }

}
