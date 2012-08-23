
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SIFCSETIDPairListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIFCSETIDPairListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIFCSETIDPair" type="{http://www.huawei.com/SPG2800/V100R002C03}SIFCSETIDPairType" maxOccurs="8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIFCSETIDPairListType", propOrder = {
    "sifcsetidPair"
})
public class SIFCSETIDPairListType {

    @XmlElement(name = "SIFCSETIDPair", required = true)
    protected List<SIFCSETIDPairType> sifcsetidPair;

    /**
     * Gets the value of the sifcsetidPair property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sifcsetidPair property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIFCSETIDPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SIFCSETIDPairType }
     * 
     * 
     */
    public List<SIFCSETIDPairType> getSIFCSETIDPair() {
        if (sifcsetidPair == null) {
            sifcsetidPair = new ArrayList<SIFCSETIDPairType>();
        }
        return this.sifcsetidPair;
    }

}
