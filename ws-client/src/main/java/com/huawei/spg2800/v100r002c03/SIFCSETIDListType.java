
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIFCSETIDListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIFCSETIDListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIFCSETID" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIFCSETID" maxOccurs="8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIFCSETIDListType", propOrder = {
    "sifcsetid"
})
public class SIFCSETIDListType {

    @XmlElement(name = "SIFCSETID", type = Integer.class)
    protected List<Integer> sifcsetid;

    /**
     * Gets the value of the sifcsetid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sifcsetid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIFCSETID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSIFCSETID() {
        if (sifcsetid == null) {
            sifcsetid = new ArrayList<Integer>();
        }
        return this.sifcsetid;
    }

}
