package laiba_44146;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import laiba_44146.CustomerLogin;

public class CustomerLoginFileImpl implements CustomerLoginFile{

	@Override
	public boolean userAccess(CustomerLogin cl) {

		        try{
		            File f = new File("src/textFiles/activeUser.txt");
		            if(!f.exists()){
		                f.createNewFile();
		            }
		            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		            PrintWriter pw = new PrintWriter(bw);
		            FileReader fr=new FileReader("src/textFiles/Customer.txt");
		            try (BufferedReader br = new BufferedReader(fr)) {
		                String line=null;
		                String []splt=null;
		                
		                while((line=br.readLine())!=null){
		                    splt=line.split(",");
		                    cl.setCustomerId(Integer.parseInt(splt[0]));
		                    
		                    if(splt[1].equals(cl.getUsername()) && splt[3].equals(cl.getPassword())) {
		                        System.out.println(cl.getCustomerId());
		                        pw.println(cl.getCustomerId()+","+cl.getUsername());
		                        pw.flush();
		                        pw.close();
		                        return true;
		                    }
		                    
		                }
		                
		            }
		        }
		        catch(IOException e){
		            System.out.println("FileNotFound");
		        }
		         
		        return false;
		    }
}
