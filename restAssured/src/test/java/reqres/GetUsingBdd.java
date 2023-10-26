package reqres;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetUsingBdd {
	@Test
	public void get() {
		baseURI="https://reqres.in/";
		
		//step 1 action
		when()
		.get("/api/users?page=2")
		
		//step 2 validation
		
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log()
	.all();
		
	}

}
