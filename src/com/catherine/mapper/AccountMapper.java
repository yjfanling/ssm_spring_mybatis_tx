package com.catherine.mapper;

import com.catherine.bean.Account;

/**
 * �˻�mapper�ӿ�
 * @author 45969
 *
 */
public interface AccountMapper {
	//�������ݿ�ۿ�ͼӿ�
	
	//�ۿ�
	public void subMoney(Account pay);
	//�ӿ�
	public void addMoney(Account collect);
}
