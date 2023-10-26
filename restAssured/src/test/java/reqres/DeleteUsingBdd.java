package reqres;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteUsingBdd {
	@Test
	public void delete() {
		baseURI="https://reqres.in/";
		when()
		.delete("/api/users=2")
		
		//step 2 validation
		
	.then()
	.assertThat()
	.statusCode(204)
//	.contentType(ContentType.JSON)
//	.time(Matchers.lessThan(3000l),TimeUnit.MILLISECONDS)
	.log()
	.all();
		
	}

}
