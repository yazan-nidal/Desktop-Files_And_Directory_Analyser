package files_and_directory_analyser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

public class GUI extends javax.swing.JFrame {


    public GUI() {
        initComponents();
        
        this.setTitle("Files_And_Airectory_Analyser");
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        //Center in screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
        
        addWindowListener(new WindowAdapter()
        {
        @Override
        public void windowOpened(WindowEvent we) {
        setIconImage( new ImageIcon("src/icons/p.png").getImage()); 
        JOptionPane.showMessageDialog(null, "Enjoy use file and directory analysis program","welcome to my program ;) ",1,new ImageIcon("src/icons/7.png")); }

        @Override
        public void windowClosing(WindowEvent we)
        {
        int ans=JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",YES_NO_CANCEL_OPTION,1,new ImageIcon("src/icons/can.png"));
        if (ans==YES_OPTION )dispose(); 
        }

        @Override
        public void windowClosed(WindowEvent we) { JOptionPane.showMessageDialog(null, "thank you for use my program ;) ","good bye",1,new ImageIcon("src/icons/7.png")); 
        System.exit(0); }
        
        @Override
        public void windowIconified(WindowEvent we) { setIconImage( new ImageIcon("src/icons/pl.png").getImage()); }

        @Override
        public void windowDeiconified(WindowEvent we) { setIconImage( new ImageIcon("src/icons/p.png").getImage()); }
        
        });
         
     
        area.setEditable(false); // set textArea non-editable
       
        this.setResizable(false);
        this.setVisible(true);
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel1.setBackground(new java.awt.Color(255, 204, 204));

        label1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 0, 51));
        label1.setText("Please Select File or Directory :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(292, Short.MAX_VALUE)
                .addComponent(label1)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel2.setBackground(new java.awt.Color(255, 204, 204));

        b1.setBackground(new java.awt.Color(204, 255, 204));
        b1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b1.setForeground(new java.awt.Color(153, 0, 51));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vg.png"))); // NOI18N
        b1.setMnemonic('1');
        b1.setText("Select");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b2.setForeground(new java.awt.Color(153, 0, 51));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rem1.png"))); // NOI18N
        b2.setText("Clear");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 102, 102));
        b3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        b3.setForeground(new java.awt.Color(153, 0, 51));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/can1.png"))); // NOI18N
        b3.setText("Cancel");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(b1)
                .addGap(141, 141, 141)
                .addComponent(b2)
                .addGap(141, 141, 141)
                .addComponent(b3)
                .addGap(141, 141, 141))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(b1)
                .addComponent(b2)
                .addComponent(b3))
        );

        area.setBackground(new java.awt.Color(102, 102, 102));
        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        area.setForeground(new java.awt.Color(153, 0, 0));
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        int ans=JOptionPane.showConfirmDialog(null,"Do you want to exit","Exit",YES_NO_CANCEL_OPTION,1,new ImageIcon("src/icons/can.png"));
        if (ans==YES_OPTION )dispose();        
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       label1.setText("Please Select File or Directory :"); area.setText("");
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
        b2.doClick();
        
        File fptr=null;
        
        JFileChooser choose=new JFileChooser();
        choose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        int i=choose.showOpenDialog(null);
        
        if(i==JFileChooser.APPROVE_OPTION)
        {
            fptr=choose.getSelectedFile();
            label1.setText("Please Select File or Directory :"+fptr.getName());
            action(fptr);
        }
        else{
        if(fptr==null){
        
        area.append("< the file or directory select is canceld >\n"); 
          
        return;}
        }
    }//GEN-LAST:event_b1ActionPerformed

     public void action(File fptr)
    {
        if(!fptr.exists()){area.append("< the file or directory is not exists >\n"); return;}
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        if(fptr.isFile())
        {
         area.append("/** \nFile Name : "+fptr.getName()
                 +" , \nFile ** "+fptr.getName()+" ** attributes -->  \nFile Full Path : "
                 +fptr.getAbsolutePath()
                 +"\nFile Size : "+fptr.length()+" bytes"
                 +"\nPermission : "+((fptr.canWrite())?"can Write":"can't Write")
                 +" , "+((fptr.canRead())?"can Read":"can't Read")
                 +" , "+((fptr.canExecute())?"can Execute":"can't Execute")
                 +" , "+((fptr.isHidden())?"is Hidden":"isn't Hidden\n")
                 +"Last Modified File : "+ sdf.format(fptr.lastModified())
                 +"\n**/\n" );
         return;
        }
        
        if(fptr.isDirectory())
        {
            area.append("< Directory Name : "+fptr.getName()+"\n"
            +"Last Modified Directory : "+ sdf.format(fptr.lastModified())+"\n"
            +"Contains Directory ** "+fptr.getAbsolutePath()+" ** --> ");
            File []list=fptr.listFiles();
            action2(list);
            area.append("\nEnd Contains Directory ** "+fptr.getAbsolutePath()+" ** >\n");
            
            area.append("\n\n******************************directory Summary******************************\n");
            area.append(fptr.getAbsolutePath()+"\n") ;
             area.append("number of Files and Directorys : " +(directorySummary(list)+1)+"\n");
             area.append("******************************End Directory Summary******************************\n");
            
        }
        
    }
     
   public void action2(File[]fptr)
   {
       if(fptr.length==0){ 
           area.append("\n is Empty Directory");
           return;  
       }
        for (File fptr1 : fptr) {
            if (fptr1.isFile()) {
                area.append("\n\n");
                action(fptr1);
            } else if (fptr1.isDirectory()) { SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                area.append("\n\n< subDirectory Name : " + fptr1.getName() + "\n"
                +"Last Modified Directory : "+ sdf.format(fptr1.lastModified())+"\n"
                +"Contains subDirectory ** "+fptr1.getAbsolutePath()+" ** --> ");
                File[] list = fptr1.listFiles();
                action2(list);
                area.append("\nEnd Contains subDirectory ** "+fptr1.getAbsolutePath()+" ** >\n");
            }
        }
       
   }
   
   public int directorySummary(File[]fptr)
   {
       int i=0;
    for (File fptr1 : fptr) {
        i++;
    if (fptr1.isFile()) {  area.append(fptr1.getAbsolutePath()+"\n") ;}
    else if (fptr1.isDirectory()) {
    area.append(fptr1.getAbsolutePath()+"\n") ;
    File[] list = fptr1.listFiles();
    i+=directorySummary(list);
     }
     }
    return i;
   }
       
    public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> {
    new GUI().addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosed(WindowEvent we) {
    System.exit(0); }
    });
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
}
