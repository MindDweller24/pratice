package sdetYT;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class GetUser {
	int id;
	@Test(priority = 1)
	void getRequest() {
		
		given()
			
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		
		.then()
		.statusCode(200)
		
		.log().all();
		
		
	}


@Test(priority = 2)
void createUser() {
	
	HashMap<String, Object> hm=new HashMap<String, Object>();
	hm.put("name", "sanat");
	hm.put("job", "qa");
	id=given()
	.contentType(ContentType.JSON)
	.body(hm)
	
	.when()
	.post("https://reqres.in/api/users")
	.jsonPath().getInt("id");
	
//	.then()
//	.statusCode(201)
//	.log().all();
	
}
@Test(priority = 3,dependsOnMethods = "createUser")
void updateUser() {
	
	HashMap<String, Object> hm=new HashMap<String, Object>();
	hm.put("name", "aziz");
	hm.put("job", "dev");
	given()
	.contentType(ContentType.JSON)
	.body(hm)
	
	.when()
	.put("https://reqres.in/api/users/"+id)
	
	.then()
	.statusCode(200)
	.log().all();
	
	
	
}
}

