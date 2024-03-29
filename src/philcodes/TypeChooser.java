package philcodes;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
/**
 *
 * @author ericko
 */


public class TypeChooser extends javax.swing.JFrame {

    /**
     * Creates new form TypeChooser
     */
    public static String type;
    String[] audioExtentions = {
        "aac","adts","ac3","mp2","mp3","mpga","flac","oga","ogg","opus","wav","f4a",
        "m4a"
    };
    String[] picsExtension = {
        "pbm","tif","tiff","svgz","svg","png","avif","avifs","bim","dib","gif","jp2",
        "jpg2","jpe","jpeg","jpg"
    };
    String[] videoExtension = {
        "3ga","3gp","3gpp","3g2","3gp2","3gpp2","dv","bdm","bdvm","clpi","cpi","m2t",
        "m2ts","mpl","mpls","mts","ts","lrv","m4v","mp4","mp2","mpeg","mpg","vob",
        "ogg","ogv","moov","mov","qt","qtvr","m4u","rv","rvx","viv","vivo","webm","flv","fxm","mkv","avi"
    };
    Connection con = new MyCON("localhost", 3306, "Media", "phillipo", "theTrine@004").getCON();
    public TypeChooser() {
        ImageIcon image = new ImageIcon(getClass().getResource("/philcodes/images/lock.jpg"));
        setIconImage(image.getImage());
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("PLEASE SELECT THE TYPE OF FILES YOU WANT TO STORE ");

        jButton1.setText("Pictures");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Audio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Videos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Others");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 204));
        jButton5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton5.setText("OK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jButton6.setText("CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FileChooser sqlChooser = new FileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES ONLY", picsExtension);
        sqlChooser.addChoosableFileFilter(filter);
        sqlChooser.setAcceptAllFileFilterUsed(false);
        
        int option = sqlChooser.showOpenDialog(null);
            if(option == JFileChooser.APPROVE_OPTION) {
                File file = sqlChooser.getSelectedFile();
                try {
                    String query = "INSERT INTO Pictures(Name,Extension,Data) value(?,?,?)";
                    PreparedStatement statement = con.prepareStatement(query);
                    FileInputStream in = new FileInputStream(file);
                    statement.setBinaryStream(3, in);
                    String name = file.getName().substring(0,file.getName().toString().lastIndexOf('.'));
                    String extension = file.getName().substring(file.getName().toString().lastIndexOf('.')+1,file.getName().length());
                    statement.setString(1, name);
                    statement.setString(2, extension);

                    System.out.println("Name : " + name);
                    System.out.println("EXT : " + extension);
                    statement.execute();
                    System.out.println("Data saved :)");
                    file.delete();
                    this.dispose();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        FileChooser sqlChooser = new FileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("AUDIO ONLY", audioExtentions);
        sqlChooser.addChoosableFileFilter(filter);
        sqlChooser.setAcceptAllFileFilterUsed(false);
        
        int option = sqlChooser.showOpenDialog(null);
            if(option == JFileChooser.APPROVE_OPTION) {
                File[] fileToDB = sqlChooser.getSelectedFiles();
                File file = sqlChooser.getSelectedFile();
                try {
                    String query = "INSERT INTO Audio(Name,Extension,Data) value(?,?,?)";
                    PreparedStatement statement = con.prepareStatement(query);
                    FileInputStream in = new FileInputStream(file);
                    statement.setBinaryStream(3, in);
                    String name = file.getName().substring(0,file.getName().toString().lastIndexOf('.'));
                    String extension = file.getName().substring(file.getName().toString().lastIndexOf('.')+1,file.getName().length());
                    statement.setString(1, name);
                    statement.setString(2, extension);

                    System.out.println("Name : " + name);
                    System.out.println("EXT : " + extension);
                    statement.execute();
                    System.out.println("Data saved :)");
                    file.delete();
                    this.dispose();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FileChooser sqlChooser = new FileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("VIDEO ONLY", videoExtension);
        sqlChooser.addChoosableFileFilter(filter);
        sqlChooser.setAcceptAllFileFilterUsed(false);
        int option = sqlChooser.showOpenDialog(null);
            if(option == JFileChooser.APPROVE_OPTION) {
                File file = sqlChooser.getSelectedFile();
                try {
                    String query = "INSERT INTO Videos(Name,Extension,Data) value(?,?,?)";
                    PreparedStatement statement = con.prepareStatement(query);
                    FileInputStream in = new FileInputStream(file);
                    statement.setBinaryStream(3, in);
                    String name = file.getName().substring(0,file.getName().toString().lastIndexOf('.'));
                    String extension = file.getName().substring(file.getName().toString().lastIndexOf('.')+1,file.getName().length());
                    statement.setString(1, name);
                    statement.setString(2, extension);

                    System.out.println("Name : " + name);
                    System.out.println("EXT : " + extension);
                    statement.execute();
                    System.out.println("Data saved :)");
                    file.delete();
                    this.dispose();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        FileChooser sqlChooser = new FileChooser();
       sqlChooser.setAcceptAllFileFilterUsed(true);
       int option = sqlChooser.showOpenDialog(null);
            if(option == JFileChooser.APPROVE_OPTION) {
               File file = sqlChooser.getSelectedFile();
                try {
                    String query = "INSERT INTO General(Name,Extension,Data) value(?,?,?)";
                    PreparedStatement statement = con.prepareStatement(query);
                    FileInputStream in = new FileInputStream(file);
                    statement.setBinaryStream(3, in);
                    String name = file.getName().substring(0,file.getName().toString().lastIndexOf('.'));
                    String extension = file.getName().substring(file.getName().toString().lastIndexOf('.')+1,file.getName().length());
                    statement.setString(1, name);
                    statement.setString(2, extension);

                    System.out.println("Name : " + name);
                    System.out.println("EXT : " + extension);
                    statement.execute();
                    System.out.println("Data saved :)");
                    file.delete();
                    this.dispose();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(TypeChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            if(!type.isEmpty() || type==null){
                this.dispose();
            }
        }catch(NullPointerException e){
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         int a = JOptionPane.showConfirmDialog(null, 
                                "Closing this windows will\nclose the application.\n\nDo you want to exit?",
                                "Leaving already?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }else if(a==JOptionPane.NO_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
