package files;

public class payload {
	
	public static String AddPlace() {
		
		return "{\r\n" + 
				"    \"location\": {\r\n" + 
				"        \"lat\": -35.383494,\r\n" + 
				"        \"lng\": 30.427362\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\": 48,\r\n" + 
				"    \"name\": \"Ajay\",\r\n" + 
				"    \"phone_number\": \"(+91) 12345\",\r\n" + 
				"    \"address\": \"Ajay niwas\",\r\n" + 
				"    \"types\": [\r\n" + 
				"        \"def\",\r\n" + 
				"        \"xyz\"\r\n" + 
				"    ],\r\n" + 
				"    \"website\": \"http://Ajay.com\",\r\n" + 
				"    \"language\": \"French-IN\"\r\n" + 
				"}";
	}
	
	public static String courseDetails() {
		
		return "{\r\n" + 
				"\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"\"courses\": [\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\r\n" + 
				"\"price\": 50,\r\n" + 
				"\r\n" + 
				"\"copies\": 6\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\r\n" + 
				"\"price\": 40,\r\n" + 
				"\r\n" + 
				"\"copies\": 4\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\r\n" + 
				"\"price\": 45,\r\n" + 
				"\r\n" + 
				"\"copies\": 10\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Appium\",\r\n" + 
				"\r\n" + 
				"\"price\": 60,\r\n" + 
				"\r\n" + 
				"\"copies\": 5\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";
	}

	public static String AddBook(String isbn,String aisle) {
		String load="{\r\n" + 
				"\r\n" + 
				"\"name\":\"Javascript\",\r\n" + 
				"\"isbn\":\""+isbn+"\",\r\n" + 
				"\"aisle\":\""+aisle+"\",\r\n" + 
				"\"author\":\"John foe\"\r\n" + 
				"}\r\n" + 
				"";
		return load;
	}
}
