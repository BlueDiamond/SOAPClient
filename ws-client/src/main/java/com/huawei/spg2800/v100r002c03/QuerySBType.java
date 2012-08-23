
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QuerySBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySBType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="PRIONUMLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}PRIONUMListType" minOccurs="0"/>
 *         &lt;element name="STARTTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="STOPTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RECURRENCE" type="{http://www.huawei.com/SPG2800/V100R002C03}tENUM012" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySBType", propOrder = {
    "impu",
    "prionumlist",
    "starttime",
    "stoptime",
    "recurrence"
})
public class QuerySBType {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "PRIONUMLIST")
    protected PRIONUMListType prionumlist;
    @XmlElement(name = "STARTTIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar starttime;
    @XmlElement(name = "STOPTIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stoptime;
    @XmlElement(name = "RECURRENCE")
    protected Integer recurrence;

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
     * Gets the value of the prionumlist property.
     * 
     * @return
     *     possible object is
     *     {@link PRIONUMListType }
     *     
     */
    public PRIONUMListType getPRIONUMLIST() {
        return prionumlist;
    }

    /**
     * Sets the value of the prionumlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PRIONUMListType }
     *     
     */
    public void setPRIONUMLIST(PRIONUMListType value) {
        this.prionumlist = value;
    }

    /**
     * Gets the value of the starttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTTIME() {
        return starttime;
    }

    /**
     * Sets the value of the starttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTTIME(XMLGregorianCalendar value) {
        this.starttime = value;
    }

    /**
     * Gets the value of the stoptime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTOPTIME() {
        return stoptime;
    }

    /**
     * Sets the value of the stoptime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTOPTIME(XMLGregorianCalendar value) {
        this.stoptime = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRECURRENCE() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRECURRENCE(Integer value) {
        this.recurrence = value;
    }

}
