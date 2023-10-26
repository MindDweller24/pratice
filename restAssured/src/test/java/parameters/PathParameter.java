package parameters;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassCreateProject.CreateProject;

public class PathParameter {
	@Test
public void create() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
	 given().pathParam("proid", "TY_PROJ_75876")
	 
	 .when().get("/projects/{proid}")
	 .then()
	 .assertThat()
	 .statusCode(200).contentType(ContentType.JSON).log();
		
		
	  
	

}
}
