package reqres;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatUsingBdd {
	@Test
		public void create() {
			//baseURI="https://reqres.in/";
			

		JSONObject jObj=new JSONObject();
		jObj.put("name", "morpheus");
		jObj.put("job", "leader");
		
		//step 1 pre condition
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		
		//step 2 action
		.when()
		.post("https://reqres.in/api/users")
		
		//step 3 validation
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log()
		.all();
		
//		Response res=when().get("api/users/2");
//		boolean flag=false;
//		String pId = res.jsonPath().get(".data[0].id");
//		List<String> pIDs = res.jsonPath().get("id");
//		for(String pID:pIDs) {
//			if(pID.equalsIgnoreCase(pId)) {
//				flag=true;
//			}
//		}
//		Assert.assertTrue(flag);
//		System.out.println("data verified");
//		
//		res.then().log();
		
	   
	   
	}

}
