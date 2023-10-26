package schemaValidation;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class JsonSchema {
@Test
	public void jsonSchemaVal(){
	
		given()
		
		.when()
		.get("/api/users?page=2")
		.then()
		.assertThat()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("SchemaF.json"));
		
	}
}
