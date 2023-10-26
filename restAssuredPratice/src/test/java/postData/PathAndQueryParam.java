package postData;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class PathAndQueryParam {
	@Test
	public void pathAndQuery()
	{
		//https://reqres.in/api/users?page=2
		
		given()
		.pathParam("path", "users")
		.queryParam("page", 2)
		.queryParam("id", 9)
		
		.when()
		.get("https://reqres.in/api/{path}")
		
		.then()
		.statusCode(200)
		.log().all();
		
	}

}
