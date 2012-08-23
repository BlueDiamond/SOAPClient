
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PUSIListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PUSIListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PUSISET" type="{http://www.huawei.com/SPG2800/V100R002C03}PUSISetType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PUSIListType", propOrder = {
    "pusiset"
})
public class PUSIListType {

    @XmlElement(name = "PUSISET", required = true)
    protected List<PUSISetType> pusiset;

    /**
     * Gets the value of the pusiset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pusiset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPUSISET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PUSISetType }
     * 
     * 
     */
    public List<PUSISetType> getPUSISET() {
        if (pusiset == null) {
            pusiset = new ArrayList<PUSISetType>();
        }
        return this.pusiset;
    }

}