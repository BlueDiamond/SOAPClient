
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
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU" minOccurs="0"/>
 *         &lt;element name="PUSI" type="{http://www.huawei.com/SPG2800/V100R002C03}tString0-127" minOccurs="0"/>
 *         &lt;element name="SIFCSETIDPAIRLIST" type="{http://www.huawei.com/SPG2800/V100R002C03}SIFCSETIDPairListType"/>
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
    "pusi",
    "sifcsetidpairlist"
})
@XmlRootElement(name = "ModSiFCRequest")
public class ModSiFCRequest {

    @XmlElement(name = "IMPU")
    protected String impu;
    @XmlElement(name = "PUSI")
    protected String pusi;
    @XmlElement(name = "SIFCSETIDPAIRLIST", required = true)
    protected SIFCSETIDPairListType sifcsetidpairlist;

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
     * Gets the value of the pusi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPUSI() {
        return pusi;
    }

    /**
     * Sets the value of the pusi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPUSI(String value) {
        this.pusi = value;
    }

    /**
     * Gets the value of the sifcsetidpairlist property.
     * 
     * @return
     *     possible object is
     *     {@link SIFCSETIDPairListType }
     *     
     */
    public SIFCSETIDPairListType getSIFCSETIDPAIRLIST() {
        return sifcsetidpairlist;
    }

    /**
     * Sets the value of the sifcsetidpairlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFCSETIDPairListType }
     *     
     */
    public void setSIFCSETIDPAIRLIST(SIFCSETIDPairListType value) {
        this.sifcsetidpairlist = value;
    }

}
