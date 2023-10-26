package reqres;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProJect {
	@Test
	public void create() {
		JSONObject jObj=new JSONObject();
		jObj.put("name", "morpheus");
		jObj.put("job", "leader");
		
		RequestSpecification resp = RestAssured.given();
		resp.body(jObj);
		resp.contentType(ContentType.JSON);
		Response res = resp.post("https://reqres.in/api/users");
		//System.out.println(res.asString());
		System.out.println(res.prettyPrint());
		System.out.println(res.prettyPeek());
	}

}
