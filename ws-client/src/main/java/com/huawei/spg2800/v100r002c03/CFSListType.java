
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CFSListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CFSListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CFSSET" type="{http://www.huawei.com/SPG2800/V100R002C03}CFSSetType" maxOccurs="25"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFSListType", propOrder = {
    "cfsset"
})
public class CFSListType {

    @XmlElement(name = "CFSSET", required = true)
    protected List<CFSSetType> cfsset;

    /**
     * Gets the value of the cfsset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfsset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFSSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFSSetType }
     * 
     * 
     */
    public List<CFSSetType> getCFSSET() {
        if (cfsset == null) {
            cfsset = new ArrayList<CFSSetType>();
        }
        return this.cfsset;
    }

}
