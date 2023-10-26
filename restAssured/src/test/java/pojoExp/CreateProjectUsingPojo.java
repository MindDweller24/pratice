package pojoExp;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoClassCreateProject.CreateProject;


public class CreateProjectUsingPojo {
	@Test
	
	public void create() {
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
  CreateProject cp=new CreateProject("sanat", "kitkat1", "ongoing", 12);
  
  given()
  .body(cp)
  .contentType(ContentType.JSON)
  
  .when()
  .post("/addProject")
  
  .then()
  .contentType(ContentType.JSON)
  .assertThat()
  .statusCode(201)
  .log()
  .all();
}
}

