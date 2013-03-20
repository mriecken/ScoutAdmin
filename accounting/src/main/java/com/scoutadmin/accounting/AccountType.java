package com.scoutadmin.accounting;

/**
 * A DEBIT account (like Assets and Expenses) INCREASE the account when DEBITED
 * A CREDIT account (like Liability, Income and Capital) INCREASE the account when CREDITED
 * 
 * @see http://en.wikipedia.org/wiki/Double-entry_bookkeeping_system#Debits_and_credits
 * @author Michael Riecken
 *
 */
public enum AccountType {
	CREDIT,
	DEBIT;
}
