
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryRepDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryRepDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REPDATA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REPTYPE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryRepDataType", propOrder = {
    "repdata",
    "reptype"
})
public class QueryRepDataType {

    @XmlElement(name = "REPDATA", required = true)
    protected String repdata;
    @XmlElement(name = "REPTYPE")
    protected int reptype;

    /**
     * Gets the value of the repdata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPDATA() {
        return repdata;
    }

    /**
     * Sets the value of the repdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPDATA(String value) {
        this.repdata = value;
    }

    /**
     * Gets the value of the reptype property.
     * 
     */
    public int getREPTYPE() {
        return reptype;
    }

    /**
     * Sets the value of the reptype property.
     * 
     */
    public void setREPTYPE(int value) {
        this.reptype = value;
    }

}
