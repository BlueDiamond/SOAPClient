
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreProv4HSSIMPUListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreProv4HSSIMPUListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PREPROV4HSSIMPUSET" type="{http://www.huawei.com/SPG2800/V100R002C03}PreProv4HSSIMPUSetType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreProv4HSSIMPUListType", propOrder = {
    "preprov4HSSIMPUSET"
})
public class PreProv4HSSIMPUListType {

    @XmlElement(name = "PREPROV4HSSIMPUSET", required = true)
    protected List<PreProv4HSSIMPUSetType> preprov4HSSIMPUSET;

    /**
     * Gets the value of the preprov4HSSIMPUSET property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preprov4HSSIMPUSET property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPREPROV4HSSIMPUSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreProv4HSSIMPUSetType }
     * 
     * 
     */
    public List<PreProv4HSSIMPUSetType> getPREPROV4HSSIMPUSET() {
        if (preprov4HSSIMPUSET == null) {
            preprov4HSSIMPUSET = new ArrayList<PreProv4HSSIMPUSetType>();
        }
        return this.preprov4HSSIMPUSET;
    }

}
