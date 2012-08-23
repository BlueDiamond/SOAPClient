
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActPreProvIMPUListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActPreProvIMPUListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACTPREPROVIMPUSET" type="{http://www.huawei.com/SPG2800/V100R002C03}ActPreProvIMPUSetType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActPreProvIMPUListType", propOrder = {
    "actpreprovimpuset"
})
public class ActPreProvIMPUListType {

    @XmlElement(name = "ACTPREPROVIMPUSET", required = true)
    protected List<ActPreProvIMPUSetType> actpreprovimpuset;

    /**
     * Gets the value of the actpreprovimpuset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actpreprovimpuset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACTPREPROVIMPUSET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActPreProvIMPUSetType }
     * 
     * 
     */
    public List<ActPreProvIMPUSetType> getACTPREPROVIMPUSET() {
        if (actpreprovimpuset == null) {
            actpreprovimpuset = new ArrayList<ActPreProvIMPUSetType>();
        }
        return this.actpreprovimpuset;
    }

}
