package dataBaseFrameWork;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataMasking {
	@Test
	public void datamasking() {
		Random ran=new Random();
		int r=ran.nextInt();
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "sagar");
		jobj.put("projectName", "bleach");
		jobj.put("status", "started");
		jobj.put("teamSize", 12);
		
		given().config(RestAssured.config.logConfig(LogConfig.logConfig().blacklistHeader("Content_Type")))
		.body(jobj).contentType(ContentType.JSON).log().all()
		
		.when().post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat()
		.log().all();
		
		
		
	}

}
