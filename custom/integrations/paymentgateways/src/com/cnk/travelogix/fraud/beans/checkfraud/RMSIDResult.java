//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.06.21 at 03:17:29 PM IST
//

package com.cnk.travelogix.fraud.beans.checkfraud;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TxnLogID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RiskLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RiskPercentage" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="DeviceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeviceProfileStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Output">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ipcity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ipregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ipcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ipisp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Iporg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Iplatitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Iplongitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Iphost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Proxyscore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Proxyfound" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Proxytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Spamscore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Binname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Bincity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Binregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Bincountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Billdistance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Billpostalcity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Billpostalregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Billpostalcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Shipbilldistance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Shipdistance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Shippostalcity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Shippostalregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Shippostalcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Freeemail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Emaildomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Emaildomaincountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Phoneserviceprovider" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Phonetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Phonecity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Phoneregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Phonecountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Tsdeltamins" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Tzdelta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Tzcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AffectedRules">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Rule20018" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder =
{ "referenceNo", "txnLogID", "templateID", "createdOn", "riskLevel", "riskPercentage", "amount", "deviceID",
		"deviceProfileStatus", "accuracy", "deviceType", "origin", "output", "affectedRules" })
@XmlRootElement(name = "RMSIDResult")
public class RMSIDResult
{

	@XmlElement(name = "ReferenceNo", required = true)
	protected String referenceNo;
	@XmlElement(name = "TxnLogID", required = true)
	protected String txnLogID;
	@XmlElement(name = "TemplateID")
	protected byte templateID;
	@XmlElement(name = "CreatedOn", required = true)
	protected String createdOn;
	@XmlElement(name = "RiskLevel", required = true)
	protected String riskLevel;
	@XmlElement(name = "RiskPercentage")
	protected byte riskPercentage;
	@XmlElement(name = "Amount")
	protected float amount;
	@XmlElement(name = "DeviceID", required = true)
	protected String deviceID;
	@XmlElement(name = "DeviceProfileStatus", required = true)
	protected String deviceProfileStatus;
	@XmlElement(name = "Accuracy", required = true)
	protected String accuracy;
	@XmlElement(name = "DeviceType", required = true)
	protected String deviceType;
	@XmlElement(name = "Origin", required = true)
	protected String origin;
	@XmlElement(name = "Output", required = true)
	protected RMSIDResult.Output output;
	@XmlElement(name = "AffectedRules", required = true)
	protected RMSIDResult.AffectedRules affectedRules;


	/**
	 * Gets the value of the referenceNo property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getReferenceNo()
	{
		return referenceNo;
	}

	/**
	 * Sets the value of the referenceNo property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setReferenceNo(final String value)
	{
		this.referenceNo = value;
	}

	/**
	 * Gets the value of the txnLogID property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getTxnLogID()
	{
		return txnLogID;
	}

	/**
	 * Sets the value of the txnLogID property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setTxnLogID(final String value)
	{
		this.txnLogID = value;
	}

	/**
	 * Gets the value of the templateID property.
	 *
	 */
	public byte getTemplateID()
	{
		return templateID;
	}

	/**
	 * Sets the value of the templateID property.
	 *
	 */
	public void setTemplateID(final byte value)
	{
		this.templateID = value;
	}

	/**
	 * Gets the value of the createdOn property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getCreatedOn()
	{
		return createdOn;
	}

	/**
	 * Sets the value of the createdOn property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setCreatedOn(final String value)
	{
		this.createdOn = value;
	}

	/**
	 * Gets the value of the riskLevel property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getRiskLevel()
	{
		return riskLevel;
	}

	/**
	 * Sets the value of the riskLevel property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setRiskLevel(final String value)
	{
		this.riskLevel = value;
	}

	/**
	 * Gets the value of the riskPercentage property.
	 *
	 */
	public byte getRiskPercentage()
	{
		return riskPercentage;
	}

	/**
	 * Sets the value of the riskPercentage property.
	 *
	 */
	public void setRiskPercentage(final byte value)
	{
		this.riskPercentage = value;
	}

	/**
	 * Gets the value of the amount property.
	 *
	 */
	public float getAmount()
	{
		return amount;
	}

	/**
	 * Sets the value of the amount property.
	 *
	 */
	public void setAmount(final float value)
	{
		this.amount = value;
	}

