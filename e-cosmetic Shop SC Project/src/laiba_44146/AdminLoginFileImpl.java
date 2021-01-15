package laiba_44146;

import laiba_44146.AdminLogin;

public class AdminLoginFileImpl implements AdminLoginFile{
	
	        private String finalUsername = "admin"; 
		    private String finalPassword = "admin123";
		    
	@Override
	public boolean userCredentials(AdminLogin al) {

		        return al.getUsername().equals(finalUsername) && al.getPassword().equals(finalPassword); 
		}
}