/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.LogicaPlanMinutos;
import Modelo.PlanMinutos;
import javax.swing.JOptionPane;

/**
 *
 * @author ALVARO ANDRES
 */
public class AgregarPlan extends javax.swing.JFrame {

    /**
     * Creates new form AgregarPlan
     */
    public AgregarPlan() {
        initComponents();
        this.setTitle("Agregar Plan Minutos");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAcomulable = new javax.swing.ButtonGroup();
        buttonGroupEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxNombrePlan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonSI = new javax.swing.JRadioButton();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tiempoAlAire = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        valorCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valorVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cantidadMinAlerta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonActivo = new javax.swing.JRadioButton();
        jRadioButtonInactivo = new javax.swing.JRadioButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Plan Minutos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre Plan");

        jComboBoxNombrePlan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxNombrePlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claro", "Movistar", "Tigo-Une", "Virgin Mobile", "Avantel", "Uff", "ETB", "Internacional" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Acomulable");

        buttonGroupAcomulable.add(jRadioButtonSI);
        jRadioButtonSI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonSI.setText("SI");

        buttonGroupAcomulable.add(jRadioButtonNO);
        jRadioButtonNO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonNO.setText("NO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tiempo al aire (Min)");

        tiempoAlAire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Valor Compra");

        valorCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Valor Venta");

        valorVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Cantidad Minima Alerta");

        cantidadMinAlerta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Estado");

        buttonGroupEstado.add(jRadioButtonActivo);
        jRadioButtonActivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonActivo.setText("Activo");

        buttonGroupEstado.add(jRadioButtonInactivo);
        jRadioButtonInactivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonInactivo.setText("Inactivo");

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonGuardar))
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tiempoAlAire)
                    .addComponent(valorCompra)
                    .addComponent(valorVenta)
                    .addComponent(cantidadMinAlerta)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonSI)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonNO))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonInactivo))
                    .addComponent(jComboBoxNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxNombrePlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonSI)
                    .addComponent(jRadioButtonNO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoAlAire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cantidadMinAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonActivo)
                    .addComponent(jRadioButtonInactivo)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Método para cerrar la ventana cuando el usuario ingresa cancelar
       Entrada: Evento del boton
       Salida: vacia
    */
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    /* Método para guardar y almacenar en la base de datos el plan de minutos creado
       Entrada: Evento del boton
       Salida: vacia
    */
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nombrePlan = jComboBoxNombrePlan.getSelectedItem().toString();
        boolean acomulable = jRadioButtonSI.isSelected();
        String tiempoAire = tiempoAlAire.getText();
        String precioCompra = valorCompra.getText();
        String precioVenta = valorVenta.getText();
        String minutoAlerta = cantidadMinAlerta.getText();
        boolean estado = jRadioButtonActivo.isSelected();
        boolean seleccion = false;
        if(acomulable == true || estado == true || acomulable == false || estado == false){
          seleccion = true;  
        }
        
        if(nombrePlan.isEmpty() || tiempoAire.isEmpty() || precioCompra.isEmpty() || precioVenta.isEmpty() || minutoAlerta.isEmpty() || seleccion == false){
            JOptionPane.showMessageDialog(null, "No se puede registrar con campos vacíos");
        }else{
            LogicaPlanMinutos logicaPlanMinutos = new LogicaPlanMinutos();
            try {
                PlanMinutos elPlan = new PlanMinutos();
                elPlan.setNombreplan(nombrePlan);
                elPlan.setMinutosacumulables(acomulable);
                elPlan.setCantidadminutos(Integer.parseInt(tiempoAire));
                elPlan.setCostominuto(Integer.parseInt(precioCompra));
                elPlan.setPreciominuto(Integer.parseInt(precioVenta));
                elPlan.setCantidadminimaminutos(Integer.parseInt(minutoAlerta));
                elPlan.setEstadoplanminutos(estado);
                logicaPlanMinutos.registrarPlanMinutos(elPlan);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, no se pudo registrar");
            } finally{
                this.dispose();
            }
        }
     
    }//GEN-LAST:event_jButtonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAcomulable;
    private javax.swing.ButtonGroup buttonGroupEstado;
    private javax.swing.JTextField cantidadMinAlerta;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxNombrePlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonActivo;
    private javax.swing.JRadioButton jRadioButtonInactivo;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonSI;
    private javax.swing.JTextField tiempoAlAire;
    private javax.swing.JTextField valorCompra;
    private javax.swing.JTextField valorVenta;
    // End of variables declaration//GEN-END:variables
}