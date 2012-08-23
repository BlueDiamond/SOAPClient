
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
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="REGFLAG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AUTOACTFLAG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFUVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CFBVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CFNRVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CFNLVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CFNRCVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CDVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CLIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CIDCW" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RIO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CNIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CLIR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CNIR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NRID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RND" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NRND" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CW" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ACR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TIP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OTIR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AOC_D" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AOC_E" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="XEXH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="XEGJ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IIFC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCBS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCNR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCBSR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CCNRR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TPTY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NPTY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MCR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MWI" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HOLD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ECT" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DAN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="STOP_SECRET" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EBO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ICO" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OUTG" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="INQYH" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SETCFNRTIME" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ACRTOVM" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SETBUSY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PWCB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AOC_S" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MCID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HRCN" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "impu",
    "regflag",
    "autoactflag",
    "cfuvm",
    "cfbvm",
    "cfnrvm",
    "cfnlvm",
    "cfnrcvm",
    "cd",
    "cdvm",
    "clip",
    "cidcw",
    "rio",
    "cnip",
    "clir",
    "rip",
    "cnir",
    "rid",
    "nrid",
    "rnd",
    "nrnd",
    "cw",
    "oip",
    "acr",
    "tip",
    "otir",
    "cr",
    "aocd",
    "aoce",
    "xexh",
    "xegj",
    "iifc",
    "ccbs",
    "ccnr",
    "ccbsr",
    "ccnrr",
    "tpty",
    "npty",
    "mcr",
    "mwi",
    "dc",
    "hold",
    "ect",
    "dan",
    "stopsecret",
    "ebo",
    "ico",
    "outg",
    "inqyh",
    "setcfnrtime",
    "acrtovm",
    "setbusy",
    "pwcb",
    "aocs",
    "mcid",
    "hrcn"
})
@XmlRootElement(name = "RegComSSRequest")
public class RegComSSRequest {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "REGFLAG")
    protected Integer regflag;
    @XmlElement(name = "AUTOACTFLAG")
    protected Integer autoactflag;
    @XmlElement(name = "CFUVM")
    protected Integer cfuvm;
    @XmlElement(name = "CFBVM")
    protected Integer cfbvm;
    @XmlElement(name = "CFNRVM")
    protected Integer cfnrvm;
    @XmlElement(name = "CFNLVM")
    protected Integer cfnlvm;
    @XmlElement(name = "CFNRCVM")
    protected Integer cfnrcvm;
    @XmlElement(name = "CD")
    protected Integer cd;
    @XmlElement(name = "CDVM")
    protected Integer cdvm;
    @XmlElement(name = "CLIP")
    protected Integer clip;
    @XmlElement(name = "CIDCW")
    protected Integer cidcw;
    @XmlElement(name = "RIO")
    protected Integer rio;
    @XmlElement(name = "CNIP")
    protected Integer cnip;
    @XmlElement(name = "CLIR")
    protected Integer clir;
    @XmlElement(name = "RIP")
    protected Integer rip;
    @XmlElement(name = "CNIR")
    protected Integer cnir;
    @XmlElement(name = "RID")
    protected Integer rid;
    @XmlElement(name = "NRID")
    protected Integer nrid;
    @XmlElement(name = "RND")
    protected Integer rnd;
    @XmlElement(name = "NRND")
    protected Integer nrnd;
    @XmlElement(name = "CW")
    protected Integer cw;
    @XmlElement(name = "OIP")
    protected Integer oip;
    @XmlElement(name = "ACR")
    protected Integer acr;
    @XmlElement(name = "TIP")
    protected Integer tip;
    @XmlElement(name = "OTIR")
    protected Integer otir;
    @XmlElement(name = "CR")
    protected Integer cr;
    @XmlElement(name = "AOC_D")
    protected Integer aocd;
    @XmlElement(name = "AOC_E")
    protected Integer aoce;
    @XmlElement(name = "XEXH")
    protected Integer xexh;
    @XmlElement(name = "XEGJ")
    protected Integer xegj;
    @XmlElement(name = "IIFC")
    protected Integer iifc;
    @XmlElement(name = "CCBS")
    protected Integer ccbs;
    @XmlElement(name = "CCNR")
    protected Integer ccnr;
    @XmlElement(name = "CCBSR")
    protected Integer ccbsr;
    @XmlElement(name = "CCNRR")
    protected Integer ccnrr;
    @XmlElement(name = "TPTY")
    protected Integer tpty;
    @XmlElement(name = "NPTY")
    protected Integer npty;
    @XmlElement(name = "MCR")
    protected Integer mcr;
    @XmlElement(name = "MWI")
    protected Integer mwi;
    @XmlElement(name = "DC")
    protected Integer dc;
    @XmlElement(name = "HOLD")
    protected Integer hold;
    @XmlElement(name = "ECT")
    protected Integer ect;
    @XmlElement(name = "DAN")
    protected Integer dan;
    @XmlElement(name = "STOP_SECRET")
    protected Integer stopsecret;
    @XmlElement(name = "EBO")
    protected Integer ebo;
    @XmlElement(name = "ICO")
    protected Integer ico;
    @XmlElement(name = "OUTG")
    protected Integer outg;
    @XmlElement(name = "INQYH")
    protected Integer inqyh;
    @XmlElement(name = "SETCFNRTIME")
    protected Integer setcfnrtime;
    @XmlElement(name = "ACRTOVM")
    protected Integer acrtovm;
    @XmlElement(name = "SETBUSY")
    protected Integer setbusy;
    @XmlElement(name = "PWCB")
    protected Integer pwcb;
    @XmlElement(name = "AOC_S")
    protected Integer aocs;
    @XmlElement(name = "MCID")
    protected Integer mcid;
    @XmlElement(name = "HRCN")
    protected Integer hrcn;

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
     * Gets the value of the regflag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getREGFLAG() {
        return regflag;
    }

    /**
     * Sets the value of the regflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setREGFLAG(Integer value) {
        this.regflag = value;
    }

    /**
     * Gets the value of the autoactflag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAUTOACTFLAG() {
        return autoactflag;
    }

    /**
     * Sets the value of the autoactflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAUTOACTFLAG(Integer value) {
        this.autoactflag = value;
    }

    /**
     * Gets the value of the cfuvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCFUVM() {
        return cfuvm;
    }

    /**
     * Sets the value of the cfuvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCFUVM(Integer value) {
        this.cfuvm = value;
    }

    /**
     * Gets the value of the cfbvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCFBVM() {
        return cfbvm;
    }

    /**
     * Sets the value of the cfbvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCFBVM(Integer value) {
        this.cfbvm = value;
    }

    /**
     * Gets the value of the cfnrvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCFNRVM() {
        return cfnrvm;
    }

    /**
     * Sets the value of the cfnrvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCFNRVM(Integer value) {
        this.cfnrvm = value;
    }

    /**
     * Gets the value of the cfnlvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCFNLVM() {
        return cfnlvm;
    }

    /**
     * Sets the value of the cfnlvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCFNLVM(Integer value) {
        this.cfnlvm = value;
    }

    /**
     * Gets the value of the cfnrcvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCFNRCVM() {
        return cfnrcvm;
    }

    /**
     * Sets the value of the cfnrcvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCFNRCVM(Integer value) {
        this.cfnrcvm = value;
    }

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCD() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCD(Integer value) {
        this.cd = value;
    }

    /**
     * Gets the value of the cdvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCDVM() {
        return cdvm;
    }

    /**
     * Sets the value of the cdvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCDVM(Integer value) {
        this.cdvm = value;
    }

    /**
     * Gets the value of the clip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLIP() {
        return clip;
    }

    /**
     * Sets the value of the clip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCLIP(Integer value) {
        this.clip = value;
    }

    /**
     * Gets the value of the cidcw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCIDCW() {
        return cidcw;
    }

    /**
     * Sets the value of the cidcw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCIDCW(Integer value) {
        this.cidcw = value;
    }

    /**
     * Gets the value of the rio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRIO() {
        return rio;
    }

    /**
     * Sets the value of the rio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRIO(Integer value) {
        this.rio = value;
    }

    /**
     * Gets the value of the cnip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCNIP() {
        return cnip;
    }

    /**
     * Sets the value of the cnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCNIP(Integer value) {
        this.cnip = value;
    }

    /**
     * Gets the value of the clir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLIR() {
        return clir;
    }

    /**
     * Sets the value of the clir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCLIR(Integer value) {
        this.clir = value;
    }

    /**
     * Gets the value of the rip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRIP() {
        return rip;
    }

    /**
     * Sets the value of the rip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRIP(Integer value) {
        this.rip = value;
    }

    /**
     * Gets the value of the cnir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCNIR() {
        return cnir;
    }

    /**
     * Sets the value of the cnir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCNIR(Integer value) {
        this.cnir = value;
    }

    /**
     * Gets the value of the rid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRID() {
        return rid;
    }

    /**
     * Sets the value of the rid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRID(Integer value) {
        this.rid = value;
    }

    /**
     * Gets the value of the nrid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNRID() {
        return nrid;
    }

    /**
     * Sets the value of the nrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNRID(Integer value) {
        this.nrid = value;
    }

    /**
     * Gets the value of the rnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRND() {
        return rnd;
    }

    /**
     * Sets the value of the rnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRND(Integer value) {
        this.rnd = value;
    }

    /**
     * Gets the value of the nrnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNRND() {
        return nrnd;
    }

    /**
     * Sets the value of the nrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNRND(Integer value) {
        this.nrnd = value;
    }

    /**
     * Gets the value of the cw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCW() {
        return cw;
    }

    /**
     * Sets the value of the cw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCW(Integer value) {
        this.cw = value;
    }

    /**
     * Gets the value of the oip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOIP() {
        return oip;
    }

    /**
     * Sets the value of the oip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOIP(Integer value) {
        this.oip = value;
    }

    /**
     * Gets the value of the acr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getACR() {
        return acr;
    }

    /**
     * Sets the value of the acr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setACR(Integer value) {
        this.acr = value;
    }

    /**
     * Gets the value of the tip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTIP() {
        return tip;
    }

    /**
     * Sets the value of the tip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTIP(Integer value) {
        this.tip = value;
    }

    /**
     * Gets the value of the otir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOTIR() {
        return otir;
    }

    /**
     * Sets the value of the otir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOTIR(Integer value) {
        this.otir = value;
    }

    /**
     * Gets the value of the cr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCR() {
        return cr;
    }

    /**
     * Sets the value of the cr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCR(Integer value) {
        this.cr = value;
    }

    /**
     * Gets the value of the aocd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAOCD() {
        return aocd;
    }

    /**
     * Sets the value of the aocd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAOCD(Integer value) {
        this.aocd = value;
    }

    /**
     * Gets the value of the aoce property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAOCE() {
        return aoce;
    }

    /**
     * Sets the value of the aoce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAOCE(Integer value) {
        this.aoce = value;
    }

    /**
     * Gets the value of the xexh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXEXH() {
        return xexh;
    }

    /**
     * Sets the value of the xexh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXEXH(Integer value) {
        this.xexh = value;
    }

    /**
     * Gets the value of the xegj property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getXEGJ() {
        return xegj;
    }

    /**
     * Sets the value of the xegj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setXEGJ(Integer value) {
        this.xegj = value;
    }

    /**
     * Gets the value of the iifc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIIFC() {
        return iifc;
    }

    /**
     * Sets the value of the iifc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIIFC(Integer value) {
        this.iifc = value;
    }

    /**
     * Gets the value of the ccbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCBS() {
        return ccbs;
    }

    /**
     * Sets the value of the ccbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCBS(Integer value) {
        this.ccbs = value;
    }

    /**
     * Gets the value of the ccnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCNR() {
        return ccnr;
    }

    /**
     * Sets the value of the ccnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCNR(Integer value) {
        this.ccnr = value;
    }

    /**
     * Gets the value of the ccbsr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCBSR() {
        return ccbsr;
    }

    /**
     * Sets the value of the ccbsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCBSR(Integer value) {
        this.ccbsr = value;
    }

    /**
     * Gets the value of the ccnrr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCNRR() {
        return ccnrr;
    }

    /**
     * Sets the value of the ccnrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCNRR(Integer value) {
        this.ccnrr = value;
    }

    /**
     * Gets the value of the tpty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTPTY() {
        return tpty;
    }

    /**
     * Sets the value of the tpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTPTY(Integer value) {
        this.tpty = value;
    }

    /**
     * Gets the value of the npty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNPTY() {
        return npty;
    }

    /**
     * Sets the value of the npty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNPTY(Integer value) {
        this.npty = value;
    }

    /**
     * Gets the value of the mcr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCR() {
        return mcr;
    }

    /**
     * Sets the value of the mcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCR(Integer value) {
        this.mcr = value;
    }

    /**
     * Gets the value of the mwi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMWI() {
        return mwi;
    }

    /**
     * Sets the value of the mwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMWI(Integer value) {
        this.mwi = value;
    }

    /**
     * Gets the value of the dc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDC() {
        return dc;
    }

    /**
     * Sets the value of the dc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDC(Integer value) {
        this.dc = value;
    }

    /**
     * Gets the value of the hold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHOLD() {
        return hold;
    }

    /**
     * Sets the value of the hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHOLD(Integer value) {
        this.hold = value;
    }

    /**
     * Gets the value of the ect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getECT() {
        return ect;
    }

    /**
     * Sets the value of the ect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setECT(Integer value) {
        this.ect = value;
    }

    /**
     * Gets the value of the dan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDAN() {
        return dan;
    }

    /**
     * Sets the value of the dan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDAN(Integer value) {
        this.dan = value;
    }

    /**
     * Gets the value of the stopsecret property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSTOPSECRET() {
        return stopsecret;
    }

    /**
     * Sets the value of the stopsecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSTOPSECRET(Integer value) {
        this.stopsecret = value;
    }

    /**
     * Gets the value of the ebo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBO() {
        return ebo;
    }

    /**
     * Sets the value of the ebo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBO(Integer value) {
        this.ebo = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICO(Integer value) {
        this.ico = value;
    }

    /**
     * Gets the value of the outg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOUTG() {
        return outg;
    }

    /**
     * Sets the value of the outg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOUTG(Integer value) {
        this.outg = value;
    }

    /**
     * Gets the value of the inqyh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINQYH() {
        return inqyh;
    }

    /**
     * Sets the value of the inqyh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINQYH(Integer value) {
        this.inqyh = value;
    }

    /**
     * Gets the value of the setcfnrtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSETCFNRTIME() {
        return setcfnrtime;
    }

    /**
     * Sets the value of the setcfnrtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSETCFNRTIME(Integer value) {
        this.setcfnrtime = value;
    }

    /**
     * Gets the value of the acrtovm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getACRTOVM() {
        return acrtovm;
    }

    /**
     * Sets the value of the acrtovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setACRTOVM(Integer value) {
        this.acrtovm = value;
    }

    /**
     * Gets the value of the setbusy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSETBUSY() {
        return setbusy;
    }

    /**
     * Sets the value of the setbusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSETBUSY(Integer value) {
        this.setbusy = value;
    }

    /**
     * Gets the value of the pwcb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPWCB() {
        return pwcb;
    }

    /**
     * Sets the value of the pwcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPWCB(Integer value) {
        this.pwcb = value;
    }

    /**
     * Gets the value of the aocs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAOCS() {
        return aocs;
    }

    /**
     * Sets the value of the aocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAOCS(Integer value) {
        this.aocs = value;
    }

    /**
     * Gets the value of the mcid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCID() {
        return mcid;
    }

    /**
     * Sets the value of the mcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCID(Integer value) {
        this.mcid = value;
    }

    /**
     * Gets the value of the hrcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHRCN() {
        return hrcn;
    }

    /**
     * Sets the value of the hrcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHRCN(Integer value) {
        this.hrcn = value;
    }

}
