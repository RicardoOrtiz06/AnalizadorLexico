
package analizadorlexico;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfazLexico extends javax.swing.JFrame {

    public InterfazLexico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txtExpresion = new javax.swing.JTextField();
        bmtAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaCoincidencias = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        txtExpresion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtExpresion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpresionActionPerformed(evt);
            }
        });

        bmtAnalizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bmtAnalizar.setText("Analizar");
        bmtAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmtAnalizarActionPerformed(evt);
            }
        });

        txaResultado.setColumns(20);
        txaResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        txaCoincidencias.setColumns(15);
        txaCoincidencias.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txaCoincidencias.setRows(5);
        jScrollPane2.setViewportView(txaCoincidencias);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("COINCIDENCIAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("RESULTADOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Ingrese la expresión");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bmtAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(214, 214, 214))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(bmtAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(panel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bmtAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmtAnalizarActionPerformed

        if (txtExpresion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese una expresion");
        }else{
            Analizar();
        }
        
    }//GEN-LAST:event_bmtAnalizarActionPerformed

    private void txtExpresionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpresionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpresionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bmtAnalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea txaCoincidencias;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables

    public void Analizar(){

        txaCoincidencias.setText("");
        txaResultado.setText("");

        int contNum = 0, contOper = 0, contadorConstantes = 0, contVari = 0, contTokensDes = 0;//contadores de Coincidencias
        
        ArrayList<Token> tokens = Pruebas.lex(txtExpresion.getText());//llamamos a la funcion lex y le asignamos el valor del textfield

        for (Token token : tokens) {
            txaResultado.append("Tipo: " + token.getTipo() + " Valor: " + token.getValorString()+"\n");
            
            switch (token.getTipo()) {
                case NUMERO -> contNum++;
                case OPERADOR -> contOper++;
                case CONSTANTE -> contadorConstantes++;
                case VARIABLE -> contVari++;
                case DESCONOCIDO -> contTokensDes++;
                default -> throw new AssertionError();
            }
        }
    
        txaCoincidencias.append("Numeros: " + contNum + "\n Operadores: " + contOper +"\n Constantes: "+ contadorConstantes + "\n Variables: " + contVari +"\n Tokens desconocidos: "+ contTokensDes);
        
    }

  
}


