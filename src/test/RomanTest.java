package test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import main.RangeOutOfBounds;
import main.Roman;

public class RomanTest {

	@Test
	public void getRomanNumberForNegative() {
		Roman roman = new Roman();
		RangeOutOfBounds e = assertThrows(RangeOutOfBounds.class, () -> {roman.getRoman(-1);});
		//Assert.assertEquals(e.getMessage(), "Number should be between 1 and 4999");
	}
	
	@Test
	public void getRomanNumberForZero() {
		Roman roman = new Roman();
		RangeOutOfBounds e = assertThrows(RangeOutOfBounds.class, () -> {roman.getRoman(0);});
	}
	
	@Test
	public void getRomanNumberForOne() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("I", roman.getRoman(1));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForTwo() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("II", roman.getRoman(2));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForThree() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("III", roman.getRoman(3));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFour() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("IV", roman.getRoman(4));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFive() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("V", roman.getRoman(5));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForSix() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("VI", roman.getRoman(6));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForSeven() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("VII", roman.getRoman(7));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForEight() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("VIII", roman.getRoman(8));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForNine() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("IX", roman.getRoman(9));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForTen() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("X", roman.getRoman(10));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFifteen() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("XV", roman.getRoman(15));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForTwenty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("XX", roman.getRoman(20));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForThirty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("XXX", roman.getRoman(30));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForForty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("XL", roman.getRoman(40));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFifty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("L", roman.getRoman(50));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForSixty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("LX", roman.getRoman(60));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForSeventy() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("LXX", roman.getRoman(70));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForEighty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("LXXX", roman.getRoman(80));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForNinty() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("XC", roman.getRoman(90));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForOneHundredSeventySeven() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("CLXXVII", roman.getRoman(177));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForTwoHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("CC", roman.getRoman(200));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}	
	
	@Test
	public void getRomanNumberForThreeHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("CCC", roman.getRoman(300));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFourHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("CD", roman.getRoman(400));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFiveHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("D", roman.getRoman(500));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForSixHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("DC", roman.getRoman(600));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForSevenHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("DCC", roman.getRoman(700));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForEightHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("DCCC", roman.getRoman(800));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForNineHundred() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("CM", roman.getRoman(900));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForThousand() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("M", roman.getRoman(1000));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberFor1990() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("MCMXC", roman.getRoman(1990));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForTwoThousand() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("MM", roman.getRoman(2000));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForThreeThousand() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("MMM", roman.getRoman(3000));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFourThousand() {
		Roman roman = new Roman();
		try {
			Assert.assertEquals("MMMM", roman.getRoman(4000));
		} catch (RangeOutOfBounds e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void getRomanNumberForFiveThousand() {
		Roman roman = new Roman();
		RangeOutOfBounds e = assertThrows(RangeOutOfBounds.class, () -> {roman.getRoman(-1);});
	}
}
