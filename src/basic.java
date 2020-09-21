import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class basic {

	public static void main(String[] args) {
		
	
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP")).extract().response().asString();
		
		
		//System.out.println(response);
		JsonPath js=new JsonPath(response);
		
		String placeID=js.getString("place_id");
		System.out.println(placeID);
		
		
		//Update Place
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
				"\"place_id\":\""+placeID+"\",\r\n" + 
				"\"address\":\"mayur vihar\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
		//Get Place
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeID)
		.when().get("maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).body("address", equalTo("mayur vihar"));
	
	}
}
