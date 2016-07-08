package proyecto_sev1;
import clases.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
public class codigo_admin extends JFrameConFondo {
    /** Creates new form codigo_admin */
    public codigo_admin() {
        initComponents();
        this.setTitle("ADMINISTRADOR");//codigo para titulo en ventana
        setImagen("Recursos/actualizarInfo.jpg");//codigo para imagen en Panel
        setLocationRelativeTo(null);// para que la ventana este siempre centrada
        Reloj modelo = new Reloj();//codigo para crear objeto de clase Reloj
        modelo.addObserver(new Observer() {
            public void update(Observable unObservable, Object dato) {
                jLbl_reloj.setText("" + dato);//codigo para mostrar reloj
            }
        });
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbl_usuario = new javax.swing.JLabel();
        jLbl_codigo = new javax.swing.JLabel();
        jTxFld_admin = new javax.swing.JTextField();
        jBtn_ir_NewJFrame = new javax.swing.JButton();
        jLbl_mensaje = new javax.swing.JLabel();
        jLbl_reloj = new javax.swing.JLabel();
        jBtn_ir_votantes = new javax.swing.JButton();
        jPasswordFld_codigo = new javax.swing.JPasswordField();
        jLbl_imagenHerramientas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbl_usuario.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_usuario.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_usuario.setText("USUARIO:");
        jLbl_usuario.setName("jLbl_usuario"); // NOI18N

        jLbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_codigo.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_codigo.setText("CONTRASEÑA:");
        jLbl_codigo.setName("jLbl_codigo"); // NOI18N

        jTxFld_admin.setEditable(false);
        jTxFld_admin.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_admin.setForeground(new java.awt.Color(51, 0, 153));
        jTxFld_admin.setText("ADMIN");
        jTxFld_admin.setName("jTxFld_admin"); // NOI18N

        jBtn_ir_NewJFrame.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_NewJFrame.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_ir_NewJFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hg.JPG"))); // NOI18N
        jBtn_ir_NewJFrame.setText("ACEPTAR ");
        jBtn_ir_NewJFrame.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        jBtn_ir_NewJFrame.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBtn_ir_NewJFrame.setName("jBtn_ir_NewJFrame"); // NOI18N
        jBtn_ir_NewJFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_NewJFrameMouseClicked(evt);
            }
        });

        jLbl_mensaje.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_mensaje.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_mensaje.setName("jLbl_mensaje"); // NOI18N

        jLbl_reloj.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_reloj.setForeground(new java.awt.Color(102, 0, 204));
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        jBtn_ir_votantes.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_votantes.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_ir_votantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hvfk.JPG"))); // NOI18N
        jBtn_ir_votantes.setText("   SALIR  ");
        jBtn_ir_votantes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        jBtn_ir_votantes.setName("jBtn_ir_votantes"); // NOI18N
        jBtn_ir_votantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_votantesMouseClicked(evt);
            }
        });

        jPasswordFld_codigo.setFont(new java.awt.Font("Tahoma", 0, 12));
        jPasswordFld_codigo.setForeground(new java.awt.Color(51, 0, 153));
        jPasswordFld_codigo.setName("jPasswordFld_codigo"); // NOI18N

        jLbl_imagenHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/herramienta.jpg"))); // NOI18N
        jLbl_imagenHerramientas.setName("jLbl_imagenHerramientas"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jBtn_ir_votantes)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_NewJFrame)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_codigo)
                            .addComponent(jLbl_usuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFld_codigo)
                            .addComponent(jTxFld_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLbl_imagenHerramientas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtn_ir_NewJFrame, jBtn_ir_votantes});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordFld_codigo, jTxFld_admin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbl_usuario)
                            .addComponent(jTxFld_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbl_codigo)
                            .addComponent(jPasswordFld_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLbl_imagenHerramientas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbl_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_ir_votantes)
                    .addComponent(jBtn_ir_NewJFrame))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtn_ir_NewJFrame, jBtn_ir_votantes});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLbl_mensaje, jLbl_reloj});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordFld_codigo, jTxFld_admin});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jBtn_ir_NewJFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_NewJFrameMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        String contra = jPasswordFld_codigo.getText();//captura el numero de CI
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()) para
            // poder verificar la contraseña ingresada
            archivo = new File("administrador.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null)//guarda el contenido de cada linea de fichero hasta el final y guarda en linea
            {
                if (contra.equals(linea))// para poder verificar que la contraseña ingresada sea correcta
                {
                    editar ir = new editar();// crea objeto para ir a nueva ventana
                    this.setVisible(false);//oculta la ventana actual
                    ir.setVisible(true);//muestra la nueva ventana
                    ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
                } else// cuando contraseña ingresada sea incorrecta
                {
                    jLbl_mensaje.setText("CONTRASEÑA INCORRECTA");//muestra mensaje si la contraseña es incorrecta
                    jPasswordFld_codigo.setText("");//limpia PasswordField para ingresar de nuevo la contraseña
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//GEN-LAST:event_jBtn_ir_NewJFrameMouseClicked

    private void jBtn_ir_votantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_votantesMouseClicked
        try {
            // TODO add your handling code here:
            votantes ir = new votantes(); // crea objeto para ir a nueva ventana
            this.setVisible(false); //oculta la ventana actual
            ir.setVisible(true); // para que la ventana este siempre centrada
            ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada
        } catch (FileNotFoundException ex) {
            Logger.getLogger(codigo_admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(codigo_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtn_ir_votantesMouseClicked
    /**
     * @param args the command line arguments
     */
//   public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                    new codigo_admin().setVisible(true); // clase principal
//
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ir_NewJFrame;
    private javax.swing.JButton jBtn_ir_votantes;
    private javax.swing.JLabel jLbl_codigo;
    private javax.swing.JLabel jLbl_imagenHerramientas;
    private javax.swing.JLabel jLbl_mensaje;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JLabel jLbl_usuario;
    private javax.swing.JPasswordField jPasswordFld_codigo;
    private javax.swing.JTextField jTxFld_admin;
    // End of variables declaration//GEN-END:variables
}