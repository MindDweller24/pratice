package crudWithBdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUsingHashmap {
	@Test
	public void create() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("createdBy","pradhapraj");
		map.put("projectName", "highHopes");
		map.put("status", "created");
		map.put("teamSize", 11);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		//step 2 action
		.when()
		.post("/addProject")
		
		//step3 validation
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log()
		.all();

}
}