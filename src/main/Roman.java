package main;

public class Roman {

	String romanIteralMap[][] = {
			{"M", "1000"},
			{"CM", "900"},
			{"D", "500"},
			{"CD", "400"},
			{"C", "100"},
			{"XC", "90"},
			{"L", "50"},
			{"XL", "40"},
			{"X", "10"},
			{"IX", "9"},
			{"V", "5"},
			{"IV", "4"},
			{"I","1"}
			};
	
	public String getRoman(int num) throws RangeOutOfBounds {
		
		if(num >= 5000 || num <= 0) {
			throw new RangeOutOfBounds("Number should be between 1 and 4999"); 
		}

		String roman = "";
		for(int i=0; i< romanIteralMap.length; i++) {
			int value = Integer.parseInt(romanIteralMap[i][1]);
			while(num >= value) {
				num -= value;
				roman += romanIteralMap[i][0];
			}
		}
		
		return roman;
	}
}