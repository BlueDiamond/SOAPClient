
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedDialDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedDialDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ABBRNUMBER">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DESTIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedDialDataType", propOrder = {
    "abbrnumber",
    "destimpu"
})
public class SpeedDialDataType {

    @XmlElement(name = "ABBRNUMBER", required = true)
    protected String abbrnumber;
    @XmlElement(name = "DESTIMPU", required = true)
    protected String destimpu;

    /**
     * Gets the value of the abbrnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getABBRNUMBER() {
        return abbrnumber;
    }

    /**
     * Sets the value of the abbrnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setABBRNUMBER(String value) {
        this.abbrnumber = value;
    }

    /**
     * Gets the value of the destimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTIMPU() {
        return destimpu;
    }

    /**
     * Sets the value of the destimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTIMPU(String value) {
        this.destimpu = value;
    }

}
