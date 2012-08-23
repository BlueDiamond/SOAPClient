
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCFNRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCFNRType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="BSV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BSG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="NOTIFYCALLER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOTIFYFORWARDER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SUBINF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="22"/>
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
@XmlType(name = "QueryCFNRType", propOrder = {
    "impu",
    "bsv",
    "bsg",
    "dimpu",
    "notifycaller",
    "notifyforwarder",
    "subinf"
})
public class QueryCFNRType {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "BSV")
    protected Integer bsv;
    @XmlElement(name = "BSG")
    protected Integer bsg;
    @XmlElement(name = "DIMPU", required = true)
    protected String dimpu;
    @XmlElement(name = "NOTIFYCALLER")
    protected Integer notifycaller;
    @XmlElement(name = "NOTIFYFORWARDER")
    protected Integer notifyforwarder;
    @XmlElement(name = "SUBINF")
    protected String subinf;

    /**
     * Gets the value of the impu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPU() {
        return impu;
    }

    /**
     * Sets the value of the impu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPU(String value) {
        this.impu = value;
    }

    /**
     * Gets the value of the bsv property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBSV() {
        return bsv;
    }

    /**
     * Sets the value of the bsv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBSV(Integer value) {
        this.bsv = value;
    }

    /**
     * Gets the value of the bsg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBSG() {
        return bsg;
    }

    /**
     * Sets the value of the bsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBSG(Integer value) {
        this.bsg = value;
    }

    /**
     * Gets the value of the dimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIMPU() {
        return dimpu;
    }

    /**
     * Sets the value of the dimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIMPU(String value) {
        this.dimpu = value;
    }

    /**
     * Gets the value of the notifycaller property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNOTIFYCALLER() {
        return notifycaller;
    }

    /**
     * Sets the value of the notifycaller property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNOTIFYCALLER(Integer value) {
        this.notifycaller = value;
    }

    /**
     * Gets the value of the notifyforwarder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNOTIFYFORWARDER() {
        return notifyforwarder;
    }

    /**
     * Sets the value of the notifyforwarder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNOTIFYFORWARDER(Integer value) {
        this.notifyforwarder = value;
    }

    /**
     * Gets the value of the subinf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBINF() {
        return subinf;
    }

    /**
     * Sets the value of the subinf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBINF(String value) {
        this.subinf = value;
    }

}
