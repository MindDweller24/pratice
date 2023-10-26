package reqSpec;

import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojoClassCreateProject.CreateProject;

public class ReqSpecification {
	@Test
	public void createProj() {
		
		JavaLibrary jLib=new JavaLibrary();
		CreateProject cp=new CreateProject("sanat", "tyss"+jLib.getRandomNum(), "ongoinG", 10);
		
		RequestSpecification rqst = new RequestSpecBuilder()
		.setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		
		ResponseSpecification resp = new ResponseSpecBuilder()
				.expectContentType(ContentType.JSON)
				.expectStatusCode(201).build();
		
		given().spec(rqst).body(cp)
		.when().post("/addProject")
		.then().spec(resp).log().all();
		
		
	}

}
