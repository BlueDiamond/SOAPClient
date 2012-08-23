
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreProvIMPUSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreProvIMPUSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELURI"/>
 *         &lt;element name="SIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="IRSID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
 *         &lt;element name="IFCSETIDLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}IFCSETIDListType" minOccurs="0"/>
 *         &lt;element name="SIFCSETIDLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}SIFCSETIDListType" minOccurs="0"/>
 *         &lt;element name="TEMPLATEIDX" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="VMAIND" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="PRON" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CPC" type="{http://www.huawei.com/SPG2800/V100R002C03}tCPC" minOccurs="0"/>
 *         &lt;element name="UNAME" type="{http://www.huawei.com/SPG2800/V100R002C03}tUNAME" minOccurs="0"/>
 *         &lt;element name="DSPIDX" type="{http://www.huawei.com/SPG2800/V100R002C03}tDSPIDX" minOccurs="0"/>
 *         &lt;element name="DPR" type="{http://www.huawei.com/SPG2800/V100R002C03}tDPR" minOccurs="0"/>
 *         &lt;element name="ESRN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="127"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VCCFLAG" type="{http://www.huawei.com/SPG2800/V100R002C03}tVCCFLAG" minOccurs="0"/>
 *         &lt;element name="MAXPARACALL" type="{http://www.huawei.com/SPG2800/V100R002C03}tMAXPARACALL" minOccurs="0"/>
 *         &lt;element name="TIMEZONE" type="{http://www.huawei.com/SPG2800/V100R002C03}tTIMEZONE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreProvIMPUSetType", propOrder = {
    "telimpu",
    "sipimpu",
    "irsid",
    "ifcsetidlist",
    "sifcsetidlist",
    "templateidx",
    "vmaind",
    "pron",
    "cpc",
    "uname",
    "dspidx",
    "dpr",
    "esrn",
    "vccflag",
    "maxparacall",
    "timezone"
})
public class PreProvIMPUSetType {

    @XmlElement(name = "TELIMPU", required = true)
    protected String telimpu;
    @XmlElement(name = "SIPIMPU", required = true)
    protected String sipimpu;
    @XmlElement(name = "IRSID")
    protected short irsid;
    @XmlElement(name = "IFCSETIDLIST")
    protected IFCSETIDListType ifcsetidlist;
    @XmlElement(name = "SIFCSETIDLIST")
    protected SIFCSETIDListType sifcsetidlist;
    @XmlElement(name = "TEMPLATEIDX")
    @XmlSchemaType(name = "unsignedInt")
    protected Long templateidx;
    @XmlElement(name = "VMAIND")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vmaind;
    @XmlElement(name = "PRON")
    protected String pron;
    @XmlElement(name = "CPC")
    protected Integer cpc;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "DSPIDX")
    protected Integer dspidx;
    @XmlElement(name = "DPR")
    protected String dpr;
    @XmlElement(name = "ESRN")
    protected String esrn;
    @XmlElement(name = "VCCFLAG")
    protected Integer vccflag;
    @XmlElement(name = "MAXPARACALL")
    protected Integer maxparacall;
    @XmlElement(name = "TIMEZONE")
    protected Integer timezone;

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
     * Gets the value of the templateidx property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTEMPLATEIDX() {
        return templateidx;
    }

    /**
     * Sets the value of the templateidx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTEMPLATEIDX(Long value) {
        this.templateidx = value;
    }

    /**
     * Gets the value of the vmaind property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVMAIND() {
        return vmaind;
    }

    /**
     * Sets the value of the vmaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVMAIND(Long value) {
        this.vmaind = value;
    }

    /**
     * Gets the value of the pron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRON() {
        return pron;
    }

    /**
     * Sets the value of the pron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRON(String value) {
        this.pron = value;
    }

    /**
     * Gets the value of the cpc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCPC() {
        return cpc;
    }

    /**
     * Sets the value of the cpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCPC(Integer value) {
        this.cpc = value;
    }

    /**
     * Gets the value of the uname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNAME() {
        return uname;
    }

    /**
     * Sets the value of the uname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNAME(String value) {
        this.uname = value;
    }

    /**
     * Gets the value of the dspidx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDSPIDX() {
        return dspidx;
    }

    /**
     * Sets the value of the dspidx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDSPIDX(Integer value) {
        this.dspidx = value;
    }

    /**
     * Gets the value of the dpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPR() {
        return dpr;
    }

    /**
     * Sets the value of the dpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPR(String value) {
        this.dpr = value;
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
     * Gets the value of the vccflag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVCCFLAG() {
        return vccflag;
    }

    /**
     * Sets the value of the vccflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVCCFLAG(Integer value) {
        this.vccflag = value;
    }

    /**
     * Gets the value of the maxparacall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAXPARACALL() {
        return maxparacall;
    }

    /**
     * Sets the value of the maxparacall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAXPARACALL(Integer value) {
        this.maxparacall = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTIMEZONE() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTIMEZONE(Integer value) {
        this.timezone = value;
    }

}
