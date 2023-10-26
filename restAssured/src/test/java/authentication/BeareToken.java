package authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BeareToken {
	@Test
	public void bearerToken() {
		baseURI ="https://api.github.com";
		JSONObject jObj=new JSONObject();
		jObj.put("name", "sdet_555_restAssured");
		//precondi
		given()
		.auth()
		.oauth2("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")
		.body(jObj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/user/repos")
		
		.then()
		.log().all();
	}

}
