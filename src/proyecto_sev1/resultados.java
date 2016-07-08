package proyecto_sev1;

import clases.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class resultados extends JFrameConFondo {

    /** Creates new form resultados */
    public resultados() {
        try {
            initComponents();
            setImagen("Recursos/bandera.jpg");//para que la ventana tenga un imagen
            setLocationRelativeTo(null); // para que la ventana este siempre centrada
            Reloj modelo = new Reloj();//codigo para crear objeto de clase Reloj
            modelo.addObserver(new Observer() {

                public void update(Observable unObservable, Object dato) {
                    jLbl_reloj.setText("" + dato);//codigo para mostrar reloj
                }
            });
            File archivo1 = null;
            FileReader fr1 = null;
            BufferedReader br1 = null;
            archivo1 = new File("votos_presidente.txt");
            fr1 = new FileReader(archivo1);
            br1 = new BufferedReader(fr1);
            // Lectura del fichero
            String lineac = "";
            //inicializamos las variables para poder mostrar resultados de votos
            //de presidente
            int sumac = 0, sumal = 0, sumaj = 0, sumar = 0, sumab = 0, suman = 0;
            while ((lineac = br1.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(lineac);
                tok.nextToken();
                int c = Integer.parseInt(tok.nextToken().toString());
                int l = Integer.parseInt(tok.nextToken().toString());
                int j = Integer.parseInt(tok.nextToken().toString());
                int r = Integer.parseInt(tok.nextToken().toString());
                int b = Integer.parseInt(tok.nextToken().toString());
                int n = Integer.parseInt(tok.nextToken().toString());
                sumac = sumac + c;//asigna la suma de votos de cada candidato
                sumal = sumal + l;//asigna la suma de votos de cada candidato
                sumaj = sumaj + j;//asigna la suma de votos de cada candidato
                sumar = sumar + r;//asigna la suma de votos de cada candidato
                sumab = sumab + b;//asigna la suma de votos de cada candidato
                suman = suman + n;//asigna la suma de votos de cada candidato
                int sumat = sumac + sumal + sumaj + sumar + sumab + suman;//asigna la suma total de votos
                jTxFld_votosCorrea.setText("" + sumac);//muestra la suma de votos
                jTxFld_votosGutierrez.setText("" + sumal);//muestra la suma de votos
                jTxFld_votosMahuad.setText("" + sumaj);//muestra la suma de votos
                jTxFld_votosRoldos.setText("" + sumar);//muestra la suma de votos
                jTxFld_votosBlancos.setText("" + sumab);//muestra la suma de votos
                jTxFld_votosNulos.setText("" + suman);//muestra la suma de votos
                jTxFld_votosTotales.setText("" + sumat);//muestra la suma de votos
            }           
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //verifica si hay voto mayor presidente retorna true si existe
    public boolean votomayor() {
        int vm = 0;
        int vc = Integer.parseInt(jTxFld_votosCorrea.getText().toString());
        int vl = Integer.parseInt(jTxFld_votosGutierrez.getText().toString());
        int vj = Integer.parseInt(jTxFld_votosMahuad.getText().toString());
        int vr = Integer.parseInt(jTxFld_votosRoldos.getText().toString());
        if (vc > vl && vc > vj && vc > vr||vl > vc && vl > vj && vl > vr||vj > vc && vj > vl && vj > vr||vr > vc && vr > vl && vr > vj)
            {
               return true;
            }
            else
            {return false;
            }
    }
    //verifica si hay voto mayor presidente retorna el mayor
    public int votomayor1() {
        int vm = 0;
        int vc = Integer.parseInt(jTxFld_votosCorrea.getText().toString());
        int vl = Integer.parseInt(jTxFld_votosGutierrez.getText().toString());
        int vj = Integer.parseInt(jTxFld_votosMahuad.getText().toString());
        int vr = Integer.parseInt(jTxFld_votosRoldos.getText().toString());
        if (vc > vl && vc > vj && vc > vr) {
            vm = vc;
        }
        if (vl > vc && vl > vj && vl > vr) {
            vm = vl;
        }
        if (vj > vc && vj > vl && vj > vr) {
            vm = vj;
        }
        if (vr > vc && vr > vl && vr > vj) {
            vm = vc;
        }
        return vm;
    }
    //compara e indica cual candidato es el ganador presidente
    public int votomayor2() {
        int i = 0;
        int vc = Integer.parseInt(jTxFld_votosCorrea.getText().toString());
        int vl = Integer.parseInt(jTxFld_votosGutierrez.getText().toString());
        int vj = Integer.parseInt(jTxFld_votosMahuad.getText().toString());
        int vr = Integer.parseInt(jTxFld_votosRoldos.getText().toString());
        if (vc > vl && vc > vj && vc > vr) {
            i = 1;
        }
        if (vl > vc && vl > vj && vl > vr) {
            i = 2;
        }
        if (vj > vc && vj > vl && vj > vr) {
            i = 3;
        }
        if (vr > vc && vr > vl && vr > vj) {
            i = 4;
        }
        return i;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbl_titulo_ResultadosElectorales = new javax.swing.JLabel();
        jPnl_presidentes = new javax.swing.JPanel();
        jLbl_imagenCorrea = new javax.swing.JLabel();
        jLbl_imagenGutierrez = new javax.swing.JLabel();
        jLbl_imagenMahuad = new javax.swing.JLabel();
        jLbl_imagenRoldos = new javax.swing.JLabel();
        jLbl_Correa = new javax.swing.JLabel();
        jLbl_Gutierrez = new javax.swing.JLabel();
        jLbl_Mahuad = new javax.swing.JLabel();
        jLbl_Roldos = new javax.swing.JLabel();
        jPnl_votosCorrea = new javax.swing.JPanel();
        jTxFld_votosCorrea = new javax.swing.JTextField();
        jPnl_votosGutierrez = new javax.swing.JPanel();
        jTxFld_votosGutierrez = new javax.swing.JTextField();
        jPnl_votosMahuad = new javax.swing.JPanel();
        jTxFld_votosMahuad = new javax.swing.JTextField();
        jPnl_votosRoldos = new javax.swing.JPanel();
        jTxFld_votosRoldos = new javax.swing.JTextField();
        jBtn_ir_msnCandidatoGanador = new javax.swing.JButton();
        jBtn_ir_editar = new javax.swing.JButton();
        jLbl_reloj = new javax.swing.JLabel();
        jTxFld_votosBlancos = new javax.swing.JTextField();
        jTxFld_votosNulos = new javax.swing.JTextField();
        jLbl_votosBlancos = new javax.swing.JLabel();
        jLbl_votosNulos = new javax.swing.JLabel();
        jTxFld_votosTotales = new javax.swing.JTextField();
        jLbl_votosTotales = new javax.swing.JLabel();
        jLbl_votos = new javax.swing.JLabel();
        jBtn_ir_DiputadosAlcaldes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbl_titulo_ResultadosElectorales.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLbl_titulo_ResultadosElectorales.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_titulo_ResultadosElectorales.setText("RESULTADOS ELECTORALES");
        jLbl_titulo_ResultadosElectorales.setName("jLbl_titulo_ResultadosElectorales"); // NOI18N

        jPnl_presidentes.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_presidentes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRESIDENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 102))); // NOI18N
        jPnl_presidentes.setName("jPnl_presidentes"); // NOI18N

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

        jLbl_Correa.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_Correa.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_Correa.setText("Eco. Rafael Correa");
        jLbl_Correa.setName("jLbl_Correa"); // NOI18N

        jLbl_Gutierrez.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_Gutierrez.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_Gutierrez.setText("Crnl. Lucio Gutierrez");
        jLbl_Gutierrez.setName("jLbl_Gutierrez"); // NOI18N

        jLbl_Mahuad.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_Mahuad.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_Mahuad.setText("Dr. Jamil Mahuad");
        jLbl_Mahuad.setName("jLbl_Mahuad"); // NOI18N

        jLbl_Roldos.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_Roldos.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_Roldos.setText("Ab. Jaime Roldos");
        jLbl_Roldos.setName("jLbl_Roldos"); // NOI18N

        jPnl_votosCorrea.setName("jPnl_votosCorrea"); // NOI18N

        jTxFld_votosCorrea.setEditable(false);
        jTxFld_votosCorrea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTxFld_votosCorrea.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_votosCorrea.setName("jTxFld_votosCorrea"); // NOI18N

        javax.swing.GroupLayout jPnl_votosCorreaLayout = new javax.swing.GroupLayout(jPnl_votosCorrea);
        jPnl_votosCorrea.setLayout(jPnl_votosCorreaLayout);
        jPnl_votosCorreaLayout.setHorizontalGroup(
            jPnl_votosCorreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_votosCorreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosCorrea, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnl_votosCorreaLayout.setVerticalGroup(
            jPnl_votosCorreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_votosCorreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosCorrea, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnl_votosGutierrez.setName("jPnl_votosGutierrez"); // NOI18N

        jTxFld_votosGutierrez.setEditable(false);
        jTxFld_votosGutierrez.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTxFld_votosGutierrez.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_votosGutierrez.setName("jTxFld_votosGutierrez"); // NOI18N

        javax.swing.GroupLayout jPnl_votosGutierrezLayout = new javax.swing.GroupLayout(jPnl_votosGutierrez);
        jPnl_votosGutierrez.setLayout(jPnl_votosGutierrezLayout);
        jPnl_votosGutierrezLayout.setHorizontalGroup(
            jPnl_votosGutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_votosGutierrezLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosGutierrez, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnl_votosGutierrezLayout.setVerticalGroup(
            jPnl_votosGutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_votosGutierrezLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosGutierrez, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnl_votosMahuad.setName("jPnl_votosMahuad"); // NOI18N

        jTxFld_votosMahuad.setEditable(false);
        jTxFld_votosMahuad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTxFld_votosMahuad.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_votosMahuad.setName("jTxFld_votosMahuad"); // NOI18N

        javax.swing.GroupLayout jPnl_votosMahuadLayout = new javax.swing.GroupLayout(jPnl_votosMahuad);
        jPnl_votosMahuad.setLayout(jPnl_votosMahuadLayout);
        jPnl_votosMahuadLayout.setHorizontalGroup(
            jPnl_votosMahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_votosMahuadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosMahuad, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnl_votosMahuadLayout.setVerticalGroup(
            jPnl_votosMahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_votosMahuadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosMahuad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPnl_votosRoldos.setName("jPnl_votosRoldos"); // NOI18N

        jTxFld_votosRoldos.setEditable(false);
        jTxFld_votosRoldos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTxFld_votosRoldos.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_votosRoldos.setName("jTxFld_votosRoldos"); // NOI18N

        javax.swing.GroupLayout jPnl_votosRoldosLayout = new javax.swing.GroupLayout(jPnl_votosRoldos);
        jPnl_votosRoldos.setLayout(jPnl_votosRoldosLayout);
        jPnl_votosRoldosLayout.setHorizontalGroup(
            jPnl_votosRoldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_votosRoldosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosRoldos, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPnl_votosRoldosLayout.setVerticalGroup(
            jPnl_votosRoldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_votosRoldosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxFld_votosRoldos, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPnl_presidentesLayout = new javax.swing.GroupLayout(jPnl_presidentes);
        jPnl_presidentes.setLayout(jPnl_presidentesLayout);
        jPnl_presidentesLayout.setHorizontalGroup(
            jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_presidentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_imagenCorrea)
                    .addComponent(jLbl_Correa))
                .addGap(18, 18, 18)
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_Gutierrez)
                    .addComponent(jLbl_imagenGutierrez))
                .addGap(18, 18, 18)
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_Mahuad)
                    .addComponent(jLbl_imagenMahuad))
                .addGap(18, 18, 18)
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_Roldos)
                    .addComponent(jLbl_imagenRoldos)))
            .addGroup(jPnl_presidentesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPnl_votosCorrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jPnl_votosGutierrez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jPnl_votosMahuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jPnl_votosRoldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jPnl_presidentesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLbl_imagenCorrea, jLbl_imagenGutierrez, jLbl_imagenMahuad, jLbl_imagenRoldos});

        jPnl_presidentesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLbl_Correa, jLbl_Gutierrez, jLbl_Mahuad, jLbl_Roldos});

        jPnl_presidentesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPnl_votosCorrea, jPnl_votosGutierrez, jPnl_votosMahuad, jPnl_votosRoldos});

        jPnl_presidentesLayout.setVerticalGroup(
            jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_presidentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_imagenCorrea)
                    .addComponent(jLbl_imagenGutierrez)
                    .addComponent(jLbl_imagenMahuad)
                    .addComponent(jLbl_imagenRoldos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbl_Correa)
                    .addComponent(jLbl_Gutierrez)
                    .addComponent(jLbl_Mahuad)
                    .addComponent(jLbl_Roldos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnl_presidentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnl_votosCorrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnl_votosRoldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnl_votosMahuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnl_votosGutierrez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPnl_presidentesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLbl_imagenCorrea, jLbl_imagenGutierrez, jLbl_imagenMahuad, jLbl_imagenRoldos});

        jPnl_presidentesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLbl_Correa, jLbl_Gutierrez, jLbl_Mahuad, jLbl_Roldos});

        jPnl_presidentesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPnl_votosCorrea, jPnl_votosGutierrez, jPnl_votosMahuad, jPnl_votosRoldos});

        jBtn_ir_msnCandidatoGanador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_ir_msnCandidatoGanador.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_msnCandidatoGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/msn.jpg"))); // NOI18N
        jBtn_ir_msnCandidatoGanador.setText("CANDIDATO GANADOR  ");
        jBtn_ir_msnCandidatoGanador.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_msnCandidatoGanador.setName("jBtn_ir_msnCandidatoGanador"); // NOI18N
        jBtn_ir_msnCandidatoGanador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_msnCandidatoGanadorMouseClicked(evt);
            }
        });
        jBtn_ir_msnCandidatoGanador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ir_msnCandidatoGanadorActionPerformed(evt);
            }
        });

        jBtn_ir_editar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_ir_editar.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/ico_salir.jpg"))); // NOI18N
        jBtn_ir_editar.setText("           SALIR                ");
        jBtn_ir_editar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_editar.setName("jBtn_ir_editar"); // NOI18N
        jBtn_ir_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_editarMouseClicked(evt);
            }
        });

        jLbl_reloj.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_reloj.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        jTxFld_votosBlancos.setEditable(false);
        jTxFld_votosBlancos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTxFld_votosBlancos.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_votosBlancos.setName("jTxFld_votosBlancos"); // NOI18N
        jTxFld_votosBlancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxFld_votosBlancosActionPerformed(evt);
            }
        });

        jTxFld_votosNulos.setEditable(false);
        jTxFld_votosNulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTxFld_votosNulos.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_votosNulos.setName("jTxFld_votosNulos"); // NOI18N

        jLbl_votosBlancos.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_votosBlancos.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_votosBlancos.setText("BLANCOS");
        jLbl_votosBlancos.setName("jLbl_votosBlancos"); // NOI18N

        jLbl_votosNulos.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_votosNulos.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_votosNulos.setText("NULOS");
        jLbl_votosNulos.setName("jLbl_votosNulos"); // NOI18N

        jTxFld_votosTotales.setEditable(false);
        jTxFld_votosTotales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTxFld_votosTotales.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_votosTotales.setName("jTxFld_votosTotales"); // NOI18N

        jLbl_votosTotales.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_votosTotales.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_votosTotales.setText("TOTALES");
        jLbl_votosTotales.setName("jLbl_votosTotales"); // NOI18N

        jLbl_votos.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLbl_votos.setForeground(new java.awt.Color(102, 0, 102));
        jLbl_votos.setText("VOTOS:");
        jLbl_votos.setName("jLbl_votos"); // NOI18N

        jBtn_ir_DiputadosAlcaldes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_ir_DiputadosAlcaldes.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_ir_DiputadosAlcaldes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/listo.jpg"))); // NOI18N
        jBtn_ir_DiputadosAlcaldes.setText("DIPUTADOS/ALCALDES ");
        jBtn_ir_DiputadosAlcaldes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_ir_DiputadosAlcaldes.setName("jBtn_ir_DiputadosAlcaldes"); // NOI18N
        jBtn_ir_DiputadosAlcaldes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_DiputadosAlcaldesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtn_ir_msnCandidatoGanador)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_DiputadosAlcaldes)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_votosBlancos)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxFld_votosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxFld_votosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_votosNulos))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbl_votosTotales, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxFld_votosTotales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPnl_presidentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLbl_votos)
                .addContainerGap(509, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLbl_titulo_ResultadosElectorales)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(189, 189, 189))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtn_ir_DiputadosAlcaldes, jBtn_ir_editar, jBtn_ir_msnCandidatoGanador});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTxFld_votosBlancos, jTxFld_votosNulos, jTxFld_votosTotales});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLbl_titulo_ResultadosElectorales)
                .addGap(18, 18, 18)
                .addComponent(jPnl_presidentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLbl_votos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_votosNulos)
                    .addComponent(jLbl_votosBlancos)
                    .addComponent(jLbl_votosTotales))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxFld_votosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxFld_votosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxFld_votosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_ir_msnCandidatoGanador)
                    .addComponent(jBtn_ir_DiputadosAlcaldes)
                    .addComponent(jBtn_ir_editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtn_ir_DiputadosAlcaldes, jBtn_ir_editar, jBtn_ir_msnCandidatoGanador});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTxFld_votosBlancos, jTxFld_votosNulos, jTxFld_votosTotales});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //metodo para validar votos empates presidente
    private void validar_votos_empates() {
        int vcorrea = Integer.parseInt(jTxFld_votosCorrea.getText());
        int vgutierrez = Integer.parseInt(jTxFld_votosGutierrez.getText());
        int vmahuad = Integer.parseInt(jTxFld_votosMahuad.getText());
        int vroldos = Integer.parseInt(jTxFld_votosRoldos.getText());
        if ((vmahuad == vroldos || vgutierrez == vroldos || vgutierrez == vmahuad || vcorrea == vroldos || vcorrea == vmahuad || vcorrea == vgutierrez)
                || (vgutierrez == vmahuad && vmahuad == vroldos)
                || (vcorrea == vgutierrez && vgutierrez == vmahuad)
                || (vmahuad == vroldos && vmahuad == vcorrea)
                || (vcorrea == vgutierrez && vcorrea == vroldos)
                || (vcorrea == vgutierrez && vcorrea == vmahuad && vcorrea == vroldos)) {
            JOptionPane.showMessageDialog(null, "NO EXISTE CANDIDATO GANADOR", "*****EMPATE*****", 1);
        }


    }

    private void jBtn_ir_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_editarMouseClicked
        // TODO add your handling code here:
        editar ir = new editar();// crea objeto para ir a nueva ventana
        this.setVisible(false);//oculta la ventana actual
        ir.setVisible(true);//muestra la nueva ventana
        ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
    }//GEN-LAST:event_jBtn_ir_editarMouseClicked

    private void jBtn_ir_msnCandidatoGanadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_msnCandidatoGanadorMouseClicked
        //codigo ganador para presidente
        //verifica que no nexista votos para mostar mensaje de error
        if (jTxFld_votosCorrea.getText().equals("") && jTxFld_votosGutierrez.getText().equals("") && jTxFld_votosMahuad.getText().equals("") && jTxFld_votosRoldos.getText().equals("") && jTxFld_votosNulos.getText().equals("") && jTxFld_votosBlancos.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "   NO EXISTEN VOTOS  ", " * * *   ERROR   * * *", 0);
        }
        //caso contrario verifica si hay ganador o empate
        else
        {
            boolean verificar =votomayor();//llamada al metodo para que retorne true si hay voto mayor
            if (verificar==true) {//si es true
                int mayorpuntaje = votomayor1();//llamada al metodo para indique el resultado mayor
                int ganador=votomayor2();// llamada al metodo para que indique cual es el nombre de ganador
                 //muestra el candidato ganador
                if(ganador==1)
                {
                     JOptionPane.showMessageDialog(null, "Ec. RAFAEL CORREA    " + (mayorpuntaje+Integer.parseInt(jTxFld_votosBlancos.getText().toString()))+ "   votos", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==2)
                {
                    JOptionPane.showMessageDialog(null, "Crnl. LUCIO GUTIERREZ    " + (mayorpuntaje+Integer.parseInt(jTxFld_votosBlancos.getText().toString()))+ "   votos", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==3)
                {
                    JOptionPane.showMessageDialog(null, "Dr. JAMIL MAHUAD    " + (mayorpuntaje+Integer.parseInt(jTxFld_votosBlancos.getText().toString()))+ "   votos", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==4)
                {
                     JOptionPane.showMessageDialog(null, "Ab.JAIME ROLDOS    " + (mayorpuntaje+Integer.parseInt(jTxFld_votosBlancos.getText().toString()))+ "   votos", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
            }
            //caso contrario false
            else {
                int c = Integer.parseInt(jTxFld_votosCorrea.getText());
                int l = Integer.parseInt(jTxFld_votosGutierrez.getText());
                int j = Integer.parseInt(jTxFld_votosMahuad.getText());
                int r = Integer.parseInt(jTxFld_votosRoldos.getText());
                int n = Integer.parseInt(jTxFld_votosNulos.getText());
                int b = Integer.parseInt(jTxFld_votosBlancos.getText());
                 //verifica empates
                if ((c == l && c == j && c == r) || (l == c && c == j) || (r == l && l == c) || (l == c) || (j == j && j == c) || (j == c) || (r == c) || (r == j && j == l) || (j == l) || (r == l) || (r == j)) {
                    validar_votos_empates();// llamada al metodo para indicar empate
                }
            }
        }
    }//GEN-LAST:event_jBtn_ir_msnCandidatoGanadorMouseClicked

    private void jBtn_ir_msnCandidatoGanadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ir_msnCandidatoGanadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ir_msnCandidatoGanadorActionPerformed

    private void jTxFld_votosBlancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxFld_votosBlancosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxFld_votosBlancosActionPerformed

    private void jBtn_ir_DiputadosAlcaldesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_DiputadosAlcaldesMouseClicked

        diputados_alcaldes ir = new diputados_alcaldes(); // crea objeto para ir a nueva ventana
        this.setVisible(false); //oculta la ventana actual
        ir.setVisible(true); // para que la ventana este siempre centrada
        ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada

    }//GEN-LAST:event_jBtn_ir_DiputadosAlcaldesMouseClicked
    /**
     * @param args the command line arguments
     */
//     public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                    new resultados().setVisible(true); // clase principal
//
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ir_DiputadosAlcaldes;
    private javax.swing.JButton jBtn_ir_editar;
    private javax.swing.JButton jBtn_ir_msnCandidatoGanador;
    private javax.swing.JLabel jLbl_Correa;
    private javax.swing.JLabel jLbl_Gutierrez;
    private javax.swing.JLabel jLbl_Mahuad;
    private javax.swing.JLabel jLbl_Roldos;
    private javax.swing.JLabel jLbl_imagenCorrea;
    private javax.swing.JLabel jLbl_imagenGutierrez;
    private javax.swing.JLabel jLbl_imagenMahuad;
    private javax.swing.JLabel jLbl_imagenRoldos;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JLabel jLbl_titulo_ResultadosElectorales;
    private javax.swing.JLabel jLbl_votos;
    private javax.swing.JLabel jLbl_votosBlancos;
    private javax.swing.JLabel jLbl_votosNulos;
    private javax.swing.JLabel jLbl_votosTotales;
    private javax.swing.JPanel jPnl_presidentes;
    private javax.swing.JPanel jPnl_votosCorrea;
    private javax.swing.JPanel jPnl_votosGutierrez;
    private javax.swing.JPanel jPnl_votosMahuad;
    private javax.swing.JPanel jPnl_votosRoldos;
    private javax.swing.JTextField jTxFld_votosBlancos;
    private javax.swing.JTextField jTxFld_votosCorrea;
    private javax.swing.JTextField jTxFld_votosGutierrez;
    private javax.swing.JTextField jTxFld_votosMahuad;
    private javax.swing.JTextField jTxFld_votosNulos;
    private javax.swing.JTextField jTxFld_votosRoldos;
    private javax.swing.JTextField jTxFld_votosTotales;
    // End of variables declaration//GEN-END:variables
}
