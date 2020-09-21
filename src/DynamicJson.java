import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payload;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	@Test(dataProvider="addbook")
	public void addBook(String isbn,String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		
		String response=given().log().all().header("Content-Type","application/json")
	    .body(payload.AddBook(isbn,aisle))
		.when().post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract()
		.response().asString();
		
		JsonPath js=new JsonPath(response);
		String id=js.getString("ID");
		System.out.println(id);
	}
	
	@DataProvider(name="addbook")
	public Object[][] getdata(){
		return new Object[][] {{"nik","123"},{"ajy","456"},{"pkl","789"}};
	}

}
