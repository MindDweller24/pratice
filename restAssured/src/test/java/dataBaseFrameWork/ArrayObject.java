package dataBaseFrameWork;

import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class ArrayObject {
	@Test
	public void arrayObj() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		when().get("/projects/TY_PROJ_75512")
		//.then().assertThat().body("", Matchers.instanceOf(List.class)).log().all();
		.then().assertThat().body("", Matchers.instanceOf(Map.class)).log().all();
	}

}
