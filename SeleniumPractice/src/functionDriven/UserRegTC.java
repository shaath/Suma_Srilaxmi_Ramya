package functionDriven;

import java.io.IOException;

public class UserRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		OrgHRMMethods ohm = new OrgHRMMethods();
		
		String res = ohm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res= ohm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application login "+res);
		
		res= ohm.orguserReg("Test Automation1", "AoneTestAutomation1", "Test@852741963");
		System.out.println("User Registration "+res);
		
		res = ohm.orgLogout();
		System.out.println("Application Logout "+res);
		
		ohm.orgClose();
		System.out.println("Application Closed Successfully");

	}

}
