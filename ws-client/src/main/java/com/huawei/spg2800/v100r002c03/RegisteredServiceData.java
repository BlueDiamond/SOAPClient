
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisteredServiceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredServiceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="COMSS" type="{http://www.huawei.com/SPG2800/V100R002C03}ComSSDataType" minOccurs="0"/>
 *         &lt;element name="CFU" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SIC" type="{http://www.huawei.com/SPG2800/V100R002C03}QuerySCRType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CFS" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFSType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CFB" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CFNR" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFNRType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredServiceData", propOrder = {
    "impu",
    "comss",
    "cfu",
    "sic",
    "cfs",
    "cfb",
    "cfnr"
})
public class RegisteredServiceData {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "COMSS")
    protected ComSSDataType comss;
    @XmlElement(name = "CFU")
    protected List<QueryCFType> cfu;
    @XmlElement(name = "SIC")
    protected List<QuerySCRType> sic;
    @XmlElement(name = "CFS")
    protected List<QueryCFSType> cfs;
    @XmlElement(name = "CFB")
    protected List<QueryCFType> cfb;
    @XmlElement(name = "CFNR")
    protected List<QueryCFNRType> cfnr;

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
     * Gets the value of the comss property.
     * 
     * @return
     *     possible object is
     *     {@link ComSSDataType }
     *     
     */
    public ComSSDataType getCOMSS() {
        return comss;
    }

    /**
     * Sets the value of the comss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComSSDataType }
     *     
     */
    public void setCOMSS(ComSSDataType value) {
        this.comss = value;
    }

    /**
     * Gets the value of the cfu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFU().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCFType }
     * 
     * 
     */
    public List<QueryCFType> getCFU() {
        if (cfu == null) {
            cfu = new ArrayList<QueryCFType>();
        }
        return this.cfu;
    }

    /**
     * Gets the value of the sic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuerySCRType }
     * 
     * 
     */
    public List<QuerySCRType> getSIC() {
        if (sic == null) {
            sic = new ArrayList<QuerySCRType>();
        }
        return this.sic;
    }

    /**
     * Gets the value of the cfs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCFSType }
     * 
     * 
     */
    public List<QueryCFSType> getCFS() {
        if (cfs == null) {
            cfs = new ArrayList<QueryCFSType>();
        }
        return this.cfs;
    }

    /**
     * Gets the value of the cfb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFB().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCFType }
     * 
     * 
     */
    public List<QueryCFType> getCFB() {
        if (cfb == null) {
            cfb = new ArrayList<QueryCFType>();
        }
        return this.cfb;
    }

    /**
     * Gets the value of the cfnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCFNRType }
     * 
     * 
     */
    public List<QueryCFNRType> getCFNR() {
        if (cfnr == null) {
            cfnr = new ArrayList<QueryCFNRType>();
        }
        return this.cfnr;
    }

}
