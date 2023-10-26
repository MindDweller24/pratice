package pojoExp;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUsingFile {
	@Test
	public void create() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		File f=new File("D:\\selenium question\\restAssured\\src\\test\\resources\\myFile");
		//step1 pre condition
		given()
		.body(f)
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
