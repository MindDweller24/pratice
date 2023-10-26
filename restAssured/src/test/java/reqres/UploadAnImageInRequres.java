package reqres;

import static io.restassured.RestAssured.baseURI;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class UploadAnImageInRequres {
	@Test
	public void uploadImg() {
    	baseURI="https://petstore.swagger.io/";

    	String reqBody = "{\r\n"
    			+ "  \"id\": 0,\r\n"
    			+ "  \"category\": {\r\n"
    			+ "    \"id\": 0,\r\n"
    			+ "    \"name\": \"string\"\r\n"
    			+ "  },\r\n"
    			+ "  \"name\": \"doggie\",\r\n"
    			+ "  \"photoUrls\": [\r\n"
    			+ "    \"string\"\r\n"
    			+ "  ],\r\n"
    			+ "  \"tags\": [\r\n"
    			+ "    {\r\n"
    			+ "      \"id\": 0,\r\n"
    			+ "      \"name\": \"string\"\r\n"
    			+ "    }\r\n"
    			+ "  ],\r\n"
    			+ "  \"status\": \"available\"\r\n"
    			+ "}";
    	RestAssured.given().contentType(ContentType.JSON).body(reqBody).post("/pet")
    	.then().log().all();
    	
    	
    	
//    	RestAssured.given().multiPart("file", new File("./src/test/resources/licensed-image.jfif"))
//    	.when()
//    	.post("/pet/0/uploadImage")
//    	.then()
//    	.assertThat().statusCode(200).log().all();
    	

}
}
