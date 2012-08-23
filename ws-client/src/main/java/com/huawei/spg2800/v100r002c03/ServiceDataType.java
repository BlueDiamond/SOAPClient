
package com.huawei.spg2800.v100r002c03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IMPU" type="{http://www.huawei.com/SPG2800/V100R002C03}tIMPU"/>
 *         &lt;element name="TEMPLATEIDX" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="DSPIDX" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="LP" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="CSC" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="UNAME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFU" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFUVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFBVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFNRVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFNL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFNLVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCDVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFNRC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFNRCVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCLIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCIDCW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSRIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCNIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCLIR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSRIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCNIR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSRID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSNRID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSRND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSNRND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCCW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSOIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSACRM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSGOIR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMOIR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSTIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSTIR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSOTIR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSWAKE_UP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSAOC_D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSAOC_E" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSXEXH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSXEGJ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCWCFNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSIIFC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDN_CALL_OUT_BAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCCBS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCCNR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCCBSR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCCNRR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NS3PTY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSNPTY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDND" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMCR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCBA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSTMP_LIN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCODEC_CNTRL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMWI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSHOLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSECT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFTB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDAN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSTOP_SECRET" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMCID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSEBO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSICO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSOUTG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSINQYH" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSUINFO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDN_CALL_OUT_ALLOW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSOC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSETCFNRTIME" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFSB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSFAX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSABRC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSACRTOVM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSPREPAID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCRBT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSICB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMRINGING" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCBEG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCOLP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCOLR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCOLPOVR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSBAOC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSBOIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSBOICEXHC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSBAIC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSBICROM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSPEED_DIAL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSD1D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSD2D" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSAOC_S" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSNIGHTSRV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSBACKNUM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSAUTOCON" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCAMPON" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCLICKHOLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSQUEUE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSANSWER" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSICENCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCFGO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCTGO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCTIO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSETBUSY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSOVERSTEP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSRD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSABSENT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMONITOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSFMONITOR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDISCNT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSINSERT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSQSNS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSFINSERT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSASI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSPWCB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSMINIBAR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INTT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IITT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ICLT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ICDDD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ICIDD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IOLT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTLCO" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTLCT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTINTNANP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTINTWORLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTINT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTDA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTOSM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTOSP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO5" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO6" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO7" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO8" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO9" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO10" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO11" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO12" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO13" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO14" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO15" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CCO16" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDDCI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NTCI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LTCI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RSC" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="CIG" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="4294967295"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OUTRST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="INRST" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NOAT" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="RINGCOUNT" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="VMAIND" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="VDMAIND" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="TGRP" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="TIDHLD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="19"/>
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="23"/>
 *               &lt;enumeration value="24"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value="26"/>
 *               &lt;enumeration value="27"/>
 *               &lt;enumeration value="28"/>
 *               &lt;enumeration value="29"/>
 *               &lt;enumeration value="30"/>
 *               &lt;enumeration value="31"/>
 *               &lt;enumeration value="32"/>
 *               &lt;enumeration value="33"/>
 *               &lt;enumeration value="34"/>
 *               &lt;enumeration value="35"/>
 *               &lt;enumeration value="36"/>
 *               &lt;enumeration value="37"/>
 *               &lt;enumeration value="38"/>
 *               &lt;enumeration value="39"/>
 *               &lt;enumeration value="40"/>
 *               &lt;enumeration value="41"/>
 *               &lt;enumeration value="42"/>
 *               &lt;enumeration value="43"/>
 *               &lt;enumeration value="44"/>
 *               &lt;enumeration value="45"/>
 *               &lt;enumeration value="46"/>
 *               &lt;enumeration value="47"/>
 *               &lt;enumeration value="48"/>
 *               &lt;enumeration value="49"/>
 *               &lt;enumeration value="50"/>
 *               &lt;enumeration value="51"/>
 *               &lt;enumeration value="52"/>
 *               &lt;enumeration value="53"/>
 *               &lt;enumeration value="54"/>
 *               &lt;enumeration value="55"/>
 *               &lt;enumeration value="56"/>
 *               &lt;enumeration value="57"/>
 *               &lt;enumeration value="58"/>
 *               &lt;enumeration value="59"/>
 *               &lt;enumeration value="60"/>
 *               &lt;enumeration value="61"/>
 *               &lt;enumeration value="62"/>
 *               &lt;enumeration value="63"/>
 *               &lt;enumeration value="64"/>
 *               &lt;enumeration value="65"/>
 *               &lt;enumeration value="66"/>
 *               &lt;enumeration value="67"/>
 *               &lt;enumeration value="68"/>
 *               &lt;enumeration value="69"/>
 *               &lt;enumeration value="65535"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIDCW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="8"/>
 *               &lt;enumeration value="9"/>
 *               &lt;enumeration value="10"/>
 *               &lt;enumeration value="11"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="13"/>
 *               &lt;enumeration value="14"/>
 *               &lt;enumeration value="15"/>
 *               &lt;enumeration value="16"/>
 *               &lt;enumeration value="17"/>
 *               &lt;enumeration value="18"/>
 *               &lt;enumeration value="19"/>
 *               &lt;enumeration value="20"/>
 *               &lt;enumeration value="21"/>
 *               &lt;enumeration value="22"/>
 *               &lt;enumeration value="23"/>
 *               &lt;enumeration value="24"/>
 *               &lt;enumeration value="25"/>
 *               &lt;enumeration value="26"/>
 *               &lt;enumeration value="27"/>
 *               &lt;enumeration value="28"/>
 *               &lt;enumeration value="29"/>
 *               &lt;enumeration value="30"/>
 *               &lt;enumeration value="31"/>
 *               &lt;enumeration value="32"/>
 *               &lt;enumeration value="33"/>
 *               &lt;enumeration value="34"/>
 *               &lt;enumeration value="35"/>
 *               &lt;enumeration value="36"/>
 *               &lt;enumeration value="37"/>
 *               &lt;enumeration value="38"/>
 *               &lt;enumeration value="39"/>
 *               &lt;enumeration value="40"/>
 *               &lt;enumeration value="41"/>
 *               &lt;enumeration value="42"/>
 *               &lt;enumeration value="43"/>
 *               &lt;enumeration value="44"/>
 *               &lt;enumeration value="45"/>
 *               &lt;enumeration value="46"/>
 *               &lt;enumeration value="47"/>
 *               &lt;enumeration value="48"/>
 *               &lt;enumeration value="49"/>
 *               &lt;enumeration value="50"/>
 *               &lt;enumeration value="51"/>
 *               &lt;enumeration value="52"/>
 *               &lt;enumeration value="53"/>
 *               &lt;enumeration value="54"/>
 *               &lt;enumeration value="55"/>
 *               &lt;enumeration value="56"/>
 *               &lt;enumeration value="57"/>
 *               &lt;enumeration value="58"/>
 *               &lt;enumeration value="59"/>
 *               &lt;enumeration value="60"/>
 *               &lt;enumeration value="61"/>
 *               &lt;enumeration value="62"/>
 *               &lt;enumeration value="63"/>
 *               &lt;enumeration value="64"/>
 *               &lt;enumeration value="65"/>
 *               &lt;enumeration value="66"/>
 *               &lt;enumeration value="67"/>
 *               &lt;enumeration value="68"/>
 *               &lt;enumeration value="69"/>
 *               &lt;enumeration value="65535"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LMTGRP" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="FLBGRP" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="SLBGRP" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="COP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G711_64K_A_LAW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G711_64K_U_LAW" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G722" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G723" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G728" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G729" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODEC_MP4A" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODEC2833" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODEC2198" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_40" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_32" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_24" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_16" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AMR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CLEARMODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ILBC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SPEEX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G729EV" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="H261" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="H263" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODEC_MP4V" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="H264" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MPEG4" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="T38" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="T120" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G711A_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G711U_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_40_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_32_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_24_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="G726_16_VBD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WIND_BAND_AMR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GSM610" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="H263_2000" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BROADVOICE_32" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BROADVOICE_32_FEC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ACODEC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VCODEC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *               &lt;enumeration value="6"/>
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="POLIDX" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="EBOCL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EBOPL" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EBOIT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CPC" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PCHG" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="TFPT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CHT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MCIDMODE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MCIDCMODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PREPAIDIDX" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="CRBTID" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="ODBBICTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ODBBOCTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ODBBARTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ODBSS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ODBBRCFTYPE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PNOTI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ATSDTMBUSY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="STCF" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DPR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRON" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSHRCN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSSB" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSDSTR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NSCUN" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CUSCAT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VCCFLAG" type="{http://www.huawei.com/SPG2800/V100R002C03}tVCCFLAG" minOccurs="0"/>
 *         &lt;element name="MAXPARACALL" type="{http://www.huawei.com/SPG2800/V100R002C03}tMAXPARACALL" minOccurs="0"/>
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
@XmlType(name = "ServiceDataType", propOrder = {
    "impu",
    "templateidx",
    "dspidx",
    "lp",
    "csc",
    "uname",
    "utype",
    "nscfu",
    "nscfuvm",
    "nscfb",
    "nscfbvm",
    "nscfnr",
    "nscfnrvm",
    "nscfnl",
    "nscfnlvm",
    "nscd",
    "nscdvm",
    "nscfnrc",
    "nscfnrcvm",
    "nsclip",
    "nscidcw",
    "nsrio",
    "nscnip",
    "nsclir",
    "nsrip",
    "nscnir",
    "nsrid",
    "nsnrid",
    "nsrnd",
    "nsnrnd",
    "nscw",
    "nsccw",
    "nsoip",
    "nsacrm",
    "nsgoir",
    "nsmoir",
    "nstip",
    "nstir",
    "nsotir",
    "nscr",
    "nswakeup",
    "nsaocd",
    "nsaoce",
    "nsxexh",
    "nsxegj",
    "nscwcfnr",
    "nsiifc",
    "nsdncalloutbar",
    "nsccbs",
    "nsccnr",
    "nsccbsr",
    "nsccnrr",
    "ns3PTY",
    "nsnpty",
    "nsdnd",
    "nsmcr",
    "nscba",
    "nstmplin",
    "nscodeccntrl",
    "nsmwi",
    "nsdc",
    "nshold",
    "nsect",
    "nscftb",
    "nsdan",
    "nsstopsecret",
    "nsmcid",
    "nsebo",
    "nsico",
    "nsoutg",
    "nsinqyh",
    "nsuinfo",
    "nsdncalloutallow",
    "nssic",
    "nssoc",
    "nssetcfnrtime",
    "nscfs",
    "nscfsb",
    "nsfax",
    "nsabrc",
    "nsacrtovm",
    "nsprepaid",
    "nscrbt",
    "nsicb",
    "nsmringing",
    "nscis",
    "nscbeg",
    "nscolp",
    "nscolr",
    "nscolpovr",
    "nsbaoc",
    "nsboic",
    "nsboicexhc",
    "nsbaic",
    "nsbicrom",
    "nsspeeddial",
    "nssd1D",
    "nssd2D",
    "nsaocs",
    "nsnightsrv",
    "nsbacknum",
    "nsautocon",
    "nscampon",
    "nsclickhold",
    "nsqueue",
    "nssanswer",
    "nsicencf",
    "nscfgo",
    "nsctgo",
    "nsctio",
    "nssetbusy",
    "nsoverstep",
    "nsrd",
    "nsabsent",
    "nsmonitor",
    "nsfmonitor",
    "nsdiscnt",
    "nsinsert",
    "nsqsns",
    "nsfinsert",
    "nsasi",
    "nspwcb",
    "nsminibar",
    "intt",
    "iitt",
    "iclt",
    "icddd",
    "icidd",
    "iolt",
    "ctlco",
    "ctlct",
    "ctld",
    "ctintnanp",
    "ctintworld",
    "ctint",
    "ctda",
    "ctosm",
    "ctosp",
    "cco1",
    "cco2",
    "cco3",
    "cco4",
    "cco5",
    "cco6",
    "cco7",
    "cco8",
    "cco9",
    "cco10",
    "cco11",
    "cco12",
    "cco13",
    "cco14",
    "cco15",
    "cco16",
    "iddci",
    "ntci",
    "ltci",
    "rsc",
    "cig",
    "outrst",
    "inrst",
    "noat",
    "ringcount",
    "vmaind",
    "vdmaind",
    "tgrp",
    "tidhld",
    "tidcw",
    "scf",
    "lmtgrp",
    "flbgrp",
    "slbgrp",
    "cop",
    "g71164KALAW",
    "g71164KULAW",
    "g722",
    "g723",
    "g726",
    "g728",
    "g729",
    "codecmp4A",
    "codec2833",
    "codec2198",
    "g72640",
    "g72632",
    "g72624",
    "g72616",
    "amr",
    "clearmode",
    "ilbc",
    "speex",
    "g729EV",
    "h261",
    "h263",
    "codecmp4V",
    "h264",
    "mpeg4",
    "t38",
    "t120",
    "g711AVBD",
    "g711UVBD",
    "g726VBD",
    "g72640VBD",
    "g72632VBD",
    "g72624VBD",
    "g72616VBD",
    "windbandamr",
    "gsm610",
    "h2632000",
    "broadvoice32",
    "broadvoice32FEC",
    "acodec",
    "vcodec",
    "polidx",
    "ebocl",
    "ebopl",
    "eboit",
    "rm",
    "cpc",
    "pchg",
    "tfpt",
    "cht",
    "mcidmode",
    "mcidcmode",
    "prepaididx",
    "crbtid",
    "odbbictype",
    "odbboctype",
    "odbbartype",
    "odbss",
    "odbbrcftype",
    "pnoti",
    "atsdtmbusy",
    "stcf",
    "dpr",
    "pron",
    "nshrcn",
    "nssb",
    "nsdstr",
    "nscun",
    "cuscat",
    "vccflag",
    "maxparacall",
    "timezone"
})
public class ServiceDataType {

    @XmlElement(name = "IMPU", required = true)
    protected String impu;
    @XmlElement(name = "TEMPLATEIDX")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer templateidx;
    @XmlElement(name = "DSPIDX")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dspidx;
    @XmlElement(name = "LP")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer lp;
    @XmlElement(name = "CSC")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer csc;
    @XmlElement(name = "UNAME")
    protected String uname;
    @XmlElement(name = "UTYPE")
    protected Integer utype;
    @XmlElement(name = "NSCFU")
    protected Integer nscfu;
    @XmlElement(name = "NSCFUVM")
    protected Integer nscfuvm;
    @XmlElement(name = "NSCFB")
    protected Integer nscfb;
    @XmlElement(name = "NSCFBVM")
    protected Integer nscfbvm;
    @XmlElement(name = "NSCFNR")
    protected Integer nscfnr;
    @XmlElement(name = "NSCFNRVM")
    protected Integer nscfnrvm;
    @XmlElement(name = "NSCFNL")
    protected Integer nscfnl;
    @XmlElement(name = "NSCFNLVM")
    protected Integer nscfnlvm;
    @XmlElement(name = "NSCD")
    protected Integer nscd;
    @XmlElement(name = "NSCDVM")
    protected Integer nscdvm;
    @XmlElement(name = "NSCFNRC")
    protected Integer nscfnrc;
    @XmlElement(name = "NSCFNRCVM")
    protected Integer nscfnrcvm;
    @XmlElement(name = "NSCLIP")
    protected Integer nsclip;
    @XmlElement(name = "NSCIDCW")
    protected Integer nscidcw;
    @XmlElement(name = "NSRIO")
    protected Integer nsrio;
    @XmlElement(name = "NSCNIP")
    protected Integer nscnip;
    @XmlElement(name = "NSCLIR")
    protected Integer nsclir;
    @XmlElement(name = "NSRIP")
    protected Integer nsrip;
    @XmlElement(name = "NSCNIR")
    protected Integer nscnir;
    @XmlElement(name = "NSRID")
    protected Integer nsrid;
    @XmlElement(name = "NSNRID")
    protected Integer nsnrid;
    @XmlElement(name = "NSRND")
    protected Integer nsrnd;
    @XmlElement(name = "NSNRND")
    protected Integer nsnrnd;
    @XmlElement(name = "NSCW")
    protected Integer nscw;
    @XmlElement(name = "NSCCW")
    protected Integer nsccw;
    @XmlElement(name = "NSOIP")
    protected Integer nsoip;
    @XmlElement(name = "NSACRM")
    protected Integer nsacrm;
    @XmlElement(name = "NSGOIR")
    protected Integer nsgoir;
    @XmlElement(name = "NSMOIR")
    protected Integer nsmoir;
    @XmlElement(name = "NSTIP")
    protected Integer nstip;
    @XmlElement(name = "NSTIR")
    protected Integer nstir;
    @XmlElement(name = "NSOTIR")
    protected Integer nsotir;
    @XmlElement(name = "NSCR")
    protected Integer nscr;
    @XmlElement(name = "NSWAKE_UP")
    protected Integer nswakeup;
    @XmlElement(name = "NSAOC_D")
    protected Integer nsaocd;
    @XmlElement(name = "NSAOC_E")
    protected Integer nsaoce;
    @XmlElement(name = "NSXEXH")
    protected Integer nsxexh;
    @XmlElement(name = "NSXEGJ")
    protected Integer nsxegj;
    @XmlElement(name = "NSCWCFNR")
    protected Integer nscwcfnr;
    @XmlElement(name = "NSIIFC")
    protected Integer nsiifc;
    @XmlElement(name = "NSDN_CALL_OUT_BAR")
    protected Integer nsdncalloutbar;
    @XmlElement(name = "NSCCBS")
    protected Integer nsccbs;
    @XmlElement(name = "NSCCNR")
    protected Integer nsccnr;
    @XmlElement(name = "NSCCBSR")
    protected Integer nsccbsr;
    @XmlElement(name = "NSCCNRR")
    protected Integer nsccnrr;
    @XmlElement(name = "NS3PTY")
    protected Integer ns3PTY;
    @XmlElement(name = "NSNPTY")
    protected Integer nsnpty;
    @XmlElement(name = "NSDND")
    protected Integer nsdnd;
    @XmlElement(name = "NSMCR")
    protected Integer nsmcr;
    @XmlElement(name = "NSCBA")
    protected Integer nscba;
    @XmlElement(name = "NSTMP_LIN")
    protected Integer nstmplin;
    @XmlElement(name = "NSCODEC_CNTRL")
    protected Integer nscodeccntrl;
    @XmlElement(name = "NSMWI")
    protected Integer nsmwi;
    @XmlElement(name = "NSDC")
    protected Integer nsdc;
    @XmlElement(name = "NSHOLD")
    protected Integer nshold;
    @XmlElement(name = "NSECT")
    protected Integer nsect;
    @XmlElement(name = "NSCFTB")
    protected Integer nscftb;
    @XmlElement(name = "NSDAN")
    protected Integer nsdan;
    @XmlElement(name = "NSSTOP_SECRET")
    protected Integer nsstopsecret;
    @XmlElement(name = "NSMCID")
    protected Integer nsmcid;
    @XmlElement(name = "NSEBO")
    protected Integer nsebo;
    @XmlElement(name = "NSICO")
    protected Integer nsico;
    @XmlElement(name = "NSOUTG")
    protected Integer nsoutg;
    @XmlElement(name = "NSINQYH")
    protected Integer nsinqyh;
    @XmlElement(name = "NSUINFO")
    protected Integer nsuinfo;
    @XmlElement(name = "NSDN_CALL_OUT_ALLOW")
    protected Integer nsdncalloutallow;
    @XmlElement(name = "NSSIC")
    protected Integer nssic;
    @XmlElement(name = "NSSOC")
    protected Integer nssoc;
    @XmlElement(name = "NSSETCFNRTIME")
    protected Integer nssetcfnrtime;
    @XmlElement(name = "NSCFS")
    protected Integer nscfs;
    @XmlElement(name = "NSCFSB")
    protected Integer nscfsb;
    @XmlElement(name = "NSFAX")
    protected Integer nsfax;
    @XmlElement(name = "NSABRC")
    protected Integer nsabrc;
    @XmlElement(name = "NSACRTOVM")
    protected Integer nsacrtovm;
    @XmlElement(name = "NSPREPAID")
    protected Integer nsprepaid;
    @XmlElement(name = "NSCRBT")
    protected Integer nscrbt;
    @XmlElement(name = "NSICB")
    protected Integer nsicb;
    @XmlElement(name = "NSMRINGING")
    protected Integer nsmringing;
    @XmlElement(name = "NSCIS")
    protected Integer nscis;
    @XmlElement(name = "NSCBEG")
    protected Integer nscbeg;
    @XmlElement(name = "NSCOLP")
    protected Integer nscolp;
    @XmlElement(name = "NSCOLR")
    protected Integer nscolr;
    @XmlElement(name = "NSCOLPOVR")
    protected Integer nscolpovr;
    @XmlElement(name = "NSBAOC")
    protected Integer nsbaoc;
    @XmlElement(name = "NSBOIC")
    protected Integer nsboic;
    @XmlElement(name = "NSBOICEXHC")
    protected Integer nsboicexhc;
    @XmlElement(name = "NSBAIC")
    protected Integer nsbaic;
    @XmlElement(name = "NSBICROM")
    protected Integer nsbicrom;
    @XmlElement(name = "NSSPEED_DIAL")
    protected Integer nsspeeddial;
    @XmlElement(name = "NSSD1D")
    protected Integer nssd1D;
    @XmlElement(name = "NSSD2D")
    protected Integer nssd2D;
    @XmlElement(name = "NSAOC_S")
    protected Integer nsaocs;
    @XmlElement(name = "NSNIGHTSRV")
    protected Integer nsnightsrv;
    @XmlElement(name = "NSBACKNUM")
    protected Integer nsbacknum;
    @XmlElement(name = "NSAUTOCON")
    protected Integer nsautocon;
    @XmlElement(name = "NSCAMPON")
    protected Integer nscampon;
    @XmlElement(name = "NSCLICKHOLD")
    protected Integer nsclickhold;
    @XmlElement(name = "NSQUEUE")
    protected Integer nsqueue;
    @XmlElement(name = "NSSANSWER")
    protected Integer nssanswer;
    @XmlElement(name = "NSICENCF")
    protected Integer nsicencf;
    @XmlElement(name = "NSCFGO")
    protected Integer nscfgo;
    @XmlElement(name = "NSCTGO")
    protected Integer nsctgo;
    @XmlElement(name = "NSCTIO")
    protected Integer nsctio;
    @XmlElement(name = "NSSETBUSY")
    protected Integer nssetbusy;
    @XmlElement(name = "NSOVERSTEP")
    protected Integer nsoverstep;
    @XmlElement(name = "NSRD")
    protected Integer nsrd;
    @XmlElement(name = "NSABSENT")
    protected Integer nsabsent;
    @XmlElement(name = "NSMONITOR")
    protected Integer nsmonitor;
    @XmlElement(name = "NSFMONITOR")
    protected Integer nsfmonitor;
    @XmlElement(name = "NSDISCNT")
    protected Integer nsdiscnt;
    @XmlElement(name = "NSINSERT")
    protected Integer nsinsert;
    @XmlElement(name = "NSQSNS")
    protected Integer nsqsns;
    @XmlElement(name = "NSFINSERT")
    protected Integer nsfinsert;
    @XmlElement(name = "NSASI")
    protected Integer nsasi;
    @XmlElement(name = "NSPWCB")
    protected Integer nspwcb;
    @XmlElement(name = "NSMINIBAR")
    protected Integer nsminibar;
    @XmlElement(name = "INTT")
    protected Integer intt;
    @XmlElement(name = "IITT")
    protected Integer iitt;
    @XmlElement(name = "ICLT")
    protected Integer iclt;
    @XmlElement(name = "ICDDD")
    protected Integer icddd;
    @XmlElement(name = "ICIDD")
    protected Integer icidd;
    @XmlElement(name = "IOLT")
    protected Integer iolt;
    @XmlElement(name = "CTLCO")
    protected Integer ctlco;
    @XmlElement(name = "CTLCT")
    protected Integer ctlct;
    @XmlElement(name = "CTLD")
    protected Integer ctld;
    @XmlElement(name = "CTINTNANP")
    protected Integer ctintnanp;
    @XmlElement(name = "CTINTWORLD")
    protected Integer ctintworld;
    @XmlElement(name = "CTINT")
    protected Integer ctint;
    @XmlElement(name = "CTDA")
    protected Integer ctda;
    @XmlElement(name = "CTOSM")
    protected Integer ctosm;
    @XmlElement(name = "CTOSP")
    protected Integer ctosp;
    @XmlElement(name = "CCO1")
    protected Integer cco1;
    @XmlElement(name = "CCO2")
    protected Integer cco2;
    @XmlElement(name = "CCO3")
    protected Integer cco3;
    @XmlElement(name = "CCO4")
    protected Integer cco4;
    @XmlElement(name = "CCO5")
    protected Integer cco5;
    @XmlElement(name = "CCO6")
    protected Integer cco6;
    @XmlElement(name = "CCO7")
    protected Integer cco7;
    @XmlElement(name = "CCO8")
    protected Integer cco8;
    @XmlElement(name = "CCO9")
    protected Integer cco9;
    @XmlElement(name = "CCO10")
    protected Integer cco10;
    @XmlElement(name = "CCO11")
    protected Integer cco11;
    @XmlElement(name = "CCO12")
    protected Integer cco12;
    @XmlElement(name = "CCO13")
    protected Integer cco13;
    @XmlElement(name = "CCO14")
    protected Integer cco14;
    @XmlElement(name = "CCO15")
    protected Integer cco15;
    @XmlElement(name = "CCO16")
    protected Integer cco16;
    @XmlElement(name = "IDDCI")
    protected Integer iddci;
    @XmlElement(name = "NTCI")
    protected Integer ntci;
    @XmlElement(name = "LTCI")
    protected Integer ltci;
    @XmlElement(name = "RSC")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer rsc;
    @XmlElement(name = "CIG")
    protected Long cig;
    @XmlElement(name = "OUTRST")
    protected Integer outrst;
    @XmlElement(name = "INRST")
    protected Integer inrst;
    @XmlElement(name = "NOAT")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer noat;
    @XmlElement(name = "RINGCOUNT")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer ringcount;
    @XmlElement(name = "VMAIND")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer vmaind;
    @XmlElement(name = "VDMAIND")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer vdmaind;
    @XmlElement(name = "TGRP")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer tgrp;
    @XmlElement(name = "TIDHLD")
    protected Integer tidhld;
    @XmlElement(name = "TIDCW")
    protected Integer tidcw;
    @XmlElement(name = "SCF")
    protected Integer scf;
    @XmlElement(name = "LMTGRP")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer lmtgrp;
    @XmlElement(name = "FLBGRP")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer flbgrp;
    @XmlElement(name = "SLBGRP")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer slbgrp;
    @XmlElement(name = "COP")
    protected String cop;
    @XmlElement(name = "G711_64K_A_LAW")
    protected Integer g71164KALAW;
    @XmlElement(name = "G711_64K_U_LAW")
    protected Integer g71164KULAW;
    @XmlElement(name = "G722")
    protected Integer g722;
    @XmlElement(name = "G723")
    protected Integer g723;
    @XmlElement(name = "G726")
    protected Integer g726;
    @XmlElement(name = "G728")
    protected Integer g728;
    @XmlElement(name = "G729")
    protected Integer g729;
    @XmlElement(name = "CODEC_MP4A")
    protected Integer codecmp4A;
    @XmlElement(name = "CODEC2833")
    protected Integer codec2833;
    @XmlElement(name = "CODEC2198")
    protected Integer codec2198;
    @XmlElement(name = "G726_40")
    protected Integer g72640;
    @XmlElement(name = "G726_32")
    protected Integer g72632;
    @XmlElement(name = "G726_24")
    protected Integer g72624;
    @XmlElement(name = "G726_16")
    protected Integer g72616;
    @XmlElement(name = "AMR")
    protected Integer amr;
    @XmlElement(name = "CLEARMODE")
    protected Integer clearmode;
    @XmlElement(name = "ILBC")
    protected Integer ilbc;
    @XmlElement(name = "SPEEX")
    protected Integer speex;
    @XmlElement(name = "G729EV")
    protected Integer g729EV;
    @XmlElement(name = "H261")
    protected Integer h261;
    @XmlElement(name = "H263")
    protected Integer h263;
    @XmlElement(name = "CODEC_MP4V")
    protected Integer codecmp4V;
    @XmlElement(name = "H264")
    protected Integer h264;
    @XmlElement(name = "MPEG4")
    protected Integer mpeg4;
    @XmlElement(name = "T38")
    protected Integer t38;
    @XmlElement(name = "T120")
    protected Integer t120;
    @XmlElement(name = "G711A_VBD")
    protected Integer g711AVBD;
    @XmlElement(name = "G711U_VBD")
    protected Integer g711UVBD;
    @XmlElement(name = "G726_VBD")
    protected Integer g726VBD;
    @XmlElement(name = "G726_40_VBD")
    protected Integer g72640VBD;
    @XmlElement(name = "G726_32_VBD")
    protected Integer g72632VBD;
    @XmlElement(name = "G726_24_VBD")
    protected Integer g72624VBD;
    @XmlElement(name = "G726_16_VBD")
    protected Integer g72616VBD;
    @XmlElement(name = "WIND_BAND_AMR")
    protected Integer windbandamr;
    @XmlElement(name = "GSM610")
    protected Integer gsm610;
    @XmlElement(name = "H263_2000")
    protected Integer h2632000;
    @XmlElement(name = "BROADVOICE_32")
    protected Integer broadvoice32;
    @XmlElement(name = "BROADVOICE_32_FEC")
    protected Integer broadvoice32FEC;
    @XmlElement(name = "ACODEC")
    protected Short acodec;
    @XmlElement(name = "VCODEC")
    protected Short vcodec;
    @XmlElement(name = "POLIDX")
    @XmlSchemaType(name = "unsignedByte")
    protected Short polidx;
    @XmlElement(name = "EBOCL")
    protected Integer ebocl;
    @XmlElement(name = "EBOPL")
    protected Integer ebopl;
    @XmlElement(name = "EBOIT")
    protected Integer eboit;
    @XmlElement(name = "RM")
    protected Integer rm;
    @XmlElement(name = "CPC")
    protected Integer cpc;
    @XmlElement(name = "PCHG")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer pchg;
    @XmlElement(name = "TFPT")
    protected Integer tfpt;
    @XmlElement(name = "CHT")
    protected Integer cht;
    @XmlElement(name = "MCIDMODE")
    protected Integer mcidmode;
    @XmlElement(name = "MCIDCMODE")
    protected String mcidcmode;
    @XmlElement(name = "PREPAIDIDX")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer prepaididx;
    @XmlElement(name = "CRBTID")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer crbtid;
    @XmlElement(name = "ODBBICTYPE")
    protected Integer odbbictype;
    @XmlElement(name = "ODBBOCTYPE")
    protected Integer odbboctype;
    @XmlElement(name = "ODBBARTYPE")
    protected Integer odbbartype;
    @XmlElement(name = "ODBSS")
    protected Boolean odbss;
    @XmlElement(name = "ODBBRCFTYPE")
    protected Integer odbbrcftype;
    @XmlElement(name = "PNOTI")
    protected Integer pnoti;
    @XmlElement(name = "ATSDTMBUSY")
    protected Integer atsdtmbusy;
    @XmlElement(name = "STCF")
    protected Integer stcf;
    @XmlElement(name = "DPR")
    protected String dpr;
    @XmlElement(name = "PRON")
    protected String pron;
    @XmlElement(name = "NSHRCN")
    protected Integer nshrcn;
    @XmlElement(name = "NSSB")
    protected Integer nssb;
    @XmlElement(name = "NSDSTR")
    protected Integer nsdstr;
    @XmlElement(name = "NSCUN")
    protected Integer nscun;
    @XmlElement(name = "CUSCAT")
    protected Integer cuscat;
    @XmlElement(name = "VCCFLAG")
    protected Integer vccflag;
    @XmlElement(name = "MAXPARACALL")
    protected Integer maxparacall;
    @XmlElement(name = "TIMEZONE")
    protected Integer timezone;

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
     * Gets the value of the templateidx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTEMPLATEIDX() {
        return templateidx;
    }

    /**
     * Sets the value of the templateidx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTEMPLATEIDX(Integer value) {
        this.templateidx = value;
    }

    /**
     * Gets the value of the dspidx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDSPIDX() {
        return dspidx;
    }

    /**
     * Sets the value of the dspidx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDSPIDX(Integer value) {
        this.dspidx = value;
    }

    /**
     * Gets the value of the lp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLP() {
        return lp;
    }

    /**
     * Sets the value of the lp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLP(Integer value) {
        this.lp = value;
    }

    /**
     * Gets the value of the csc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCSC() {
        return csc;
    }

    /**
     * Sets the value of the csc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCSC(Integer value) {
        this.csc = value;
    }

    /**
     * Gets the value of the uname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNAME() {
        return uname;
    }

    /**
     * Sets the value of the uname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNAME(String value) {
        this.uname = value;
    }

    /**
     * Gets the value of the utype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUTYPE() {
        return utype;
    }

    /**
     * Sets the value of the utype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUTYPE(Integer value) {
        this.utype = value;
    }

    /**
     * Gets the value of the nscfu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFU() {
        return nscfu;
    }

    /**
     * Sets the value of the nscfu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFU(Integer value) {
        this.nscfu = value;
    }

    /**
     * Gets the value of the nscfuvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFUVM() {
        return nscfuvm;
    }

    /**
     * Sets the value of the nscfuvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFUVM(Integer value) {
        this.nscfuvm = value;
    }

    /**
     * Gets the value of the nscfb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFB() {
        return nscfb;
    }

    /**
     * Sets the value of the nscfb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFB(Integer value) {
        this.nscfb = value;
    }

    /**
     * Gets the value of the nscfbvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFBVM() {
        return nscfbvm;
    }

    /**
     * Sets the value of the nscfbvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFBVM(Integer value) {
        this.nscfbvm = value;
    }

    /**
     * Gets the value of the nscfnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFNR() {
        return nscfnr;
    }

    /**
     * Sets the value of the nscfnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFNR(Integer value) {
        this.nscfnr = value;
    }

    /**
     * Gets the value of the nscfnrvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFNRVM() {
        return nscfnrvm;
    }

    /**
     * Sets the value of the nscfnrvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFNRVM(Integer value) {
        this.nscfnrvm = value;
    }

    /**
     * Gets the value of the nscfnl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFNL() {
        return nscfnl;
    }

    /**
     * Sets the value of the nscfnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFNL(Integer value) {
        this.nscfnl = value;
    }

    /**
     * Gets the value of the nscfnlvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFNLVM() {
        return nscfnlvm;
    }

    /**
     * Sets the value of the nscfnlvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFNLVM(Integer value) {
        this.nscfnlvm = value;
    }

    /**
     * Gets the value of the nscd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCD() {
        return nscd;
    }

    /**
     * Sets the value of the nscd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCD(Integer value) {
        this.nscd = value;
    }

    /**
     * Gets the value of the nscdvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCDVM() {
        return nscdvm;
    }

    /**
     * Sets the value of the nscdvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCDVM(Integer value) {
        this.nscdvm = value;
    }

    /**
     * Gets the value of the nscfnrc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFNRC() {
        return nscfnrc;
    }

    /**
     * Sets the value of the nscfnrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFNRC(Integer value) {
        this.nscfnrc = value;
    }

    /**
     * Gets the value of the nscfnrcvm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFNRCVM() {
        return nscfnrcvm;
    }

    /**
     * Sets the value of the nscfnrcvm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFNRCVM(Integer value) {
        this.nscfnrcvm = value;
    }

    /**
     * Gets the value of the nsclip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCLIP() {
        return nsclip;
    }

    /**
     * Sets the value of the nsclip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCLIP(Integer value) {
        this.nsclip = value;
    }

    /**
     * Gets the value of the nscidcw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCIDCW() {
        return nscidcw;
    }

    /**
     * Sets the value of the nscidcw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCIDCW(Integer value) {
        this.nscidcw = value;
    }

    /**
     * Gets the value of the nsrio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSRIO() {
        return nsrio;
    }

    /**
     * Sets the value of the nsrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSRIO(Integer value) {
        this.nsrio = value;
    }

    /**
     * Gets the value of the nscnip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCNIP() {
        return nscnip;
    }

    /**
     * Sets the value of the nscnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCNIP(Integer value) {
        this.nscnip = value;
    }

    /**
     * Gets the value of the nsclir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCLIR() {
        return nsclir;
    }

    /**
     * Sets the value of the nsclir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCLIR(Integer value) {
        this.nsclir = value;
    }

    /**
     * Gets the value of the nsrip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSRIP() {
        return nsrip;
    }

    /**
     * Sets the value of the nsrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSRIP(Integer value) {
        this.nsrip = value;
    }

    /**
     * Gets the value of the nscnir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCNIR() {
        return nscnir;
    }

    /**
     * Sets the value of the nscnir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCNIR(Integer value) {
        this.nscnir = value;
    }

    /**
     * Gets the value of the nsrid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSRID() {
        return nsrid;
    }

    /**
     * Sets the value of the nsrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSRID(Integer value) {
        this.nsrid = value;
    }

    /**
     * Gets the value of the nsnrid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSNRID() {
        return nsnrid;
    }

    /**
     * Sets the value of the nsnrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSNRID(Integer value) {
        this.nsnrid = value;
    }

    /**
     * Gets the value of the nsrnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSRND() {
        return nsrnd;
    }

    /**
     * Sets the value of the nsrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSRND(Integer value) {
        this.nsrnd = value;
    }

    /**
     * Gets the value of the nsnrnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSNRND() {
        return nsnrnd;
    }

    /**
     * Sets the value of the nsnrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSNRND(Integer value) {
        this.nsnrnd = value;
    }

    /**
     * Gets the value of the nscw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCW() {
        return nscw;
    }

    /**
     * Sets the value of the nscw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCW(Integer value) {
        this.nscw = value;
    }

    /**
     * Gets the value of the nsccw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCCW() {
        return nsccw;
    }

    /**
     * Sets the value of the nsccw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCCW(Integer value) {
        this.nsccw = value;
    }

    /**
     * Gets the value of the nsoip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSOIP() {
        return nsoip;
    }

    /**
     * Sets the value of the nsoip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSOIP(Integer value) {
        this.nsoip = value;
    }

    /**
     * Gets the value of the nsacrm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSACRM() {
        return nsacrm;
    }

    /**
     * Sets the value of the nsacrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSACRM(Integer value) {
        this.nsacrm = value;
    }

    /**
     * Gets the value of the nsgoir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSGOIR() {
        return nsgoir;
    }

    /**
     * Sets the value of the nsgoir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSGOIR(Integer value) {
        this.nsgoir = value;
    }

    /**
     * Gets the value of the nsmoir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMOIR() {
        return nsmoir;
    }

    /**
     * Sets the value of the nsmoir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMOIR(Integer value) {
        this.nsmoir = value;
    }

    /**
     * Gets the value of the nstip property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSTIP() {
        return nstip;
    }

    /**
     * Sets the value of the nstip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSTIP(Integer value) {
        this.nstip = value;
    }

    /**
     * Gets the value of the nstir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSTIR() {
        return nstir;
    }

    /**
     * Sets the value of the nstir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSTIR(Integer value) {
        this.nstir = value;
    }

    /**
     * Gets the value of the nsotir property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSOTIR() {
        return nsotir;
    }

    /**
     * Sets the value of the nsotir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSOTIR(Integer value) {
        this.nsotir = value;
    }

    /**
     * Gets the value of the nscr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCR() {
        return nscr;
    }

    /**
     * Sets the value of the nscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCR(Integer value) {
        this.nscr = value;
    }

    /**
     * Gets the value of the nswakeup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSWAKEUP() {
        return nswakeup;
    }

    /**
     * Sets the value of the nswakeup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSWAKEUP(Integer value) {
        this.nswakeup = value;
    }

    /**
     * Gets the value of the nsaocd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSAOCD() {
        return nsaocd;
    }

    /**
     * Sets the value of the nsaocd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSAOCD(Integer value) {
        this.nsaocd = value;
    }

    /**
     * Gets the value of the nsaoce property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSAOCE() {
        return nsaoce;
    }

    /**
     * Sets the value of the nsaoce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSAOCE(Integer value) {
        this.nsaoce = value;
    }

    /**
     * Gets the value of the nsxexh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSXEXH() {
        return nsxexh;
    }

    /**
     * Sets the value of the nsxexh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSXEXH(Integer value) {
        this.nsxexh = value;
    }

    /**
     * Gets the value of the nsxegj property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSXEGJ() {
        return nsxegj;
    }

    /**
     * Sets the value of the nsxegj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSXEGJ(Integer value) {
        this.nsxegj = value;
    }

    /**
     * Gets the value of the nscwcfnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCWCFNR() {
        return nscwcfnr;
    }

    /**
     * Sets the value of the nscwcfnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCWCFNR(Integer value) {
        this.nscwcfnr = value;
    }

    /**
     * Gets the value of the nsiifc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSIIFC() {
        return nsiifc;
    }

    /**
     * Sets the value of the nsiifc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSIIFC(Integer value) {
        this.nsiifc = value;
    }

    /**
     * Gets the value of the nsdncalloutbar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDNCALLOUTBAR() {
        return nsdncalloutbar;
    }

    /**
     * Sets the value of the nsdncalloutbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDNCALLOUTBAR(Integer value) {
        this.nsdncalloutbar = value;
    }

    /**
     * Gets the value of the nsccbs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCCBS() {
        return nsccbs;
    }

    /**
     * Sets the value of the nsccbs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCCBS(Integer value) {
        this.nsccbs = value;
    }

    /**
     * Gets the value of the nsccnr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCCNR() {
        return nsccnr;
    }

    /**
     * Sets the value of the nsccnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCCNR(Integer value) {
        this.nsccnr = value;
    }

    /**
     * Gets the value of the nsccbsr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCCBSR() {
        return nsccbsr;
    }

    /**
     * Sets the value of the nsccbsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCCBSR(Integer value) {
        this.nsccbsr = value;
    }

    /**
     * Gets the value of the nsccnrr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCCNRR() {
        return nsccnrr;
    }

    /**
     * Sets the value of the nsccnrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCCNRR(Integer value) {
        this.nsccnrr = value;
    }

    /**
     * Gets the value of the ns3PTY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNS3PTY() {
        return ns3PTY;
    }

    /**
     * Sets the value of the ns3PTY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNS3PTY(Integer value) {
        this.ns3PTY = value;
    }

    /**
     * Gets the value of the nsnpty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSNPTY() {
        return nsnpty;
    }

    /**
     * Sets the value of the nsnpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSNPTY(Integer value) {
        this.nsnpty = value;
    }

    /**
     * Gets the value of the nsdnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDND() {
        return nsdnd;
    }

    /**
     * Sets the value of the nsdnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDND(Integer value) {
        this.nsdnd = value;
    }

    /**
     * Gets the value of the nsmcr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMCR() {
        return nsmcr;
    }

    /**
     * Sets the value of the nsmcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMCR(Integer value) {
        this.nsmcr = value;
    }

    /**
     * Gets the value of the nscba property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCBA() {
        return nscba;
    }

    /**
     * Sets the value of the nscba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCBA(Integer value) {
        this.nscba = value;
    }

    /**
     * Gets the value of the nstmplin property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSTMPLIN() {
        return nstmplin;
    }

    /**
     * Sets the value of the nstmplin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSTMPLIN(Integer value) {
        this.nstmplin = value;
    }

    /**
     * Gets the value of the nscodeccntrl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCODECCNTRL() {
        return nscodeccntrl;
    }

    /**
     * Sets the value of the nscodeccntrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCODECCNTRL(Integer value) {
        this.nscodeccntrl = value;
    }

    /**
     * Gets the value of the nsmwi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMWI() {
        return nsmwi;
    }

    /**
     * Sets the value of the nsmwi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMWI(Integer value) {
        this.nsmwi = value;
    }

    /**
     * Gets the value of the nsdc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDC() {
        return nsdc;
    }

    /**
     * Sets the value of the nsdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDC(Integer value) {
        this.nsdc = value;
    }

    /**
     * Gets the value of the nshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSHOLD() {
        return nshold;
    }

    /**
     * Sets the value of the nshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSHOLD(Integer value) {
        this.nshold = value;
    }

    /**
     * Gets the value of the nsect property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSECT() {
        return nsect;
    }

    /**
     * Sets the value of the nsect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSECT(Integer value) {
        this.nsect = value;
    }

    /**
     * Gets the value of the nscftb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFTB() {
        return nscftb;
    }

    /**
     * Sets the value of the nscftb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFTB(Integer value) {
        this.nscftb = value;
    }

    /**
     * Gets the value of the nsdan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDAN() {
        return nsdan;
    }

    /**
     * Sets the value of the nsdan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDAN(Integer value) {
        this.nsdan = value;
    }

    /**
     * Gets the value of the nsstopsecret property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSTOPSECRET() {
        return nsstopsecret;
    }

    /**
     * Sets the value of the nsstopsecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSTOPSECRET(Integer value) {
        this.nsstopsecret = value;
    }

    /**
     * Gets the value of the nsmcid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMCID() {
        return nsmcid;
    }

    /**
     * Sets the value of the nsmcid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMCID(Integer value) {
        this.nsmcid = value;
    }

    /**
     * Gets the value of the nsebo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSEBO() {
        return nsebo;
    }

    /**
     * Sets the value of the nsebo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSEBO(Integer value) {
        this.nsebo = value;
    }

    /**
     * Gets the value of the nsico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSICO() {
        return nsico;
    }

    /**
     * Sets the value of the nsico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSICO(Integer value) {
        this.nsico = value;
    }

    /**
     * Gets the value of the nsoutg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSOUTG() {
        return nsoutg;
    }

    /**
     * Sets the value of the nsoutg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSOUTG(Integer value) {
        this.nsoutg = value;
    }

    /**
     * Gets the value of the nsinqyh property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSINQYH() {
        return nsinqyh;
    }

    /**
     * Sets the value of the nsinqyh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSINQYH(Integer value) {
        this.nsinqyh = value;
    }

    /**
     * Gets the value of the nsuinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSUINFO() {
        return nsuinfo;
    }

    /**
     * Sets the value of the nsuinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSUINFO(Integer value) {
        this.nsuinfo = value;
    }

    /**
     * Gets the value of the nsdncalloutallow property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDNCALLOUTALLOW() {
        return nsdncalloutallow;
    }

    /**
     * Sets the value of the nsdncalloutallow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDNCALLOUTALLOW(Integer value) {
        this.nsdncalloutallow = value;
    }

    /**
     * Gets the value of the nssic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSIC() {
        return nssic;
    }

    /**
     * Sets the value of the nssic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSIC(Integer value) {
        this.nssic = value;
    }

    /**
     * Gets the value of the nssoc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSOC() {
        return nssoc;
    }

    /**
     * Sets the value of the nssoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSOC(Integer value) {
        this.nssoc = value;
    }

    /**
     * Gets the value of the nssetcfnrtime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSETCFNRTIME() {
        return nssetcfnrtime;
    }

    /**
     * Sets the value of the nssetcfnrtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSETCFNRTIME(Integer value) {
        this.nssetcfnrtime = value;
    }

    /**
     * Gets the value of the nscfs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFS() {
        return nscfs;
    }

    /**
     * Sets the value of the nscfs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFS(Integer value) {
        this.nscfs = value;
    }

    /**
     * Gets the value of the nscfsb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFSB() {
        return nscfsb;
    }

    /**
     * Sets the value of the nscfsb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFSB(Integer value) {
        this.nscfsb = value;
    }

    /**
     * Gets the value of the nsfax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSFAX() {
        return nsfax;
    }

    /**
     * Sets the value of the nsfax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSFAX(Integer value) {
        this.nsfax = value;
    }

    /**
     * Gets the value of the nsabrc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSABRC() {
        return nsabrc;
    }

    /**
     * Sets the value of the nsabrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSABRC(Integer value) {
        this.nsabrc = value;
    }

    /**
     * Gets the value of the nsacrtovm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSACRTOVM() {
        return nsacrtovm;
    }

    /**
     * Sets the value of the nsacrtovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSACRTOVM(Integer value) {
        this.nsacrtovm = value;
    }

    /**
     * Gets the value of the nsprepaid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSPREPAID() {
        return nsprepaid;
    }

    /**
     * Sets the value of the nsprepaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSPREPAID(Integer value) {
        this.nsprepaid = value;
    }

    /**
     * Gets the value of the nscrbt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCRBT() {
        return nscrbt;
    }

    /**
     * Sets the value of the nscrbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCRBT(Integer value) {
        this.nscrbt = value;
    }

    /**
     * Gets the value of the nsicb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSICB() {
        return nsicb;
    }

    /**
     * Sets the value of the nsicb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSICB(Integer value) {
        this.nsicb = value;
    }

    /**
     * Gets the value of the nsmringing property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMRINGING() {
        return nsmringing;
    }

    /**
     * Sets the value of the nsmringing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMRINGING(Integer value) {
        this.nsmringing = value;
    }

    /**
     * Gets the value of the nscis property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCIS() {
        return nscis;
    }

    /**
     * Sets the value of the nscis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCIS(Integer value) {
        this.nscis = value;
    }

    /**
     * Gets the value of the nscbeg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCBEG() {
        return nscbeg;
    }

    /**
     * Sets the value of the nscbeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCBEG(Integer value) {
        this.nscbeg = value;
    }

    /**
     * Gets the value of the nscolp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCOLP() {
        return nscolp;
    }

    /**
     * Sets the value of the nscolp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCOLP(Integer value) {
        this.nscolp = value;
    }

    /**
     * Gets the value of the nscolr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCOLR() {
        return nscolr;
    }

    /**
     * Sets the value of the nscolr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCOLR(Integer value) {
        this.nscolr = value;
    }

    /**
     * Gets the value of the nscolpovr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCOLPOVR() {
        return nscolpovr;
    }

    /**
     * Sets the value of the nscolpovr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCOLPOVR(Integer value) {
        this.nscolpovr = value;
    }

    /**
     * Gets the value of the nsbaoc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSBAOC() {
        return nsbaoc;
    }

    /**
     * Sets the value of the nsbaoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSBAOC(Integer value) {
        this.nsbaoc = value;
    }

    /**
     * Gets the value of the nsboic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSBOIC() {
        return nsboic;
    }

    /**
     * Sets the value of the nsboic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSBOIC(Integer value) {
        this.nsboic = value;
    }

    /**
     * Gets the value of the nsboicexhc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSBOICEXHC() {
        return nsboicexhc;
    }

    /**
     * Sets the value of the nsboicexhc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSBOICEXHC(Integer value) {
        this.nsboicexhc = value;
    }

    /**
     * Gets the value of the nsbaic property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSBAIC() {
        return nsbaic;
    }

    /**
     * Sets the value of the nsbaic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSBAIC(Integer value) {
        this.nsbaic = value;
    }

    /**
     * Gets the value of the nsbicrom property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSBICROM() {
        return nsbicrom;
    }

    /**
     * Sets the value of the nsbicrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSBICROM(Integer value) {
        this.nsbicrom = value;
    }

    /**
     * Gets the value of the nsspeeddial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSPEEDDIAL() {
        return nsspeeddial;
    }

    /**
     * Sets the value of the nsspeeddial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSPEEDDIAL(Integer value) {
        this.nsspeeddial = value;
    }

    /**
     * Gets the value of the nssd1D property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSD1D() {
        return nssd1D;
    }

    /**
     * Sets the value of the nssd1D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSD1D(Integer value) {
        this.nssd1D = value;
    }

    /**
     * Gets the value of the nssd2D property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSD2D() {
        return nssd2D;
    }

    /**
     * Sets the value of the nssd2D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSD2D(Integer value) {
        this.nssd2D = value;
    }

    /**
     * Gets the value of the nsaocs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSAOCS() {
        return nsaocs;
    }

    /**
     * Sets the value of the nsaocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSAOCS(Integer value) {
        this.nsaocs = value;
    }

    /**
     * Gets the value of the nsnightsrv property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSNIGHTSRV() {
        return nsnightsrv;
    }

    /**
     * Sets the value of the nsnightsrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSNIGHTSRV(Integer value) {
        this.nsnightsrv = value;
    }

    /**
     * Gets the value of the nsbacknum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSBACKNUM() {
        return nsbacknum;
    }

    /**
     * Sets the value of the nsbacknum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSBACKNUM(Integer value) {
        this.nsbacknum = value;
    }

    /**
     * Gets the value of the nsautocon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSAUTOCON() {
        return nsautocon;
    }

    /**
     * Sets the value of the nsautocon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSAUTOCON(Integer value) {
        this.nsautocon = value;
    }

    /**
     * Gets the value of the nscampon property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCAMPON() {
        return nscampon;
    }

    /**
     * Sets the value of the nscampon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCAMPON(Integer value) {
        this.nscampon = value;
    }

    /**
     * Gets the value of the nsclickhold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCLICKHOLD() {
        return nsclickhold;
    }

    /**
     * Sets the value of the nsclickhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCLICKHOLD(Integer value) {
        this.nsclickhold = value;
    }

    /**
     * Gets the value of the nsqueue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSQUEUE() {
        return nsqueue;
    }

    /**
     * Sets the value of the nsqueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSQUEUE(Integer value) {
        this.nsqueue = value;
    }

    /**
     * Gets the value of the nssanswer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSANSWER() {
        return nssanswer;
    }

    /**
     * Sets the value of the nssanswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSANSWER(Integer value) {
        this.nssanswer = value;
    }

    /**
     * Gets the value of the nsicencf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSICENCF() {
        return nsicencf;
    }

    /**
     * Sets the value of the nsicencf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSICENCF(Integer value) {
        this.nsicencf = value;
    }

    /**
     * Gets the value of the nscfgo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCFGO() {
        return nscfgo;
    }

    /**
     * Sets the value of the nscfgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCFGO(Integer value) {
        this.nscfgo = value;
    }

    /**
     * Gets the value of the nsctgo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCTGO() {
        return nsctgo;
    }

    /**
     * Sets the value of the nsctgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCTGO(Integer value) {
        this.nsctgo = value;
    }

    /**
     * Gets the value of the nsctio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCTIO() {
        return nsctio;
    }

    /**
     * Sets the value of the nsctio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCTIO(Integer value) {
        this.nsctio = value;
    }

    /**
     * Gets the value of the nssetbusy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSETBUSY() {
        return nssetbusy;
    }

    /**
     * Sets the value of the nssetbusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSETBUSY(Integer value) {
        this.nssetbusy = value;
    }

    /**
     * Gets the value of the nsoverstep property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSOVERSTEP() {
        return nsoverstep;
    }

    /**
     * Sets the value of the nsoverstep property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSOVERSTEP(Integer value) {
        this.nsoverstep = value;
    }

    /**
     * Gets the value of the nsrd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSRD() {
        return nsrd;
    }

    /**
     * Sets the value of the nsrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSRD(Integer value) {
        this.nsrd = value;
    }

    /**
     * Gets the value of the nsabsent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSABSENT() {
        return nsabsent;
    }

    /**
     * Sets the value of the nsabsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSABSENT(Integer value) {
        this.nsabsent = value;
    }

    /**
     * Gets the value of the nsmonitor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMONITOR() {
        return nsmonitor;
    }

    /**
     * Sets the value of the nsmonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMONITOR(Integer value) {
        this.nsmonitor = value;
    }

    /**
     * Gets the value of the nsfmonitor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSFMONITOR() {
        return nsfmonitor;
    }

    /**
     * Sets the value of the nsfmonitor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSFMONITOR(Integer value) {
        this.nsfmonitor = value;
    }

    /**
     * Gets the value of the nsdiscnt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDISCNT() {
        return nsdiscnt;
    }

    /**
     * Sets the value of the nsdiscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDISCNT(Integer value) {
        this.nsdiscnt = value;
    }

    /**
     * Gets the value of the nsinsert property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSINSERT() {
        return nsinsert;
    }

    /**
     * Sets the value of the nsinsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSINSERT(Integer value) {
        this.nsinsert = value;
    }

    /**
     * Gets the value of the nsqsns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSQSNS() {
        return nsqsns;
    }

    /**
     * Sets the value of the nsqsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSQSNS(Integer value) {
        this.nsqsns = value;
    }

    /**
     * Gets the value of the nsfinsert property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSFINSERT() {
        return nsfinsert;
    }

    /**
     * Sets the value of the nsfinsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSFINSERT(Integer value) {
        this.nsfinsert = value;
    }

    /**
     * Gets the value of the nsasi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSASI() {
        return nsasi;
    }

    /**
     * Sets the value of the nsasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSASI(Integer value) {
        this.nsasi = value;
    }

    /**
     * Gets the value of the nspwcb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSPWCB() {
        return nspwcb;
    }

    /**
     * Sets the value of the nspwcb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSPWCB(Integer value) {
        this.nspwcb = value;
    }

    /**
     * Gets the value of the nsminibar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSMINIBAR() {
        return nsminibar;
    }

    /**
     * Sets the value of the nsminibar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSMINIBAR(Integer value) {
        this.nsminibar = value;
    }

    /**
     * Gets the value of the intt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINTT() {
        return intt;
    }

    /**
     * Sets the value of the intt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINTT(Integer value) {
        this.intt = value;
    }

    /**
     * Gets the value of the iitt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIITT() {
        return iitt;
    }

    /**
     * Sets the value of the iitt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIITT(Integer value) {
        this.iitt = value;
    }

    /**
     * Gets the value of the iclt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICLT() {
        return iclt;
    }

    /**
     * Sets the value of the iclt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICLT(Integer value) {
        this.iclt = value;
    }

    /**
     * Gets the value of the icddd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICDDD() {
        return icddd;
    }

    /**
     * Sets the value of the icddd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICDDD(Integer value) {
        this.icddd = value;
    }

    /**
     * Gets the value of the icidd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getICIDD() {
        return icidd;
    }

    /**
     * Sets the value of the icidd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setICIDD(Integer value) {
        this.icidd = value;
    }

    /**
     * Gets the value of the iolt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIOLT() {
        return iolt;
    }

    /**
     * Sets the value of the iolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIOLT(Integer value) {
        this.iolt = value;
    }

    /**
     * Gets the value of the ctlco property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTLCO() {
        return ctlco;
    }

    /**
     * Sets the value of the ctlco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTLCO(Integer value) {
        this.ctlco = value;
    }

    /**
     * Gets the value of the ctlct property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTLCT() {
        return ctlct;
    }

    /**
     * Sets the value of the ctlct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTLCT(Integer value) {
        this.ctlct = value;
    }

    /**
     * Gets the value of the ctld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTLD() {
        return ctld;
    }

    /**
     * Sets the value of the ctld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTLD(Integer value) {
        this.ctld = value;
    }

    /**
     * Gets the value of the ctintnanp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTINTNANP() {
        return ctintnanp;
    }

    /**
     * Sets the value of the ctintnanp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTINTNANP(Integer value) {
        this.ctintnanp = value;
    }

    /**
     * Gets the value of the ctintworld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTINTWORLD() {
        return ctintworld;
    }

    /**
     * Sets the value of the ctintworld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTINTWORLD(Integer value) {
        this.ctintworld = value;
    }

    /**
     * Gets the value of the ctint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTINT() {
        return ctint;
    }

    /**
     * Sets the value of the ctint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTINT(Integer value) {
        this.ctint = value;
    }

    /**
     * Gets the value of the ctda property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTDA() {
        return ctda;
    }

    /**
     * Sets the value of the ctda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTDA(Integer value) {
        this.ctda = value;
    }

    /**
     * Gets the value of the ctosm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTOSM() {
        return ctosm;
    }

    /**
     * Sets the value of the ctosm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTOSM(Integer value) {
        this.ctosm = value;
    }

    /**
     * Gets the value of the ctosp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTOSP() {
        return ctosp;
    }

    /**
     * Sets the value of the ctosp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTOSP(Integer value) {
        this.ctosp = value;
    }

    /**
     * Gets the value of the cco1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO1() {
        return cco1;
    }

    /**
     * Sets the value of the cco1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO1(Integer value) {
        this.cco1 = value;
    }

    /**
     * Gets the value of the cco2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO2() {
        return cco2;
    }

    /**
     * Sets the value of the cco2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO2(Integer value) {
        this.cco2 = value;
    }

    /**
     * Gets the value of the cco3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO3() {
        return cco3;
    }

    /**
     * Sets the value of the cco3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO3(Integer value) {
        this.cco3 = value;
    }

    /**
     * Gets the value of the cco4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO4() {
        return cco4;
    }

    /**
     * Sets the value of the cco4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO4(Integer value) {
        this.cco4 = value;
    }

    /**
     * Gets the value of the cco5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO5() {
        return cco5;
    }

    /**
     * Sets the value of the cco5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO5(Integer value) {
        this.cco5 = value;
    }

    /**
     * Gets the value of the cco6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO6() {
        return cco6;
    }

    /**
     * Sets the value of the cco6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO6(Integer value) {
        this.cco6 = value;
    }

    /**
     * Gets the value of the cco7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO7() {
        return cco7;
    }

    /**
     * Sets the value of the cco7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO7(Integer value) {
        this.cco7 = value;
    }

    /**
     * Gets the value of the cco8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO8() {
        return cco8;
    }

    /**
     * Sets the value of the cco8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO8(Integer value) {
        this.cco8 = value;
    }

    /**
     * Gets the value of the cco9 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO9() {
        return cco9;
    }

    /**
     * Sets the value of the cco9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO9(Integer value) {
        this.cco9 = value;
    }

    /**
     * Gets the value of the cco10 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO10() {
        return cco10;
    }

    /**
     * Sets the value of the cco10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO10(Integer value) {
        this.cco10 = value;
    }

    /**
     * Gets the value of the cco11 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO11() {
        return cco11;
    }

    /**
     * Sets the value of the cco11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO11(Integer value) {
        this.cco11 = value;
    }

    /**
     * Gets the value of the cco12 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO12() {
        return cco12;
    }

    /**
     * Sets the value of the cco12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO12(Integer value) {
        this.cco12 = value;
    }

    /**
     * Gets the value of the cco13 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO13() {
        return cco13;
    }

    /**
     * Sets the value of the cco13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO13(Integer value) {
        this.cco13 = value;
    }

    /**
     * Gets the value of the cco14 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO14() {
        return cco14;
    }

    /**
     * Sets the value of the cco14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO14(Integer value) {
        this.cco14 = value;
    }

    /**
     * Gets the value of the cco15 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO15() {
        return cco15;
    }

    /**
     * Sets the value of the cco15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO15(Integer value) {
        this.cco15 = value;
    }

    /**
     * Gets the value of the cco16 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCCO16() {
        return cco16;
    }

    /**
     * Sets the value of the cco16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCCO16(Integer value) {
        this.cco16 = value;
    }

    /**
     * Gets the value of the iddci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDDCI() {
        return iddci;
    }

    /**
     * Sets the value of the iddci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDDCI(Integer value) {
        this.iddci = value;
    }

    /**
     * Gets the value of the ntci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNTCI() {
        return ntci;
    }

    /**
     * Sets the value of the ntci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNTCI(Integer value) {
        this.ntci = value;
    }

    /**
     * Gets the value of the ltci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLTCI() {
        return ltci;
    }

    /**
     * Sets the value of the ltci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLTCI(Integer value) {
        this.ltci = value;
    }

    /**
     * Gets the value of the rsc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRSC() {
        return rsc;
    }

    /**
     * Sets the value of the rsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRSC(Integer value) {
        this.rsc = value;
    }

    /**
     * Gets the value of the cig property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCIG() {
        return cig;
    }

    /**
     * Sets the value of the cig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCIG(Long value) {
        this.cig = value;
    }

    /**
     * Gets the value of the outrst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOUTRST() {
        return outrst;
    }

    /**
     * Sets the value of the outrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOUTRST(Integer value) {
        this.outrst = value;
    }

    /**
     * Gets the value of the inrst property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getINRST() {
        return inrst;
    }

    /**
     * Sets the value of the inrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setINRST(Integer value) {
        this.inrst = value;
    }

    /**
     * Gets the value of the noat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNOAT() {
        return noat;
    }

    /**
     * Sets the value of the noat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNOAT(Integer value) {
        this.noat = value;
    }

    /**
     * Gets the value of the ringcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRINGCOUNT() {
        return ringcount;
    }

    /**
     * Sets the value of the ringcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRINGCOUNT(Integer value) {
        this.ringcount = value;
    }

    /**
     * Gets the value of the vmaind property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVMAIND() {
        return vmaind;
    }

    /**
     * Sets the value of the vmaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVMAIND(Integer value) {
        this.vmaind = value;
    }

    /**
     * Gets the value of the vdmaind property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVDMAIND() {
        return vdmaind;
    }

    /**
     * Sets the value of the vdmaind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVDMAIND(Integer value) {
        this.vdmaind = value;
    }

    /**
     * Gets the value of the tgrp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTGRP() {
        return tgrp;
    }

    /**
     * Sets the value of the tgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTGRP(Integer value) {
        this.tgrp = value;
    }

    /**
     * Gets the value of the tidhld property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTIDHLD() {
        return tidhld;
    }

    /**
     * Sets the value of the tidhld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTIDHLD(Integer value) {
        this.tidhld = value;
    }

    /**
     * Gets the value of the tidcw property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTIDCW() {
        return tidcw;
    }

    /**
     * Sets the value of the tidcw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTIDCW(Integer value) {
        this.tidcw = value;
    }

    /**
     * Gets the value of the scf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSCF() {
        return scf;
    }

    /**
     * Sets the value of the scf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSCF(Integer value) {
        this.scf = value;
    }

    /**
     * Gets the value of the lmtgrp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLMTGRP() {
        return lmtgrp;
    }

    /**
     * Sets the value of the lmtgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLMTGRP(Integer value) {
        this.lmtgrp = value;
    }

    /**
     * Gets the value of the flbgrp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFLBGRP() {
        return flbgrp;
    }

    /**
     * Sets the value of the flbgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFLBGRP(Integer value) {
        this.flbgrp = value;
    }

    /**
     * Gets the value of the slbgrp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSLBGRP() {
        return slbgrp;
    }

    /**
     * Sets the value of the slbgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSLBGRP(Integer value) {
        this.slbgrp = value;
    }

    /**
     * Gets the value of the cop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOP() {
        return cop;
    }

    /**
     * Sets the value of the cop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOP(String value) {
        this.cop = value;
    }

    /**
     * Gets the value of the g71164KALAW property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG71164KALAW() {
        return g71164KALAW;
    }

    /**
     * Sets the value of the g71164KALAW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG71164KALAW(Integer value) {
        this.g71164KALAW = value;
    }

    /**
     * Gets the value of the g71164KULAW property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG71164KULAW() {
        return g71164KULAW;
    }

    /**
     * Sets the value of the g71164KULAW property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG71164KULAW(Integer value) {
        this.g71164KULAW = value;
    }

    /**
     * Gets the value of the g722 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG722() {
        return g722;
    }

    /**
     * Sets the value of the g722 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG722(Integer value) {
        this.g722 = value;
    }

    /**
     * Gets the value of the g723 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG723() {
        return g723;
    }

    /**
     * Sets the value of the g723 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG723(Integer value) {
        this.g723 = value;
    }

    /**
     * Gets the value of the g726 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG726() {
        return g726;
    }

    /**
     * Sets the value of the g726 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG726(Integer value) {
        this.g726 = value;
    }

    /**
     * Gets the value of the g728 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG728() {
        return g728;
    }

    /**
     * Sets the value of the g728 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG728(Integer value) {
        this.g728 = value;
    }

    /**
     * Gets the value of the g729 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG729() {
        return g729;
    }

    /**
     * Sets the value of the g729 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG729(Integer value) {
        this.g729 = value;
    }

    /**
     * Gets the value of the codecmp4A property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCODECMP4A() {
        return codecmp4A;
    }

    /**
     * Sets the value of the codecmp4A property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCODECMP4A(Integer value) {
        this.codecmp4A = value;
    }

    /**
     * Gets the value of the codec2833 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCODEC2833() {
        return codec2833;
    }

    /**
     * Sets the value of the codec2833 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCODEC2833(Integer value) {
        this.codec2833 = value;
    }

    /**
     * Gets the value of the codec2198 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCODEC2198() {
        return codec2198;
    }

    /**
     * Sets the value of the codec2198 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCODEC2198(Integer value) {
        this.codec2198 = value;
    }

    /**
     * Gets the value of the g72640 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72640() {
        return g72640;
    }

    /**
     * Sets the value of the g72640 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72640(Integer value) {
        this.g72640 = value;
    }

    /**
     * Gets the value of the g72632 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72632() {
        return g72632;
    }

    /**
     * Sets the value of the g72632 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72632(Integer value) {
        this.g72632 = value;
    }

    /**
     * Gets the value of the g72624 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72624() {
        return g72624;
    }

    /**
     * Sets the value of the g72624 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72624(Integer value) {
        this.g72624 = value;
    }

    /**
     * Gets the value of the g72616 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72616() {
        return g72616;
    }

    /**
     * Sets the value of the g72616 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72616(Integer value) {
        this.g72616 = value;
    }

    /**
     * Gets the value of the amr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAMR() {
        return amr;
    }

    /**
     * Sets the value of the amr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAMR(Integer value) {
        this.amr = value;
    }

    /**
     * Gets the value of the clearmode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCLEARMODE() {
        return clearmode;
    }

    /**
     * Sets the value of the clearmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCLEARMODE(Integer value) {
        this.clearmode = value;
    }

    /**
     * Gets the value of the ilbc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getILBC() {
        return ilbc;
    }

    /**
     * Sets the value of the ilbc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setILBC(Integer value) {
        this.ilbc = value;
    }

    /**
     * Gets the value of the speex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSPEEX() {
        return speex;
    }

    /**
     * Sets the value of the speex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSPEEX(Integer value) {
        this.speex = value;
    }

    /**
     * Gets the value of the g729EV property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG729EV() {
        return g729EV;
    }

    /**
     * Sets the value of the g729EV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG729EV(Integer value) {
        this.g729EV = value;
    }

    /**
     * Gets the value of the h261 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH261() {
        return h261;
    }

    /**
     * Sets the value of the h261 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH261(Integer value) {
        this.h261 = value;
    }

    /**
     * Gets the value of the h263 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH263() {
        return h263;
    }

    /**
     * Sets the value of the h263 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH263(Integer value) {
        this.h263 = value;
    }

    /**
     * Gets the value of the codecmp4V property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCODECMP4V() {
        return codecmp4V;
    }

    /**
     * Sets the value of the codecmp4V property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCODECMP4V(Integer value) {
        this.codecmp4V = value;
    }

    /**
     * Gets the value of the h264 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH264() {
        return h264;
    }

    /**
     * Sets the value of the h264 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH264(Integer value) {
        this.h264 = value;
    }

    /**
     * Gets the value of the mpeg4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMPEG4() {
        return mpeg4;
    }

    /**
     * Sets the value of the mpeg4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMPEG4(Integer value) {
        this.mpeg4 = value;
    }

    /**
     * Gets the value of the t38 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getT38() {
        return t38;
    }

    /**
     * Sets the value of the t38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setT38(Integer value) {
        this.t38 = value;
    }

    /**
     * Gets the value of the t120 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getT120() {
        return t120;
    }

    /**
     * Sets the value of the t120 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setT120(Integer value) {
        this.t120 = value;
    }

    /**
     * Gets the value of the g711AVBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG711AVBD() {
        return g711AVBD;
    }

    /**
     * Sets the value of the g711AVBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG711AVBD(Integer value) {
        this.g711AVBD = value;
    }

    /**
     * Gets the value of the g711UVBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG711UVBD() {
        return g711UVBD;
    }

    /**
     * Sets the value of the g711UVBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG711UVBD(Integer value) {
        this.g711UVBD = value;
    }

    /**
     * Gets the value of the g726VBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG726VBD() {
        return g726VBD;
    }

    /**
     * Sets the value of the g726VBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG726VBD(Integer value) {
        this.g726VBD = value;
    }

    /**
     * Gets the value of the g72640VBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72640VBD() {
        return g72640VBD;
    }

    /**
     * Sets the value of the g72640VBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72640VBD(Integer value) {
        this.g72640VBD = value;
    }

    /**
     * Gets the value of the g72632VBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72632VBD() {
        return g72632VBD;
    }

    /**
     * Sets the value of the g72632VBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72632VBD(Integer value) {
        this.g72632VBD = value;
    }

    /**
     * Gets the value of the g72624VBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72624VBD() {
        return g72624VBD;
    }

    /**
     * Sets the value of the g72624VBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72624VBD(Integer value) {
        this.g72624VBD = value;
    }

    /**
     * Gets the value of the g72616VBD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getG72616VBD() {
        return g72616VBD;
    }

    /**
     * Sets the value of the g72616VBD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setG72616VBD(Integer value) {
        this.g72616VBD = value;
    }

    /**
     * Gets the value of the windbandamr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWINDBANDAMR() {
        return windbandamr;
    }

    /**
     * Sets the value of the windbandamr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWINDBANDAMR(Integer value) {
        this.windbandamr = value;
    }

    /**
     * Gets the value of the gsm610 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGSM610() {
        return gsm610;
    }

    /**
     * Sets the value of the gsm610 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGSM610(Integer value) {
        this.gsm610 = value;
    }

    /**
     * Gets the value of the h2632000 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getH2632000() {
        return h2632000;
    }

    /**
     * Sets the value of the h2632000 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setH2632000(Integer value) {
        this.h2632000 = value;
    }

    /**
     * Gets the value of the broadvoice32 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBROADVOICE32() {
        return broadvoice32;
    }

    /**
     * Sets the value of the broadvoice32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBROADVOICE32(Integer value) {
        this.broadvoice32 = value;
    }

    /**
     * Gets the value of the broadvoice32FEC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBROADVOICE32FEC() {
        return broadvoice32FEC;
    }

    /**
     * Sets the value of the broadvoice32FEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBROADVOICE32FEC(Integer value) {
        this.broadvoice32FEC = value;
    }

    /**
     * Gets the value of the acodec property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getACODEC() {
        return acodec;
    }

    /**
     * Sets the value of the acodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setACODEC(Short value) {
        this.acodec = value;
    }

    /**
     * Gets the value of the vcodec property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVCODEC() {
        return vcodec;
    }

    /**
     * Sets the value of the vcodec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVCODEC(Short value) {
        this.vcodec = value;
    }

    /**
     * Gets the value of the polidx property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPOLIDX() {
        return polidx;
    }

    /**
     * Sets the value of the polidx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPOLIDX(Short value) {
        this.polidx = value;
    }

    /**
     * Gets the value of the ebocl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBOCL() {
        return ebocl;
    }

    /**
     * Sets the value of the ebocl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBOCL(Integer value) {
        this.ebocl = value;
    }

    /**
     * Gets the value of the ebopl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBOPL() {
        return ebopl;
    }

    /**
     * Sets the value of the ebopl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBOPL(Integer value) {
        this.ebopl = value;
    }

    /**
     * Gets the value of the eboit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEBOIT() {
        return eboit;
    }

    /**
     * Sets the value of the eboit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEBOIT(Integer value) {
        this.eboit = value;
    }

    /**
     * Gets the value of the rm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRM() {
        return rm;
    }

    /**
     * Sets the value of the rm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRM(Integer value) {
        this.rm = value;
    }

    /**
     * Gets the value of the cpc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCPC() {
        return cpc;
    }

    /**
     * Sets the value of the cpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCPC(Integer value) {
        this.cpc = value;
    }

    /**
     * Gets the value of the pchg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPCHG() {
        return pchg;
    }

    /**
     * Sets the value of the pchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPCHG(Integer value) {
        this.pchg = value;
    }

    /**
     * Gets the value of the tfpt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTFPT() {
        return tfpt;
    }

    /**
     * Sets the value of the tfpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTFPT(Integer value) {
        this.tfpt = value;
    }

    /**
     * Gets the value of the cht property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCHT() {
        return cht;
    }

    /**
     * Sets the value of the cht property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCHT(Integer value) {
        this.cht = value;
    }

    /**
     * Gets the value of the mcidmode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCIDMODE() {
        return mcidmode;
    }

    /**
     * Sets the value of the mcidmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCIDMODE(Integer value) {
        this.mcidmode = value;
    }

    /**
     * Gets the value of the mcidcmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMCIDCMODE() {
        return mcidcmode;
    }

    /**
     * Sets the value of the mcidcmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMCIDCMODE(String value) {
        this.mcidcmode = value;
    }

    /**
     * Gets the value of the prepaididx property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPREPAIDIDX() {
        return prepaididx;
    }

    /**
     * Sets the value of the prepaididx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPREPAIDIDX(Integer value) {
        this.prepaididx = value;
    }

    /**
     * Gets the value of the crbtid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCRBTID() {
        return crbtid;
    }

    /**
     * Sets the value of the crbtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCRBTID(Integer value) {
        this.crbtid = value;
    }

    /**
     * Gets the value of the odbbictype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getODBBICTYPE() {
        return odbbictype;
    }

    /**
     * Sets the value of the odbbictype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setODBBICTYPE(Integer value) {
        this.odbbictype = value;
    }

    /**
     * Gets the value of the odbboctype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getODBBOCTYPE() {
        return odbboctype;
    }

    /**
     * Sets the value of the odbboctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setODBBOCTYPE(Integer value) {
        this.odbboctype = value;
    }

    /**
     * Gets the value of the odbbartype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getODBBARTYPE() {
        return odbbartype;
    }

    /**
     * Sets the value of the odbbartype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setODBBARTYPE(Integer value) {
        this.odbbartype = value;
    }

    /**
     * Gets the value of the odbss property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isODBSS() {
        return odbss;
    }

    /**
     * Sets the value of the odbss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setODBSS(Boolean value) {
        this.odbss = value;
    }

    /**
     * Gets the value of the odbbrcftype property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getODBBRCFTYPE() {
        return odbbrcftype;
    }

    /**
     * Sets the value of the odbbrcftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setODBBRCFTYPE(Integer value) {
        this.odbbrcftype = value;
    }

    /**
     * Gets the value of the pnoti property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPNOTI() {
        return pnoti;
    }

    /**
     * Sets the value of the pnoti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPNOTI(Integer value) {
        this.pnoti = value;
    }

    /**
     * Gets the value of the atsdtmbusy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getATSDTMBUSY() {
        return atsdtmbusy;
    }

    /**
     * Sets the value of the atsdtmbusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setATSDTMBUSY(Integer value) {
        this.atsdtmbusy = value;
    }

    /**
     * Gets the value of the stcf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSTCF() {
        return stcf;
    }

    /**
     * Sets the value of the stcf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSTCF(Integer value) {
        this.stcf = value;
    }

    /**
     * Gets the value of the dpr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPR() {
        return dpr;
    }

    /**
     * Sets the value of the dpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPR(String value) {
        this.dpr = value;
    }

    /**
     * Gets the value of the pron property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRON() {
        return pron;
    }

    /**
     * Sets the value of the pron property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRON(String value) {
        this.pron = value;
    }

    /**
     * Gets the value of the nshrcn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSHRCN() {
        return nshrcn;
    }

    /**
     * Sets the value of the nshrcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSHRCN(Integer value) {
        this.nshrcn = value;
    }

    /**
     * Gets the value of the nssb property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSSB() {
        return nssb;
    }

    /**
     * Sets the value of the nssb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSSB(Integer value) {
        this.nssb = value;
    }

    /**
     * Gets the value of the nsdstr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSDSTR() {
        return nsdstr;
    }

    /**
     * Sets the value of the nsdstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSDSTR(Integer value) {
        this.nsdstr = value;
    }

    /**
     * Gets the value of the nscun property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNSCUN() {
        return nscun;
    }

    /**
     * Sets the value of the nscun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNSCUN(Integer value) {
        this.nscun = value;
    }

    /**
     * Gets the value of the cuscat property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCUSCAT() {
        return cuscat;
    }

    /**
     * Sets the value of the cuscat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCUSCAT(Integer value) {
        this.cuscat = value;
    }

    /**
     * Gets the value of the vccflag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVCCFLAG() {
        return vccflag;
    }

    /**
     * Sets the value of the vccflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVCCFLAG(Integer value) {
        this.vccflag = value;
    }

    /**
     * Gets the value of the maxparacall property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMAXPARACALL() {
        return maxparacall;
    }

    /**
     * Sets the value of the maxparacall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMAXPARACALL(Integer value) {
        this.maxparacall = value;
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
