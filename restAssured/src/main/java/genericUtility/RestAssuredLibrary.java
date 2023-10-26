package genericUtility;

import io.restassured.response.Response;

public class RestAssuredLibrary {
	public String getJsonData(Response response,String path) {
		String jsondata = response.jsonPath().get(path);
		return jsondata;
		
	}

}
