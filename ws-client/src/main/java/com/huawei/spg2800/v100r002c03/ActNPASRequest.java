
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="OTELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELURI"/>
 *         &lt;element name="OSIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="NTELIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tTELURI"/>
 *         &lt;element name="NSIPIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tSIPURI"/>
 *         &lt;element name="IRSID" type="{http://www.huawei.com/SPG2800/V100R002C03}tIRSID"/>
 *         &lt;element name="PermissiveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AnnouncementTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PermissivePeriodAnnounceFlag" type="{http://www.huawei.com/SPG2800/V100R002C03}tFlag"/>
 *         &lt;element name="AnnoucementPeriodAnnounceFlag" type="{http://www.huawei.com/SPG2800/V100R002C03}tFlag"/>
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
@XmlType(name = "", propOrder = {
    "otelimpu",
    "osipimpu",
    "ntelimpu",
    "nsipimpu",
    "irsid",
    "permissiveTime",
    "announcementTime",
    "endTime",
    "permissivePeriodAnnounceFlag",
    "annoucementPeriodAnnounceFlag",
    "timezone"
})
@XmlRootElement(name = "ActNPASRequest")
public class ActNPASRequest {

    @XmlElement(name = "OTELIMPU", required = true)
    protected String otelimpu;
    @XmlElement(name = "OSIPIMPU", required = true)
    protected String osipimpu;
    @XmlElement(name = "NTELIMPU", required = true)
    protected String ntelimpu;
    @XmlElement(name = "NSIPIMPU", required = true)
    protected String nsipimpu;
    @XmlElement(name = "IRSID")
    protected short irsid;
    @XmlElement(name = "PermissiveTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar permissiveTime;
    @XmlElement(name = "AnnouncementTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar announcementTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "PermissivePeriodAnnounceFlag")
    protected int permissivePeriodAnnounceFlag;
    @XmlElement(name = "AnnoucementPeriodAnnounceFlag")
    protected int annoucementPeriodAnnounceFlag;
    @XmlElement(name = "TIMEZONE")
    protected Integer timezone;

    /**
     * Gets the value of the otelimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTELIMPU() {
        return otelimpu;
    }

    /**
     * Sets the value of the otelimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTELIMPU(String value) {
        this.otelimpu = value;
    }

    /**
     * Gets the value of the osipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSIPIMPU() {
        return osipimpu;
    }

    /**
     * Sets the value of the osipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSIPIMPU(String value) {
        this.osipimpu = value;
    }

    /**
     * Gets the value of the ntelimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTELIMPU() {
        return ntelimpu;
    }

    /**
     * Sets the value of the ntelimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTELIMPU(String value) {
        this.ntelimpu = value;
    }

    /**
     * Gets the value of the nsipimpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSIPIMPU() {
        return nsipimpu;
    }

    /**
     * Sets the value of the nsipimpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSIPIMPU(String value) {
        this.nsipimpu = value;
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
     * Gets the value of the permissiveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermissiveTime() {
        return permissiveTime;
    }

    /**
     * Sets the value of the permissiveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermissiveTime(XMLGregorianCalendar value) {
        this.permissiveTime = value;
    }

    /**
     * Gets the value of the announcementTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnouncementTime() {
        return announcementTime;
    }

    /**
     * Sets the value of the announcementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnouncementTime(XMLGregorianCalendar value) {
        this.announcementTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the permissivePeriodAnnounceFlag property.
     * 
     */
    public int getPermissivePeriodAnnounceFlag() {
        return permissivePeriodAnnounceFlag;
    }

    /**
     * Sets the value of the permissivePeriodAnnounceFlag property.
     * 
     */
    public void setPermissivePeriodAnnounceFlag(int value) {
        this.permissivePeriodAnnounceFlag = value;
    }

    /**
     * Gets the value of the annoucementPeriodAnnounceFlag property.
     * 
     */
    public int getAnnoucementPeriodAnnounceFlag() {
        return annoucementPeriodAnnounceFlag;
    }

    /**
     * Sets the value of the annoucementPeriodAnnounceFlag property.
     * 
     */
    public void setAnnoucementPeriodAnnounceFlag(int value) {
        this.annoucementPeriodAnnounceFlag = value;
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
