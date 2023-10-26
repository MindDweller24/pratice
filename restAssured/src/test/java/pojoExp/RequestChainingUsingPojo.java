package pojoExp;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import io.restassured.http.ContentType;
import pojoClassCreateProject.CreateProject;

public class RequestChainingUsingPojo {
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
