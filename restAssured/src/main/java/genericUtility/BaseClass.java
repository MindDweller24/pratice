package genericUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	public DataBseLibrary dlib=new DataBseLibrary();
	public JavaLibrary jlib=new JavaLibrary();
	public RestAssuredLibrary rlib=new RestAssuredLibrary();
	public RequestSpecification req;
	public ResponseSpecification resp;
	@BeforeSuite
	public void bsConfig() throws SQLException {
		dlib.ConnectToDB();
		req = new RequestSpecBuilder()
				.setBaseUri("http://rmgtestingserver:8084")
				.setContentType(ContentType.JSON).build();
				
				resp = new ResponseSpecBuilder()
						.expectContentType(ContentType.JSON)
						.expectStatusCode(201).build();
	}
	@AfterSuite
public void afterConfig() throws SQLException {
	dlib.closeDB();
}
}
