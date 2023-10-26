package crudWithoutBdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	@Test
	public void update() {
		JavaLibrary jlib=new JavaLibrary();
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "sushma");
		jObj.put("projectName", "Galaxy"+jlib.getRandomNum());
		jObj.put("status", "ongoing");
		jObj.put("teamSize", 13);
		
		RequestSpecification resp = RestAssured.given();
		resp.body(jObj);
		resp.contentType(ContentType.JSON);
		Response res = resp.put("http://rmgtestingserver:8084/projects/TY_PROJ_75341");
		System.out.println(res.prettyPeek());
		
	}

}
