package laiba_44146;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationFormFileImpl implements RegistrationFormFile{

	@Override
	public void newUserDetails(RegistrationForm rf) {
		
		File f = new File("src/textFiles/Accountrequest.txt");
        
	     
        try {
            if (!f.exists()){
                f.createNewFile();
            }
            
            
            
            try (FileWriter fw = new FileWriter(f,true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
                pw.println(rf.getUsername() + "," +rf.getAddress() + "," + rf.getPassword() + "," + rf.getGender() + "," + rf.getPhoneNo());
                pw.flush();
                pw.close();
                bw.close();
                fw.close();
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RegistrationFormFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegistrationFormFileImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            System.out.println("Successfully Wrote in file.....");
            
	}
}