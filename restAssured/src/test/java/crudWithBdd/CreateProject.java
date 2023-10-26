package crudWithBdd;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import genericUtility.JavaLibrary;
import static io.restassured.RestAssured.*;

import java.util.List;

public class CreateProject {
	
	@Test
	public void create() {
		baseURI="http://rmgtestingserver";
		port=8084;
	
	JavaLibrary jLib=new JavaLibrary();
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy", "sanat");
	jObj.put("projectName", "galaxy"+jLib.getRandomNum());
	jObj.put("status", "completed");
	jObj.put("teamSize", 10);
	
	//step1 pre condition
	given()
	.body(jObj)
	.contentType(ContentType.JSON)
	
	//step 2 action
	.when()
	.post("/addProject")
	
	//step3 validation
	.then()
	.assertThat() //hamcrest matchers
	.statusCode(201)
	.contentType(ContentType.JSON)
	.log()
	.all();
	
	Response res=when().get("/projects");
	boolean flag=false;
	String pId = res.jsonPath().get("[0].projectId");
	List<String> pIDs = res.jsonPath().get("projectId");
	for(String pID:pIDs) {
		if(pID.equalsIgnoreCase(pId)) {
			flag=true;
		}
	}
	Assert.assertTrue(flag);
	System.out.println("data verified");
	
	res.then().log();
	
	}
}
