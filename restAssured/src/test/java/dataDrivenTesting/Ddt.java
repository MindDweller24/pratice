package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Ddt {
	
	@DataProvider(name="getData")
	public Object[][] data(){
		Object[][] data=new Object[3][4];
		data[0][0]="sanat";
		data[0][1]="hp";
		data[0][2]="ongoing";
		data[0][3]=12;
		
		data[1][0]="pradhap";
		data[1][1]="sony";
		data[1][2]="ongoing";
		data[1][3]=10;
		
		data[2][0]="kuresh";
		data[2][1]="dell";
		data[2][2]="completed";
		data[2][3]=11;
		
		
		return data;
		
		
	}
	@Test(dataProvider = "getData")
	public void createProject(String createdBy,String projectName,String status,int teamSize) {
		
		//pre-condition
		JavaLibrary jlib=new JavaLibrary();
		pojoClassCreateProject.CreateProject pLib = new pojoClassCreateProject.CreateProject(createdBy, projectName, status, teamSize);
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.body(pLib)
		.contentType(ContentType.JSON)
		//adction
		.when()
		.post("/addProject")
		
		//validation
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.log().all();
		
		
		
		
		
		
	}
	

}
