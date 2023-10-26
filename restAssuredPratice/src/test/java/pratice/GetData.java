package pratice;

import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.When;
import io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	@Test
	public void getAllUsers() {
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		String compBody = resp.prettyPrint();
		System.out.println(compBody);
		int status = resp.getStatusCode();
		System.out.println(status);
		String content = resp.getContentType();
		System.out.println(content);
	}
	@Test
	public void getAllProjects() {
		
		
		
	}

}
