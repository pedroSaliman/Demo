package api;

import io.restassured.path.json.JsonPath;

public class ComplexJson {
	public static void  main(String args[]) {
	
	JsonPath js = new JsonPath(Data.jsondata());
	int numbers = js.getInt("courses.size()");
	System.out.println(numbers);
	String name = js.getString("dashboard.purchaseAmount");
	System.out.println(name);
	String course = js.getString("courses[2].title");
	System.out.println(course);
	for(int i=0 ; i<numbers;i++) {
	String all = 	js.get("courses["+i+"].title");
	System.out.println( js.get("courses["+i+"].price").toString());

	System.out.println(all);

	}

	}
}
