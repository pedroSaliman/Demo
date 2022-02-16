package api;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
public class Jira {

@Test
public void testing() {
	
	
SessionFilter session = new SessionFilter();
given().log().all().header("Content-Type","application/json").body(Dummy.jira()).filter(session).when().post("rest/auth/1/session")
.then().log().all();
given().log().all().pathParam("key", "10001").header("Content-Type","application/json").body(Dummy.afterjira()).
filter(session).when().post("rest/api/2/issue/{key}/comment").then().log().all();

RestAssured.baseURI="http://localhost:8080";

//given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10001").header("Content-Type","multipart/form-data").
//multiPart("file",new File("file.txt")).when().post("rest/api/2/issue/{key}/attachments").then().log().all();
	
//get 
String response= given().log().all().filter(session).pathParam("key", "10001").queryParam("fields", "comment").


when().get("rest/api/2/issue/{key}").then()
.log().all().extract().response().asString();
JsonPath js = new JsonPath(response);
String name = js.getString("fields.comment.comments[0].body");
int  number = js.getInt("fields.comment.comments[0].id");

System.out.println(number);
}
}

