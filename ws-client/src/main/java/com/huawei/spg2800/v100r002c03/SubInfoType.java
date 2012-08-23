
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubInfoType">
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
 *         &lt;element name="SIFCSETIDLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}SIFCSETIDListType" minOccurs="0"/>
 *         &lt;element name="UNAME" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PRON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DSPIDX" type="{http://www.huawei.com/SPG2800/V100R002C03}tDSPIDX" minOccurs="0"/>
 *         &lt;element name="DPR" type="{http://www.huawei.com/SPG2800/V100R002C03}tDPR" minOccurs="0"/>
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
@XmlType(name = "SubInfoType", propOrder = {
    "subid",
    "impi",
    "impuList",
    "irsid",
    "aliasid",
    "defimpu",
    "chargtplid",
    "esrn",
    "sifcsetidlist",
    "uname",
    "pron",
    "cpc",
    "dspidx",
    "dpr",
    "timezone"
})
public class SubInfoType {

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
    @XmlElement(name = "SIFCSETIDLIST")
    protected SIFCSETIDListType sifcsetidlist;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "PRON")
    protected String pron;
    @XmlElement(name = "CPC")
    protected String cpc;
    @XmlElement(name = "DSPIDX")
    protected Integer dspidx;
    @XmlElement(name = "DPR")
    protected String dpr;
    @XmlElement(name = "TIMEZONE")
    protected Integer timezone;

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
     *     {@link String }
     *     
     */
    public String getCPC() {
        return cpc;
    }

    /**
     * Sets the value of the cpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPC(String value) {
        this.cpc = value;
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
