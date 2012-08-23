
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
 *         &lt;element name="SUBID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU" minOccurs="0"/>
 *         &lt;element name="IMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI" minOccurs="0"/>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU" minOccurs="0"/>
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
    "subid",
    "impi",
    "impu"
})
@XmlRootElement(name = "QueryDevRegStatusRequest")
public class QueryDevRegStatusRequest {

    @XmlElement(name = "SUBID")
    protected String subid;
    @XmlElement(name = "IMPI")
    protected String impi;
    @XmlElement(name = "IMPU")
    protected String impu;

    /**
     * Gets the value of the subid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBID() {
        return subid;
    }

    /**
     * Sets the value of the subid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBID(String value) {
        this.subid = value;
    }

    /**
     * Gets the value of the impi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPI() {
        return impi;
    }

    /**
     * Sets the value of the impi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPI(String value) {
        this.impi = value;
    }

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

}
