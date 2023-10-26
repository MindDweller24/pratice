package crudWithBdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProject {
	@Test
	public void del() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when()
		.delete("/projects/TY_PROJ_75512")
		
		.then()
		.assertThat()
		.statusCode(204)
		.contentType(ContentType.JSON)
		.log()
		.all();
		
	}

}
