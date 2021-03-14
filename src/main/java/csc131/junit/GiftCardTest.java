package csc131.junit;

import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
// import org.junit.rules.ExpectedException;



class GiftCardTest{

	@Test
	void testGetIssuingStore(){
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	
	@Test
	void getBalance(){
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		assertEquals("getBalance()", balance, card.getBalance(), 0.001);
	}
	
	void deduct_RemainingBalance() {
		double balance;
		GiftCard card;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		String result = "Remaining Balance: " + String.format("%6.2f",
                Math.abs(balance)
		
		assertEquals("deduct_RemainingBalance()", result, card.deduct(balance));
	}
}
