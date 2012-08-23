
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
 *         &lt;element name="PISI" type="{http://www.huawei.com/SPG2800/V100R002C03}tString1-127"/>
 *         &lt;element name="PUSILIST" type="{http://www.huawei.com/SPG2800/V100R002C03}PUSIListType"/>
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
    "pisi",
    "pusilist"
})
@XmlRootElement(name = "AddPSISubRequest")
public class AddPSISubRequest {

    @XmlElement(name = "PISI", required = true)
    protected String pisi;
    @XmlElement(name = "PUSILIST", required = true)
    protected PUSIListType pusilist;

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
     * Gets the value of the pusilist property.
     * 
     * @return
     *     possible object is
     *     {@link PUSIListType }
     *     
     */
    public PUSIListType getPUSILIST() {
        return pusilist;
    }

    /**
     * Sets the value of the pusilist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUSIListType }
     *     
     */
    public void setPUSILIST(PUSIListType value) {
        this.pusilist = value;
    }

}
