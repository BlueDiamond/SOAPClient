
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIFCSETIDPairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIFCSETIDPairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OSIFCSETID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="1024"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSIFCSETID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="1024"/>
 *               &lt;minInclusive value="0"/>
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
@XmlType(name = "SIFCSETIDPairType", propOrder = {
    "osifcsetid",
    "nsifcsetid"
})
public class SIFCSETIDPairType {

    @XmlElement(name = "OSIFCSETID")
    protected int osifcsetid;
    @XmlElement(name = "NSIFCSETID")
    protected int nsifcsetid;

    /**
     * Gets the value of the osifcsetid property.
     * 
     */
    public int getOSIFCSETID() {
        return osifcsetid;
    }

    /**
     * Sets the value of the osifcsetid property.
     * 
     */
    public void setOSIFCSETID(int value) {
        this.osifcsetid = value;
    }

    /**
     * Gets the value of the nsifcsetid property.
     * 
     */
    public int getNSIFCSETID() {
        return nsifcsetid;
    }

    /**
     * Sets the value of the nsifcsetid property.
     * 
     */
    public void setNSIFCSETID(int value) {
        this.nsifcsetid = value;
    }

}
