package functionDriven;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		OrgHRMMethods ohm = new OrgHRMMethods();
		
		String res = ohm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res= ohm.orgLogin("AoneTestAutomation1", "Test@852741963");
		System.out.println("Application login "+res);
		
		res = ohm.orgLogout();
		System.out.println("Application Logout "+res);
		
		ohm.orgClose();
		System.out.println("Application Closed Successfully");
	}

}
