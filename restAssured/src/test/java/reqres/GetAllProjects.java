package reqres;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjects {
@Test
public void getAll() {
	Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
	resp.then().log().all();
	int res = resp.getStatusCode();
	Assert.assertEquals(200,res);
			
}

}
