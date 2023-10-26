package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassCreateProject.PojoSerialization;

public class SerializationTest {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper obj=new ObjectMapper();
		PojoSerialization ps=new PojoSerialization("sanat", 7278289l, 26);
		obj.writeValue(new File(".//sanat.json"), ps);
		
	}

}
