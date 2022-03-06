
package optimizacion_de_costos_de_produccion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cuadrados_Medios extends javax.swing.JFrame {

    public Cuadrados_Medios() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columns = {"Y","SEMILLA","RESULTADO","X"};
        modelo.setColumnIdentifiers(columns);
        jTable1.setModel(modelo);        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGen = new javax.swing.JButton();
        txtSeed = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRet = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        btnGen.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGen.setText("GENERAR");
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Semilla:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnRet.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnRet.setText("REGRESAR");
        btnRet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnClose.setText("SALIR");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRet)
                        .addGap(492, 492, 492)
                        .addComponent(btnClose))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtSeed, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnGen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGen)
                    .addComponent(txtSeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRet, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetActionPerformed
        Proyecto_Simulacion frm = new Proyecto_Simulacion();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetActionPerformed

    private void btnGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenActionPerformed
       if(txtSeed.getText().length()>0 && Integer.parseInt(txtSeed.getText())>999 && Integer.parseInt(txtSeed.getText())<=10000){
        Busqueda.init();

            boolean is_number = true;
            
            try{
            int a;
                a = Integer.parseInt(txtSeed.getText().toString());
            }
            catch(java.lang.NumberFormatException nfe){
                JOptionPane.showMessageDialog(rootPane, "Debes escribir caracteres numericos");
                is_number = false;
            }

            if(is_number==true){
            DefaultTableModel modelo = new DefaultTableModel();
            int contador=0;
            int xaux = 0;
            String cadena = "";
            String[] columnas = {"Y0","Xn","Operaciones","Rn"};
            modelo.setColumnIdentifiers(columnas);
            modelo.setColumnIdentifiers(columnas);
            int seed = Integer.parseInt(txtSeed.getText());
            xaux = seed;
            int copia = seed;
            while(true){
                int op = (seed*seed);
                char[] numeros = (""+op).toCharArray();
                
                int longitud = numeros.length;
                System.out.println(""+longitud);
                if(longitud==4){ seed = op ;}
                else if(longitud==1){ 
                     cadena = "" + 0 + "" +0 + "" +0+ ""+numeros[0];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==2){ 
                     cadena = "" + 0 + "" +0 + "" + numeros[0]+ ""+numeros[1];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==3){ 
                     cadena = "" + 0 + "" + numeros[0] + "" + numeros[1]+ ""+numeros[2];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==5){ 
                     cadena = "" + numeros[0] + "" + numeros[1] + "" + numeros[2]+ ""+numeros[3];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==6){ 
                     cadena = "" + numeros[1] + "" + numeros[2] + "" + numeros[3]+ ""+numeros[4];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==7){ 
                    cadena = "" + numeros[1] + "" + numeros[2] + "" + numeros[3]+ ""+numeros[4];
                    seed = Integer.parseInt(cadena);
                }
                else if(longitud==8){ 
                     cadena = "" + numeros[2] + "" + numeros[3] + "" + numeros[4]+ ""+numeros[5];
                    seed = Integer.parseInt(cadena);
                }
                modelo.addRow(new Object[]{contador,xaux,op,cadena});
                xaux = seed;
                if(seed==copia){
                    JOptionPane.showMessageDialog(rootPane, "la semilla inicial \""+copia+"\" se repite en : " + contador);                    
                    break; }
                else if(seed==0){
                    JOptionPane.showMessageDialog(rootPane, "el ciclo termina en 000 : " + contador);
                    break; }
                if(Busqueda.Vacio()){
                    Busqueda.Agregar(cadena);
                }else{
                    if(!Busqueda.Existe(cadena)){
                        Busqueda.Agregar(cadena);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "El numero se repite en "+ contador);
                        break;
                    }
                }
                
                contador++;
            }
            jTable1.setModel(modelo);
        }
        }
        else if(txtSeed.getText().length()==0){
        JOptionPane.showMessageDialog(rootPane, "Debes Ingresar una Semilla");
        }
        else if(Integer.parseInt(txtSeed.getText())<=999||Integer.parseInt(txtSeed.getText())>=10000){
        JOptionPane.showMessageDialog(rootPane, "La semilla debe Contener 4 digitos");
        }
    }//GEN-LAST:event_btnGenActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Cuadrados_Medios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuadrados_Medios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuadrados_Medios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuadrados_Medios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuadrados_Medios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGen;
    private javax.swing.JButton btnRet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSeed;
    // End of variables declaration//GEN-END:variables
}
