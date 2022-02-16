package Jira;
import static io.restassured.RestAssured.given;

import org.codehaus.groovy.ast.builder.AstStringCompiler;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AuthBasedCookie {
	@Test
	
	public void testing() {
		
		
		RestAssured.baseURI="http://localhost:8080";
		SessionFilter session = new SessionFilter();
	
		
		
	String name = 	given().log().all().header("Content-Type","application/json").body(Data.session())
		.filter(session).when().post("/rest/auth/1/session").then().log().all().assertThat().statusCode(200).extract().response().asString();
	System.out.println(name);
	
	
	//post comment
//String comment = 	given().log().all().header("Content-Type","application/json").pathParam("key", "10100").body(Data.comment()).filter(session)
//.when().post("rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
//System.out.println(comment);
//delete
given().log().all().header("Content-Type","application/json").pathParam("key", "10100").body(Data.comment()).filter(session)
.when().delete("rest/api/2/issue/{key}/comment/10102").then().log().all().assertThat().statusCode(204).extract().response().asString();

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public void setissue() {
//		SessionFilter session = new SessionFilter();
//	RequestSpecification req = new RequestSpecBuilder()
//	.setContentType(ContentType.JSON).setBaseUri("http://localhost:8080")
//	.addHeader("cookie", "JSESSIONID61F4493F0428758290CB917C9E80FDF8")
//	.build();
//ResponseSpecification   res = new ResponseSpecBuilder().build();
//String name = given()
//.spec(req)
//.body(Data.session())
//.filter(session)
//.post("/rest/auth/1/session")
//.then()
//.spec(res)
//.extract()
//.response()
//.asString();
//System.out.println(name);
////post
// 
//String namee = given().spec(req).get("rest/api/2/issue/10100").then().spec(res).extract().response().asString();
//System.out.println(namee);
//	
//	
//	}

}
