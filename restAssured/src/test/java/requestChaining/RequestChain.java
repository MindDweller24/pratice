package requestChaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class RequestChain {
	public void create() {
		baseURI="http://rmgtestingserver";
		port=8084;
	
	JavaLibrary jLib=new JavaLibrary();
	JSONObject jObj=new JSONObject();
	jObj.put("createdBy", "Sanat");
	jObj.put("projectName", "galaxy"+jLib.getRandomNum());
	jObj.put("status", "completed");
	jObj.put("teamSize", 12);
	
	//step1 pre condition
	given()
	.body(jObj)
	.contentType(ContentType.JSON)
	
	//step 2 action
	.when()
	.post("/addProject")
	
	//step3 validation
	.then()
	.assertThat()
	.statusCode(201)
	.contentType(ContentType.JSON)
	.log()
	.all();
	
	
	
	
	}

}
