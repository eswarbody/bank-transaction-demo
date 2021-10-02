package com.bank.citi.account.citibank.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.bank.citi.account.citibank.dto.AccountFilterRequest;
import com.bank.citi.account.citibank.dto.AccountRequest;
import com.bank.citi.account.citibank.service.AccountBalanceService;
import com.bank.citi.account.citibank.util.CitiBankUtil;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author EswarBody
 * @CreateDate 2021-10-01
 * @Description: Dealing account operations such as create, read, update
 */

@RestController
public class AccountBalanceController {
	
	@Autowired
	private AccountBalanceService accountBalanceService;
	
	@PostMapping("/accountCreate")
	public Object createAccount(@Valid @RequestBody AccountRequest accountRequest, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return CitiBankUtil.getErrorList(bindResult);
		}
		
		return accountBalanceService.saveAccount(accountRequest);
	}
	
	@PostMapping("/getBalance")
	@ApiOperation(value = "Provides current balance of provided Account", response = Double.class)
	public Object getBalance(@Valid @RequestBody AccountFilterRequest accountFilterRequest, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return CitiBankUtil.getErrorList(bindResult);
		}
		
		return accountBalanceService.getAccountBalance(accountFilterRequest);
	}
	
	@GetMapping("/getAccountList")
	public List<Integer> getAccountList(){
		return accountBalanceService.getAccountList();
	}
}
