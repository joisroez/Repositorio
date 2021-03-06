package proyecto_sev1;
import clases.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.*;
import java.awt.event.*; 
public class editar extends JFrameConFondo {
    /** Creates new form editar */
    public editar() {
        initComponents();
        setImagen("Recursos/bandera.jpg");//codigo para imagen en Panel
        setLocationRelativeTo(null);// para que la ventana este siempre centrada
        Reloj modelo=new Reloj();//codigo para crear objeto de clase Reloj
                modelo.addObserver (new Observer()
                 {
                     public void update (Observable unObservable, Object dato)
                     {
                         jLbl_reloj.setText(""+dato);//codigo para mostrar reloj
                     }
                 });
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editorvent.MouseEvent evt) {                                      
        // TODO add your handling code here:
       .
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbl_titulo_MENÚ = new javax.swing.JLabel();
        jBtn_ir_empadronar = new javax.swing.JButton();
        jBtn_ir_resultados = new javax.swing.JButton();
        jBtn_ir_NewJFrame = new javax.swing.JButton();
        jBtn_ir_cierresistema = new javax.swing.JButton();
        jBtn_ir_listavotantes = new javax.swing.JButton();
        jLbl_reloj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLbl_titulo_MENÚ.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLbl_titulo_MENÚ.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_titulo_MENÚ.setText("MENÚ");
        jLbl_titulo_MENÚ.setName("jLbl_titulo_MENÚ"); // NOI18N

        jBtn_ir_empadronar.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_empadronar.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_empadronar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ico_empa.jpg"))); // NOI18N
        jBtn_ir_empadronar.setText("             EMPADRONAR             ");
        jBtn_ir_empadronar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_empadronar.setName("jBtn_ir_empadronar"); // NOI18N
        jBtn_ir_empadronar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_empadronarMouseClicked(evt);
            }
        });

        jBtn_ir_resultados.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_resultados.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ico_resultados.jpg"))); // NOI18N
        jBtn_ir_resultados.setText("             RESULTADOS             ");
        jBtn_ir_resultados.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_resultados.setName("jBtn_ir_resultados"); // NOI18N
        jBtn_ir_resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_resultadosMouseClicked(evt);
            }
        });

        jBtn_ir_NewJFrame.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_NewJFrame.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_NewJFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ico_salir.jpg"))); // NOI18N
        jBtn_ir_NewJFrame.setText("                 SALIR                    ");
        jBtn_ir_NewJFrame.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_NewJFrame.setName("jBtn_ir_NewJFrame"); // NOI18N
        jBtn_ir_NewJFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_NewJFrameMouseClicked(evt);
            }
        });

        jBtn_ir_cierresistema.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_cierresistema.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_cierresistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ico_hora.jpg"))); // NOI18N
        jBtn_ir_cierresistema.setText("        APERTURA / CIERRE        ");
        jBtn_ir_cierresistema.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_cierresistema.setName("jBtn_ir_cierresistema"); // NOI18N
        jBtn_ir_cierresistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_cierresistemaMouseClicked(evt);
            }
        });

        jBtn_ir_listavotantes.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_listavotantes.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_listavotantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ico_buscar.jpg"))); // NOI18N
        jBtn_ir_listavotantes.setText("BUSCAR / EDITAR (VOTANTES)");
        jBtn_ir_listavotantes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_listavotantes.setName("jBtn_ir_listavotantes"); // NOI18N
        jBtn_ir_listavotantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_listavotantesMouseClicked(evt);
            }
        });
        jBtn_ir_listavotantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ir_listavotantesActionPerformed(evt);
            }
        });

        jLbl_reloj.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_reloj.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBtn_ir_empadronar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtn_ir_cierresistema))
                            .addComponent(jBtn_ir_listavotantes)
                            .addComponent(jBtn_ir_resultados, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jBtn_ir_NewJFrame)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLbl_titulo_MENÚ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtn_ir_NewJFrame, jBtn_ir_cierresistema, jBtn_ir_empadronar, jBtn_ir_listavotantes, jBtn_ir_resultados});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_titulo_MENÚ)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_listavotantes)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_cierresistema)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_empadronar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtn_ir_resultados)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_NewJFrame)
                .addGap(18, 18, 18)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtn_ir_NewJFrame, jBtn_ir_cierresistema, jBtn_ir_empadronar, jBtn_ir_listavotantes, jBtn_ir_resultados});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_ir_NewJFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_NewJFrameMouseClicked
        // TODO add your handling code here:
        NewJFrame ir = new  NewJFrame();// crea objeto para ir a nueva ventana
        this.setVisible(false);//oculta la ventana actual
        ir.setVisible(true);//muestra la nueva ventana
        ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
    }//GEN-LAST:event_jBtn_ir_NewJFrameMouseClicked

    private void jBtn_ir_listavotantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ir_listavotantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ir_listavotantesActionPerformed

    private void jBtn_ir_empadronarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_empadronarMouseClicked
        try {
            // TODO add your handling code here:
            empadronar ir = new empadronar(); // crea objeto para ir a nueva ventana
            this.setVisible(false); //oculta la ventana actual
            ir.setVisible(true); // para que la ventana este siempre centrada
            ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada
        } catch (FileNotFoundException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtn_ir_empadronarMouseClicked

    private void jBtn_ir_listavotantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_listavotantesMouseClicked
        // TODO add your handling code here:
        lista_votantes ir = new lista_votantes();// crea objeto para ir a nueva ventana
        this.setVisible(false);//oculta la ventana actual
        ir.setVisible(true);//muestra la nueva ventana
        ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
    }//GEN-LAST:event_jBtn_ir_listavotantesMouseClicked

    private void jBtn_ir_resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_resultadosMouseClicked
        
            resultados ir = new resultados(); // crea objeto para ir a nueva ventana
            this.setVisible(false); //oculta la ventana actual
            ir.setVisible(true); // para que la ventana este siempre centrada
            ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada



        
    }//GEN-LAST:event_jBtn_ir_resultadosMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formMouseClicked

    private void jBtn_ir_cierresistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_cierresistemaMouseClicked
        try {
            // TODO add your handling code here:
            cierre_sistema ir = new cierre_sistema(); // crea objeto para ir a nueva ventana
            this.setVisible(false); //oculta la ventana actual
            ir.setVisible(true); // para que la ventana este siempre centrada
            ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada
        } catch (FileNotFoundException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(editar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBtn_ir_cierresistemaMouseClicked

    /**
    * @param args the command line arguments
    */
//     public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                    new editar().setVisible(true); // clase principal
//
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ir_NewJFrame;
    private javax.swing.JButton jBtn_ir_cierresistema;
    private javax.swing.JButton jBtn_ir_empadronar;
    private javax.swing.JButton jBtn_ir_listavotantes;
    private javax.swing.JButton jBtn_ir_resultados;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JLabel jLbl_titulo_MENÚ;
    // End of variables declaration//GEN-END:variables

}
