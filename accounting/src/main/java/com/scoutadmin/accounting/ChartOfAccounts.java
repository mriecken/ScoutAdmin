package com.scoutadmin.accounting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 
 * @author Michael Riecken
 * 
 */
public class ChartOfAccounts {
	public static final UUID TOP_LEVEL = new UUID(0L, 0L);
	private static final List<Account> EMPTY_LIST = Collections
			.unmodifiableList(new ArrayList<Account>());

	private Map<UUID, List<Account>> accounts = new HashMap<UUID, List<Account>>();

	public int getSize() {
		List<Account> all = getAllAccounts();
		return all.size();
	}

	public void addAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			addAccount(account);
		}
	}

	/**
	 * TODO: Prevent loops from being added (throws an exception)
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {
		UUID parentID = account.getParentID();

		if (parentID == null) {
			parentID = TOP_LEVEL;
		}

		List<Account> children = accounts.get(parentID);

		if (children == null) {
			children = new ArrayList<Account>();
			accounts.put(parentID, children);
		}
		children.add(account);
	}

	public List<Account> getTopLevelAccounts() {
		return Collections.unmodifiableList(accounts.get(TOP_LEVEL));
	}

	public List<Account> getChildAccounts(UUID parentID) {
		List<Account> result = accounts.get(parentID);

		if (result == null) {
			result = EMPTY_LIST;
		} else {
			result = Collections.unmodifiableList(result);
		}

		return result;
	}

	public Account getAccountByID(UUID ID) {
		if (ID == null) {
			return null;
		}

		List<Account> all = getAllAccounts();

		for (Account account : all) {
			if (account.getID().equals(ID)) {
				return account;
			}
		}

		return null;
	}

	public Account getAccountByName(String name) {
		if (name == null) {
			return null;
		}

		List<Account> all = getAllAccounts();

		for (Account account : all) {
			if (account.getName().equals(name)) {
				return account;
			}
		}

		return null;
	}

	public List<Account> getAllAccounts() {
		List<Account> result = new ArrayList<Account>();

		for (Account account : getTopLevelAccounts()) {
			result.add(account);
			addChildren(account, result);
		}

		return result;
	}

	/**
	 * Recurse through the chart.
	 * 
	 * @param account
	 * @param result
	 */
	private void addChildren(Account account, List<Account> result) {
		List<Account> children = getChildAccounts(account.getID());
		for (Account child : children) {
			result.add(child);
			addChildren(child, result);
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Account account : this.getTopLevelAccounts()) {
			sb.append(account).append( "\n" );
			toStringChildren(1, account.getID(), sb);
		}

		return sb.toString();
	}

	private void toStringChildren(int indent, UUID parent, StringBuilder sb) {
		for (Account account : this.getChildAccounts(parent)) {
			for (int i = 0; i < indent; i++) {
				sb.append("   ");
			}
			sb.append(account).append("\n");
			toStringChildren(indent + 1, account.getID(), sb);
		}
	}
}
