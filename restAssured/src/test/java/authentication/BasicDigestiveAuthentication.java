package authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class BasicDigestiveAuthentication {
	@Test
	public void basicDigestiveAuthentication() {
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given()
		.auth().digest("rmgyantra", "rmgy@9999")
		
		.when()
		.get("/login")
		.then()
		.assertThat().statusCode(202).log().all();

}
}
