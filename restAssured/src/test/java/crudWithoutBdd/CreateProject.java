package crudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	@Test
	public void createProj() {
		
		JavaLibrary jlib=new JavaLibrary();
		JSONObject jObj=new JSONObject();
		jObj.put("createdBy", "sanat1");
		jObj.put("projectName", "galaxy"+jlib.getRandomNum());
		jObj.put("status", "completed");
		jObj.put("teamSize", 12);
		
		
		RequestSpecification reqs = RestAssured.given();
		reqs.body(jObj);
		reqs.contentType(ContentType.JSON);
		Response resp = reqs.post("http://rmgtestingserver:8084/addProject");
		
//		System.out.println(resp.asString());
//		System.out.println(resp.prettyPrint());
		System.out.println(resp.prettyPeek());
		
	}

	
}