	/**
	 * Gets the value of the deviceID property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDeviceID()
	{
		return deviceID;
	}

	/**
	 * Sets the value of the deviceID property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDeviceID(final String value)
	{
		this.deviceID = value;
	}

	/**
	 * Gets the value of the deviceProfileStatus property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDeviceProfileStatus()
	{
		return deviceProfileStatus;
	}

	/**
	 * Sets the value of the deviceProfileStatus property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDeviceProfileStatus(final String value)
	{
		this.deviceProfileStatus = value;
	}

	/**
	 * Gets the value of the accuracy property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getAccuracy()
	{
		return accuracy;
	}

	/**
	 * Sets the value of the accuracy property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setAccuracy(final String value)
	{
		this.accuracy = value;
	}

	/**
	 * Gets the value of the deviceType property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getDeviceType()
	{
		return deviceType;
	}

	/**
	 * Sets the value of the deviceType property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setDeviceType(final String value)
	{
		this.deviceType = value;
	}

	/**
	 * Gets the value of the origin property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getOrigin()
	{
		return origin;
	}

	/**
	 * Sets the value of the origin property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setOrigin(final String value)
	{
		this.origin = value;
	}

	/**
	 * Gets the value of the output property.
	 *
	 * @return possible object is {@link RMSIDResult.Output }
	 *
	 */
	public RMSIDResult.Output getOutput()
	{
		return output;
	}

	/**
	 * Sets the value of the output property.
	 *
	 * @param value
	 *           allowed object is {@link RMSIDResult.Output }
	 *
	 */
	public void setOutput(final RMSIDResult.Output value)
	{
		this.output = value;
	}

	/**
	 * Gets the value of the affectedRules property.
	 *
	 * @return possible object is {@link RMSIDResult.AffectedRules }
	 *
	 */
	public RMSIDResult.AffectedRules getAffectedRules()
	{
		return affectedRules;
	}

	/**
	 * Sets the value of the affectedRules property.
	 *
	 * @param value
	 *           allowed object is {@link RMSIDResult.AffectedRules }
	 *
	 */
	public void setAffectedRules(final RMSIDResult.AffectedRules value)
	{
		this.affectedRules = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 *
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 *
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Rule20018" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 *
	 *
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder =
	{ "rule20018" })
	public static class AffectedRules
	{

		@XmlElement(name = "Rule20018", required = true)
		protected String rule20018;

