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
		
		int remainder = name.length() % maxSizeOfItemName;
		int line = name.length() / maxSizeOfItemName;
		if(remainder > 0)
			line++;
		
		int startIndex = 0;
		int endIndex = name.length() > maxSizeOfItemName ? maxSizeOfItemName - 1 : name.length();//why
		
		for(int i = 0; i < line; i++){
			String lineContent = name.substring(startIndex, endIndex);
			if(lineContent.contains("\n")){
				endIndex = lineContent.indexOf("\n");
				lineContent = name.substring(startIndex, endIndex);
				if(i == line - 2)
					remainder = name.length() - endIndex - 1;
			}
			stringBuffer.append(lineContent);
			startIndex = endIndex + 1;
			endIndex = (i == line - 2) ? endIndex + name.length() - startIndex : endIndex + maxSizeOfItemName;
			endIndex++;//why
			if(i != line - 1)
				stringBuffer.append("\n");
		}
		
		int spaceLeft = maxSizeOfItemName - remainder;
		int spaceRight = widthDisplayCost - cents2dollarsAndCents(cost).length();
		int spaceNumber = spaceLeft + spaceRight;
		stringBuffer.append(mutipleSpace(spaceNumber));
		stringBuffer.append(cents2dollarsAndCents(cost) + "\n");
		
		return stringBuffer.toString();
	}
}
