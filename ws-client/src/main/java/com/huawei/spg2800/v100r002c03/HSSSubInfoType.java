
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HSSSubInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HSSSubInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SUBID" type="{http://www.huawei.com/SPG2800/V100R002C03}tSUBID"/>
 *         &lt;element name="IMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI"/>
 *         &lt;element name="IMPUList" type="{http://www.huawei.com/SPG2800/V100R002C03}IMPUListType"/>
 *         &lt;element name="IRSID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
 *         &lt;element name="ALIASID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
 *         &lt;element name="DEFIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="CHARGTPLID" type="{http://www.huawei.com/SPG2800/V100R002C03}tCHARGTPLID" minOccurs="0"/>
 *         &lt;element name="ESRN" type="{http://www.huawei.com/SPG2800/V100R002C03}tESRN" minOccurs="0"/>
 *         &lt;element name="SIFCSETID" type="{http://www.huawei.com/SPG2800/V100R002C03}SIFCSETIDListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSSSubInfoType", propOrder = {
    "subid",
    "impi",
    "impuList",
    "irsid",
    "aliasid",
    "defimpu",
    "chargtplid",
    "esrn",
    "sifcsetid"
})
public class HSSSubInfoType {

    @XmlElement(name = "SUBID", required = true)
    protected String subid;
    @XmlElement(name = "IMPI", required = true)
    protected String impi;
    @XmlElement(name = "IMPUList", required = true)
    protected IMPUListType impuList;
    @XmlElement(name = "IRSID")
    protected short irsid;
    @XmlElement(name = "ALIASID")
    protected short aliasid;
    @XmlElement(name = "DEFIMPU", required = true)
    protected String defimpu;
    @XmlElement(name = "CHARGTPLID")
    protected Integer chargtplid;
    @XmlElement(name = "ESRN")
    protected String esrn;
    @XmlElement(name = "SIFCSETID")
    protected SIFCSETIDListType sifcsetid;

    /**
     * Gets the value of the subid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBID() {
        return subid;
    }

    /**
     * Sets the value of the subid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBID(String value) {
        this.subid = value;
    }

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
     * Gets the value of the impuList property.
     * 
     * @return
     *     possible object is
     *     {@link IMPUListType }
     *     
     */
    public IMPUListType getIMPUList() {
        return impuList;
    }

    /**
     * Sets the value of the impuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IMPUListType }
     *     
     */
    public void setIMPUList(IMPUListType value) {
        this.impuList = value;
    }

    /**
     * Gets the value of the irsid property.
     * 
     */
    public short getIRSID() {
        return irsid;
    }

    /**
     * Sets the value of the irsid property.
     * 
     */
    public void setIRSID(short value) {
        this.irsid = value;
    }

    /**
     * Gets the value of the aliasid property.
     * 
     */
    public short getALIASID() {
        return aliasid;
    }

    /**
     * Sets the value of the aliasid property.
     * 
     */
    public void setALIASID(short value) {
        this.aliasid = value;
    }

    /**
     * Gets the value of the defimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEFIMPU() {
        return defimpu;
    }

    /**
     * Sets the value of the defimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEFIMPU(String value) {
        this.defimpu = value;
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
     * Gets the value of the esrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESRN() {
        return esrn;
    }

    /**
     * Sets the value of the esrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESRN(String value) {
        this.esrn = value;
    }

    /**
     * Gets the value of the sifcsetid property.
     * 
     * @return
     *     possible object is
     *     {@link SIFCSETIDListType }
     *     
     */
    public SIFCSETIDListType getSIFCSETID() {
        return sifcsetid;
    }

    /**
     * Sets the value of the sifcsetid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFCSETIDListType }
     *     
     */
    public void setSIFCSETID(SIFCSETIDListType value) {
        this.sifcsetid = value;
    }

}
