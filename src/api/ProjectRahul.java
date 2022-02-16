package api;

//import static org.testng.AssertJUnit.assertThat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Paths;
public class ProjectRahul {
	
	
	@Test(priority = 1)
	public void test() throws IOException {
		
		RestAssured.baseURI ="https://reqres.in";

		given().log().all().header("Content-Type","application/json").body(new String(java.nio.file.Files.readAllBytes(Paths.get("C:\\Users\\LORD TRADE\\eclipse-workspace\\api\\src\\api\\file.json")))).
		when().post("api/users").
		then().log().all().assertThat().statusCode(201);
	}
	

	@DataProvider(name="databooks")
	public Object[][] getdata(){
		
		return new Object[][] {{"mohamed","developer"},{"walled","wordpress"},{"alla","low"}};
	}
	
	
	
}
//Dummy.dummydata(name,job)