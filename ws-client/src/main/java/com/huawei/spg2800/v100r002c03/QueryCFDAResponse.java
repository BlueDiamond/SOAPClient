
package com.huawei.spg2800.v100r002c03;

import java.util.ArrayList;
import java.util.List;
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
 *                             &lt;element name="Item" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFType" maxOccurs="unbounded"/>
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
@XmlRootElement(name = "QueryCFDAResponse")
public class QueryCFDAResponse
    extends GenericResponseType
{

    @XmlElement(name = "ResultData")
    protected QueryCFDAResponse.ResultData resultData;

    /**
     * Gets the value of the resultData property.
     * 
     * @return
     *     possible object is
     *     {@link QueryCFDAResponse.ResultData }
     *     
     */
    public QueryCFDAResponse.ResultData getResultData() {
        return resultData;
    }

    /**
     * Sets the value of the resultData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryCFDAResponse.ResultData }
     *     
     */
    public void setResultData(QueryCFDAResponse.ResultData value) {
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
     *                   &lt;element name="Item" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFType" maxOccurs="unbounded"/>
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
        protected QueryCFDAResponse.ResultData.Table1 table1;

        /**
         * Gets the value of the table1 property.
         * 
         * @return
         *     possible object is
         *     {@link QueryCFDAResponse.ResultData.Table1 }
         *     
         */
        public QueryCFDAResponse.ResultData.Table1 getTable1() {
            return table1;
        }

        /**
         * Sets the value of the table1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryCFDAResponse.ResultData.Table1 }
         *     
         */
        public void setTable1(QueryCFDAResponse.ResultData.Table1 value) {
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
         *         &lt;element name="Item" type="{http://www.huawei.com/SPG2800/V100R002C03}QueryCFType" maxOccurs="unbounded"/>
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
            protected List<QueryCFType> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryCFType }
             * 
             * 
             */
            public List<QueryCFType> getItem() {
                if (item == null) {
                    item = new ArrayList<QueryCFType>();
                }
                return this.item;
            }

        }

    }

}
