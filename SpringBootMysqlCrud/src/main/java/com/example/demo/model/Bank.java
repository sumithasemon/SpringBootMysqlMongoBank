package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BankDetails")
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Account_Number;
	
	@Column(name="Account_Type")
	private String name;
	
	@Column(name="Customer_Name")
	private String custName;
	
	@Column(name="Pancard_No")
	private String pan;
	
	@Column(name="Aadhar_No")
	private String aadhar;
	
	@Column(name="Mobile_No")
	private Long mobileNumber;
	
	@Column(name="IFSC_Code")
	private String ifscCode;
	
	@Column(name="Branch")
	private String branch;

	public Long getAccount_Number() {
		return Account_Number;
	}

	public void setAccount_Number(Long account_Number) {
		Account_Number = account_Number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Bank [Account_Number=" + Account_Number + ", name=" + name + ", custName=" + custName + ", pan=" + pan
				+ ", aadhar=" + aadhar + ", mobileNumber=" + mobileNumber + ", ifscCode=" + ifscCode + ", branch="
				+ branch + ", toString()=" + super.toString() + "]";
	}
	

	
}
