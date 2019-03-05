package com.catherine.mapper;

import com.catherine.bean.Account;

/**
 * 账户mapper接口
 * @author 45969
 *
 */
public interface AccountMapper {
	//操作数据库扣款和加款
	
	//扣款
	public void subMoney(Account pay);
	//加款
	public void addMoney(Account collect);
}
