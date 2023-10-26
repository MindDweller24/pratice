package jupiterScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepo.ContactPage;
import objectRepo.HomePage;

public class ErrorValidator extends BaseClass{
	@Test
	public void scenario1() throws IOException, InterruptedException {
		wlib.maximizeWindow(cd);
		wlib.implicitlyWait(cd);
		String url = plib.getdataFromPropFile("url");
		cd.get(url);
		HomePage hp = new HomePage(cd);
		ContactPage cp = new ContactPage(cd);
		hp.homeAction();
		cp.submitAction();
		
		String forName = "Forename is required";
		String email = "Email is required";
		String mesg = "Message is required";
		
		//AsssertValidation
		cp.AssertValidation(cd, forName, email, mesg);
		String success = "Thanks Marnus, we appreciate your feedback.";
		
		//Get the Data From properties Files
		String fname = plib.getdataFromPropFile("fname");
		String sname = plib.getdataFromPropFile("sname");
		String email1 = plib.getdataFromPropFile("email");
		String telephone = plib.getdataFromPropFile("telephone");
		String msg = plib.getdataFromPropFile("msg");
		
		//ActionsContactPage
		cp.ContactAction(fname,sname,email1,telephone,msg,success,cd);
		System.out.println("dsdsdasd");
		
	}
	
}
