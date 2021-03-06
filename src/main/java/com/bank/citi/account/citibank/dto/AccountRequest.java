package com.bank.citi.account.citibank.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AccountRequest {

	@NotNull(message="Account Number must not blank.")
	@Min(value = 10000, message = "Account Number Length must be 5.")
	@Max(value = 99999, message = "Account Number Length must be 5.")
	private Integer accountNumber;

	private Double balance;

	public AccountRequest() {
		super();
	}

	public AccountRequest(
			@NotNull(message = "Account Number must not blank.") @Min(value = 10000, message = "Account Number Length must be 5.") @Max(value = 99999, message = "Account Number Length must be 5.") Integer accountNumber,
			Double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