		/**
		 * Gets the value of the rule20018 property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getRule20018()
		{
			return rule20018;
		}

		/**
		 * Sets the value of the rule20018 property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setRule20018(final String value)
		{
			this.rule20018 = value;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString()
		{
			return "AffectedRules [rule20018=" + rule20018 + "]";
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 *
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 *
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="Ipcity" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Ipregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Ipcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Ipisp" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Iporg" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Iplatitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Iplongitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Iphost" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Proxyscore" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Proxyfound" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Proxytype" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Spamscore" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Binname" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Bincity" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Binregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Bincountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Billdistance" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Billpostalcity" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Billpostalregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Billpostalcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Shipbilldistance" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Shipdistance" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Shippostalcity" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Shippostalregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Shippostalcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Freeemail" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Emaildomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Emaildomaincountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Phoneserviceprovider" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Phonetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Phonecity" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Phoneregion" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Phonecountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Tsdeltamins" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Tzdelta" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Tzcountry" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="Ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 *
	 *
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder =
	{ "ipcity", "ipregion", "ipcountry", "ipisp", "iporg", "iplatitude", "iplongitude", "iphost", "proxyscore", "proxyfound",
			"proxytype", "spamscore", "binname", "bincity", "binregion", "bincountry", "billdistance", "billpostalcity",
			"billpostalregion", "billpostalcountry", "shipbilldistance", "shipdistance", "shippostalcity", "shippostalregion",
			"shippostalcountry", "freeemail", "emaildomain", "emaildomaincountry", "phoneserviceprovider", "phonetype", "phonecity",
			"phoneregion", "phonecountry", "tsdeltamins", "tzdelta", "tzcountry", "ipaddress" })
	public static class Output
	{

		@XmlElement(name = "Ipcity", required = true)
		protected String ipcity;
		@XmlElement(name = "Ipregion", required = true)
		protected String ipregion;
		@XmlElement(name = "Ipcountry", required = true)
		protected String ipcountry;
		@XmlElement(name = "Ipisp", required = true)
		protected String ipisp;
		@XmlElement(name = "Iporg", required = true)
		protected String iporg;
		@XmlElement(name = "Iplatitude", required = true)
		protected String iplatitude;
		@XmlElement(name = "Iplongitude", required = true)
		protected String iplongitude;
		@XmlElement(name = "Iphost", required = true)
		protected String iphost;
		@XmlElement(name = "Proxyscore", required = true)
		protected String proxyscore;
		@XmlElement(name = "Proxyfound", required = true)
		protected String proxyfound;
		@XmlElement(name = "Proxytype", required = true)
		protected String proxytype;
		@XmlElement(name = "Spamscore", required = true)
		protected String spamscore;
		@XmlElement(name = "Binname", required = true)
		protected String binname;
		@XmlElement(name = "Bincity", required = true)
		protected String bincity;
		@XmlElement(name = "Binregion", required = true)
		protected String binregion;
		@XmlElement(name = "Bincountry", required = true)
		protected String bincountry;
		@XmlElement(name = "Billdistance", required = true)
		protected String billdistance;
		@XmlElement(name = "Billpostalcity", required = true)
		protected String billpostalcity;
		@XmlElement(name = "Billpostalregion", required = true)
		protected String billpostalregion;
		@XmlElement(name = "Billpostalcountry", required = true)
		protected String billpostalcountry;
		@XmlElement(name = "Shipbilldistance", required = true)
		protected String shipbilldistance;
		@XmlElement(name = "Shipdistance", required = true)
		protected String shipdistance;
		@XmlElement(name = "Shippostalcity", required = true)
		protected String shippostalcity;
		@XmlElement(name = "Shippostalregion", required = true)
		protected String shippostalregion;
		@XmlElement(name = "Shippostalcountry", required = true)
		protected String shippostalcountry;
		@XmlElement(name = "Freeemail", required = true)
		protected String freeemail;
		@XmlElement(name = "Emaildomain", required = true)
		protected String emaildomain;
		@XmlElement(name = "Emaildomaincountry", required = true)
		protected String emaildomaincountry;
		@XmlElement(name = "Phoneserviceprovider", required = true)
		protected String phoneserviceprovider;
		@XmlElement(name = "Phonetype", required = true)
		protected String phonetype;
		@XmlElement(name = "Phonecity", required = true)
		protected String phonecity;
		@XmlElement(name = "Phoneregion", required = true)
		protected String phoneregion;
		@XmlElement(name = "Phonecountry", required = true)
		protected String phonecountry;
		@XmlElement(name = "Tsdeltamins", required = true)
		protected String tsdeltamins;
		@XmlElement(name = "Tzdelta", required = true)
		protected String tzdelta;
		@XmlElement(name = "Tzcountry", required = true)
		protected String tzcountry;
		@XmlElement(name = "Ipaddress", required = true)
		protected String ipaddress;

		/**
		 * Gets the value of the ipcity property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIpcity()
		{
			return ipcity;
		}

		/**
		 * Sets the value of the ipcity property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIpcity(final String value)
		{
			this.ipcity = value;
		}

		/**
		 * Gets the value of the ipregion property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIpregion()
		{
			return ipregion;
		}

		/**
		 * Sets the value of the ipregion property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIpregion(final String value)
		{
			this.ipregion = value;
		}

		/**
		 * Gets the value of the ipcountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIpcountry()
		{
			return ipcountry;
		}

		/**
		 * Sets the value of the ipcountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIpcountry(final String value)
		{
			this.ipcountry = value;
		}

		/**
		 * Gets the value of the ipisp property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIpisp()
		{
			return ipisp;
		}

		/**
		 * Sets the value of the ipisp property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIpisp(final String value)
		{
			this.ipisp = value;
		}

		/**
		 * Gets the value of the iporg property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIporg()
		{
			return iporg;
		}

		/**
		 * Sets the value of the iporg property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIporg(final String value)
		{
			this.iporg = value;
		}

		/**
		 * Gets the value of the iplatitude property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIplatitude()
		{
			return iplatitude;
		}

		/**
		 * Sets the value of the iplatitude property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIplatitude(final String value)
		{
			this.iplatitude = value;
		}

		/**
		 * Gets the value of the iplongitude property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIplongitude()
		{
			return iplongitude;
		}

		/**
		 * Sets the value of the iplongitude property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIplongitude(final String value)
		{
			this.iplongitude = value;
		}

		/**
		 * Gets the value of the iphost property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIphost()
		{
			return iphost;
		}

		/**
		 * Sets the value of the iphost property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIphost(final String value)
		{
			this.iphost = value;
		}

		/**
		 * Gets the value of the proxyscore property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getProxyscore()
		{
			return proxyscore;
		}

		/**
		 * Sets the value of the proxyscore property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setProxyscore(final String value)
		{
			this.proxyscore = value;
		}

		/**
		 * Gets the value of the proxyfound property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getProxyfound()
		{
			return proxyfound;
		}

		/**
		 * Sets the value of the proxyfound property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setProxyfound(final String value)
		{
			this.proxyfound = value;
		}

		/**
		 * Gets the value of the proxytype property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getProxytype()
		{
			return proxytype;
		}

		/**
		 * Sets the value of the proxytype property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setProxytype(final String value)
		{
			this.proxytype = value;
		}

		/**
		 * Gets the value of the spamscore property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getSpamscore()
		{
			return spamscore;
		}

		/**
		 * Sets the value of the spamscore property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setSpamscore(final String value)
		{
			this.spamscore = value;
		}

		/**
		 * Gets the value of the binname property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBinname()
		{
			return binname;
		}

		/**
		 * Sets the value of the binname property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBinname(final String value)
		{
			this.binname = value;
		}

		/**
		 * Gets the value of the bincity property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBincity()
		{
			return bincity;
		}

		/**
		 * Sets the value of the bincity property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBincity(final String value)
		{
			this.bincity = value;
		}

		/**
		 * Gets the value of the binregion property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBinregion()
		{
			return binregion;
		}

		/**
		 * Sets the value of the binregion property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBinregion(final String value)
		{
			this.binregion = value;
		}

		/**
		 * Gets the value of the bincountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBincountry()
		{
			return bincountry;
		}

		/**
		 * Sets the value of the bincountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBincountry(final String value)
		{
			this.bincountry = value;
		}

		/**
		 * Gets the value of the billdistance property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBilldistance()
		{
			return billdistance;
		}

		/**
		 * Sets the value of the billdistance property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBilldistance(final String value)
		{
			this.billdistance = value;
		}

		/**
		 * Gets the value of the billpostalcity property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBillpostalcity()
		{
			return billpostalcity;
		}

		/**
		 * Sets the value of the billpostalcity property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBillpostalcity(final String value)
		{
			this.billpostalcity = value;
		}

		/**
		 * Gets the value of the billpostalregion property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBillpostalregion()
		{
			return billpostalregion;
		}

		/**
		 * Sets the value of the billpostalregion property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBillpostalregion(final String value)
		{
			this.billpostalregion = value;
		}

		/**
		 * Gets the value of the billpostalcountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getBillpostalcountry()
		{
			return billpostalcountry;
		}

		/**
		 * Sets the value of the billpostalcountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setBillpostalcountry(final String value)
		{
			this.billpostalcountry = value;
		}

		/**
		 * Gets the value of the shipbilldistance property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getShipbilldistance()
		{
			return shipbilldistance;
		}

		/**
		 * Sets the value of the shipbilldistance property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setShipbilldistance(final String value)
		{
			this.shipbilldistance = value;
		}

		/**
		 * Gets the value of the shipdistance property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getShipdistance()
		{
			return shipdistance;
		}

		/**
		 * Sets the value of the shipdistance property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setShipdistance(final String value)
		{
			this.shipdistance = value;
		}

		/**
		 * Gets the value of the shippostalcity property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getShippostalcity()
		{
			return shippostalcity;
		}

		/**
		 * Sets the value of the shippostalcity property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setShippostalcity(final String value)
		{
			this.shippostalcity = value;
		}

		/**
		 * Gets the value of the shippostalregion property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getShippostalregion()
		{
			return shippostalregion;
		}

		/**
		 * Sets the value of the shippostalregion property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setShippostalregion(final String value)
		{
			this.shippostalregion = value;
		}

		/**
		 * Gets the value of the shippostalcountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getShippostalcountry()
		{
			return shippostalcountry;
		}

		/**
		 * Sets the value of the shippostalcountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setShippostalcountry(final String value)
		{
			this.shippostalcountry = value;
		}

		/**
		 * Gets the value of the freeemail property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getFreeemail()
		{
			return freeemail;
		}

		/**
		 * Sets the value of the freeemail property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setFreeemail(final String value)
		{
			this.freeemail = value;
		}

		/**
		 * Gets the value of the emaildomain property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getEmaildomain()
		{
			return emaildomain;
		}

		/**
		 * Sets the value of the emaildomain property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setEmaildomain(final String value)
		{
			this.emaildomain = value;
		}

		/**
		 * Gets the value of the emaildomaincountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getEmaildomaincountry()
		{
			return emaildomaincountry;
		}

		/**
		 * Sets the value of the emaildomaincountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setEmaildomaincountry(final String value)
		{
			this.emaildomaincountry = value;
		}

		/**
		 * Gets the value of the phoneserviceprovider property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getPhoneserviceprovider()
		{
			return phoneserviceprovider;
		}

		/**
		 * Sets the value of the phoneserviceprovider property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setPhoneserviceprovider(final String value)
		{
			this.phoneserviceprovider = value;
		}

		/**
		 * Gets the value of the phonetype property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getPhonetype()
		{
			return phonetype;
		}

		/**
		 * Sets the value of the phonetype property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setPhonetype(final String value)
		{
			this.phonetype = value;
		}

		/**
		 * Gets the value of the phonecity property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getPhonecity()
		{
			return phonecity;
		}

		/**
		 * Sets the value of the phonecity property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setPhonecity(final String value)
		{
			this.phonecity = value;
		}

		/**
		 * Gets the value of the phoneregion property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getPhoneregion()
		{
			return phoneregion;
		}

		/**
		 * Sets the value of the phoneregion property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setPhoneregion(final String value)
		{
			this.phoneregion = value;
		}

		/**
		 * Gets the value of the phonecountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getPhonecountry()
		{
			return phonecountry;
		}

		/**
		 * Sets the value of the phonecountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setPhonecountry(final String value)
		{
			this.phonecountry = value;
		}

		/**
		 * Gets the value of the tsdeltamins property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getTsdeltamins()
		{
			return tsdeltamins;
		}

		/**
		 * Sets the value of the tsdeltamins property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setTsdeltamins(final String value)
		{
			this.tsdeltamins = value;
		}

		/**
		 * Gets the value of the tzdelta property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getTzdelta()
		{
			return tzdelta;
		}

		/**
		 * Sets the value of the tzdelta property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setTzdelta(final String value)
		{
			this.tzdelta = value;
		}

		/**
		 * Gets the value of the tzcountry property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getTzcountry()
		{
			return tzcountry;
		}

		/**
		 * Sets the value of the tzcountry property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setTzcountry(final String value)
		{
			this.tzcountry = value;
		}

		/**
		 * Gets the value of the ipaddress property.
		 *
		 * @return possible object is {@link String }
		 *
		 */
		public String getIpaddress()
		{
			return ipaddress;
		}

