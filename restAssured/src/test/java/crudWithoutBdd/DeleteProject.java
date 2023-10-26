package crudWithoutBdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProject {
	@Test
	public void delete() {
		Response resp = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_75385");
		resp.then().log().all();
		int res=resp.getStatusCode();
		Assert.assertEquals(204, res);
	}
	

}
