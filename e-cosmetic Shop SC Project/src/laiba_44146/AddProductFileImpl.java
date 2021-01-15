package laiba_44146;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import laiba_44146.AddProduct;

public class AddProductFileImpl implements AddProductFile{

	@Override
	public void productFile(AddProduct ap) {
		
		        File f = new File("src/textFiles/Product.txt");
		        
		     
		        try {
		            if (!f.exists()){
		                f.createNewFile();
		            }
		            int i=0;
		            int id = 0;
		            BufferedReader br = new BufferedReader(new FileReader(f));
		            Object[] tableLines = br.lines().toArray();
		                                
		                for(i=0; i<tableLines.length;i++){
		                    String line = tableLines[i].toString().trim();
		                    String[] tableRow = line.split(",");
		                    try{
		                    id = Integer.parseInt(tableRow[0]);
		                    }
		                    catch(NumberFormatException e){
		                        System.out.println("NO ID found");
		                    }
		                    
		                }
		                
		                ap.setProductId(id+1);
		            
		            
		            try (FileWriter fw = new FileWriter(f,true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw)) {
		                pw.println(ap.getProductId()+","+ap.getProductName() + "," +ap.getUnitPrice() + "," + ap.getQuantity() + "," + ap.getCategory());
		                pw.flush();
		                pw.close();
		                bw.close();
		                fw.close();
		            }
		            
		            
		        } catch (FileNotFoundException ex) {
		            Logger.getLogger(AddCustomerFileImpl.class.getName()).log(Level.SEVERE, null, ex);
		        } catch (IOException ex) {
		            Logger.getLogger(AddCustomerFileImpl.class.getName()).log(Level.SEVERE, null, ex);
		        }
		            
		            System.out.println("Successfully Wrote in file.....");
		            
		    } 
}