package header;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

import java.util.Map;

import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers.*;

import com.aventstack.extentreports.gherkin.model.And;
import com.google.gson.JsonObject;
public class HeaderVerify {
	@Test
	public void header() {
		given()
		
		.when()
		.get("https://www.google.com/")
		.then()
		.header("X-Frame-Options", "SAMEORIGIN")
		.and()
		.header("Content-Type", "text/html; charset=ISO-8859-1");
		
	}

}
