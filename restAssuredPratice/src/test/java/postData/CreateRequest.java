package postData;

import java.util.HashMap;
import org.json.simple.JSONObject;
import io.restassured.matcher.RestAssuredMatchers.*;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Then;
import com.google.gson.JsonObject;

import static io.restassured.RestAssured.*;

public class CreateRequest {
	@Test
//	public void createUsingHashMap() {
//		
//		HashMap<String, Object> map=new HashMap<String, Object>();
//		map.put("name", "Ankit");
//		map.put("location", "bangalore");
//		map.put("phoneno", "778228822");
//		String [] courseArr= {"Automation","civil"};
//		
//		map.put("course", courseArr);
//		
//		given()
//		.contentType("application/json")
//		.body(map)
//		
//		.when()
//		.post(" http://localhost:3000/posts")
//		
//		
//		.then()
//		.statusCode(201)
//		.log().all();
//				
//		
//		
//	}
//	@Test(priority = 2)
//	public void deleteReq() {
//		given()
//		
//		.when()
//		.delete("http://localhost:3000/posts/3")
//		
//		.then()
//		.statusCode(200)
//		.log().all();
//	}
	
	
	
public void createUsingjsonObj() {
		
		JSONObject map=new JSONObject();
		map.put("name", "AnkitG.K");
		map.put("location", "bangalore");
		map.put("phoneno", "778228822");
		String [] courseArr= {"Automation","civil"};
		
		map.put("course", courseArr);
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		.post(" http://localhost:3000/posts")
		
		
		.then()
		.statusCode(201)
		.log().all();
				
		
		
	}
	@Test(priority = 2)
	public void delete() {
		given()
		
		.when()
		.delete("http://localhost:3000/posts/4")
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
