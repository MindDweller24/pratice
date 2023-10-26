package responseBodyValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicRespBodyValidation {
	@Test
	public void dynamic() {
		//prereqisites
		String expData="TY_PROJ_9208";
		baseURI="http://rmgtestingserver";
		port=8084;
		//action
		Response resp = when().get("/projects");
		//validation
		boolean flag=false;
		List<String> pIds=resp.jsonPath().get("projectId");
		for(String ProjId:pIds)
		{
			if(ProjId.equalsIgnoreCase(expData)) {
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("data verified");
		
		resp.then().log().all();
	}
	

}
