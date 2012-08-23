
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
 *         &lt;element name="IMPUList" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPUList"/>
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
    "impuList"
})
@XmlRootElement(name = "RmvDeviceTNRequest")
public class RmvDeviceTNRequest {

    @XmlElement(name = "IMPUList", required = true)
    protected TIMPUList impuList;

    /**
     * Gets the value of the impuList property.
     * 
     * @return
     *     possible object is
     *     {@link TIMPUList }
     *     
     */
    public TIMPUList getIMPUList() {
        return impuList;
    }

    /**
     * Sets the value of the impuList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIMPUList }
     *     
     */
    public void setIMPUList(TIMPUList value) {
        this.impuList = value;
    }

}
