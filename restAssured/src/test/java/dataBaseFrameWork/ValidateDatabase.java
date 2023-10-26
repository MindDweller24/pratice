package dataBaseFrameWork;

import static io.restassured.RestAssured.given;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.EndPointsLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ValidateDatabase extends BaseClass {
	@Test
	public void createProject() throws SQLException {
		
		//create pre reqsuites
		pojoClassCreateProject.CreateProject cp=new pojoClassCreateProject.CreateProject("sanat", "Tyss"+jlib.getRandomNum(), "ongoing", 12);
		
		//step 2:send the request
		
		Response resp=given().spec(req).body(cp)
				.contentType(ContentType.JSON)
				.when().post(EndPointsLibrary.createProject);
		
		//step 3: capture project id
		String expdata = rlib.getJsonData(resp, "projectId");
		System.out.println(expdata);
		//step 4:validate the id in database
		String query="select* from project";
		String actdata = dlib.executeQueryAndGetData(query, 1, expdata);
		Assert.assertEquals(expdata, actdata);
		System.out.println("test case is pass");
		resp.then().log().all();
	}			

}
