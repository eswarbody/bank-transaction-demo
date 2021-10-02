package com.bank.citi.account.citibank.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AccountFilterRequest {
	
	@NotNull(message="Account Number must not blank.")
	@Min(value = 10000, message = "Account Number Length must be 5.")
	@Max(value = 99999, message = "Account Number Length must be 5.")
	private Integer accountNumber;
	
	private String startDate;   //can write pattern validation for DateFormat to be entered
	private String endDate;
	
	//@NotEmpty(message="TransactionType must not blank.")	
	@Pattern(regexp = "^[D|W|d|w]{1}$", message ="Transaction Type Must be D or d or W or w.")
	private String transactionType;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
	
}
