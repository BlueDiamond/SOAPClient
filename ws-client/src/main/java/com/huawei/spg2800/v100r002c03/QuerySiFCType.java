
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySiFCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySiFCType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIFCSETID" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySiFCType", propOrder = {
    "sifcsetid"
})
public class QuerySiFCType {

    @XmlElement(name = "SIFCSETID")
    @XmlSchemaType(name = "unsignedByte")
    protected short sifcsetid;

    /**
     * Gets the value of the sifcsetid property.
     * 
     */
    public short getSIFCSETID() {
        return sifcsetid;
    }

    /**
     * Sets the value of the sifcsetid property.
     * 
     */
    public void setSIFCSETID(short value) {
        this.sifcsetid = value;
    }

}
