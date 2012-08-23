
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
 *         &lt;element name="SUBID" type="{http://www.huawei.com/SPG2800/V100R002C03}tSUBID"/>
 *         &lt;element name="DIMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI"/>
 *         &lt;element name="PASSWORD" type="{http://www.huawei.com/SPG2800/V100R002C03}tHPassword"/>
 *         &lt;element name="REALM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="127"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHARGTPLID" type="{http://www.huawei.com/SPG2800/V100R002C03}tCHARGTPLID" minOccurs="0"/>
 *         &lt;element name="PREPROVIMPULIST" type="{http://www.huawei.com/SPG2800/V100R002C03}PreProvIMPUListType"/>
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
    "subid",
    "dimpi",
    "password",
    "realm",
    "chargtplid",
    "preprovimpulist"
})
@XmlRootElement(name = "AddPreProvDev2SubRequest")
public class AddPreProvDev2SubRequest {

    @XmlElement(name = "SUBID", required = true)
    protected String subid;
    @XmlElement(name = "DIMPI", required = true)
    protected String dimpi;
    @XmlElement(name = "PASSWORD", required = true)
    protected String password;
    @XmlElement(name = "REALM", required = true)
    protected String realm;
    @XmlElement(name = "CHARGTPLID")
    protected Integer chargtplid;
    @XmlElement(name = "PREPROVIMPULIST", required = true)
    protected PreProvIMPUListType preprovimpulist;

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
     * Gets the value of the dimpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIMPI() {
        return dimpi;
    }

    /**
     * Sets the value of the dimpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIMPI(String value) {
        this.dimpi = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWORD() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWORD(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the realm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREALM() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREALM(String value) {
        this.realm = value;
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
     * Gets the value of the preprovimpulist property.
     * 
     * @return
     *     possible object is
     *     {@link PreProvIMPUListType }
     *     
     */
    public PreProvIMPUListType getPREPROVIMPULIST() {
        return preprovimpulist;
    }

    /**
     * Sets the value of the preprovimpulist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreProvIMPUListType }
     *     
     */
    public void setPREPROVIMPULIST(PreProvIMPUListType value) {
        this.preprovimpulist = value;
    }

}
