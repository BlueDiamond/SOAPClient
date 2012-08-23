
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RELNUMDATAListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RELNUMDATAListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RELNUMLST" type="{http://www.huawei.com/SPG2800/V100R002C03}tRELNUMLST"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RELNUMDATAListType", propOrder = {
    "relnumlst"
})
public class RELNUMDATAListType {

    @XmlElement(name = "RELNUMLST", required = true)
    protected String relnumlst;

    /**
     * Gets the value of the relnumlst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELNUMLST() {
        return relnumlst;
    }

    /**
     * Sets the value of the relnumlst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELNUMLST(String value) {
        this.relnumlst = value;
    }

}
