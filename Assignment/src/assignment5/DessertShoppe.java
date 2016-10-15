package assignment5;

public class DessertShoppe {
	public static final float TAX_RATE = 6.5f;
	public static final String storeName = "M & M Dessert Shoppe";
	public static final int maxSizeOfItemName = 25;
	public static final int widthDisplayCost = 6;
	
	public static String cents2dollarsAndCents(int amountOfCents){
		int dollar = amountOfCents / 100;
		int cent = amountOfCents % 100;
		
		if(dollar == 0)
			return "." + String.format("%02d", cent);
		else
			return dollar + "." + String.format("%02d", cent);
	}
	
	public static String mutipleSpace(int numOfSpace){
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i < numOfSpace; i++){
			stringBuffer.append(" ");
		}

		return stringBuffer.toString();
	}
	
	public static String receiptDetailFormatter(String name, int cost){
		StringBuffer stringBuffer = new StringBuffer();
		
		int nameLength = name.length();
		int remainderOfLastLine = 0;
		int startIndex = 0;
		int endIndex = nameLength > maxSizeOfItemName ? maxSizeOfItemName : nameLength;
		
		while(nameLength > 0){
			String lineContent = name.substring(startIndex, endIndex);
			if(lineContent.contains("\n")){ // the name of sundae contains "\n" following "with".
				endIndex = lineContent.indexOf("\n") + 1;
				lineContent = name.substring(startIndex, endIndex);
			}
			else if(nameLength - lineContent.length() > 0){ // not yet reach the end of String
				lineContent += "\n";
			}
			stringBuffer.append(lineContent);
			remainderOfLastLine = nameLength;
			nameLength -= lineContent.length();
			startIndex = endIndex;
			endIndex = nameLength > maxSizeOfItemName ? startIndex + maxSizeOfItemName : startIndex + nameLength;
		}
		
		int spaceLeft = maxSizeOfItemName - remainderOfLastLine;
		int spaceRight = widthDisplayCost - cents2dollarsAndCents(cost).length();
		int spaceNumber = spaceLeft + spaceRight;
		stringBuffer.append(mutipleSpace(spaceNumber));
		stringBuffer.append(cents2dollarsAndCents(cost) + "\n");
		
		return stringBuffer.toString();
	}
}
