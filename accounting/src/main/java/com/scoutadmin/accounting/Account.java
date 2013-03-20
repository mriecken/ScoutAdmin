package com.scoutadmin.accounting;

import java.util.UUID;

/**
 * The Account is the base element of the chart of accounts.  Each chart of accounts is associated with a single 
 * Organization (company, troop, whatever).
 * 
 * @author Michael Riecken
 *
 */
public class Account {
	private UUID ID;
	private String name;
	private AccountType category;
	private String number;
	private String alternateNumber;
	private String description;
	private boolean active;
	private UUID parentID;

	public Account(UUID ID, String name, AccountType category, String number,
			String alternateNumber, String description, boolean active, UUID parentID) {
		super();
		this.ID = ID;
		this.name = name;
		this.category = category;
		this.number = number;
		this.alternateNumber = alternateNumber;
		this.description = description;
		this.active = active;
		this.parentID = parentID;
	}
	
	public UUID getID() {
		return ID;
	}

	public void setID(UUID iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAlternateNumber() {
		return alternateNumber;
	}

	public void setAlternateNumber(String alternateNumber) {
		this.alternateNumber = alternateNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public AccountType getCategory() {
		return category;
	}

	public void setCategory(AccountType category) {
		this.category = category;
	}

	public UUID getParentID() {
		return parentID;
	}

	public void setParentID(UUID parentID) {
		this.parentID = parentID;
	}
	
	public String toString() {
		return this.getNumber() + ": " + this.getName();
	}

}
