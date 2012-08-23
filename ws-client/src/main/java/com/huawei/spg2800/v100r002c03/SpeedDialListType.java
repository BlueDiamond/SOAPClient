
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedDialListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedDialListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpeedDialData" type="{http://www.huawei.com/SPG2800/V100R002C03}SpeedDialDataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedDialListType", propOrder = {
    "speedDialData"
})
public class SpeedDialListType {

    @XmlElement(name = "SpeedDialData", required = true)
    protected List<SpeedDialDataType> speedDialData;

    /**
     * Gets the value of the speedDialData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the speedDialData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpeedDialData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpeedDialDataType }
     * 
     * 
     */
    public List<SpeedDialDataType> getSpeedDialData() {
        if (speedDialData == null) {
            speedDialData = new ArrayList<SpeedDialDataType>();
        }
        return this.speedDialData;
    }

}
