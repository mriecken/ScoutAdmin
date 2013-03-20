package com.scoutadmin.accounting;

import java.util.List;
import java.util.UUID;

public class ChartOfAccountsHelper {

	/**
	 * Generates a
	 * 
	 * @return
	 */
	public static ChartOfAccounts generateChartOfAccounts() {
		ChartOfAccounts chart = new ChartOfAccounts();
		
		chart.addAccount( new Account(	new UUID(0L, 2L)	, "Assets",	AccountType.DEBIT	, "1.0.0","010000","Assets",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 3L)	, "Current",	AccountType.DEBIT	, "1.1.0","010100","AssetsCurrent",true,	new UUID(0L, 2L)	));
		chart.addAccount( new Account(	new UUID(0L, 4L)	, "Cash, Cash Equivalents, Short-term Investments",	AccountType.DEBIT	, "1.1.1","010101","CashCashEquivalentsAndShortTermInvestments",true,	new UUID(1L, 3L)	));
		chart.addAccount( new Account(	new UUID(0L, 5L)	, "Receivables",	AccountType.DEBIT	, "1.1.2","010102","ReceivablesNetCurrent",true,	new UUID(1L, 3L)	));
		chart.addAccount( new Account(	new UUID(0L, 6L)	, "Inventory",	AccountType.DEBIT	, "1.1.3","010103","InventoryNet",true,	new UUID(1L, 3L)	));
		chart.addAccount( new Account(	new UUID(0L, 7L)	, "Accrued and Deferred",	AccountType.DEBIT	, "1.1.4","010104","PrepaidExpenseAndOtherAssetsCurrent",true,	new UUID(1L, 3L)	));
		chart.addAccount( new Account(	new UUID(0L, 8L)	, "Long-lived",	AccountType.DEBIT	, "1.2.0","010200","AssetsNoncurrent",true,	new UUID(0L, 2L)	));
		chart.addAccount( new Account(	new UUID(0L, 9L)	, "Investments",	AccountType.DEBIT	, "1.2.1","010201","LongTermInvestments",true,	new UUID(6L, 8L)	));
		chart.addAccount( new Account(	new UUID(0L, 10L)	, "Property pant and equipment",	AccountType.DEBIT	, "1.2.2","010202","PropertyPlantAndEquipmentNet",true,	new UUID(6L, 8L)	));
		chart.addAccount( new Account(	new UUID(0L, 11L)	, "Intangible assets",	AccountType.DEBIT	, "1.2.3","010203","IntangibleAssetsNetExcludingGoodwill",true,	new UUID(6L, 8L)	));
		chart.addAccount( new Account(	new UUID(0L, 12L)	, "Other long-lived assets",	AccountType.DEBIT	, "1.2.5","010205","OtherAssetsNoncurrent",true,	new UUID(6L, 8L)	));
		chart.addAccount( new Account(	new UUID(0L, 13L)	, "Liabilities",	AccountType.DEBIT	, "2.0.0","020000","Liabilities",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 14L)	, "Current Liabilities",	AccountType.DEBIT	, "2.1.0","020100","LiabilitiesCurrent",true,	new UUID(11L, 13L)	));
		chart.addAccount( new Account(	new UUID(0L, 15L)	, "Accounts Payable",	AccountType.DEBIT	, "2.1.1","020101","AccountsPayableCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 16L)	, "Accrued Liabilities",	AccountType.DEBIT	, "2.1.2","020102","AccruedLiabilitiesCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 17L)	, "Debts",	AccountType.DEBIT	, "2.1.2","020102","DebtCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 18L)	, "Unearned (deferred) revenue",	AccountType.DEBIT	, "2.1.3","020103","DeferredRevenueAndCreditsCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 19L)	, "Deferred Compensation",	AccountType.DEBIT	, "2.1.4","020104","DeferredCompensationLiabilityCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 20L)	, "Derivative Instruments and Hedges",	AccountType.DEBIT	, "2.1.5","020105","DerivativeInstrumentsAndHedgesLiabilities",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 21L)	, "BillingsInExcessOfCostCurrent",	AccountType.DEBIT	, "2.1.6","020106","BillingsInExcessOfCostCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 22L)	, "Current portion of long-term debt",	AccountType.DEBIT	, "2.1.7","020107","LongTermDebtCurrent",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 23L)	, "Other Current Liabilities",	AccountType.DEBIT	, "2.1.8","020108","-- Not defined / Add own XBRL name --",true,	new UUID(12L, 14L)	));
		chart.addAccount( new Account(	new UUID(0L, 24L)	, "Long-term Liabilities",	AccountType.DEBIT	, "2.2.0","020200","LiabilitiesNoncurrent",true,	new UUID(11L, 13L)	));
		chart.addAccount( new Account(	new UUID(0L, 25L)	, "Debt",	AccountType.DEBIT	, "2.2.1","020201","LongTermDebtNoncurrent",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 26L)	, "Capital Leases",	AccountType.DEBIT	, "2.2.2","020202","CapitalLeaseObligationsNoncurrent",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 27L)	, "Other Than Debt",	AccountType.DEBIT	, "2.2.3","020203","LiabilitiesOtherThanLongTermDebtNoncurrent",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 28L)	, "Unearned (deferred) Revenue",	AccountType.DEBIT	, "2.2.4","020204","DeferredRevenueAndCreditsNoncurrent",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 29L)	, "Provisions",	AccountType.DEBIT	, "2.2.5","020205","-- Not defined / Add own XBRL name --",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 30L)	, "Tax related",	AccountType.DEBIT	, "2.2.6","020206","-- Not defined / Add own XBRL name --",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 31L)	, "Derivatives and Hedges",	AccountType.DEBIT	, "2.2.7","020207","DerivativeInstrumentsAndHedgesLiabilitiesNoncurrent",true,	new UUID(22L, 24L)	));
		chart.addAccount( new Account(	new UUID(0L, 32L)	, "Equity",	AccountType.DEBIT	, "3.0.0","030000","StockholdersEquityIncludingPortionAttributableToNoncontrollingInterest",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 33L)	, "Common Stock",	AccountType.DEBIT	, "3.1.0","030100","CommonStockValue",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 34L)	, "Preferred Stock",	AccountType.DEBIT	, "3.2.0","030200","PreferredStockValue",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 35L)	, "Additional Paid In Capital",	AccountType.DEBIT	, "3.3.0","030300","AdditionalPaidInCapital",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 36L)	, "Other Additional Capital",	AccountType.DEBIT	, "3.4.0","030400","OtherAdditionalCapital",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 37L)	, "Retained Earnings (Deficit)",	AccountType.DEBIT	, "3.5.0","030500","RetainedEarningsAccumulatedDeficit",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 38L)	, "Appropriated",	AccountType.DEBIT	, "3.5.1","030501","RetainedEarningsAppropriated",true,	new UUID(35L, 37L)	));
		chart.addAccount( new Account(	new UUID(0L, 39L)	, "Unappropriated",	AccountType.DEBIT	, "3.5.2","030502","RetainedEarningsUnappropriated",true,	new UUID(35L, 37L)	));
		chart.addAccount( new Account(	new UUID(0L, 40L)	, "Accumulated Other Comprehensive Income (Loss) Net Of Tax",	AccountType.DEBIT	, "3.6.0","030600","AccumulatedOtherComprehensiveIncomeLossNetOfTax",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 41L)	, "Foreign Currency Translation Loss",	AccountType.DEBIT	, "3.6.1","030601","AccumulatedOtherComprehensiveIncomeLossForeignCurrencyTranslationAdjustmentNetOfTax",true,	new UUID(38L, 40L)	));
		chart.addAccount( new Account(	new UUID(0L, 42L)	, "Available For Sale Securities",	AccountType.DEBIT	, "3.6.2","030602","AccumulatedOtherComprehensiveIncomeLossAvailableForSaleSecuritiesAdjustmentNetOfTax",true,	new UUID(38L, 40L)	));
		chart.addAccount( new Account(	new UUID(0L, 43L)	, "Cash Flow Hedges",	AccountType.DEBIT	, "3.6.3","030603","AccumulatedOtherComprehensiveIncomeLossCumulativeChangesInNetGainLossFromCashFlowHedgesEffectNetOfTax",true,	new UUID(38L, 40L)	));
		chart.addAccount( new Account(	new UUID(0L, 44L)	, "Defined Benefit Plan Inocme (Loss)",	AccountType.DEBIT	, "3.6.4","030604","AccumulatedOtherComprehensiveIncomeLossDefinedBenefitPensionAndOtherPostretirementPlansNetOfTax",true,	new UUID(38L, 40L)	));
		chart.addAccount( new Account(	new UUID(0L, 45L)	, "Impairment Debt Securities",	AccountType.DEBIT	, "3.6.5","030605","AccumulatedOtherComprehensiveIncomeLossOtherThanTemporaryImpairmentNotCreditLossNetOfTaxDebtSecurities",true,	new UUID(38L, 40L)	));
		chart.addAccount( new Account(	new UUID(0L, 46L)	, "Accumulated asset revaluations",	AccountType.DEBIT	, "3.6.6","030606","-- Not defined / Add own XBRL name --",true,	new UUID(38L, 40L)	));
		chart.addAccount( new Account(	new UUID(0L, 47L)	, "Other Equity",	AccountType.DEBIT	, "3.7.0","030700","-- Not defined / Add own XBRL name --",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 48L)	, "Common Subscribed Stock",	AccountType.DEBIT	, "3.7.1","030701","CommonStockShareSubscribedButUnissuedSubscriptionsReceivable",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 49L)	, "Preferred Subscribed Stock",	AccountType.DEBIT	, "3.7.2","030702","PreferredStockSharesSubscribedButUnissuedSubscriptionsReceivable",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 50L)	, "Common Stock Held By Subsidiary",	AccountType.DEBIT	, "3.7.3","030703","CommonStockHeldBySubsidiary",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 51L)	, "Treasury Stock Value",	AccountType.DEBIT	, "3.7.4","030704","TreasuryStockValue",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 52L)	, "Treasury Stock Deferred Employee Stock Ownership Plan",	AccountType.DEBIT	, "3.7.5","030705","TreasuryStockDeferredEmployeeStockOwnershipPlan",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 53L)	, "Deferred Compensation Equity",	AccountType.DEBIT	, "3.7.6","030706","DeferredCompensationEquity",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 54L)	, "Unearned ESOP Shares",	AccountType.DEBIT	, "3.7.7","030707","UnearnedESOPShares",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 55L)	, "Receivable From Officers And Directors For Issuance Of Capital Stock",	AccountType.DEBIT	, "3.7.8","030708","ReceivableFromOfficersAndDirectorsForIssuanceOfCapitalStock",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 56L)	, "Receivable From Shareholders Or Affiliates For Issuance Of Capital Stock",	AccountType.DEBIT	, "3.7.9","030709","ReceivableFromShareholdersOrAffiliatesForIssuanceOfCapitalStock",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 57L)	, "Warrants And Rights Outstanding",	AccountType.DEBIT	, "3.7.10","030710","WarrantsAndRightsOutstanding",true,	new UUID(0L, 47L)	));
		chart.addAccount( new Account(	new UUID(0L, 58L)	, "MinorityInterest",	AccountType.DEBIT	, "3.8.0","030800","MinorityInterest",true,	new UUID(30L, 32L)	));
		chart.addAccount( new Account(	new UUID(0L, 59L)	, "Revenues",	AccountType.DEBIT	, "4.0.0","040000","SalesRevenueNet",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 60L)	, "Goods",	AccountType.DEBIT	, "4.1.0","040100","SalesRevenueGoodsNet",true,	new UUID(0L, 59L)	));
		chart.addAccount( new Account(	new UUID(0L, 61L)	, "Products",	AccountType.DEBIT	, "4.1.1","040101","SalesRevenueGoodsGross",true,	new UUID(0L, 60L)	));
		chart.addAccount( new Account(	new UUID(0L, 62L)	, "Merchandise",	AccountType.DEBIT	, "4.1.2","040102","-- Not defined / Add own XBRL name --",true,	new UUID(0L, 60L)	));
		chart.addAccount( new Account(	new UUID(0L, 63L)	, "Other goods",	AccountType.DEBIT	, "4.1.3","040103","-- Not defined / Add own XBRL name --",true,	new UUID(0L, 60L)	));
		chart.addAccount( new Account(	new UUID(0L, 64L)	, "Returns",	AccountType.DEBIT	, "4.1.4","040104","SalesReturnsGoods",true,	new UUID(0L, 60L)	));
		chart.addAccount( new Account(	new UUID(0L, 65L)	, "Allowances",	AccountType.DEBIT	, "4.1.5","040105","SalesAllowancesGoods",true,	new UUID(0L, 60L)	));
		chart.addAccount( new Account(	new UUID(0L, 66L)	, "Discounts",	AccountType.DEBIT	, "4.1.6","040106","SalesDiscountsGoods",true,	new UUID(0L, 60L)	));
		chart.addAccount( new Account(	new UUID(0L, 67L)	, "Services",	AccountType.DEBIT	, "4.2.0","040200","SalesRevenueServicesNet",true,	new UUID(0L, 59L)	));
		chart.addAccount( new Account(	new UUID(0L, 68L)	, "General services",	AccountType.DEBIT	, "4.2.1","040201","SalesRevenueServicesGross",true,	new UUID(0L, 67L)	));
		chart.addAccount( new Account(	new UUID(0L, 69L)	, "Allowances",	AccountType.DEBIT	, "4.2.2","040202","SalesAllowancesServices",true,	new UUID(0L, 67L)	));
		chart.addAccount( new Account(	new UUID(0L, 70L)	, "Cash discounts",	AccountType.DEBIT	, "4.2.3","040203","SalesDiscountsServices",true,	new UUID(0L, 67L)	));
		chart.addAccount( new Account(	new UUID(0L, 71L)	, "Revenue from Related Parties",	AccountType.DEBIT	, "4.3.0","040300","RevenueFromRelatedParties",true,	new UUID(0L, 59L)	));
		chart.addAccount( new Account(	new UUID(0L, 72L)	, "Other Operating Revenue",	AccountType.DEBIT	, "4.4.0","040400","OtherSalesRevenueNet",true,	new UUID(0L, 59L)	));
		chart.addAccount( new Account(	new UUID(0L, 73L)	, "Sale of Trust Assets to Pay Expenses",	AccountType.DEBIT	, "4.5.0","040500","SaleOfTrustAssetsToPayExpenses",true,	new UUID(0L, 59L)	));
		chart.addAccount( new Account(	new UUID(0L, 74L)	, "Special Operating Revenues",	AccountType.DEBIT	, "4.6.0","040600","-- Not defined / Add own XBRL name --",true,	new UUID(0L, 59L)	));
		chart.addAccount( new Account(	new UUID(0L, 75L)	, "Shipping and Handling Revenue",	AccountType.DEBIT	, "4.6.1","040601","ShippingAndHandlingRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 76L)	, "Reimbursement Revenue",	AccountType.DEBIT	, "4.6.2","040602","ReimbursementRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 77L)	, "Subscription and Circulation Revenue",	AccountType.DEBIT	, "4.6.3","040603","SubscriptionRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 78L)	, "Advertising Revenue",	AccountType.DEBIT	, "4.6.4","040604","AdvertisingRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 79L)	, "Admissions Revenue",	AccountType.DEBIT	, "4.6.5","040605","AdmissionsRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 80L)	, "Enrollment and Registration Fees, Excluding Hospitality Enterprises",	AccountType.DEBIT	, "4.6.6","040606","RevenueFromEnrollmentAndRegistrationFeesExcludingHospitalityEnterprises",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 81L)	, "Membership Dues Revenue, On-going",	AccountType.DEBIT	, "4.6.7","040607","MembershipDuesRevenueOnGoing",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 82L)	, "Licenses Revenue",	AccountType.DEBIT	, "4.6.8","040608","LicensesRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 83L)	, "Franchise Revenue",	AccountType.DEBIT	, "4.6.9","040609","FranchiseRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 84L)	, "Franchisor Revenue",	AccountType.DEBIT	, "4.6.10","040610","FranchisorRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 85L)	, "Clearing Fees Revenue",	AccountType.DEBIT	, "4.6.11","040611","ClearingFeesRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 86L)	, "Passenger Revenue",	AccountType.DEBIT	, "4.6.12","040612","PassengerRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 87L)	, "Cargo and Freight Revenue",	AccountType.DEBIT	, "4.6.13","040613","CargoAndFreightRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 88L)	, "Vehicle Toll Revenue",	AccountType.DEBIT	, "4.6.14","040614","VehicleTollRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 89L)	, "Health Care Organization",	AccountType.DEBIT	, "4.6.15","040615","HealthCareOrganizationRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 90L)	, "Operating Leases",	AccountType.DEBIT	, "4.6.16","040616","OperatingLeasesIncomeStatementLeaseRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 91L)	, "Financial Services Revenue",	AccountType.DEBIT	, "4.6.17","040617","FinancialServicesRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 92L)	, "Real Estate Related",	AccountType.DEBIT	, "4.6.18","040618","RealEstateRevenueGross",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 93L)	, "Oil And Gas",	AccountType.DEBIT	, "4.6.20","040620","OilAndGasRevenue",true,	new UUID(0L, 74L)	));
		chart.addAccount( new Account(	new UUID(0L, 94L)	, "Expenses",	AccountType.DEBIT	, "5.0.0","050000","-- Not defined / Add own XBRL name --",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 95L)	, "Cost of Sales",	AccountType.DEBIT	, "5.1.0","050100","CostOfRevenue",true,	new UUID(0L, 94L)	));
		chart.addAccount( new Account(	new UUID(0L, 96L)	, "Cost of Goods Sold",	AccountType.DEBIT	, "5.1.1","050101","CostOfGoodsAndServicesSold",true,	new UUID(0L, 95L)	));
		chart.addAccount( new Account(	new UUID(0L, 97L)	, "Cost of Services Rendered",	AccountType.DEBIT	, "5.1.2","050102","CostOfServices",true,	new UUID(0L, 95L)	));
		chart.addAccount( new Account(	new UUID(0L, 98L)	, "Other Cost of Operating Revenue",	AccountType.DEBIT	, "5.1.3","050103","OtherCostOfOperatingRevenue",true,	new UUID(0L, 95L)	));
		chart.addAccount( new Account(	new UUID(0L, 99L)	, "Cost of Trust Assets Sold to Pay Expenses",	AccountType.DEBIT	, "5.1.4","050104","CostOfTrustAssetsSoldToPayExpenses",true,	new UUID(0L, 95L)	));
		chart.addAccount( new Account(	new UUID(0L, 100L)	, "Selling, General and Administrative",	AccountType.DEBIT	, "5.2.0","050200","SellingGeneralAndAdministrativeExpense",true,	new UUID(0L, 94L)	));
		chart.addAccount( new Account(	new UUID(0L, 101L)	, "General and Administrative",	AccountType.DEBIT	, "5.2.2","050202","GeneralAndAdministrativeExpense",true,	new UUID(0L, 100L)	));
		chart.addAccount( new Account(	new UUID(0L, 102L)	, "Other General Expense",	AccountType.DEBIT	, "5.2.3","050203","OtherGeneralExpense",true,	new UUID(0L, 100L)	));
		chart.addAccount( new Account(	new UUID(0L, 103L)	, "Other Revenue, Expenses, Gains and Losses",	AccountType.DEBIT	, "6.0.0","060000","-- Not defined / Add own XBRL name --",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 104L)	, "Gains (losses)",	AccountType.DEBIT	, "6.1.0","060100","-- Not defined / Add own XBRL name --",true,	new UUID(0L, 103L)	));
		chart.addAccount( new Account(	new UUID(0L, 105L)	, "Disposal of PP&E",	AccountType.DEBIT	, "6.1.1","060101","GainLossOnSaleOfPropertyPlantEquipment",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 106L)	, "Sale of Business",	AccountType.DEBIT	, "6.1.2","060102","GainLossOnSaleOfBusiness",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 107L)	, "Impairment Charges",	AccountType.DEBIT	, "6.1.3","060103","AssetImpairmentCharges",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 108L)	, "Restructuring Charges",	AccountType.DEBIT	, "6.1.4","060104","RestructuringCharges",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 109L)	, "Foreign Currency Transactions",	AccountType.DEBIT	, "6.1.5","060105","ForeignCurrencyTransactionGainLossBeforeTax",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 110L)	, "Investments",	AccountType.DEBIT	, "6.1.6","060106","GainLossOnInvestments",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 111L)	, "Marketable Securities",	AccountType.DEBIT	, "6.1.7","060107","MarketableSecuritiesGainLoss",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 112L)	, "Cost-method Investments",	AccountType.DEBIT	, "6.1.8","060108","CostMethodInvestmentsRealizedGainLoss",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 113L)	, "Marketable Securities",	AccountType.DEBIT	, "6.1.9","060109","MarketableSecuritiesGainLossExcludingOtherThanTemporaryImpairments",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 114L)	, "Cost-method Investments",	AccountType.DEBIT	, "6.1.10","060110","CostmethodInvestmentsRealizedGainLossExcludingOtherThanTemporaryImpairments",true,	new UUID(0L, 104L)	));
		chart.addAccount( new Account(	new UUID(0L, 115L)	, "Other Revenues",	AccountType.DEBIT	, "6.2.0","060200","-- Not defined / Add own XBRL name --",true,	new UUID(0L, 103L)	));
		chart.addAccount( new Account(	new UUID(0L, 116L)	, "Royalty Income, Nonoperating",	AccountType.DEBIT	, "6.2.1","060201","RoyaltyIncomeNonoperating",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 117L)	, "Rental Income, Nonoperating",	AccountType.DEBIT	, "6.2.2","060202","RentalIncomeNonoperating",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 118L)	, "Revenue from Grants",	AccountType.DEBIT	, "6.2.3","060203","RevenueFromGrants",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 119L)	, "Investment Income, Net",	AccountType.DEBIT	, "6.2.4","060204","InvestmentIncomeNet",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 120L)	, "Other Nonoperating Income",	AccountType.DEBIT	, "6.2.5","060205","OtherNonoperatingIncome",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 121L)	, "Development Profits, Nonoperating",	AccountType.DEBIT	, "6.2.6","060206","DevelopmentProfitsNonoperating",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 122L)	, "Recovery Stranded Costs",	AccountType.DEBIT	, "6.2.7","060207","RecoveryStrandedCosts",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 123L)	, "Leveraged Leases, Income (Loss)",	AccountType.DEBIT	, "6.2.8","060208","LeveragedLeasesIncomeStatementNetIncomeFromLeveragedLeases",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 124L)	, "Public Utilities, Allowance for Funds Used During Construction, Additions",	AccountType.DEBIT	, "6.2.9","060209","PublicUtilitiesAllowanceForFundsUsedDuringConstructionAdditions",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 125L)	, "Health Care Trust Fund, Investment Gains (Losses), Net",	AccountType.DEBIT	, "6.2.10","060210","HealthCareTrustFundInvestmentGainsLossesNet",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 126L)	, "Health Care Trust Fund, Administrative Expense",	AccountType.DEBIT	, "6.2.11","060211","HealthCareTrustFundAdministrativeExpense",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 127L)	, "Health Care Trust Fund, Interest Income",	AccountType.DEBIT	, "6.2.12","060212","HealthCareTrustFundInterestIncome",true,	new UUID(0L, 115L)	));
		chart.addAccount( new Account(	new UUID(0L, 128L)	, "Other expenses",	AccountType.DEBIT	, "6.3.0","060300","InterestAndDebtExpense",true,	new UUID(0L, 103L)	));
		chart.addAccount( new Account(	new UUID(0L, 129L)	, "Interest Expense",	AccountType.DEBIT	, "6.3.1","060301","InterestExpense",true,	new UUID(0L, 128L)	));
		chart.addAccount( new Account(	new UUID(0L, 130L)	, "Other Nonoperating Expenses",	AccountType.DEBIT	, "6.3.2","060302","OtherNonoperatingExpense",true,	new UUID(0L, 128L)	));
		chart.addAccount( new Account(	new UUID(0L, 131L)	, "Other Nonrecurring (Income) Expense",	AccountType.DEBIT	, "6.4.0","060400","OtherNonrecurringIncomeExpense",true,	new UUID(0L, 103L)	));
		chart.addAccount( new Account(	new UUID(0L, 132L)	, "Other Nonrecurring Income",	AccountType.DEBIT	, "6.4.1","060401","OtherNonrecurringIncome",true,	new UUID(0L, 131L)	));
		chart.addAccount( new Account(	new UUID(0L, 133L)	, "Other Nonrecurring Expense",	AccountType.DEBIT	, "6.4.2","060402","OtherNonrecurringExpense",true,	new UUID(0L, 131L)	));
		chart.addAccount( new Account(	new UUID(0L, 134L)	, "Distributions on Mandatorily Redeemable Securities",	AccountType.DEBIT	, "6.5.0","060500","DistributionsOnMandatorilyRedeemableSecurities",true,	new UUID(0L, 103L)	));
		chart.addAccount( new Account(	new UUID(0L, 135L)	, "Income (Loss) from Equity Method Investments",	AccountType.DEBIT	, "6.6.0","060600","IncomeLossFromEquityMethodInvestments",true,	new UUID(0L, 103L)	));
		chart.addAccount( new Account(	new UUID(0L, 136L)	, "Income Tax Expense (Benefit)",	AccountType.DEBIT	, "7.0.0","070000","IncomeTaxExpenseBenefit",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 137L)	, "Current Income Tax Expense (Benefit)",	AccountType.DEBIT	, "7.1.0","070100","CurrentIncomeTaxExpenseBenefit",true,	new UUID(0L, 136L)	));
		chart.addAccount( new Account(	new UUID(0L, 138L)	, "Current Federal Tax Expense (Benefit)",	AccountType.DEBIT	, "7.1.1","070101","CurrentFederalTaxExpenseBenefit",true,	new UUID(0L, 137L)	));
		chart.addAccount( new Account(	new UUID(0L, 139L)	, "Current State and Local Tax Expense (Benefit)",	AccountType.DEBIT	, "7.1.2","070102","CurrentStateAndLocalTaxExpenseBenefit",true,	new UUID(0L, 137L)	));
		chart.addAccount( new Account(	new UUID(0L, 140L)	, "Current Foreign Tax Expense (Benefit)",	AccountType.DEBIT	, "7.1.3","070103","CurrentForeignTaxExpenseBenefit",true,	new UUID(0L, 137L)	));
		chart.addAccount( new Account(	new UUID(0L, 141L)	, "Deferred Income Tax Expense (Benefit)",	AccountType.DEBIT	, "7.2.0","070200","DeferredIncomeTaxExpenseBenefit",true,	new UUID(0L, 136L)	));
		chart.addAccount( new Account(	new UUID(0L, 142L)	, "Deferred Federal Income Tax Expense (Benefit)",	AccountType.DEBIT	, "7.2.1","070201","DeferredFederalIncomeTaxExpenseBenefit",true,	new UUID(0L, 141L)	));
		chart.addAccount( new Account(	new UUID(0L, 143L)	, "Deferred State and Local Income Tax Expense (Benefit)",	AccountType.DEBIT	, "7.2.2","070202","DeferredStateAndLocalIncomeTaxExpenseBenefit",true,	new UUID(0L, 141L)	));
		chart.addAccount( new Account(	new UUID(0L, 144L)	, "Deferred Foreign Income Tax Expense (Benefit)",	AccountType.DEBIT	, "7.2.3","070203","DeferredForeignIncomeTaxExpenseBenefit",true,	new UUID(0L, 141L)	));
		chart.addAccount( new Account(	new UUID(0L, 145L)	, "Other Tax Expense (Benefit)",	AccountType.DEBIT	, "7.3.0","070300","OtherTaxExpenseBenefit",true,	new UUID(0L, 136L)	));
		chart.addAccount( new Account(	new UUID(0L, 146L)	, "Deferred Other Tax Expense (Benefit)",	AccountType.DEBIT	, "7.4.0","070400","DeferredOtherTaxExpenseBenefit",true,	new UUID(0L, 136L)	));
		chart.addAccount( new Account(	new UUID(0L, 147L)	, "Tax Adjustments, Settlements, and Unusual Provisions",	AccountType.DEBIT	, "7.5.0","070500","TaxAdjustmentsSettlementsAndUnusualProvisions",true,	new UUID(0L, 136L)	));
		chart.addAccount( new Account(	new UUID(0L, 148L)	, "Unrecognized Tax Benefits, Income Tax Penalties and Interest Expense",	AccountType.DEBIT	, "7.6.0","070600","UnrecognizedTaxBenefitsIncomeTaxPenaltiesAndInterestExpense",true,	new UUID(0L, 136L)	));
		chart.addAccount( new Account(	new UUID(0L, 149L)	, "Net of Tax Items",	AccountType.DEBIT	, "8.0.0","080000","-- Not defined / Add own XBRL name --",true,	ChartOfAccounts.TOP_LEVEL));
		chart.addAccount( new Account(	new UUID(0L, 150L)	, "Discontinued Operations",	AccountType.DEBIT	, "8.1.0","080100","IncomeLossFromDiscontinuedOperationsNetOfTax",true,	new UUID(0L, 149L)	));
		chart.addAccount( new Account(	new UUID(0L, 151L)	, "Income (Loss) During Phase-out Period",	AccountType.DEBIT	, "8.1.1","080101","DiscontinuedOperationIncomeLossFromDiscontinuedOperationDuringPhaseOutPeriodNetOfTax",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 152L)	, "Disposal",	AccountType.DEBIT	, "8.1.2","080102","DiscontinuedOperationGainLossOnDisposalOfDiscontinuedOperationNetOfTax",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 153L)	, "Provision for Loss (Gain) on Disposal",	AccountType.DEBIT	, "8.1.3","080103","DiscontinuedOperationProvisionForLossGainOnDisposalNetOfTax",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 154L)	, "Adjustment to Prior Period Disposal",	AccountType.DEBIT	, "8.1.4","080104","DiscontinuedOperationAmountOfAdjustmentToPriorPeriodGainLossOnDisposalNetOfTax",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 155L)	, "Other Income (Loss) from Disposition",	AccountType.DEBIT	, "8.1.5","080105","DiscontinuedOperationAmountOfOtherIncomeLossFromDispositionOfDiscontinuedOperationNetOfTax",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 156L)	, "Income (Loss) from before Income Tax",	AccountType.DEBIT	, "8.1.6","080106","DiscontinuedOperationIncomeLossFromDiscontinuedOperationBeforeIncomeTax",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 157L)	, "Tax Effect of Discontinued Operation",	AccountType.DEBIT	, "8.1.7","080107","DiscontinuedOperationTaxEffectOfDiscontinuedOperation",true,	new UUID(0L, 150L)	));
		chart.addAccount( new Account(	new UUID(0L, 158L)	, "Extraordinary Items",	AccountType.DEBIT	, "8.2.0","080200","ExtraordinaryItemNetOfTax",true,	new UUID(0L, 149L)	));
		chart.addAccount( new Account(	new UUID(0L, 159L)	, "Extraordinary Item, Gain (Loss), Gross",	AccountType.DEBIT	, "8.2.1","080201","ExtraordinaryItemsGross",true,	new UUID(0L, 158L)	));
		chart.addAccount( new Account(	new UUID(0L, 160L)	, "Tax Effect of Extraordinary Item, Gain (Loss)",	AccountType.DEBIT	, "8.2.2","080202","TaxEffectOfExtraordinaryItem",true,	new UUID(0L, 158L)	));

		return chart;
	}
	
	public static void print( ChartOfAccounts chart ) {
		for( Account account: chart.getTopLevelAccounts() ) {
			System.out.println( account );
			print( chart, 1, account.getID() );
		}
	}
	
	public static void print( ChartOfAccounts chart, int indent, UUID parent ) {
		for( Account account : chart.getChildAccounts( parent ) )  {
			for( int i = 0; i < indent; i++ ) {
				System.out.print( "   " );
			}
			System.out.println( account );
			print(chart, indent + 1, account.getParentID());
		}
	}
}