		/**
		 * Sets the value of the ipaddress property.
		 *
		 * @param value
		 *           allowed object is {@link String }
		 *
		 */
		public void setIpaddress(final String value)
		{
			this.ipaddress = value;
		}

		/*
		 * (non-Javadoc)
		 *
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString()
		{
			return "Output [ipcity=" + ipcity + ", ipregion=" + ipregion + ", ipcountry=" + ipcountry + ", ipisp=" + ipisp
					+ ", iporg=" + iporg + ", iplatitude=" + iplatitude + ", iplongitude=" + iplongitude + ", iphost=" + iphost
					+ ", proxyscore=" + proxyscore + ", proxyfound=" + proxyfound + ", proxytype=" + proxytype + ", spamscore="
					+ spamscore + ", binname=" + binname + ", bincity=" + bincity + ", binregion=" + binregion + ", bincountry="
					+ bincountry + ", billdistance=" + billdistance + ", billpostalcity=" + billpostalcity + ", billpostalregion="
					+ billpostalregion + ", billpostalcountry=" + billpostalcountry + ", shipbilldistance=" + shipbilldistance
					+ ", shipdistance=" + shipdistance + ", shippostalcity=" + shippostalcity + ", shippostalregion="
					+ shippostalregion + ", shippostalcountry=" + shippostalcountry + ", freeemail=" + freeemail + ", emaildomain="
					+ emaildomain + ", emaildomaincountry=" + emaildomaincountry + ", phoneserviceprovider=" + phoneserviceprovider
					+ ", phonetype=" + phonetype + ", phonecity=" + phonecity + ", phoneregion=" + phoneregion + ", phonecountry="
					+ phonecountry + ", tsdeltamins=" + tsdeltamins + ", tzdelta=" + tzdelta + ", tzcountry=" + tzcountry
					+ ", ipaddress=" + ipaddress + "]";
		}

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "RMSIDResult [referenceNo=" + referenceNo + ", txnLogID=" + txnLogID + ", templateID=" + templateID + ", createdOn="
				+ createdOn + ", riskLevel=" + riskLevel + ", riskPercentage=" + riskPercentage + ", amount=" + amount + ", deviceID="
				+ deviceID + ", deviceProfileStatus=" + deviceProfileStatus + ", accuracy=" + accuracy + ", deviceType=" + deviceType
				+ ", origin=" + origin + ", output=" + output + ", affectedRules=" + affectedRules + "]";
	}

}