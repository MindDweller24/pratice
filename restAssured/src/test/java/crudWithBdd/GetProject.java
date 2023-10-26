package crudWithBdd;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertThat;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetProject {
	@Test
	public void get() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//step 1 actions
		when()
		.get("/projects")
		
		//step 3 validations
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000l),TimeUnit.MILLISECONDS)
		.log()
		.all();
	}
	

}
