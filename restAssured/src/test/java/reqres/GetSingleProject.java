package reqres;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
	@Test
	public void getSingle() {
		Response resp = RestAssured.get("https://reqres.in/api/users/2");
		resp.then().log().all();
		int res=resp.getStatusCode();
		Assert.assertEquals(200, res);
	}

}
