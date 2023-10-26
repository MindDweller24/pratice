package reqres;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathParametersUsingReq {
	@Test
	public void pathParm() {
		baseURI="https://reqres.in/";
		given().pathParam("id", 7)
		
		.when().get("/api/users/{id}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
