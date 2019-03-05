package com.catherine.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.catherine.bean.Account;
import com.catherine.mapper.AccountMapper;

public class AccountServiceImpl implements AccountService {
	@Resource(type=AccountMapper.class)
	private AccountMapper mapper;
	@Override
	public void updateTransferAccounts() {
		Double transferMoney = 50d;
		
		Account pay = new Account();
		pay.setId(1);
		pay.setTransferMoney(transferMoney);
		//先扣款
		mapper.subMoney(pay);
		
		//int a = 1/0;
		
		
		Account collect = new Account();
		collect.setId(2);
		collect.setTransferMoney(transferMoney);
		//加款
		mapper.addMoney(collect);

	}

}
