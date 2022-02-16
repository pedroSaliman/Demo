package Trello;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.Dummy;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Trell_api {
	
	
		
	@Test
	public void api_test() {
		String m = "AUT board";
		String name= "http://localhost:8080";
		RestAssured.baseURI=name;
		SessionFilter session = new SessionFilter();
		RequestSpecification req = new RequestSpecBuilder().setBaseUri(name).setContentType(ContentType.JSON).build();
		ResponseSpecification repo = new ResponseSpecBuilder().build();
		given().spec(req).body(Dummy.auth()).filter(session).when().post("rest/auth/1/session").then().spec(repo).log().all().assertThat().statusCode(200);

//		given().spec(req).filter(session).when().get("/rest/agile/1.0/board").then().spec(repo).log().all().assertThat().statusCode(200);
		
		//given().spec(req).filter(session).when().get("/rest/agile/1.0/board/65/project").then().spec(repo).log().all().assertThat().statusCode(200);
//		given().spec(req).body(Dummy.scrum()).filter(session).when().put("rest/api/2/issue/10200").then().spec(repo).log().all();
	//	given().spec(req).filter(session).when().get("/rest/agile/1.0/board/65/issue").then().spec(repo).log().all().assertThat().statusCode(200);

	//given().spec(req).filter(session).when().get("rest/api/2/issue/10200/comment").then().spec(repo).log().all().assertThat().statusCode(200);
given().spec(req).body(Dummy.comment()).filter(session).when().post("rest/api/2/issue/10200/comment").then().spec(repo).log().all();
//	given().spec(req).filter(session).when().delete("rest/api/2/issue/10200/comment/10200").then().spec(repo).log().all().assertThat().statusCode(204);


	//	given().spec(req).filter(session).when().delete("rest/agile/1.0/board/33").then().spec(repo).log().all().assertThat().statusCode(204);
	//create board


		

		

		
		

//post

}





			


	







	
	
	
	

}
