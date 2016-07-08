package proyecto_sev1;
import clases.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.*;
public class papeleta_presidente extends JFrameConFondo {
    /** Creates new form papeleta_presidente */
    public papeleta_presidente() throws FileNotFoundException, IOException {
        initComponents();
        setImagen("Recursos/blanco.jpg");//codigo para imagen en Panel
        setLocationRelativeTo(null);// para que la ventana este siempre centrada
        Reloj modelo = new Reloj();//codigo para crear objeto de clase Reloj
        modelo.addObserver(new Observer() {
            public void update(Observable unObservable, Object dato) {
                jLbl_reloj.setText("" + dato);//codigo para mostrar reloj
            }
        });
        // codigo para mostrar los datos de la persona que esta votando
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File("Compararcedula.txt");//abre fichero
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        String linea = "";//inicializa linea para poder leer linea de fichero
        while ((linea = br.readLine()) != null) {//hace la comparacion hasta que exista linea en blanco
            jLbl_CIPersona.setText("" + linea);//muestra la CI de la persona que esta votando
        }
        String cedula1 = (String) jLbl_CIPersona.getText();//guarda la cedula de identidad de la persona que vota
        buscar busempa = new buscar("empa.txt");//llamada a clase buscar
        String datos = busempa.BuscarDatos(cedula1);//llamada a metodo BuscarDatos de clase buscar //verifica que exista la cedula ingresada este fichero
        if (datos.equals("")) {//verifica que exista cedula
            JOptionPane.showMessageDialog(null, "NO ESTA EMPADRONADO", "  ERROR", 0);//mensaje de no existe
        } else {
            StringTokenizer tok = new StringTokenizer(datos,"\t");//codigo para poder leer cada dato de empadronado
            tok.nextToken();//salta al siguiente dato de empadronado
            String codigo = tok.nextToken().toString();//guarda codigo de empadronado
            String nombre = tok.nextToken().toString();//guarda nombre de fichero
            String apellido = tok.nextToken().toString();//guarda apellido de fichero
            jLbl_codigoPersonal.setText(codigo);//muestra codigo de empadronado
            jLbl_nombrePersona.setText( nombre);//muestra nombre de empadronado
            jLbl_apellidoPersona.setText(apellido);//muestra apellido de empadronado
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

        label1 = new java.awt.Label();
        jLbl_titulo_ListaPresidentes = new javax.swing.JLabel();
        jLbl_imagenCorrea = new javax.swing.JLabel();
        jLbl_imagenGutierrez = new javax.swing.JLabel();
        jLbl_imagenMahuad = new javax.swing.JLabel();
        jLbl_imagenRoldos = new javax.swing.JLabel();
        jRBtn_votoCorrea = new javax.swing.JRadioButton();
        jRBtn_votoGutierrez = new javax.swing.JRadioButton();
        jRBtn_votoMahuad = new javax.swing.JRadioButton();
        jRBtn_votoRoldos = new javax.swing.JRadioButton();
        jBtn_ir_papeletaDiputadosAlcaldes = new javax.swing.JButton();
        jLbl_reloj = new javax.swing.JLabel();
        jPnl_datosPersonales = new javax.swing.JPanel();
        jLbl_nombre = new javax.swing.JLabel();
        jLbl_codigoPersonal = new javax.swing.JLabel();
        jLbl_codigo = new javax.swing.JLabel();
        jLbl_nombrePersona = new javax.swing.JLabel();
        jLbl_apellido = new javax.swing.JLabel();
        jLbl_apellidoPersona = new javax.swing.JLabel();
        jLbl_CI = new javax.swing.JLabel();
        jLbl_CIPersona = new javax.swing.JLabel();
        jLbl_imagenescudo = new javax.swing.JLabel();
        jLbl_imagenmapabandera = new javax.swing.JLabel();

        label1.setName("label1"); // NOI18N
        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbl_titulo_ListaPresidentes.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLbl_titulo_ListaPresidentes.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_titulo_ListaPresidentes.setText("LISTA DE PRESIDENTES");
        jLbl_titulo_ListaPresidentes.setName("jLbl_titulo_ListaPresidentes"); // NOI18N

        jLbl_imagenCorrea.setBackground(new java.awt.Color(0, 0, 0));
        jLbl_imagenCorrea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/correa.JPG"))); // NOI18N
        jLbl_imagenCorrea.setName("jLbl_imagenCorrea"); // NOI18N

        jLbl_imagenGutierrez.setBackground(new java.awt.Color(0, 0, 0));
        jLbl_imagenGutierrez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/lucio.JPG"))); // NOI18N
        jLbl_imagenGutierrez.setName("jLbl_imagenGutierrez"); // NOI18N

        jLbl_imagenMahuad.setBackground(new java.awt.Color(0, 0, 0));
        jLbl_imagenMahuad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/jamil.JPG"))); // NOI18N
        jLbl_imagenMahuad.setName("jLbl_imagenMahuad"); // NOI18N

        jLbl_imagenRoldos.setBackground(new java.awt.Color(0, 0, 0));
        jLbl_imagenRoldos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/roldos.JPG"))); // NOI18N
        jLbl_imagenRoldos.setName("jLbl_imagenRoldos"); // NOI18N

        jRBtn_votoCorrea.setFont(new java.awt.Font("Tahoma", 1, 12));
        jRBtn_votoCorrea.setForeground(new java.awt.Color(51, 0, 102));
        jRBtn_votoCorrea.setText("Eco. Rafael Correa");
        jRBtn_votoCorrea.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jRBtn_votoCorrea.setName("jRBtn_votoCorrea"); // NOI18N
        jRBtn_votoCorrea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRBtn_votoCorreaMouseClicked(evt);
            }
        });

        jRBtn_votoGutierrez.setFont(new java.awt.Font("Tahoma", 1, 12));
        jRBtn_votoGutierrez.setForeground(new java.awt.Color(51, 0, 102));
        jRBtn_votoGutierrez.setText("Crnl. Lucio Gutierrez");
        jRBtn_votoGutierrez.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jRBtn_votoGutierrez.setName("jRBtn_votoGutierrez"); // NOI18N
        jRBtn_votoGutierrez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_votoGutierrezActionPerformed(evt);
            }
        });

        jRBtn_votoMahuad.setFont(new java.awt.Font("Tahoma", 1, 12));
        jRBtn_votoMahuad.setForeground(new java.awt.Color(51, 0, 102));
        jRBtn_votoMahuad.setText("Dr. Jamil Mahuad");
        jRBtn_votoMahuad.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jRBtn_votoMahuad.setName("jRBtn_votoMahuad"); // NOI18N

        jRBtn_votoRoldos.setFont(new java.awt.Font("Tahoma", 1, 12));
        jRBtn_votoRoldos.setForeground(new java.awt.Color(51, 0, 102));
        jRBtn_votoRoldos.setText("Ab. Jaime Roldos");
        jRBtn_votoRoldos.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jRBtn_votoRoldos.setName("jRBtn_votoRoldos"); // NOI18N
        jRBtn_votoRoldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBtn_votoRoldosActionPerformed(evt);
            }
        });

        jBtn_ir_papeletaDiputadosAlcaldes.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_papeletaDiputadosAlcaldes.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_ir_papeletaDiputadosAlcaldes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hg.JPG"))); // NOI18N
        jBtn_ir_papeletaDiputadosAlcaldes.setText("ACEPTAR");
        jBtn_ir_papeletaDiputadosAlcaldes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 102)));
        jBtn_ir_papeletaDiputadosAlcaldes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBtn_ir_papeletaDiputadosAlcaldes.setName("jBtn_ir_papeletaDiputadosAlcaldes"); // NOI18N
        jBtn_ir_papeletaDiputadosAlcaldes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_papeletaDiputadosAlcaldesMouseClicked(evt);
            }
        });

        jLbl_reloj.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_reloj.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        jPnl_datosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PERSONALES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_datosPersonales.setName("jPnl_datosPersonales"); // NOI18N

        jLbl_nombre.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_nombre.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_nombre.setText("NOMBRE:");
        jLbl_nombre.setName("jLbl_nombre"); // NOI18N

        jLbl_codigoPersonal.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLbl_codigoPersonal.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_codigoPersonal.setName("jLbl_codigoPersonal"); // NOI18N

        jLbl_codigo.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_codigo.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_codigo.setText("CODIGO:");
        jLbl_codigo.setName("jLbl_codigo"); // NOI18N

        jLbl_nombrePersona.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLbl_nombrePersona.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_nombrePersona.setName("jLbl_nombrePersona"); // NOI18N

        jLbl_apellido.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_apellido.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_apellido.setText("APELLIDO:");
        jLbl_apellido.setName("jLbl_apellido"); // NOI18N

        jLbl_apellidoPersona.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLbl_apellidoPersona.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_apellidoPersona.setName("jLbl_apellidoPersona"); // NOI18N

        jLbl_CI.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_CI.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_CI.setText("C.I.:");
        jLbl_CI.setName("jLbl_CI"); // NOI18N

        jLbl_CIPersona.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLbl_CIPersona.setForeground(new java.awt.Color(153, 0, 0));
        jLbl_CIPersona.setName("jLbl_CIPersona"); // NOI18N

        javax.swing.GroupLayout jPnl_datosPersonalesLayout = new javax.swing.GroupLayout(jPnl_datosPersonales);
        jPnl_datosPersonales.setLayout(jPnl_datosPersonalesLayout);
        jPnl_datosPersonalesLayout.setHorizontalGroup(
            jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_datosPersonalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPnl_datosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLbl_apellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLbl_apellidoPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPnl_datosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_nombre)
                            .addComponent(jLbl_codigo)
                            .addComponent(jLbl_CI))
                        .addGap(18, 18, 18)
                        .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLbl_codigoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLbl_CIPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbl_nombrePersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        jPnl_datosPersonalesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLbl_CIPersona, jLbl_apellidoPersona, jLbl_codigoPersonal, jLbl_nombrePersona});

        jPnl_datosPersonalesLayout.setVerticalGroup(
            jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_datosPersonalesLayout.createSequentialGroup()
                .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_codigo)
                    .addComponent(jLbl_codigoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_CI)
                    .addComponent(jLbl_CIPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_nombre)
                    .addComponent(jLbl_nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnl_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_apellido)
                    .addComponent(jLbl_apellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPnl_datosPersonalesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLbl_CIPersona, jLbl_apellidoPersona, jLbl_codigoPersonal, jLbl_nombrePersona});

        jLbl_imagenescudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ecuador_mwp.gif"))); // NOI18N
        jLbl_imagenescudo.setName("jLbl_imagenescudo"); // NOI18N

        jLbl_imagenmapabandera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ecuador.gif"))); // NOI18N
        jLbl_imagenmapabandera.setName("jLbl_imagenmapabandera"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRBtn_votoCorrea)
                                    .addComponent(jLbl_imagenMahuad)
                                    .addComponent(jRBtn_votoMahuad)
                                    .addComponent(jLbl_imagenCorrea))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_imagenGutierrez)
                            .addComponent(jLbl_imagenRoldos)
                            .addComponent(jRBtn_votoRoldos)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBtn_ir_papeletaDiputadosAlcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRBtn_votoGutierrez))))
                    .addComponent(jLbl_titulo_ListaPresidentes))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLbl_imagenescudo)
                .addGap(38, 38, 38)
                .addComponent(jPnl_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLbl_imagenmapabandera)
                .addGap(26, 26, 26))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLbl_imagenCorrea, jLbl_imagenGutierrez, jLbl_imagenMahuad, jLbl_imagenRoldos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbl_titulo_ListaPresidentes)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnl_datosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLbl_imagenmapabandera))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLbl_imagenescudo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbl_imagenGutierrez)
                        .addGap(18, 18, 18)
                        .addComponent(jRBtn_votoGutierrez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLbl_imagenRoldos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jRBtn_votoRoldos))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbl_imagenCorrea)
                        .addGap(18, 18, 18)
                        .addComponent(jRBtn_votoCorrea)
                        .addGap(35, 35, 35)
                        .addComponent(jLbl_imagenMahuad)
                        .addGap(18, 18, 18)
                        .addComponent(jRBtn_votoMahuad)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_ir_papeletaDiputadosAlcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLbl_imagenCorrea, jLbl_imagenGutierrez, jLbl_imagenMahuad, jLbl_imagenRoldos});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBtn_votoGutierrezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_votoGutierrezActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_votoGutierrezActionPerformed

    private void jRBtn_votoRoldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBtn_votoRoldosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_votoRoldosActionPerformed

    private void jBtn_ir_papeletaDiputadosAlcaldesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_papeletaDiputadosAlcaldesMouseClicked
        JOptionPane.showMessageDialog(null,"CONTINUE CON SU ELECCION\n ***SU VOTO SE HA GUARDADO***");
        if (jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == false) {//condicion para suma votos c1
            FileWriter fwmostarnombres = null;//inicializacion de variable para escribir en fichero
            try {
                File mostarnombres = new File("votos_presidente.txt");//abre fichero
                fwmostarnombres = new FileWriter(mostarnombres, true);
                PrintWriter pmostarnombres = new PrintWriter(fwmostarnombres);
                pmostarnombres.println("C_G_M_R_B_N      1      0      0      0      0      0");//guarda en fichero
                pmostarnombres.close();//cierra fichero
                papeleta_diputados_alcaldes ir = new papeleta_diputados_alcaldes();// crea objeto para ir a nueva ventana
                this.setVisible(false);//oculta la ventana actual
                ir.setVisible(true);//muestra la nueva ventana
                ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
            } catch (IOException ex) {
                Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fwmostarnombres.close();//cierra fichero
                } catch (IOException ex) {
                    Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }        
        if (jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == false) {//condicion para suma votos c2
            FileWriter fwmostarnombres = null;
            try {
                File mostarnombres = new File("votos_presidente.txt");//abre fichero
                fwmostarnombres = new FileWriter(mostarnombres, true);
                PrintWriter pmostarnombres = new PrintWriter(fwmostarnombres);
                pmostarnombres.println("C_G_M_R_B_N       0       1       0       0       0       0");//guarda voto en el fichero
                pmostarnombres.close();
                papeleta_diputados_alcaldes ir = new papeleta_diputados_alcaldes();// crea objeto para ir a nueva ventana
                this.setVisible(false);//oculta la ventana actual
                ir.setVisible(true);//muestra la nueva ventana
                ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
            } catch (IOException ex) {
                Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fwmostarnombres.close();
                } catch (IOException ex) {
                    Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == false) {//condicion para suma votos c3
            FileWriter fwmostarnombres = null;
            try {
                File mostarnombres = new File("votos_presidente.txt");
                fwmostarnombres = new FileWriter(mostarnombres, true);
                PrintWriter pmostarnombres = new PrintWriter(fwmostarnombres);
                pmostarnombres.println("C_G_M_R_B_N       0       0       1       0       0       0");
                pmostarnombres.close();
                papeleta_diputados_alcaldes ir = new papeleta_diputados_alcaldes();// crea objeto para ir a nueva ventana
                this.setVisible(false);//oculta la ventana actual
                ir.setVisible(true);//muestra la nueva ventana
                ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
            } catch (IOException ex) {
                Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fwmostarnombres.close();
                } catch (IOException ex) {
                    Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         if (jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == true) {//condicion para suma votos c4
            FileWriter fwmostarnombres = null;
            try {
                File mostarnombres = new File("votos_presidente.txt");
                fwmostarnombres = new FileWriter(mostarnombres, true);
                PrintWriter pmostarnombres = new PrintWriter(fwmostarnombres);
                pmostarnombres.println("C_G_M_R_B_N       0       0       0       1       0       0");
                pmostarnombres.close();
                papeleta_diputados_alcaldes ir = new papeleta_diputados_alcaldes();// crea objeto para ir a nueva ventana
                this.setVisible(false);//oculta la ventana actual
                ir.setVisible(true);//muestra la nueva ventana
                ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
            } catch (IOException ex) {
                Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fwmostarnombres.close();
                } catch (IOException ex) {
                    Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == false) {//condicion para suma votos en blanco
            FileWriter fwmostarnombres = null;
            try {
                File mostarnombres = new File("votos_presidente.txt");
                fwmostarnombres = new FileWriter(mostarnombres, true);
                PrintWriter pmostarnombres = new PrintWriter(fwmostarnombres);
                pmostarnombres.println("C_G_M_R_B_N       0       0       0       0       1       0");
                pmostarnombres.close();
                papeleta_diputados_alcaldes ir = new papeleta_diputados_alcaldes();// crea objeto para ir a nueva ventana
                this.setVisible(false);//oculta la ventana actual
                ir.setVisible(true);//muestra la nueva ventana
                ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
            } catch (IOException ex) {
                Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fwmostarnombres.close();
                } catch (IOException ex) {
                    Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //validacion para votos nulos
        if ((jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == true)||
              jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == true||
                jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == false||
                jRBtn_votoCorrea.isSelected() == false && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == true||
                jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == true||
                 jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == false||
                 jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == false
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == true||
                 jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == false||
                 jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == false && jRBtn_votoRoldos.isSelected() == true||
                 jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == false||
                 jRBtn_votoCorrea.isSelected() == true && jRBtn_votoGutierrez.isSelected() == true
                && jRBtn_votoMahuad.isSelected() == true && jRBtn_votoRoldos.isSelected() == true) {//condicion para suma votos nulos
            FileWriter fwmostarnombres = null;
            try {
                File mostarnombres = new File("votos_presidente.txt");
                fwmostarnombres = new FileWriter(mostarnombres, true);
                PrintWriter pmostarnombres = new PrintWriter(fwmostarnombres);
                pmostarnombres.println("C_G_M_R_B_N       0       0       0       0       0       1");
                pmostarnombres.close();
                papeleta_diputados_alcaldes ir = new papeleta_diputados_alcaldes();// crea objeto para ir a nueva ventana
                this.setVisible(false);//oculta la ventana actual
                ir.setVisible(true);//muestra la nueva ventana
                ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
            } catch (IOException ex) {
                Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fwmostarnombres.close();
                } catch (IOException ex) {
                    Logger.getLogger(papeleta_presidente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jBtn_ir_papeletaDiputadosAlcaldesMouseClicked

    private void jRBtn_votoCorreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRBtn_votoCorreaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBtn_votoCorreaMouseClicked
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new papeleta_presidente().setVisible(true); // clase principal
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(ImprimeCertificadoVotos.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IOException ex) {
//                    Logger.getLogger(ImprimeCertificadoVotos.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ir_papeletaDiputadosAlcaldes;
    private javax.swing.JLabel jLbl_CI;
    private javax.swing.JLabel jLbl_CIPersona;
    private javax.swing.JLabel jLbl_apellido;
    private javax.swing.JLabel jLbl_apellidoPersona;
    private javax.swing.JLabel jLbl_codigo;
    private javax.swing.JLabel jLbl_codigoPersonal;
    private javax.swing.JLabel jLbl_imagenCorrea;
    private javax.swing.JLabel jLbl_imagenGutierrez;
    private javax.swing.JLabel jLbl_imagenMahuad;
    private javax.swing.JLabel jLbl_imagenRoldos;
    private javax.swing.JLabel jLbl_imagenescudo;
    private javax.swing.JLabel jLbl_imagenmapabandera;
    private javax.swing.JLabel jLbl_nombre;
    private javax.swing.JLabel jLbl_nombrePersona;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JLabel jLbl_titulo_ListaPresidentes;
    private javax.swing.JPanel jPnl_datosPersonales;
    private javax.swing.JRadioButton jRBtn_votoCorrea;
    private javax.swing.JRadioButton jRBtn_votoGutierrez;
    private javax.swing.JRadioButton jRBtn_votoMahuad;
    private javax.swing.JRadioButton jRBtn_votoRoldos;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
