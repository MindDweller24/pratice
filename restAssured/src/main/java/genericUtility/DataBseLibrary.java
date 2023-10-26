package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


/**
 * @author sanat
 * 
 */
public class DataBseLibrary {

	Connection con;
	Driver driverref;
	
	public void ConnectToDB() throws SQLException{
		driverref=new Driver();
		con=DriverManager.getConnection(Iconstants.dbURL, Iconstants.dbUserName, Iconstants.dbPassword);
	}
	
	
	public String executeQueryAndGetData(String query, int column, String ExpData) throws SQLException {
		ResultSet result = con.createStatement().executeQuery(query);
		boolean flag = false;
		while (result.next()) {
			String data = result.getString(column);
			{
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("---data is verified");
			return ExpData;
		} else {
			System.out.println("----data is not present");
			return "";
		}
	}
	public void closeDB() throws SQLException {
		con.close();
		
	}

}
