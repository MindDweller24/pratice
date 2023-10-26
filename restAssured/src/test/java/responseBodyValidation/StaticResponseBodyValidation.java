package responseBodyValidation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponseBodyValidation {
	@Test
	public void staticResp() {
		//prereqisites
		String expData="TY_PROJ_9208";
		baseURI="http://rmgtestingserver";
		port=8084;
		//action
		Response resp = when().get("/projects");
		//validation
		String actdata = resp.jsonPath().get("[0].projectId");
		Assert.assertEquals(actdata, expData);
		System.out.println("data verified");
		
		resp.then().log().all();
	}

}
