package laiba_44146;

import laiba_44146.CustomerLogin;

	import java.awt.event.WindowEvent;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.PrintWriter;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import javax.swing.ImageIcon;
	import javax.swing.JOptionPane;
	import javax.swing.table.DefaultTableModel;

	public class LipSticks extends javax.swing.JFrame {
	    CustomerLogin clb = new CustomerLogin();
	    public void clothesList() throws FileNotFoundException, IOException{
	       String[] columnName = new String[5];
	       columnName[0] = "Product ID";
	       columnName[1] = "Name";
	       columnName[2] = "Rate";
	       columnName[3] = "Quantity";
	       columnName[4] = "Category";
	       
	       

	        File file = new File("src/textFiles/Product.txt");
	        BufferedReader br = new BufferedReader(new FileReader(file));
	        
	        DefaultTableModel model = (DefaultTableModel) tblProductList.getModel();
	        model.setColumnIdentifiers(columnName);
	        tblProductList.setRowHeight(30);
	      
	       Object[] tableLines = br.lines().toArray();
	       int i;
	       
	       for(i=0; i<tableLines.length;i++){
	           String line = tableLines[i].toString().trim();
	           String[] tableRow = line.split(",");
	           if("Toys".equals(tableRow[4])){
	           model.addRow(tableRow);
	           }
	       }
	       
	    }

	    public LipSticks() throws FileNotFoundException, IOException {
	        initComponents();
	        ImageIcon img = new ImageIcon("src/media/images(6).jpg");
	       this.setIconImage(img.getImage());
	       
	       
	       txtProdName.setText("");
	       txtQuantity.setText("");
	       clothesList();
	    }
	    

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        lblWelcomeAdminPanel = new javax.swing.JLabel();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        tblProductList = new javax.swing.JTable();
	        lblProdName = new javax.swing.JLabel();
	        lblQuantity = new javax.swing.JLabel();
	        txtProdName = new javax.swing.JTextField();
	        txtQuantity = new javax.swing.JTextField();
	        btnCheckout = new javax.swing.JButton();
	        jPanel2 = new javax.swing.JPanel();
	        lblDashboard = new javax.swing.JLabel();
	        lblPendingOrders = new javax.swing.JLabel();
	        lblCart = new javax.swing.JLabel();
	        lblSignout = new javax.swing.JLabel();
	        lblExit = new javax.swing.JLabel();
	        jLabel1 = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Customer Panel");
	        setResizable(false);
	        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

	        jPanel1.setBackground(new java.awt.Color(0, 0, 0,70));

	        lblWelcomeAdminPanel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
	        lblWelcomeAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
	        lblWelcomeAdminPanel.setText("                                                 Clothes Section");

	        tblProductList.setBackground(new java.awt.Color(0, 0, 0));
	        tblProductList.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
	        tblProductList.setForeground(new java.awt.Color(255, 255, 255));
	        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {

	            }
	        ));
	        tblProductList.setFillsViewportHeight(true);
	        tblProductList.setFocusable(false);
	        tblProductList.setGridColor(new java.awt.Color(204, 0, 0));
	        tblProductList.getTableHeader().setReorderingAllowed(false);
	        tblProductList.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                tblProductListMouseClicked(evt);
	            }
	        });
	        jScrollPane1.setViewportView(tblProductList);

	        lblProdName.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblProdName.setForeground(new java.awt.Color(255, 255, 255));
	        lblProdName.setText("Product Name:");

	        lblQuantity.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
	        lblQuantity.setText("Quantity:");

	        btnCheckout.setBackground(new java.awt.Color(189, 20, 20));
	        btnCheckout.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
	        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
	        btnCheckout.setText("Check Out");
	        btnCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                btnCheckoutMouseClicked(evt);
	            }
	        });
	        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnCheckoutActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(lblWelcomeAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(189, 189, 189)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(lblProdName)
	                            .addComponent(lblQuantity))
	                        .addGap(106, 106, 106)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(txtProdName, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
	                            .addComponent(txtQuantity)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(329, 329, 329)
	                        .addComponent(btnCheckout))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(lblWelcomeAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(41, 41, 41)
	                        .addComponent(lblProdName)
	                        .addGap(32, 32, 32))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(40, 40, 40)))
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(lblQuantity)
	                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
	                .addComponent(btnCheckout)
	                .addGap(78, 78, 78))
	        );

	        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 890, 610));

	        jPanel2.setBackground(new java.awt.Color(204, 22, 22));

	        lblDashboard.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
	        lblDashboard.setText("Dashboard");
	        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                lblDashboardMouseClicked(evt);
	            }
	        });

	        lblPendingOrders.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblPendingOrders.setForeground(new java.awt.Color(255, 255, 255));
	        lblPendingOrders.setText("Pending orders");
	        lblPendingOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

	        lblCart.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblCart.setForeground(new java.awt.Color(255, 255, 255));
	        lblCart.setText("Cart");
	        lblCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

	        lblSignout.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblSignout.setForeground(new java.awt.Color(255, 255, 255));
	        lblSignout.setText("Sign out");
	        lblSignout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        lblSignout.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                lblSignoutMouseClicked(evt);
	            }
	        });

	        lblExit.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
	        lblExit.setForeground(new java.awt.Color(255, 255, 255));
	        lblExit.setText("Exit");
	        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                lblExitMouseClicked(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(35, 35, 35)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblPendingOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblSignout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(55, 55, 55)
	                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(lblPendingOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(lblCart, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(33, 33, 33)
	                .addComponent(lblSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(37, 37, 37)
	                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(214, Short.MAX_VALUE))
	        );

	        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

	        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/images(3).jpg"))); // NOI18N
	        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 610));

	        pack();
	        setLocationRelativeTo(null);
	    }

	    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
	        // TODO add your handling code here:
	        CustomerDashboard cd = new CustomerDashboard();
	        cd.setVisible(true);
	        this.setVisible(false);
	    }//GEN-LAST:event_lblDashboardMouseClicked
	    public void purchaseClothes(CustomerLoginBll clb) throws IOException{
	        
	        File file = new File("src/textFiles/Product.txt");
	        File f = new File("src/textFiles/Order.txt");
	        BufferedReader br;
	        String prodname = txtProdName.getText();
	        
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	            LocalDateTime now = LocalDateTime.now();  
	              
	        try{
	            br = new BufferedReader(new FileReader(file));
	            if(!f.exists()){
	                f.createNewFile();
	                
	            }
	            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))) {
	                PrintWriter pw = new PrintWriter(bw);
	                

	                float rate;
	                BufferedReader brUser = new BufferedReader(new FileReader("src/textFiles/activeUser.txt"));
	                Object[] tableData = brUser.lines().toArray();
	                String lineUser = tableData[0].toString().trim();
	                String[] rowData = lineUser.split(",");
	                Object[] tableLines = br.lines().toArray();
	                int i;
	                System.out.println(clb.getCustomerId()+" "+clb.getUsername());
	                
	                for(i=0; i<tableLines.length;i++){
	                    String line = tableLines[i].toString().trim();
	                    String[] tableRow = line.split(",");
	                   
	                    try{
	                        rate = Float.parseFloat(tableRow[2]);
	                        int quantity = Integer.parseInt(txtQuantity.getText());
	                        int stockQuantity = Integer.parseInt(tableRow[3]);
	                        if(prodname.equals(tableRow[1]) && stockQuantity > 0){
	                            
	                            pw.println(rowData[0]+","+ rowData[1] + ","+ prodname + "," +"Toys,"+ quantity +","+ rate*quantity+","+ dtf.format(now) );
	                            JOptionPane.showMessageDialog(this,"Product Purchased");
	                            
	                            pw.flush();
	                            pw.close();
	                            break;
	                            
	                        }
	                        
	                    }catch(NumberFormatException e){
	                       System.out.println("Please enter numeric value");
	                    }
	                   
	                if(i==tableLines.length){
	                    JOptionPane.showMessageDialog(this, "Product out of Stock.");
	                    txtProdName.setText(null);
	                    txtQuantity.setText(null);
	                }
	                bw.flush();
	                bw.close();
	                
//	                System.out.println("Inside first loop");
	            }
	                try (BufferedWriter bwp = new BufferedWriter(new FileWriter(file)); PrintWriter pwp = new PrintWriter(bwp)) {
	                   // System.out.println("Out of first loop");
	                    for(i=0; i<tableLines.length;i++){
	                        String lines = tableLines[i].toString().trim();
	                        String[] tableRows = lines.split(",");
	                        //System.out.println(i);
	                        
	                        
	                        int quantity = Integer.parseInt(txtQuantity.getText());
	                        int stockQuantity = Integer.parseInt(tableRows[3]);
	                        if(prodname.equals(tableRows[1]) ){
	                            int newStock = stockQuantity-quantity;
	                            
	                            if(newStock > 0){
	                            pwp.println(tableRows[0]+","+tableRows[1]+","+tableRows[2]+","+newStock+","+tableRows[4]);
	                           
	                            }
	                            
	                        }
	                        else{
	                            pwp.println(lines);
	                        }
	                    }
	                    pwp.flush();
	                }           
	             
	    }   catch (FileNotFoundException ex) {
	            Logger.getLogger(Toys.class.getName()).log(Level.SEVERE, null, ex);
	        } }catch (IOException ex) {
	            Logger.getLogger(Toys.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
	        // TODO add your handling code here:
	        int res;
	        res = JOptionPane.showConfirmDialog(this, "Are You sure to exit?");
	        System.out.println(res);
	        if (res == 0){
	            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	        }
	       
	    }//GEN-LAST:event_lblExitMouseClicked

	    private void lblSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignoutMouseClicked
	        LoginType lt = new LoginType();
	        int res;
	        res = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?" );
	        switch (res) {
	            case 0:
	                
	                lt.setVisible(true);    //opens the LoginType Jframe.
	                this.setVisible(false);     //closes the current JFrame form.
	                break;
	        //this.setVisible(true);
	            default:
	                break;
	        }
	// TODO add your handling code here:
	    }//GEN-LAST:event_lblSignoutMouseClicked

	    private void btnCheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseClicked
	       
	            // TODO add your handling code here:
	            
	        
	        
	    }//GEN-LAST:event_btnCheckoutMouseClicked

	    private void tblProductListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductListMouseClicked
	        // TODO add your handling code here:
	        
	    }//GEN-LAST:event_tblProductListMouseClicked

	    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
	        // TODO add your handling code here:
	        if(!"".equals(txtProdName.getText())  && !"".equals(txtQuantity.getText())){
	                try{
	                purchaseClothes(clb);
	                tblProductList.setModel(new DefaultTableModel(null, new String[]{"ID","Name","Rate","Quantity","Category"}));
	                clothesList();
	                txtProdName.setText(null);
	                txtQuantity.setText(null);
	                }
	                catch(IOException e){
	                    System.out.println("FIle IO exception error");
	                }
	            }
	            else{
	                JOptionPane.showMessageDialog(this, "Please Fill all the fields!");
	            }
	        
	    }//GEN-LAST:event_btnCheckoutActionPerformed

	   
	    public static void main(String args[]) {
	    
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(Toys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(Toys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(Toys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(Toys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	       

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(() -> {
	            try {
	                new Toys().setVisible(true);
	            } catch (FileNotFoundException ex) {
	                Logger.getLogger(Toys.class.getName()).log(Level.SEVERE, null, ex);
	            } catch (IOException ex) {
	                Logger.getLogger(Toys.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        });
	    }

	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JButton btnCheckout;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JLabel lblCart;
	    private javax.swing.JLabel lblDashboard;
	    private javax.swing.JLabel lblExit;
	    private javax.swing.JLabel lblPendingOrders;
	    private javax.swing.JLabel lblProdName;
	    private javax.swing.JLabel lblQuantity;
	    private javax.swing.JLabel lblSignout;
	    private javax.swing.JLabel lblWelcomeAdminPanel;
	    private javax.swing.JTable tblProductList;
	    private javax.swing.JTextField txtProdName;
	    private javax.swing.JTextField txtQuantity;
	    // End of variables declaration//GEN-END:variables
	}

}
