package com.scoutadmin.accounting;

import java.util.List;
import java.util.UUID;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestChartOfAccounts extends TestCase {

	public void testAddAccounts() {
		ChartOfAccounts chart = ChartOfAccountsHelper.generateChartOfAccounts();

		Account parent = chart.getAccountByName("Services"); // 4.2.0
		UUID parentID = parent.getID();

		UUID newAccountID = UUID.randomUUID();

		Account account = new Account(newAccountID, "This is a test account",
				AccountType.CREDIT, "4.2.4", null, "Description", false,
				parentID);
		chart.addAccount(account);

		// Now we should see our account when we get the children of the parent
		List<Account> children = chart.getChildAccounts(parentID);
		Assert.assertTrue(children.contains(account));

		// We should also be able to see this if we search for it.
		Assert.assertNotNull(chart.getAccountByID(account.getID()));
		
		Assert.assertNotNull(chart.getAccountByName( account.getName() ) );
	}

	public void testAddAccountToTopLevel() {
		ChartOfAccounts chart = ChartOfAccountsHelper.generateChartOfAccounts();

		Account parent = chart.getAccountByName("Services"); // 4.2.0
		UUID parentID = parent.getID();

		UUID newAccountID = UUID.randomUUID();

		Account account = new Account(newAccountID, "This is a test account",
				AccountType.CREDIT, "4.2.4", null, "Description", false,
				ChartOfAccounts.TOP_LEVEL);
		
		chart.addAccount(account);
		
		Assert.assertTrue( chart.getTopLevelAccounts().contains( account ) );
	}

	public void testGetTopLevelAccounts() {
		ChartOfAccounts chart = ChartOfAccountsHelper.generateChartOfAccounts();

		// We should only have accounts that start with X.0.0 and should have nothing else.
		for( Account account : chart.getTopLevelAccounts() ) {
			String number = account.getNumber();
			Assert.assertTrue( number.matches( "[0-9]*\\.0\\.0" ) );
		}
		
		// And there should be eight children
		Assert.assertEquals( 8, chart.getTopLevelAccounts().size() );
	}

	public void testGetChildAccounts() {
		
	}
}
