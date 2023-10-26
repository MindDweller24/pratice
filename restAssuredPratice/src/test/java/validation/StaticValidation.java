package validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

public class StaticValidation {
	@Test
	public void test() {
		String expectedData = "7";
		baseURI="https://reqres.in";
		
		Response resp = when().get("/api/users?page=2");
		String firstName = resp.jsonPath().get("[0].id");
		resp.then().log().all();
		Assert.assertEquals(expectedData, firstName);
		
	}
	@Test
	public void verifyPRojectNameinDynamicResponse() {
	    String expectedData = "9";
		
			     Response resp = when().get("https://reqres.in/api/users?page=2");
			   List<String>list = resp.jsonPath().get("[0].id");
	for(String str : list) {
		if(str.equals(expectedData)) {
		System.out.println(expectedData + "==> is available in Dynamic Response");
			break;
		}
	        }
	
	resp.then().log().all();

	}


}
