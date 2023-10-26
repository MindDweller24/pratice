package reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProject {
	@Test
	public void update() {
		baseURI="https://reqres.in/";
		

		JSONObject jObj=new JSONObject();
		jObj.put("name", "morpheus");
		jObj.put("job", "zion resident");
		
		//step 1 pre condition
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		
		//step 2 action
		.when()
		.put("/api/users/2")
		
		//step 3 validation
		.then()
		.assertThat()
		.statusCode(200)
		.time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS)
//		.contentType(ContentType.JSON)
		
		.log()
		.all();
		
	}

}
