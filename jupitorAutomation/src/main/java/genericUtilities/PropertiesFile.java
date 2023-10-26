package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public String getdataFromPropFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IpathConstant.filePath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		System.out.print(value);
		return value;

}
}
