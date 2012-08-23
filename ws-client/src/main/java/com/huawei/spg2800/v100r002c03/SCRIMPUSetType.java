
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SCRIMPUSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCRIMPUSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SICIDX">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="24"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SCRIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCRIMPUSetType", propOrder = {
    "sicidx",
    "scrimpu"
})
public class SCRIMPUSetType {

    @XmlElement(name = "SICIDX")
    protected int sicidx;
    @XmlElement(name = "SCRIMPU", required = true)
    protected String scrimpu;

    /**
     * Gets the value of the sicidx property.
     * 
     */
    public int getSICIDX() {
        return sicidx;
    }

    /**
     * Sets the value of the sicidx property.
     * 
     */
    public void setSICIDX(int value) {
        this.sicidx = value;
    }

    /**
     * Gets the value of the scrimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCRIMPU() {
        return scrimpu;
    }

    /**
     * Sets the value of the scrimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCRIMPU(String value) {
        this.scrimpu = value;
    }

}
