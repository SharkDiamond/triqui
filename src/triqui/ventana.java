/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triqui;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("triqu");
       
    
    }

    ganador win=new ganador();
     
      String[] options = {"X", "O"};
 int seleccion = JOptionPane.showOptionDialog(null, "¿Quien va primero?", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
   
    int turno=1;
   
    int fila;
    
   int columna;
   
         int[][] tablero=new int[3][3];
      
       
   public String empieza(){
      
      
      //EMPIEZAN LAS X
       if(this.seleccion==0){


           if(turno==1 || turno==3 || turno==5 || turno==7 || turno==9){
           turno=turno+1;
           return "X";
       }
       
       else if(turno==2 || turno==4 || turno==6 || turno==8 ){
            turno=turno+1;
            return "O";
        
       }
           
           
           
       }//LLAVE DE CIERRE DEL IF PRINCIPAL
         
       
       
         //EMPIEZAN LAS O 
       else{
         
       
           if(turno==1 || turno==3 || turno==5 || turno==7 || turno==9){
            turno=turno+1;
           return "O";
       }
           
           else if(turno==2 || turno==4 || turno==6 || turno==8 ){
            turno=turno+1;
            return "X";
           }
           
           
      
     }//LAVE DEL ESE PRINCIPAL
   
       
         
   return "";
        
   }//LLAVE DE CIERRE DEL METODO EMPIEZA
    
    
  
   
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton1.setForeground(new java.awt.Color(255, 255, 255));
        boton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton1.setFocusable(false);
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(0, 0, 0));
        boton2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton2.setFocusable(false);
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(0, 0, 0));
        boton3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton3.setForeground(new java.awt.Color(255, 255, 255));
        boton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton3.setFocusable(false);
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        boton4.setBackground(new java.awt.Color(0, 0, 0));
        boton4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton4.setForeground(new java.awt.Color(255, 255, 255));
        boton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton4.setFocusable(false);
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setBackground(new java.awt.Color(0, 0, 0));
        boton5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton5.setForeground(new java.awt.Color(255, 255, 255));
        boton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton5.setFocusable(false);
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setBackground(new java.awt.Color(0, 0, 0));
        boton6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton6.setForeground(new java.awt.Color(255, 255, 255));
        boton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton6.setFocusable(false);
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        boton7.setBackground(new java.awt.Color(0, 0, 0));
        boton7.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton7.setForeground(new java.awt.Color(255, 255, 255));
        boton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton7.setFocusable(false);
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setBackground(new java.awt.Color(0, 0, 0));
        boton8.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton8.setForeground(new java.awt.Color(255, 255, 255));
        boton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton8.setFocusable(false);
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setBackground(new java.awt.Color(0, 0, 0));
        boton9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        boton9.setForeground(new java.awt.Color(255, 255, 255));
        boton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        boton9.setFocusable(false);
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
  
      
      boton1.setText(this.empieza());
 fila=0;
 columna=0;
      
 
   if(boton1.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
    else {
        
    tablero[fila][columna]=2;
    
      }
      
 System.out.println("="+tablero[0][0]);
 
 
      this.ganador();
   
   
 
        
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
 boton2.setText(this.empieza());
       fila=0;
 columna=1;
 
 
 
 if(boton2.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
    else {
        
    tablero[fila][columna]=2;
    
      }
      
 System.out.println("="+tablero[0][1]);
 
 
      this.ganador();
        
                // TODO add your handling code here:
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
 boton3.setText(this.empieza());
       fila=0;
 columna=2;
      
  if(boton3.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
 else {
        
    tablero[fila][columna]=2;
    
      }
 System.out.println("="+tablero[0][2]);
 
 
 
 
      this.ganador();
       
                // TODO add your handling code here:
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
 boton4.setText(this.empieza());  
 fila=1;
 columna=0;
      
  if(boton4.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
 else {
        
    tablero[fila][columna]=2;
    
      }
 System.out.println("="+tablero[1][0]);
 
 
 
 
      this.ganador();
  
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
 boton5.setText(this.empieza());  
 fila=1;
 columna=1;
       if(boton5.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
    else {
        
    tablero[fila][columna]=2;
    
      }
      
 System.out.println("="+tablero[1][1]);
 
 
      this.ganador();// TODO add your handling code here:
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
 boton6.setText(this.empieza());     
 fila=1;
 columna=2;
       if(boton6.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
      else {
        
    tablero[fila][columna]=2;
    
      }
      
 System.out.println("="+tablero[1][2]);
 
 
      this.ganador();// TODO add your handling code here:
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
 boton7.setText(this.empieza());     
 fila=2;
 columna=0;
       if(boton7.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
       else {
        
    tablero[fila][columna]=2;
    
      }
      
 System.out.print("="+tablero[2][0]);
 
 
      this.ganador();// TODO add your handling code here:
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
 boton8.setText(this.empieza());   
 fila=2;
 columna=1;
       if(boton8.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
     else {
        
    tablero[fila][columna]=2;
    
      }
 System.out.println("="+tablero[2][1]);
 
 
  this.ganador();
// TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
 boton9.setText(this.empieza());   
 fila=2;
 columna=2;



       if(boton9.getText().equals("X")){
      
       tablero[fila][columna]=1;
      
     
      }
      
      else {
        
    tablero[fila][columna]=2;
    
      }
      
 System.out.println("="+tablero[2][2]);
 
 
      this.ganador();// TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    
     public String ganador(){
    
         String g="GANARON LAS X";
    String o="GANARON LAS O";
    
  
    //HORIZONTAL
         
    if((tablero[0][0]==1 && tablero[0][1]==1 && tablero[0][2]==1) || (tablero[1][0]==1 && tablero[1][1]==1 && tablero[1][2]==1) || (tablero[2][0]==1 && tablero[2][1]==1 && tablero[2][2]==1)){
    
        this.dispose();
        win.setVisible(true);
       win.imprimir.setText(g);
      
      
        
    }
    
    else if((tablero[0][0]==2 && tablero[0][1]==2 && tablero[0][2]==2) || (tablero[1][0]==2 && tablero[1][1]==2 && tablero[1][2]==2) || (tablero[2][0]==2 && tablero[2][1]==2 && tablero[2][2]==2)){
   
         this.dispose();
        win.setVisible(true);
       win.imprimir.setText(o);
      
    
    }
    
    
   
    
    //VERTICAL
   
  
    if((tablero[0][0]==1 && tablero[1][0]==1 && tablero[2][0]==1) || (tablero[0][1]==1 && tablero[1][1]==1 && tablero[2][1]==1) || (tablero[0][2]==1 && tablero[1][2]==1 && tablero[2][2]==1))
    {
    
      this.dispose();
        win.setVisible(true);
       win.imprimir.setText(g);
    
    }
    
    else if((tablero[0][0]==2 && tablero[1][0]==2 && tablero[2][0]==2) || (tablero[0][1]==2 && tablero[1][1]==2 && tablero[2][1]==2) || (tablero[0][2]==1 && tablero[1][2]==1 && tablero[2][2]==1)){
    
         this.dispose();
        win.setVisible(true);
       win.imprimir.setText(o);
    }
    
    //DIAGONAL
    
      if((tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1) || (tablero[0][2]==1 && tablero[1][1]==1 && tablero[2][0]==1))
    {
    
      this.dispose();
        win.setVisible(true);
       win.imprimir.setText(g);
    
    }
      
      else if((tablero[0][0]==2 && tablero[1][1]==2 && tablero[2][2]==2) || (tablero[0][2]==2 && tablero[1][1]==2 && tablero[2][0]==2)){
      
         this.dispose();
        win.setVisible(true);
       win.imprimir.setText(o);
      
      }
    
      
      //LAS O 
      
      //Horizontal
      
      /*
      if((tablero[0][0]==0 && tablero[0][1]==0 && tablero[0][2]==0) || (tablero[1][0]==0 && tablero[1][1]==0 && tablero[1][2]==0) || (tablero[2][0]==0 && tablero[2][1]==0 && tablero[2][2]==0)){
    
        JOptionPane.showMessageDialog(null, o);
        
    }
    
   
    
    //VERTICAL
   
  
    if((tablero[0][0]==0 && tablero[1][0]==0 && tablero[2][0]==0) || (tablero[0][1]==0 && tablero[1][1]==0 && tablero[2][1]==0) || (tablero[0][2]==0 && tablero[1][2]==0 && tablero[2][2]==0))
    {
    
    
     JOptionPane.showMessageDialog(null, o);
    
    }
    
    //DIAGONAL
    
      if((tablero[0][0]==0 && tablero[1][1]==0 && tablero[2][2]==0) || (tablero[0][2]==0 && tablero[1][1]==0 && tablero[2][0]==0))
    {
    
    
     JOptionPane.showMessageDialog(null, o);
    
    }
    */
      

    return "";
    
    
    }
    
 public void replace(){
 
 
 
 
 
 
 
 }
   
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
