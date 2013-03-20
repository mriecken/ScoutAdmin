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
	public static final UUID TOP_LEVEL = new UUID( 0L, 0L );
	
	private Map<UUID, List<Account>> accounts = new HashMap<UUID, List<Account>>();
	
	public void addAccounts( List<Account> accounts ) {
		for( Account account : accounts ) {
			addAccount( account );
		}
	}
	
	public void addAccount( Account account ) {
		UUID parentID = account.getParentID();
		
		if( parentID == null ) {
			parentID = TOP_LEVEL;
		}
		
		List<Account> children = accounts.get( parentID );
		
		if( children == null ) {
			children = new ArrayList<Account>();
			accounts.put( parentID, children );
		}
	}
	
	public List<Account> getTopLevelAccounts() {
		return accounts.get( TOP_LEVEL );
	}
	
	public List<Account> getChildAccounts( UUID parentID ) {
		return accounts.get( parentID );
	}
}
