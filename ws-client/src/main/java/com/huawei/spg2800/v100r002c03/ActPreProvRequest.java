
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
 *         &lt;element name="DIMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI"/>
 *         &lt;element name="PIMPI" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPI"/>
 *         &lt;element name="PASSWORD" type="{http://www.huawei.com/SPG2800/V100R002C03}tHPassword"/>
 *         &lt;element name="REALM">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="127"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACTPREPROVIMPULIST" type="{http://www.huawei.com/SPG2800/V100R002C03}ActPreProvIMPUListType"/>
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
    "dimpi",
    "pimpi",
    "password",
    "realm",
    "actpreprovimpulist"
})
@XmlRootElement(name = "ActPreProvRequest")
public class ActPreProvRequest {

    @XmlElement(name = "DIMPI", required = true)
    protected String dimpi;
    @XmlElement(name = "PIMPI", required = true)
    protected String pimpi;
    @XmlElement(name = "PASSWORD", required = true)
    protected String password;
    @XmlElement(name = "REALM", required = true)
    protected String realm;
    @XmlElement(name = "ACTPREPROVIMPULIST", required = true)
    protected ActPreProvIMPUListType actpreprovimpulist;

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
     * Gets the value of the pimpi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPIMPI() {
        return pimpi;
    }

    /**
     * Sets the value of the pimpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPIMPI(String value) {
        this.pimpi = value;
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
     * Gets the value of the actpreprovimpulist property.
     * 
     * @return
     *     possible object is
     *     {@link ActPreProvIMPUListType }
     *     
     */
    public ActPreProvIMPUListType getACTPREPROVIMPULIST() {
        return actpreprovimpulist;
    }

    /**
     * Sets the value of the actpreprovimpulist property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActPreProvIMPUListType }
     *     
     */
    public void setACTPREPROVIMPULIST(ActPreProvIMPUListType value) {
        this.actpreprovimpulist = value;
    }

}
