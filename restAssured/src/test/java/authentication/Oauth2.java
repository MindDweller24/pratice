package authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Oauth2 {
	@Test
	public void oauthh2() {
		//create a request to generate token
		Response resp=given()
		.formParams("client_id","hotstar")
		.formParams("client_secret","1ff0f772169f3db85de421467835601c")
		.formParams("grant_type","client_credentials")
		.formParams("redirect_uri","http://www.example.com")
		.formParams("code","authorizton_code")
		
		.when()
		.post("http://coop.apps.symfonycasts.com/token");
		
		//capture the access token from the response of the above response
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//create another request and use the token to access the APIs
		given()
		.auth().oauth2(token)
		.pathParam("USER_ID", 4672)
		
		.when()
		.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/chickens-feed")
		.then().log().all();
		
		
		
	}

}
