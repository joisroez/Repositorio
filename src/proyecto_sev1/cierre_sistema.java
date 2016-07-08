package proyecto_sev1;

import clases.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cierre_sistema extends JFrameConFondo {

    /** Creates new form cierre_sistema */
    public cierre_sistema() throws FileNotFoundException, IOException {
        initComponents();
        this.setTitle("***HORARIO***");//codigo para titulo en ventana
        setImagen("Recursos/actualizarInfo.jpg");//codigo para imagen en Panel
        setLocationRelativeTo(null);// para que la ventana este siempre centrada
        Reloj modelo = new Reloj();//codigo para crear objeto de clase Reloj
        modelo.addObserver(new Observer() {

            public void update(Observable unObservable, Object dato) {
                jLbl_reloj.setText("" + dato);//codigo para mostrar reloj
            }
        });
        mostrar_hora();
        for (int i = 0; i <= 23; i++) {//codigo para añadir hora de 00 hasta 24
            if (i >= 0 && i <= 9) {//añade un cero de 0 hasta 9 para que queden 2 digitos 00 hasta 09
                jCmbBx_hora_apertura.addItem("0" + i);//muestra en jCmbBx_hora_apertura desde 00 hasta 09
            } else {//añade el resto de horas de 10 hasta 23
                jCmbBx_hora_apertura.addItem(i + "");//muestra en jCmbBx_hora_apertura desde 10 hasta 59
            }
        }
        for (int i = 0; i <= 59; i++) {//codigo para añadir hora de 00 hasta 59
            if (i >= 0 && i <= 9) {//añade un cero de 0 hasta 9 para que queden 2 digitos 00 hasta 09
                jCmbBx_minuto_apertura.addItem("0" + i);//muestra en jCmbBx_hora_apertura 00 hasta 09
            } else {//añade el resto de horas de 10 hasta 59
                jCmbBx_minuto_apertura.addItem(i + "");//añade el resto de horas de 10 hasta 59
            }

        }
        for (int i = 0; i <= 23; i++) {//codigo para añadir hora de 00 hasta 24
            if (i >= 0 && i <= 9) {//añade un cero de 0 hasta 9 para que queden 2 digitos 00 hasta 09
                jCmbBx_hora_cierre.addItem("0" + i);//muestra en jCmbBx_hora_cierre desde 00 hasta 09
            } else {//añade el resto de horas de 10 hasta 23
                jCmbBx_hora_cierre.addItem(i + "");//muestra en jCmbBx_hora_cierre desde 10 hasta 59
            }
        }
        for (int i = 0; i <= 59; i++) {//codigo para añadir hora de 00 hasta 59
            if (i >= 0 && i <= 9) {//añade un cero de 0 hasta 9 para que queden 2 digitos 00 hasta 09
                jCmbBx_minuto_cierre.addItem("0" + i);//muestra en jCmbBx_hora_apertura 00 hasta 09
            } else {//añade el resto de horas de 10 hasta 59
                jCmbBx_minuto_cierre.addItem(i + "");//añade el resto de horas de 10 hasta 59
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbl_hora_cierre = new javax.swing.JLabel();
        jLbl_rora_apertura = new javax.swing.JLabel();
        jBtn_aceptar_horario_sistema = new javax.swing.JButton();
        jBtn_ir_editar = new javax.swing.JButton();
        jCmbBx_hora_apertura = new javax.swing.JComboBox();
        jCmbBx_minuto_apertura = new javax.swing.JComboBox();
        jLbl_tiempo_apertura = new javax.swing.JLabel();
        jCmbBx_hora_cierre = new javax.swing.JComboBox();
        jCmbBx_minuto_cierre = new javax.swing.JComboBox();
        jLbl_tiempo_cierre = new javax.swing.JLabel();
        jLbl_reloj = new javax.swing.JLabel();
        jLbl_aperturahoraminuto = new javax.swing.JLabel();
        jLbl_cierrehoraminuto = new javax.swing.JLabel();
        jLbl_imagenCronometro = new javax.swing.JLabel();
        jLbl_Apertura = new javax.swing.JLabel();
        jLbl_Cierre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbl_hora_cierre.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_hora_cierre.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_hora_cierre.setText("HORA CIERRE:");
        jLbl_hora_cierre.setName("jLbl_hora_cierre"); // NOI18N

        jLbl_rora_apertura.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_rora_apertura.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_rora_apertura.setText("HORA APERTURA:");
        jLbl_rora_apertura.setName("jLbl_rora_apertura"); // NOI18N

        jBtn_aceptar_horario_sistema.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_aceptar_horario_sistema.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_aceptar_horario_sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hg.JPG"))); // NOI18N
        jBtn_aceptar_horario_sistema.setText("ACEPTAR ");
        jBtn_aceptar_horario_sistema.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        jBtn_aceptar_horario_sistema.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBtn_aceptar_horario_sistema.setName("jBtn_aceptar_horario_sistema"); // NOI18N
        jBtn_aceptar_horario_sistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_aceptar_horario_sistemaMouseClicked(evt);
            }
        });

        jBtn_ir_editar.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_editar.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_ir_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hvfk.JPG"))); // NOI18N
        jBtn_ir_editar.setText("   ATRAS  ");
        jBtn_ir_editar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        jBtn_ir_editar.setName("jBtn_ir_editar"); // NOI18N
        jBtn_ir_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_editarMouseClicked(evt);
            }
        });

        jCmbBx_hora_apertura.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCmbBx_hora_apertura.setForeground(new java.awt.Color(51, 0, 102));
        jCmbBx_hora_apertura.setName("jCmbBx_hora_apertura"); // NOI18N

        jCmbBx_minuto_apertura.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCmbBx_minuto_apertura.setForeground(new java.awt.Color(51, 0, 102));
        jCmbBx_minuto_apertura.setName("jCmbBx_minuto_apertura"); // NOI18N

        jLbl_tiempo_apertura.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_tiempo_apertura.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_tiempo_apertura.setText("HH                    MM");
        jLbl_tiempo_apertura.setName("jLbl_tiempo_apertura"); // NOI18N

        jCmbBx_hora_cierre.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCmbBx_hora_cierre.setForeground(new java.awt.Color(51, 0, 102));
        jCmbBx_hora_cierre.setName("jCmbBx_hora_cierre"); // NOI18N

        jCmbBx_minuto_cierre.setFont(new java.awt.Font("Tahoma", 1, 12));
        jCmbBx_minuto_cierre.setForeground(new java.awt.Color(51, 0, 102));
        jCmbBx_minuto_cierre.setName("jCmbBx_minuto_cierre"); // NOI18N

        jLbl_tiempo_cierre.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_tiempo_cierre.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_tiempo_cierre.setText("HH                    MM");
        jLbl_tiempo_cierre.setName("jLbl_tiempo_cierre"); // NOI18N

        jLbl_reloj.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_reloj.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        jLbl_aperturahoraminuto.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_aperturahoraminuto.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_aperturahoraminuto.setText(":");
        jLbl_aperturahoraminuto.setName("jLbl_aperturahoraminuto"); // NOI18N

        jLbl_cierrehoraminuto.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_cierrehoraminuto.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_cierrehoraminuto.setText(":");
        jLbl_cierrehoraminuto.setName("jLbl_cierrehoraminuto"); // NOI18N

        jLbl_imagenCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/cronometro.jpg"))); // NOI18N
        jLbl_imagenCronometro.setName("jLbl_imagenCronometro"); // NOI18N

        jLbl_Apertura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbl_Apertura.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_Apertura.setName("jLbl_Apertura"); // NOI18N

        jLbl_Cierre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLbl_Cierre.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_Cierre.setName("jLbl_Cierre"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_rora_apertura)
                    .addComponent(jLbl_hora_cierre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jCmbBx_hora_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLbl_cierrehoraminuto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCmbBx_minuto_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLbl_tiempo_cierre, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jCmbBx_hora_apertura, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLbl_aperturahoraminuto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCmbBx_minuto_apertura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLbl_tiempo_apertura, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(jLbl_imagenCronometro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtn_ir_editar)
                        .addGap(26, 26, 26)
                        .addComponent(jBtn_aceptar_horario_sistema))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLbl_Apertura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbl_Cierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtn_aceptar_horario_sistema, jBtn_ir_editar});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jCmbBx_hora_apertura, jCmbBx_hora_cierre, jCmbBx_minuto_apertura, jCmbBx_minuto_cierre});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbl_tiempo_apertura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCmbBx_hora_apertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_aperturahoraminuto)
                            .addComponent(jCmbBx_minuto_apertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_rora_apertura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLbl_tiempo_cierre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCmbBx_hora_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_cierrehoraminuto)
                            .addComponent(jCmbBx_minuto_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_hora_cierre))
                        .addGap(18, 18, 18))
                    .addComponent(jLbl_imagenCronometro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbl_Apertura, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_Cierre, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_ir_editar)
                    .addComponent(jBtn_aceptar_horario_sistema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtn_aceptar_horario_sistema, jBtn_ir_editar});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCmbBx_hora_apertura, jCmbBx_hora_cierre, jCmbBx_minuto_apertura, jCmbBx_minuto_cierre});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLbl_Apertura, jLbl_Cierre});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrar_hora() throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File("suma_horas.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) //guarda el contenido de cada linea de fichero hasta el final y guarda en linea
        {

            StringTokenizer tok = new StringTokenizer(linea);//metodo para saltar espacios en blanco y tomar el siguiente dato del fichero
            tok.nextToken();
            tok.nextToken();
            tok.nextToken();
            String hora_inicio = tok.nextToken().toString();//guarda codigo de empadronado
            String min_inicio = tok.nextToken().toString();//guarda codigo de empadronado
            String hora_fin = tok.nextToken().toString();//guarda codigo de empadronado
            String min_fin = tok.nextToken().toString();//guarda codigo de empadronado
            jLbl_Apertura.setText("HORA DE INICIO DEL SISTEMA:     " + hora_inicio + ":" + min_inicio);
            jLbl_Cierre.setText("HORA DE CIERRE DEL SISTEMA:    " + hora_fin + ":" + min_fin);
        }
    }

    private void jBtn_aceptar_horario_sistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_aceptar_horario_sistemaMouseClicked
        // TODO add your handling code here:
        String hora = "";
        hora = (String) (jCmbBx_hora_apertura.getSelectedItem());//para asignar en hora lo del combo box
        long horainicio = 0;
        horainicio = Long.parseLong(hora);// para convertir hora a long
        String minuto = "";
        minuto = (String) (jCmbBx_minuto_apertura.getSelectedItem());//para asignar en minuto lo del combo box
        long minutoinicio = 0;
        minutoinicio = Long.parseLong(minuto);// para convertir minuto a long
        String horaf = "";
        horaf = (String) (jCmbBx_hora_cierre.getSelectedItem());//para asignar en horaf lo del combo box
        long horafinal = 0;
        horafinal = Long.parseLong(horaf);// para convertir horaf a long
        String minf = "";
        minf = (String) (jCmbBx_minuto_cierre.getSelectedItem());//para asignar en minf lo del combo box
        long minutofinal = 0;
        minutofinal = Long.parseLong(minf);// para convertir minf a long

        horainicio = horainicio * 3600000;//transformar a milisegundos
        horafinal = horafinal * 3600000;//transformar a milisegundos
        minutoinicio = minutoinicio * 60000;//transformar a milisegundos
        minutofinal = minutofinal * 60000;//transformar a milisegundos
        long sumai = horainicio + minutoinicio;//suma en milisegundos la hora y minutos de inicio
        long sumaf = horafinal + minutofinal;//suma en milisegundos la hora y minutos de fin
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //se habre el fichero para borrar el contenido y poder guardar nueva hora
            FileWriter fstream = new FileWriter("suma_horas.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            for (int k = 0; k <= 0; k++) {
                out.write("");
            }
            out.close();
            //guarda la suma y hora para habilitar el sistema
            File entrada = new File("suma_horas.txt"); //creacion de fichero
            FileWriter fw = new FileWriter(entrada, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("sumainicio_sumafin    " + sumai + "    " + sumaf + "    " + jCmbBx_hora_apertura.getSelectedItem().toString() + "    " + jCmbBx_minuto_apertura.getSelectedItem().toString() + "    " + jCmbBx_hora_cierre.getSelectedItem().toString() + "    " + jCmbBx_minuto_cierre.getSelectedItem().toString());//escritura de la suma de inicio en  fichero
            pw.close();//cierre de fichero
            JOptionPane.showMessageDialog(null, "Los datos han sido guardados", "* * *   EXITO   * * *", 1);//mensaje e aviso al guardar las suma de inicio y fin
            mostrar_hora();
            votantes ir = new votantes();// crea objeto para ir a nueva ventana
            this.setVisible(false);//oculta la ventana actual
            ir.setVisible(true);//muestra la nueva ventana
            ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "* * *   ERROR   * * *", 0);//mensajes cuando ocurre un error al guardar las sumas
        }

    }//GEN-LAST:event_jBtn_aceptar_horario_sistemaMouseClicked

    private void jBtn_ir_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_editarMouseClicked
        // TODO add your handling code here:
        editar ir = new editar();// crea objeto para ir a nueva ventana
        this.setVisible(false);//oculta la ventana actual
        ir.setVisible(true);//muestra la nueva ventana
        ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada

    }//GEN-LAST:event_jBtn_ir_editarMouseClicked
    /**
     * @param args the command line arguments
    //     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new cierre_sistema().setVisible(true); // clase principal
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(cierre_sistema.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(cierre_sistema.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_aceptar_horario_sistema;
    private javax.swing.JButton jBtn_ir_editar;
    private javax.swing.JComboBox jCmbBx_hora_apertura;
    private javax.swing.JComboBox jCmbBx_hora_cierre;
    private javax.swing.JComboBox jCmbBx_minuto_apertura;
    private javax.swing.JComboBox jCmbBx_minuto_cierre;
    private javax.swing.JLabel jLbl_Apertura;
    private javax.swing.JLabel jLbl_Cierre;
    private javax.swing.JLabel jLbl_aperturahoraminuto;
    private javax.swing.JLabel jLbl_cierrehoraminuto;
    private javax.swing.JLabel jLbl_hora_cierre;
    private javax.swing.JLabel jLbl_imagenCronometro;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JLabel jLbl_rora_apertura;
    private javax.swing.JLabel jLbl_tiempo_apertura;
    private javax.swing.JLabel jLbl_tiempo_cierre;
    // End of variables declaration//GEN-END:variables
}