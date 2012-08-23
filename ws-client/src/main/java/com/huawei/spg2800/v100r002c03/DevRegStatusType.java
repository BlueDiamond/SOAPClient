
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevRegStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevRegStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="IMSUSERST">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NOTREGISTERED"/>
 *               &lt;enumeration value="REGISTERED"/>
 *               &lt;enumeration value="UNREGISTERED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PENDINGFLG" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevRegStatusType", propOrder = {
    "impi",
    "impu",
    "imsuserst",
    "pendingflg"
})
public class DevRegStatusType {

    @XmlElement(name = "IMPI", required = true)
    protected String impi;
    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "IMSUSERST", required = true)
    protected String imsuserst;
    @XmlElement(name = "PENDINGFLG")
    protected boolean pendingflg;

    /**
     * Gets the value of the impi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMPI() {
        return impi;
    }

    /**
     * Sets the value of the impi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMPI(String value) {
        this.impi = value;
    }

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
     * Gets the value of the imsuserst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSUSERST() {
        return imsuserst;
    }

    /**
     * Sets the value of the imsuserst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSUSERST(String value) {
        this.imsuserst = value;
    }

    /**
     * Gets the value of the pendingflg property.
     * 
     */
    public boolean isPENDINGFLG() {
        return pendingflg;
    }

    /**
     * Sets the value of the pendingflg property.
     * 
     */
    public void setPENDINGFLG(boolean value) {
        this.pendingflg = value;
    }

}
