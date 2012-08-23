
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegIMPUPairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegIMPUPairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OREGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="NREGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegIMPUPairType", propOrder = {
    "oregimpu",
    "nregimpu"
})
public class RegIMPUPairType {

    @XmlElement(name = "OREGIMPU", required = true)
    protected String oregimpu;
    @XmlElement(name = "NREGIMPU", required = true)
    protected String nregimpu;

    /**
     * Gets the value of the oregimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOREGIMPU() {
        return oregimpu;
    }

    /**
     * Sets the value of the oregimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOREGIMPU(String value) {
        this.oregimpu = value;
    }

    /**
     * Gets the value of the nregimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNREGIMPU() {
        return nregimpu;
    }

    /**
     * Sets the value of the nregimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNREGIMPU(String value) {
        this.nregimpu = value;
    }

}
