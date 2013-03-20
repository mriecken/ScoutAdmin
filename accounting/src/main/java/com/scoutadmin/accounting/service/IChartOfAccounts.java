package com.scoutadmin.accounting.service;

import java.util.List;
import java.util.UUID;

import com.scoutadmin.accounting.Account;

public interface IChartOfAccounts {
	public Account getAccount( String name );
	public Account getAccount( UUID ID );
	public List<Account> getAccounts();
	public List<Account> searchAccounts( String name );
	public Account createAccount(Account account );
	
}
