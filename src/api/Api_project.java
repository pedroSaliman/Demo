package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.apache.http.client.params.AllClientPNames;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Api_project {
	
	
	

//	public static void main(String[] args) {
		// given when then
//		RestAssured.baseURI="https://petstore.swagger.io/v2";
//		String response = given().log().all().header("Content-Type","application/json")
//				.body(Data.data())
//				.when().post("pet")
//				.then().log().all().statusCode(200).extract().response().asString();
//		System.out.println(response);
//
//		JsonPath js = new JsonPath(response);
//		String name = 		js.getString("category.name");
//		System.out.println(name);
//		
//		//get
//	String response1=	given().log().all().queryParam("status", "sold")
//		.when().get("pet/findByStatus")
//		.then().log().all().assertThat().statusCode(200).extract().response().asString();
//	
//	System.out.println(response1);
//		
//		JsonPath js1 = new JsonPath(response1);
//		String cat = js1.getString("category.name");
//		System.out.println(cat);

@BeforeTest
public void opentest() {
	RestAssured.baseURI="https://reqres.in";

}
@Test(priority = 0)
public void test() {
	String response =	given().log().all().header("Content-Type","application/json").body(Data.newdata()).when().post("api/users")
			.then().log().all().assertThat().statusCode(201).extract().response().asString();
		System.out.println(response);

		JsonPath js = new JsonPath(response);
		String id = js.getString("id");
		System.out.println(id);
}
@Test(priority = 1)
public void test2() {
	String response=given().log().all().when().get("api/users").then().log().all().assertThat().statusCode(200).extract().response().asString();
	JsonPath js = new JsonPath(response);
	String name = js.get("data[3].first_name");
	System.out.println(name);
			
}

//String response =	given().log().all().header("Content-Type","application/json").body(Data.newdata()).when().post("api/users")
//	.then().log().all().assertThat().statusCode(201).extract().response().asString();
//System.out.println(response);
//
//JsonPath js = new JsonPath(response);
//String id = js.getString("id");
//System.out.println(id);
//put
// id ="2";
//given().log().all().queryParam("key", "2").header("Content-Type","application/json").body("{\r\n"
//		+ "    \"name\": \"morpheus\",\r\n"
//		+ "    \"job\": \"leader\",\r\n"
//		+ "    \"id\": \""+id+"\",\r\n"
//		+ "    \"createdAt\": \"2022-01-20T12:45:07.709Z\"\r\n"
//		+ "}").when().put("api/users").then().log().all().assertThat().statusCode(200);
//
//
//
//
//
//String response2 = given().log().all().queryParam("key", id).when().get("api/users").then().log().all().assertThat().statusCode(200).extract().response().asString();
//System.out.println(response2);
//
//






















		
	//}
	
	
	
	

}
