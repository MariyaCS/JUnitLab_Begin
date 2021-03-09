package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiftCardTest {

	@Test
	void testGiftCard() {
		fail("Not yet implemented");
	}

	@Test
	void testDeduct() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBalance() {
		fail("Not yet implemented");
	}
	@Test
	public void deduct_RemainingBalance() {
		
		double balance;
		GiftCard card;
		int issuingStore; 
		
		issuingStore = 1337;
		balance = 100.00;
		String bal = "Remaining Balance: " + String.format("%6.2f",
                Math.abs(balance));
		
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("deduct_RemainingBalance()", bal, card.deduct(0.0));
		
	}
	@Test
	public void testGetIssuingStore() {
		double balance;
		GiftCard card;
		int issuingStore;
		double tolerance;
		
		tolerance = 0.001;
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", 
				issuingStore, card.getIssuingStore());
		
		assertEquals("getBalance()", 
				issuingStore, card.getIssuingStore(), tolerance);
	}	

}
