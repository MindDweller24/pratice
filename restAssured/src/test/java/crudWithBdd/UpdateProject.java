package crudWithBdd;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;


public class UpdateProject {
	@Test
	public void updateProject() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		JavaLibrary jLib=new JavaLibrary();
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "ashrar");
		jObj.put("projectName", "Mygalaxy"+jLib.getRandomNum());
		jObj.put("status", "ongoing");
		jObj.put("teamSize", 13);
		
		//step 1 pre condition
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		
		//step 2 action
		.when()
		.put("/projects/TY_PROJ_75567")
		
		//step3 validation
		.then()
		.assertThat()
		.statusCode(200)
		.time(Matchers.lessThan(2000l),TimeUnit.MILLISECONDS)
//		.contentType(ContentType.JSON)
		.log()
		.all();
		
	}

}
