/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proto1c;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class gui_EventNew extends javax.swing.JFrame {

    /**
     * Creates new form gui_EventNew
     */
    public gui_EventNew() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        evt_create = new javax.swing.JButton();
        evt_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        evt_name = new javax.swing.JTextField();
        evt_hour = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        evt_day = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        evt_month = new javax.swing.JTextField();
        evt_year = new javax.swing.JTextField();
        evt_min = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        evt_create.setText("Create");
        evt_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evt_createActionPerformed(evt);
            }
        });

        evt_cancel.setText("Cancel");
        evt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evt_cancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Event Name:");

        evt_name.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        evt_name.setText("Name");
        evt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evt_nameMouseClicked(evt);
            }
        });

        evt_hour.setText("HH");
        evt_hour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evt_hourMouseClicked(evt);
            }
        });

        jLabel3.setText("Event Time:");

        evt_day.setText("DD");
        evt_day.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evt_dayMouseClicked(evt);
            }
        });

        jLabel2.setText("Event Date:");

        evt_month.setText("MM");
        evt_month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evt_monthMouseClicked(evt);
            }
        });

        evt_year.setText("YYYY");
        evt_year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evt_yearMouseClicked(evt);
            }
        });

        evt_min.setText("MM");
        evt_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                evt_minMouseClicked(evt);
            }
        });

        jLabel4.setText("/");

        jLabel5.setText("/");

        jLabel6.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(evt_create)
                .addGap(18, 18, 18)
                .addComponent(evt_cancel)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(evt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(evt_day, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(evt_month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(evt_year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(evt_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(evt_min, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evt_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evt_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evt_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evt_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evt_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evt_create)
                    .addComponent(evt_cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evt_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evt_createActionPerformed
        // TODO add your handling code here:
        final int reqFields = 6;
        int validFields = 0;
        String errorMessage = "";
        
        //Validation to ensure entered fields are correct.
        if(evt_name.getText().equalsIgnoreCase("Name")||evt_name.getText().isEmpty()){
            errorMessage = errorMessage.concat("Name field is missing.\n");
        }else{
            String aName = evt_name.getText();
            validFields++;
        }
        
        //Ensure Month field is correct
        if(evt_month.getText().equalsIgnoreCase("MM")||evt_month.getText().isEmpty()){
            errorMessage = errorMessage.concat("Month field is missing.\n");
        }else{
            //Attempt to ensure month is valid and is a number
            try{
                int mm = Integer.parseInt(evt_month.getText());
                if(mm <=0 || mm >12){
                       errorMessage = errorMessage.concat("Month not valid.\n");
               }else{
                   aMonth = mm;
                   validFields++;
               }
            } catch(NumberFormatException e){
                errorMessage = errorMessage.concat("Month is not a valid number.\n");
            }
        }
        
        //Ensure Year field is correct
        if(evt_year.getText().equalsIgnoreCase("YYYY")||evt_year.getText().isEmpty()){
            errorMessage = errorMessage.concat("Year field is missing.\n");
        }else{
            //Attempt to ensure month is valid and is a number
            try{
                int yy = Integer.parseInt(evt_year.getText());
                if(yy < 2019 || yy > 2099 ){
                       errorMessage = errorMessage.concat("Month not valid.\n");
               }else{
                   aYear = yy;
                   validFields++;
               }
            } catch(NumberFormatException e){
                errorMessage = errorMessage.concat("Month is not a valid number.\n");
            }
        }      
        
        //Ensure Day field is filled
        if(evt_day.getText().equalsIgnoreCase("DD")||evt_day.getText().isEmpty()){
            errorMessage = errorMessage.concat("Day field is missing.\n");
        }else{
            //Attempt to ensure day is valid and is a number
            try{
               int dd = Integer.parseInt(evt_day.getText());
               if(dd <=0 || dd >31){
                    errorMessage = errorMessage.concat("Day not valid.\n");
                }else{
                    aDay = dd;
                    validFields++;
                }
            } catch(NumberFormatException e){
                errorMessage = errorMessage.concat("Day is not a valid number.\n");
            }
        }
        
          //Ensure hour field is correct
          if(evt_hour.getText().equalsIgnoreCase("HH")||evt_hour.getText().isEmpty()){
            errorMessage = errorMessage.concat("Hour field is missing.\n");
        }else{
            //Attempt to ensure hour is valid and is a number
            try{
               int hh = Integer.parseInt(evt_hour.getText());
               if(hh < 0 || hh > 24){
                    errorMessage = errorMessage.concat("Hour not valid.\n");
                }else{
                    aHour = hh;
                    validFields++;
                }
            } catch(NumberFormatException e){
                errorMessage = errorMessage.concat("Hour is not a valid number.\n");
            }
        }
          
            //Ensure Minute field is correct
          if(evt_min.getText().equalsIgnoreCase("MM")||evt_min.getText().isEmpty()){
            errorMessage = errorMessage.concat("Minute field is missing.\n");
        }else{
            //Attempt to ensure hour is valid and is a number
            try{
               int min = Integer.parseInt(evt_min.getText());
               if(min < 00 || min > 59){
                    errorMessage = errorMessage.concat("Hour not valid.\n");
                }else{
                    aMinute = min;
                    validFields++;
                }
            } catch(NumberFormatException e){
                errorMessage = errorMessage.concat("Minute is not a valid number.\n");
            }
        }
                
        //Ensure the fields are valid to avoid error message
        if (validFields < reqFields){
            JOptionPane.showMessageDialog(null, errorMessage,"Invalid Fields", JOptionPane.ERROR_MESSAGE);
        }else{
        
       // System.out.println(aName);
        //System.out.println(aDate);
        //System.out.println(aTime);
          JOptionPane.showMessageDialog(null, "Event has been created.", "Event Created", JOptionPane.INFORMATION_MESSAGE);
          aDate = (aDay + aMonth + aYear);
          aTime = (aHour + aMinute);        
          SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
          SimpleDateFormat tf = new SimpleDateFormat("kk:mm");
          String date = df.format(aDate);
          String time = tf.format(Integer.valueOf(aTime));
        }
    }//GEN-LAST:event_evt_createActionPerformed

    private void evt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evt_nameMouseClicked
        // When clicked on field automatically becomes empty.
        evt_name.setText("");
    }//GEN-LAST:event_evt_nameMouseClicked

    private void evt_dayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evt_dayMouseClicked
        // When clicked on field automatically becomes empty.
        evt_day.setText("");
    }//GEN-LAST:event_evt_dayMouseClicked

    private void evt_hourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evt_hourMouseClicked
        // When clicked on field automatically becomes empty.
        evt_hour.setText("");
    }//GEN-LAST:event_evt_hourMouseClicked

    private void evt_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evt_minMouseClicked
        // When clicked on field automatically becomes empty.
        evt_min.setText("");
    }//GEN-LAST:event_evt_minMouseClicked

    private void evt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evt_cancelActionPerformed
        //Closes when clicked on
        this.dispose();
        gui_Event e= new gui_Event();
        e.setVisible(true);
    }//GEN-LAST:event_evt_cancelActionPerformed

    private void evt_monthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evt_monthMouseClicked
        // When clicked on field automatically becomes empty.
        evt_month.setText("");
    }//GEN-LAST:event_evt_monthMouseClicked

    private void evt_yearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_evt_yearMouseClicked
        // TODO add your handling code here:
        evt_year.setText("");
    }//GEN-LAST:event_evt_yearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evt_cancel;
    private javax.swing.JButton evt_create;
    private javax.swing.JTextField evt_day;
    private javax.swing.JTextField evt_hour;
    private javax.swing.JTextField evt_min;
    private javax.swing.JTextField evt_month;
    private javax.swing.JTextField evt_name;
    private javax.swing.JTextField evt_year;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    private String aName;
    private int aDay;
    private int aMonth;
    private int aYear;
    private int aHour;
    private int aMinute;
    private int aTime;
    private int aDate;
   
    

}