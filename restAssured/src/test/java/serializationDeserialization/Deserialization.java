package serializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojoClassCreateProject.PojoSerialization;

public class Deserialization {
	@Test
	public void deserialization() throws Throwable {
		
		ObjectMapper obj=new ObjectMapper();
		PojoSerialization ps=obj.readValue(new File(".//sanat.json"),PojoSerialization.class);
		System.out.println(ps.getName()+" "+ps.getPhoneno()+" "+ps.getAge());
		
	}
}
