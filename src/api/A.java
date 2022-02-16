package api;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class A {
	@Test
	public void test() {
RestAssured.baseURI="https://reqres.in";

String res = given().log().all().body(AnotherData.data()).when().post("api/users").then().log().all().statusCode(201).extract().response().asString();
System.out.println(res);
	}
}
