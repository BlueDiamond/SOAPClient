
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCFSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCFSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="EP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="24"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="DIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCFSType", propOrder = {
    "impu",
    "ep",
    "cimpu",
    "dimpu"
})
public class QueryCFSType {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "EP")
    protected int ep;
    @XmlElement(name = "CIMPU", required = true)
    protected String cimpu;
    @XmlElement(name = "DIMPU", required = true)
    protected String dimpu;

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
     * Gets the value of the ep property.
     * 
     */
    public int getEP() {
        return ep;
    }

    /**
     * Sets the value of the ep property.
     * 
     */
    public void setEP(int value) {
        this.ep = value;
    }

    /**
     * Gets the value of the cimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMPU() {
        return cimpu;
    }

    /**
     * Sets the value of the cimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMPU(String value) {
        this.cimpu = value;
    }

    /**
     * Gets the value of the dimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIMPU() {
        return dimpu;
    }

    /**
     * Sets the value of the dimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIMPU(String value) {
        this.dimpu = value;
    }

}
