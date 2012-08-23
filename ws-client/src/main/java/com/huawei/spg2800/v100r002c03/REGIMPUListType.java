
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REGIMPUListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REGIMPUListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="REGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}RegIMPUPairType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REGIMPUListType", propOrder = {
    "regimpu"
})
public class REGIMPUListType {

    @XmlElement(name = "REGIMPU", required = true)
    protected List<RegIMPUPairType> regimpu;

    /**
     * Gets the value of the regimpu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regimpu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREGIMPU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegIMPUPairType }
     * 
     * 
     */
    public List<RegIMPUPairType> getREGIMPU() {
        if (regimpu == null) {
            regimpu = new ArrayList<RegIMPUPairType>();
        }
        return this.regimpu;
    }

}
