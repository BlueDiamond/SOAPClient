
package com.huawei.spg2800.v100r002c03;

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
 *         &lt;element name="REGIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="REGIMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tREGIMPUTYPE" minOccurs="0"/>
 *         &lt;element name="TELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELURI"/>
 *         &lt;element name="TELIMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELIMPUTYPE" minOccurs="0"/>
 *         &lt;element name="SIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="SIPIMPUTYPE" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPIMPUTYPE" minOccurs="0"/>
 *         &lt;element name="IRSID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
 *         &lt;element name="IFCSETIDLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}IFCSETIDListType" minOccurs="0"/>
 *         &lt;element name="SIFCSETIDLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}SIFCSETIDListType" minOccurs="0"/>
 *         &lt;element name="ESRN" type="{http://www.huawei.com/SPG2800/V100R002C03}tESRN" minOccurs="0"/>
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
    "regimpu",
    "regimputype",
    "telimpu",
    "telimputype",
    "sipimpu",
    "sipimputype",
    "irsid",
    "ifcsetidlist",
    "sifcsetidlist",
    "esrn"
})
@XmlRootElement(name = "AddTN2Device4HSSRequest")
public class AddTN2Device4HSSRequest {

    @XmlElement(name = "IMPI", required = true)
    protected String impi;
    @XmlElement(name = "REGIMPU", required = true)
    protected String regimpu;
    @XmlElement(name = "REGIMPUTYPE")
    protected Integer regimputype;
    @XmlElement(name = "TELIMPU", required = true)
    protected String telimpu;
    @XmlElement(name = "TELIMPUTYPE")
    protected Integer telimputype;
    @XmlElement(name = "SIPIMPU", required = true)
    protected String sipimpu;
    @XmlElement(name = "SIPIMPUTYPE")
    protected Integer sipimputype;
    @XmlElement(name = "IRSID")
    protected short irsid;
    @XmlElement(name = "IFCSETIDLIST")
    protected IFCSETIDListType ifcsetidlist;
    @XmlElement(name = "SIFCSETIDLIST")
    protected SIFCSETIDListType sifcsetidlist;
    @XmlElement(name = "ESRN")
    protected String esrn;

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
     * Gets the value of the regimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIMPU() {
        return regimpu;
    }

    /**
     * Sets the value of the regimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIMPU(String value) {
        this.regimpu = value;
    }

    /**
     * Gets the value of the regimputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREGIMPUTYPE() {
        return regimputype;
    }

    /**
     * Sets the value of the regimputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREGIMPUTYPE(Integer value) {
        this.regimputype = value;
    }

    /**
     * Gets the value of the telimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELIMPU() {
        return telimpu;
    }

    /**
     * Sets the value of the telimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELIMPU(String value) {
        this.telimpu = value;
    }

    /**
     * Gets the value of the telimputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTELIMPUTYPE() {
        return telimputype;
    }

    /**
     * Sets the value of the telimputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTELIMPUTYPE(Integer value) {
        this.telimputype = value;
    }

    /**
     * Gets the value of the sipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPIMPU() {
        return sipimpu;
    }

    /**
     * Sets the value of the sipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPIMPU(String value) {
        this.sipimpu = value;
    }

    /**
     * Gets the value of the sipimputype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSIPIMPUTYPE() {
        return sipimputype;
    }

    /**
     * Sets the value of the sipimputype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSIPIMPUTYPE(Integer value) {
        this.sipimputype = value;
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
     * Gets the value of the ifcsetidlist property.
     * 
     * @return
     *     possible object is
     *     {@link IFCSETIDListType }
     *     
     */
    public IFCSETIDListType getIFCSETIDLIST() {
        return ifcsetidlist;
    }

    /**
     * Sets the value of the ifcsetidlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link IFCSETIDListType }
     *     
     */
    public void setIFCSETIDLIST(IFCSETIDListType value) {
        this.ifcsetidlist = value;
    }

    /**
     * Gets the value of the sifcsetidlist property.
     * 
     * @return
     *     possible object is
     *     {@link SIFCSETIDListType }
     *     
     */
    public SIFCSETIDListType getSIFCSETIDLIST() {
        return sifcsetidlist;
    }

    /**
     * Sets the value of the sifcsetidlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFCSETIDListType }
     *     
     */
    public void setSIFCSETIDLIST(SIFCSETIDListType value) {
        this.sifcsetidlist = value;
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

}