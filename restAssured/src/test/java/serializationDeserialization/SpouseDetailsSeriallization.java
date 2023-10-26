package serializationDeserialization;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassCreateProject.SpouseDetails;

public class SpouseDetailsSeriallization {
	@Test
	public void spouseDetails() throws Throwable {
		int spouse_phno[]= {151616,161771};
		SpouseDetails sd=new SpouseDetails("ana", spouse_phno, 25);
		ObjectMapper om=new ObjectMapper();
		om.writerWithDefaultPrettyPrinter().writeValue(new File("./spousedetail.json"), sd);
	}

}
