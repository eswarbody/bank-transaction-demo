package com.bank.citi.account.citibank.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bank.citi.account.citibank.CitiBankApplication;
import com.bank.citi.account.citibank.dto.AccountFilterRequest;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CitiBankApplication.class})
public class AccountBalanceServiceTest {

	@Autowired
	private AccountBalanceService accountBalanceService;
	
	@Test
	public void test_account_balance() {
		AccountFilterRequest accountFilterRequest = new AccountFilterRequest();
		accountFilterRequest.setAccountNumber(12344);
		Object balanceReceived = accountBalanceService.getAccountBalance(accountFilterRequest);
		assertNotEquals(new Double(1900), balanceReceived);
	}
	
	@Test
	public void test_getAccountList_size() {
		List<Integer> accountList = accountBalanceService.getAccountList();
		assertEquals(0, accountList.size());
	}

}
