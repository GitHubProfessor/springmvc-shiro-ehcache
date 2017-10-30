package com.qd.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@Service
public class AccountService {
	//@Cacheable(value="accountCache")// 使用了一个缓存名叫 accountCache 
	@Cacheable(value = "dict-activeSessionCache")
	public Account getAccountByName(String userName) { 
	  // 方法内部实现不考虑缓存逻辑，直接实现业务
	  return getFromDB(userName); 
	} 
	
	@CachePut(value="accountCache",key="#account.getName()")// 更新 accountCache 缓存
	public Account updateAccount(Account account) { 
	  return updateDB(account); 
	} 
	
	
	
	private Account updateDB(Account account) { 
	  System.out.println("real updating db..."+account.getName()); 
	  return account; 
	}
	
	private Account getFromDB(String acctName) { 
	    System.out.println("real querying db..."+acctName); 
	    Account account = new Account(acctName); 
	    account.setPassword("123");
	    return account;
	   
	  } 
}
