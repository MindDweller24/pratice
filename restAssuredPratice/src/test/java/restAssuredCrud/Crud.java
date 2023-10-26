package restAssuredCrud;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Crud {
	@Test
	public void create() {
		JSONObject jobj=new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job", "leader");
		
		RequestSpecification response = RestAssured.given();
		response.body(jobj);
		response.contentType(ContentType.JSON);
		Response res = response.post("https://reqres.in/api/users");
		System.out.println(res.prettyPrint());
		System.out.println(res.prettyPeek());
		int statuscode = res.getStatusCode();
		Assert.assertEquals(statuscode, 201);
		
	}
	@Test
	public void getAllData() {
		Response result = RestAssured.get("https://reqres.in/api/users?page=2");
		result.then().log().all();
		int statuscode = result.getStatusCode();
		Assert.assertEquals(statuscode, 200);
	}
	@Test
	public void updateData() {
		JSONObject jobj=new JSONObject();
		jobj.put("name", "morpheus");
		jobj.put("job","zion resident");
		Response res = RestAssured.put("https://reqres.in/api/users/2");
		int statuscode = res.getStatusCode();
		Assert.assertEquals(statuscode, 201);
		System.out.println(res.prettyPrint());
	}
	@Test
	public void deleteDate() {
		Response res = RestAssured.delete("https://reqres.in/api/users/2");
		int statuscode = res.getStatusCode();
		Assert.assertEquals(statuscode, 204);
		
		
	}

}
