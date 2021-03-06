/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Wael;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Date;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.xmlbeans.XmlObject;



//import org.apache.poi.xssf.
//import org.apache.poi.hssf.usermodel


/**
 *
 * @author Administrator
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAN Commands Generator");
        setResizable(false);

        jButton1.setText("Generate Configuration File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose Input File");

        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Brocade");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cisco");

        jLabel2.setText("Select Switch:");

        jLabel3.setText("Choose Output Path:");

        jButton3.setText("Browse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Type Output File Name:");

        jMenu1.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setBounds(635, 250, 331, 367);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //start if the button
        
        //aliases variables
    
        try {
        
            if (jRadioButton1.isSelected()) 
                
            {
        
        //Brocade Configuration variables        
        int a;
        int b;
        
        int c;
        int d;
        
        int e;
        int f;
        
                        File file = new File (jTextField2.getText()+"\\"+jTextField3.getText());
                        file.createNewFile();                        
                        FileWriter brocadefile = new FileWriter (file);
        
                            
                        FileInputStream fileinputstream = new FileInputStream(jTextField1.getText());
                        XSSFWorkbook workbook = new XSSFWorkbook(fileinputstream);
                        
                        XSSFSheet alisheet = workbook.getSheet("Aliases");
                        XSSFSheet zonesheet = workbook.getSheet("Zones");
			XSSFSheet cfgsheet = workbook.getSheet("CFG");
                        
                        b = alisheet.getPhysicalNumberOfRows();
                        d = zonesheet.getPhysicalNumberOfRows();
                        f = cfgsheet.getPhysicalNumberOfRows();
                        
                        for ( a = 0 ; a<b ; a++ )
                        {
                            
                            
                            XSSFRow rowa = alisheet.getRow(a);
                            
                            XSSFCell cellza = rowa.getCell((int) 0);
                            XSSFCell cellzb = rowa.getCell((int) 1);
                            
                            if(cellza.getStringCellValue().equals("") || cellza.getStringCellValue() == null)
                            {
                            break;
                            }
                            
                            brocadefile.write("alicreate"+" "+"\""+cellza.getStringCellValue().trim()+"\""+","+" "+"\""+cellzb.getStringCellValue().trim()+"\"");
                            brocadefile.write("\n");
                            
                         }
                        
                        brocadefile.write("\n");
                        brocadefile.write("\n");
                       
                //Start of zone creation             
                        
                       for ( c = 0 ; c < d ; c++ )
                       
                       {
                         
                        XSSFRow rowc = zonesheet.getRow(c);
                        XSSFCell cellca = rowc.getCell((int) 0);
                        XSSFCell cellcb = rowc.getCell((int) 1);
                        XSSFCell cellcc = rowc.getCell((int) 2);
                        
                        if(cellca.getStringCellValue().equals("") || cellca.getStringCellValue() == null)
                            {
                            break;
                            }
                        //zonecreate "zonemame", "member1; member2"
                        
                        brocadefile.write("zonecreate"+" "+"\""+cellca.getStringCellValue().trim()+"\""+","+" "+"\""+cellcb.getStringCellValue().trim()+";"+" "+cellcc.getStringCellValue().trim()+"\"");
                        brocadefile.write("\n");
                        
                        }
                       
                       brocadefile.write("\n");
                       brocadefile.write("\n");

                        XSSFRow rowc = cfgsheet.getRow(0);
                        XSSFCell cellcfgcreateA = rowc.getCell((int) 0);
                        XSSFCell cellcfgcreateB = rowc.getCell((int) 1);
                        
                      brocadefile.write("cfgcreate"+" "+"\""+cellcfgcreateB.getStringCellValue().trim()+"\""+","+" "+"\""+cellcfgcreateA.getStringCellValue().trim()+"\"");
                      brocadefile.write("\n");
                      brocadefile.write("\n");
                      
                      
                      for ( e = 1 ; e < f ; e++ )
                      {
                      
                      XSSFRow rowe = cfgsheet.getRow(e);
                      XSSFCell cellea = rowe.getCell((int) 0);
                      XSSFCell celleb = rowe.getCell((int) 1);
                      
                      
                      if(cellea.getStringCellValue().equals("") || cellea.getStringCellValue() == null)
                            {
                            break;
                            }
                      
                      brocadefile.write("cfgadd"+" "+"\""+celleb.getStringCellValue().trim()+"\""+","+" "+"\""+cellea.getStringCellValue().trim()+"\"");
                      brocadefile.write("\n");
                      }
                      
                      brocadefile.write("\n");
                      brocadefile.write("\n");
                      
                      brocadefile.close();
                                            
            }
            
            //Start of Cisco Configuration
            else if (jRadioButton2.isSelected())
            {
            
            
                        //Cisco Configuration variables
        
                        int g;
                        int h;
        
                        int i;
                        int j;
        
                        int k;
                        int l;
                
                        File file = new File (jTextField2.getText()+"\\"+jTextField3.getText());
                        file.createNewFile();                        
                        FileWriter ciscofile = new FileWriter (file);
            
                        FileInputStream fileinputstream = new FileInputStream(jTextField1.getText());
                        XSSFWorkbook ciscoworkbook = new XSSFWorkbook(fileinputstream);
                        
                        XSSFSheet alisheet = ciscoworkbook.getSheet("Aliases");
                        XSSFSheet zonesheet = ciscoworkbook.getSheet("Zones");
			XSSFSheet cfgsheet = ciscoworkbook.getSheet("CFG");
                        
                        h = alisheet.getPhysicalNumberOfRows();
                        j = zonesheet.getPhysicalNumberOfRows();
                        l = cfgsheet.getPhysicalNumberOfRows();
                        
                        ciscofile.write("config t");
                        ciscofile.write("\n");
                        ciscofile.write("\n");
                        
                        
                        //create aliases for Cisco switch
                        
                        
                        for ( g = 0 ; g<h ; g++ )
                        {
                            
                            
                            XSSFRow rowg = alisheet.getRow(g);
                            XSSFCell cellga = rowg.getCell((int) 0);
                            XSSFCell cellgb = rowg.getCell((int) 1);
                            XSSFCell cellgc = rowg.getCell((int) 2);
                            
                            //config t
                            //fcalias name CX4240_21_SPA vsan 3
                            //member pwwn 50:06:01:60:46:e0:0f:ba
                            //exit
                            
                            if(cellga.getStringCellValue().equals("") || cellga.getStringCellValue() == null)
                            {
                            break;
                            }
                            
                            ciscofile.write("fcalias name"+" "+cellga.getStringCellValue().trim()+" "+cellgc.getStringCellValue().trim());
                            ciscofile.write("\n");
                            ciscofile.write("member pwwn"+" "+cellgb.getStringCellValue().trim());
                            ciscofile.write("\n");
                            ciscofile.write("exit");
                            ciscofile.write("\n");
                            ciscofile.write("\n");
                        }
                        
                        ciscofile.write("\n");
                       
                        
                        
                        //create zones for cisco switch
                        
                       for ( i = 0 ; i<j ; i++ )
                        {
                            
                            
                            XSSFRow rowi = zonesheet.getRow(i);
                            XSSFCell cellia = rowi.getCell((int) 0);
                            XSSFCell cellib = rowi.getCell((int) 1);
                            XSSFCell cellic = rowi.getCell((int) 2);
                            XSSFCell cellid = rowi.getCell((int) 3);
                            
                            //zone name U52P1_13 vsan 3 
                            //member fcalias  CX4240_21_SPA
                            //member fcalias  Unix1_52_P1
                            //exit
                            
                            if(cellia.getStringCellValue().equals("") || cellia.getStringCellValue() == null)
                            {
                            break;
                            }
                            
                            ciscofile.write("zone name"+" "+cellia.getStringCellValue().trim()+" "+cellid.getStringCellValue().trim());
                            ciscofile.write("\n");
                            ciscofile.write("member fcalias"+" "+cellib.getStringCellValue().trim());
                            ciscofile.write("\n");
                            ciscofile.write("member fcalias"+" "+cellic.getStringCellValue().trim());
                            ciscofile.write("\n");
                            ciscofile.write("exit");
                            ciscofile.write("\n");
                            ciscofile.write("\n");
                            
                        }
                        
                        ciscofile.write("\n");
                        ciscofile.write("\n");
                        
                        
                        //create zoneset and add it to a VSAN
//                        
                            XSSFRow rowmain = cfgsheet.getRow(1);
                            XSSFCell cellcfgname = rowmain.getCell((int) 1);
                            XSSFCell cellvsanname = rowmain.getCell((int) 2);
                            
                            //zoneset name main_config vsan 3 
                            ciscofile.write("zoneset name"+" "+cellcfgname.getStringCellValue().trim()+" "+cellvsanname.getStringCellValue().trim());
                            ciscofile.write("\n");
                            ciscofile.write("\n");
                        
                        for ( k = 0 ; k<l ; k++ )
                        {
                            
                            
                            XSSFRow rowk = cfgsheet.getRow(k);
                            XSSFCell cellka = rowk.getCell((int) 0);
                            
                            if(cellka.getStringCellValue().equals("") || cellka.getStringCellValue() == null)
                            {
                            break;
                            }
                            
                            //member L51P2_14  
                            ciscofile.write("member"+" "+cellka.getStringCellValue().trim());
                            ciscofile.write("\n");
                            
                        }
                        
                        ciscofile.write("\n");
                        
                        XSSFRow rowend = cfgsheet.getRow(1);
                        XSSFCell cellendb = rowend.getCell((int) 1);
                        XSSFCell cellendc = rowend.getCell((int) 2);
                        
                        //zoneset activate name main_config vsan 3 
                        ciscofile.write("zoneset activate name"+" "+cellendb.getStringCellValue().trim()+" "+cellendc.getStringCellValue().trim());
                        ciscofile.write("\n");
                        ciscofile.write("\n");
                        ciscofile.close();
            }
            }                                        

        catch (FileNotFoundException e) 
                {
			e.printStackTrace();
		} 
        catch (IOException e) 
                {
			e.printStackTrace();
		}
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jFileChooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int returnVal = jFileChooser1.showOpenDialog((java.awt.Component) null); 
        
        if ( returnVal == jFileChooser1.APPROVE_OPTION ) { 
            
            String filepath = jFileChooser1.getSelectedFile().getPath(); 
            jTextField1.setText(filepath);
             
        } 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jFileChooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        int returnVal = jFileChooser2.showOpenDialog((java.awt.Component) null); 
        
        if ( returnVal == jFileChooser2.APPROVE_OPTION ) 
        { 
            
            String filepath2 = jFileChooser2.getSelectedFile().toString();
            jTextField2.setText(filepath2);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
        // TODO add your handling code here:
        String x = "Version: 1.0"+ "\n"+ "Developed by: Wael ElMasry"+"\n"+ "Contact: Wael.ElMasry@live.com" ; 
        JOptionPane.showMessageDialog(null, x);
    }//GEN-LAST:event_jMenuItem1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
