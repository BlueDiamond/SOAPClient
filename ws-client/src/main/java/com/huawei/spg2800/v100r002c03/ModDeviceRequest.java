
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI"/>
 *         &lt;element name="NIMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI" minOccurs="0"/>
 *         &lt;element name="NPASSWORD" type="{http://www.huawei.com/SPG2800/V100R002C03}tHPassword" minOccurs="0"/>
 *         &lt;element name="NREALM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="127"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHARGTPLID" type="{http://www.huawei.com/SPG2800/V100R002C03}tCHARGTPLID" minOccurs="0"/>
 *         &lt;element name="REGIMPULIST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="REGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}RegIMPUPairType" maxOccurs="10"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "impi",
    "nimpi",
    "npassword",
    "nrealm",
    "chargtplid",
    "regimpulist"
})
@XmlRootElement(name = "ModDeviceRequest")
public class ModDeviceRequest {

    @XmlElement(name = "IMPI", required = true)
    protected String impi;
    @XmlElement(name = "NIMPI")
    protected String nimpi;
    @XmlElement(name = "NPASSWORD")
    protected String npassword;
    @XmlElement(name = "NREALM")
    protected String nrealm;
    @XmlElement(name = "CHARGTPLID")
    protected Integer chargtplid;
    @XmlElement(name = "REGIMPULIST")
    protected ModDeviceRequest.REGIMPULIST regimpulist;

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
     * Gets the value of the nimpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIMPI() {
        return nimpi;
    }

    /**
     * Sets the value of the nimpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIMPI(String value) {
        this.nimpi = value;
    }

    /**
     * Gets the value of the npassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPASSWORD() {
        return npassword;
    }

    /**
     * Sets the value of the npassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPASSWORD(String value) {
        this.npassword = value;
    }

    /**
     * Gets the value of the nrealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNREALM() {
        return nrealm;
    }

    /**
     * Sets the value of the nrealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNREALM(String value) {
        this.nrealm = value;
    }

    /**
     * Gets the value of the chargtplid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCHARGTPLID() {
        return chargtplid;
    }

    /**
     * Sets the value of the chargtplid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCHARGTPLID(Integer value) {
        this.chargtplid = value;
    }

    /**
     * Gets the value of the regimpulist property.
     * 
     * @return
     *     possible object is
     *     {@link ModDeviceRequest.REGIMPULIST }
     *     
     */
    public ModDeviceRequest.REGIMPULIST getREGIMPULIST() {
        return regimpulist;
    }

    /**
     * Sets the value of the regimpulist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModDeviceRequest.REGIMPULIST }
     *     
     */
    public void setREGIMPULIST(ModDeviceRequest.REGIMPULIST value) {
        this.regimpulist = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="REGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}RegIMPUPairType" maxOccurs="10"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "regimpu"
    })
    public static class REGIMPULIST {

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

}
