package crudWithoutBdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetSingleProject {
	@Test
	
	public void getProject() {
		Response resp = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_75385");
		resp.then().log().all();
		int StatusCode=resp.getStatusCode();
		Assert.assertEquals(200, StatusCode);
		
}
}