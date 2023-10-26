package cookies;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import java.util.Map;

import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers.*;
import com.google.gson.JsonObject;

public class CokkiesData {
	@Test
	public void cookieCheck() {
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.cookie("AEC", "Ackid1Q7ee6VdG9gMk0auSFAOuTXtbdr25f-xyrcGtiBx1n_G1YXQirTJg")
		.log().all();
		
		
	}

	@Test
	public void getCookieInfo() {
		Response res = given()
		
		.when()
		.get("https://www.google.com/");
		
		//single cookie info
		
		String cookie = res.getCookie("AEC");
		System.out.println("value of cookie===>"+cookie);
		
	}
	@Test
	public void getAllCookiesInfo() {
		
		Response res = given()
		
		
		.when()
		.get("https://www.google.com/");
		
		Map<String, String> getAllcookies = res.getCookies();
		
		for(String s:getAllcookies.keySet()) {
			String cookieValue = res.getCookie(s);
			System.out.println(s+"       "+cookieValue);
		}
		
	}
}
