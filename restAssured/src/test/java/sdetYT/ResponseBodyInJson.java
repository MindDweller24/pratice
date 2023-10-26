package sdetYT;

import static io.restassured.RestAssured.*;

import java.io.FileWriter;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseBodyInJson {
	@Test
    public void jsonFile() {
    	baseURI="https://reqres.in/";
    	JSONObject jObj=new JSONObject();
    	jObj.put("name", "darshil");
    	jObj.put("job", "business");
    	 Response res = given().body(jObj).contentType(ContentType.JSON)
    			.when().post("/api/users");
    	 res.then().assertThat().statusCode(201).log().all();
    	 String responseBody = res.getBody().asString();
    	 try {
			FileWriter file=new FileWriter("./src/test/resources/testFile.json");
			file.write(responseBody);
			file.flush();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    }

}
