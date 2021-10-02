package com.bank.citi.account.citibank.dto;

import com.bank.citi.account.citibank.entity.AccountEntity;

import lombok.Data;

@Data
public class AccountResponse{

	private AccountEntity accountEntity;
	private boolean isSuccess;
	private String errorMessage;
	public AccountResponse(AccountEntity accountEntity, boolean isSuccess, String errorMessage) {
		super();
		this.accountEntity = accountEntity;
		this.isSuccess = isSuccess;
		this.errorMessage = errorMessage;
	}
}
