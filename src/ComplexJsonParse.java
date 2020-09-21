import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JsonPath js=new JsonPath(payload.courseDetails());
		
		int size=js.getInt("courses.size()");
		System.out.println(size);
		
		//print purchase amount
		int amount=js.getInt("dashboard.purchaseAmount");
		System.out.println(amount);
		
		//
		String title=js.getString("courses[0].title");
		System.out.println(title);
		
		//print all course title and respective prices
		
		for(int i=0;i<size;i++) {
			System.out.println(js.get("courses["+i+"].title").toString());
			System.out.println(js.get("courses["+i+"].price").toString());
			
			//Print number of copies sold by RPA
			if(js.get("courses["+i+"].title").equals("RPA")) {
				System.out.println(js.get("courses["+i+"].copies").toString());
				break;
			
			}
				
		}
		
		

}
}