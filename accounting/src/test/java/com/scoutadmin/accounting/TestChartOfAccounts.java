package com.scoutadmin.accounting;

import junit.framework.TestCase;

public class TestChartOfAccounts extends TestCase {

	public void testGeneral() {
		ChartOfAccounts chart = ChartOfAccountsHelper.generateChartOfAccounts();
		ChartOfAccountsHelper.print( chart );
	}
	public void testAddAccounts() {
		fail("Not yet implemented");
	}

	public void testAddAccount() {
		fail("Not yet implemented");
	}

	public void testGetTopLevelAccounts() {
		fail("Not yet implemented");
	}

	public void testGetChildAccounts() {
		fail("Not yet implemented");
	}
}
