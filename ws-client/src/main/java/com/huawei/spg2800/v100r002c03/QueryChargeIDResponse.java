
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
 *     &lt;extension base="{http://www.huawei.com/SPG2800/V100R002C03}GenericResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResultData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Table1" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Item" type="{http://www.huawei.com/SPG2800/V100R002C03}ChargeIDType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "resultData"
})
@XmlRootElement(name = "QueryChargeIDResponse")
public class QueryChargeIDResponse
    extends GenericResponseType
{

    @XmlElement(name = "ResultData")
    protected QueryChargeIDResponse.ResultData resultData;

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link QueryChargeIDResponse.ResultData }
     *     
     */
    public QueryChargeIDResponse.ResultData getResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryChargeIDResponse.ResultData }
     *     
     */
    public void setResultData(QueryChargeIDResponse.ResultData value) {
        this.resultData = value;
    }


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
     *         &lt;element name="Table1" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Item" type="{http://www.huawei.com/SPG2800/V100R002C03}ChargeIDType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "table1"
    })
    public static class ResultData {

        @XmlElement(name = "Table1")
        protected QueryChargeIDResponse.ResultData.Table1 table1;

        /**
         * Gets the value of the table1 property.
         * 
         * @return
         *     possible object is
         *     {@link QueryChargeIDResponse.ResultData.Table1 }
         *     
         */
        public QueryChargeIDResponse.ResultData.Table1 getTable1() {
            return table1;
        }

        /**
         * Sets the value of the table1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryChargeIDResponse.ResultData.Table1 }
         *     
         */
        public void setTable1(QueryChargeIDResponse.ResultData.Table1 value) {
            this.table1 = value;
        }


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
         *         &lt;element name="Item" type="{http://www.huawei.com/SPG2800/V100R002C03}ChargeIDType"/>
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
            "item"
        })
        public static class Table1 {

            @XmlElement(name = "Item", required = true)
            protected ChargeIDType item;

            /**
             * Gets the value of the item property.
             * 
             * @return
             *     possible object is
             *     {@link ChargeIDType }
             *     
             */
            public ChargeIDType getItem() {
                return item;
            }

            /**
             * Sets the value of the item property.
             * 
             * @param value
             *     allowed object is
             *     {@link ChargeIDType }
             *     
             */
            public void setItem(ChargeIDType value) {
                this.item = value;
            }

        }

    }

}
