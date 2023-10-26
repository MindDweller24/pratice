package crudWithBdd;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleProject {
	@Test
	public void singleProj() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.get("/projects/TY_PROJ_75512")
		
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(3000l), TimeUnit.MILLISECONDS)
		.log().all();
		
		
		
	}

}
