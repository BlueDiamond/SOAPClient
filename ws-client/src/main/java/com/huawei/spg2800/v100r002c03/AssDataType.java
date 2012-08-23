
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTED" type="{http://www.huawei.com/SPG2800/V100R002C03}tENUM01" minOccurs="0"/>
 *         &lt;element name="RTIME" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0-255" minOccurs="0"/>
 *         &lt;element name="ACOR" type="{http://www.huawei.com/SPG2800/V100R002C03}tInteger0-255" minOccurs="0"/>
 *         &lt;element name="ARTT" type="{http://www.huawei.com/SPG2800/V100R002C03}tARTT" minOccurs="0"/>
 *         &lt;element name="AND" type="{http://www.huawei.com/SPG2800/V100R002C03}ANDType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssDataType", propOrder = {
    "acted",
    "rtime",
    "acor",
    "artt",
    "and"
})
public class AssDataType {

    @XmlElement(name = "ACTED")
    protected Integer acted;
    @XmlElement(name = "RTIME")
    protected Integer rtime;
    @XmlElement(name = "ACOR")
    protected Integer acor;
    @XmlElement(name = "ARTT")
    protected Integer artt;
    @XmlElement(name = "AND", required = true)
    protected List<ANDType> and;

    /**
     * Gets the value of the acted property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getACTED() {
        return acted;
    }

    /**
     * Sets the value of the acted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setACTED(Integer value) {
        this.acted = value;
    }

    /**
     * Gets the value of the rtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRTIME() {
        return rtime;
    }

    /**
     * Sets the value of the rtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRTIME(Integer value) {
        this.rtime = value;
    }

    /**
     * Gets the value of the acor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getACOR() {
        return acor;
    }

    /**
     * Sets the value of the acor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setACOR(Integer value) {
        this.acor = value;
    }

    /**
     * Gets the value of the artt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getARTT() {
        return artt;
    }

    /**
     * Sets the value of the artt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setARTT(Integer value) {
        this.artt = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the and property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAND().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANDType }
     * 
     * 
     */
    public List<ANDType> getAND() {
        if (and == null) {
            and = new ArrayList<ANDType>();
        }
        return this.and;
    }

}
