
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryDRCWType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryDRCWType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="PATTERN" type="{http://www.huawei.com/SPG2800/V100R002C03}tPATTERN"/>
 *         &lt;element name="CWPATTERN" type="{http://www.huawei.com/SPG2800/V100R002C03}tPATTERN"/>
 *         &lt;element name="SIMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryDRCWType", propOrder = {
    "impu",
    "pattern",
    "cwpattern",
    "simpu"
})
public class QueryDRCWType {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "PATTERN")
    protected int pattern;
    @XmlElement(name = "CWPATTERN")
    protected int cwpattern;
    @XmlElement(name = "SIMPU", required = true)
    protected String simpu;

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
     * Gets the value of the pattern property.
     * 
     */
    public int getPATTERN() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     */
    public void setPATTERN(int value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the cwpattern property.
     * 
     */
    public int getCWPATTERN() {
        return cwpattern;
    }

    /**
     * Sets the value of the cwpattern property.
     * 
     */
    public void setCWPATTERN(int value) {
        this.cwpattern = value;
    }

    /**
     * Gets the value of the simpu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIMPU() {
        return simpu;
    }

    /**
     * Sets the value of the simpu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIMPU(String value) {
        this.simpu = value;
    }

}
