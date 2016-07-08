package proyecto_sev1;
import clases.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.util.logging.*;
public class diputados_alcaldes extends JFrameConFondo {
    /** Creates new form diputados_alcaldes */
    public diputados_alcaldes() {
        try {
            initComponents();
            setImagen("Recursos/blanco.jpg");//para que la ventana tenga un imagen
            setLocationRelativeTo(null); // para que la ventana este siempre centrada
            Reloj modelo = new Reloj();
            modelo.addObserver(new Observer() {

                public void update(Observable unObservable, Object dato) {
                    jLbl_reloj.setText("" + dato);//muestra la hora del sistema
                }
            });
            File archivo1 = null;
            FileReader fr1 = null;
            BufferedReader br1 = null;
            archivo1 = new File("votos_diputados.txt");
            fr1 = new FileReader(archivo1);
            br1 = new BufferedReader(fr1);
            // Lectura del fichero
            String lineac = "";
            //inicializamos las variables para poder mostrar resultados de votos
            //de diputados
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
                jTxFld_resultado_diputado1.setText("" + sumac);//muestra la suma de votos
                jTxFld_resultado_diputado2.setText("" + sumal);//muestra la suma de votos
                jTxFld_resultado_diputado3.setText("" + sumaj);//muestra la suma de votos
                jTxFld_resultado_diputado4.setText("" + sumar);//muestra la suma de votos
                jTxFld_resulblancos_diputados.setText("" + sumab);//muestra la suma de votos
                jTxFld_resulnulos_diputados.setText("" + suman);//muestra la suma de votos
                jTxFld_resultotales_diputados.setText("" + sumat);//muestra la suma de votos
            }
            //
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////para alcaldes
        try {
            File archivo1 = null;
            FileReader fr1 = null;
            BufferedReader br1 = null;
            archivo1 = new File("votos_alcaldes.txt");
            fr1 = new FileReader(archivo1);
            br1 = new BufferedReader(fr1);
            // Lectura del fichero
            String lineac = "";
            //inicializamos las variables para poder mostrar resultados de votos
            //de alcaldes
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
                int sumat = sumac + sumal + sumaj + sumar + sumab + suman;
                jTxFld_resultado_alcalde1.setText("" + sumac);//muestra la suma de votos
                jTxFld_resultado_alcalde2.setText("" + sumal);//muestra la suma de votos
                jTxFld_resultado_alcalde3.setText("" + sumaj);//muestra la suma de votos
                jTxFld_resultado_alcalde4.setText("" + sumar);//muestra la suma de votos
                jTxFld_resulblancos_alcaldes.setText("" + sumab);//muestra la suma de votos
                jTxFld_resulnulos_alcaldes.setText("" + suman);//muestra la suma de votos
                jTxFld_resultotales_alcaldes.setText("" + sumat);//muestra la suma de votos
            }
            //
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jLbl_titulo_ResultadosElectorales = new javax.swing.JLabel();
        jPnl_diputados = new javax.swing.JPanel();
        jPnl_diputado_correa = new javax.swing.JPanel();
        jLbl_imagen_diputado1 = new javax.swing.JLabel();
        jLbl_diputado1 = new javax.swing.JLabel();
        jTxFld_resultado_diputado1 = new javax.swing.JTextField();
        jPnl_diputado_gutierrez = new javax.swing.JPanel();
        jLbl_imagen_diputado2 = new javax.swing.JLabel();
        jLbl_diputado2 = new javax.swing.JLabel();
        jTxFld_resultado_diputado2 = new javax.swing.JTextField();
        jPnl_diputado_mahuad = new javax.swing.JPanel();
        jLbl_imagen_diputado3 = new javax.swing.JLabel();
        jLbl_diputado3 = new javax.swing.JLabel();
        jTxFld_resultado_diputado3 = new javax.swing.JTextField();
        jPnl_diputado_roldos = new javax.swing.JPanel();
        jLbl_imagen_diputado4 = new javax.swing.JLabel();
        jLbl_diputado4 = new javax.swing.JLabel();
        jTxFld_resultado_diputado4 = new javax.swing.JTextField();
        jLbl_votosblancos_diputados = new javax.swing.JLabel();
        jTxFld_resulblancos_diputados = new javax.swing.JTextField();
        jLbl_votosnulos_diputados = new javax.swing.JLabel();
        jTxFld_resulnulos_diputados = new javax.swing.JTextField();
        jLbl_votostotales_diputados = new javax.swing.JLabel();
        jTxFld_resultotales_diputados = new javax.swing.JTextField();
        jBtn_msn_diputadoganador = new javax.swing.JButton();
        jPnl_alcaldes = new javax.swing.JPanel();
        jPnl_alcalde_correa = new javax.swing.JPanel();
        jLbl_imagen_alcalde1 = new javax.swing.JLabel();
        jLbl_alcalde1 = new javax.swing.JLabel();
        jTxFld_resultado_alcalde1 = new javax.swing.JTextField();
        jPnl_alcalde_gutierrez = new javax.swing.JPanel();
        jLbl_imagen_alcalde2 = new javax.swing.JLabel();
        jLbl_alcalde2 = new javax.swing.JLabel();
        jTxFld_resultado_alcalde2 = new javax.swing.JTextField();
        jPnl_alcalde_mahuad = new javax.swing.JPanel();
        jLbl_imagen_alcalde3 = new javax.swing.JLabel();
        jLbl_alcalde3 = new javax.swing.JLabel();
        jTxFld_resultado_alcalde3 = new javax.swing.JTextField();
        jPnl_alcalde_roldos = new javax.swing.JPanel();
        jLbl_imagen_alcalde4 = new javax.swing.JLabel();
        jLbl_alcalde4 = new javax.swing.JLabel();
        jTxFld_resultado_alcalde4 = new javax.swing.JTextField();
        jLbl_votosblancos_alcaldes = new javax.swing.JLabel();
        jTxFld_resulblancos_alcaldes = new javax.swing.JTextField();
        jLbl_votosnulos_alcaldes = new javax.swing.JLabel();
        jTxFld_resulnulos_alcaldes = new javax.swing.JTextField();
        jLbl_votostotales_alcaldes = new javax.swing.JLabel();
        jTxFld_resultotales_alcaldes = new javax.swing.JTextField();
        jBtn_msn_alcaldeganador = new javax.swing.JButton();
        jBtn_ir_resultados = new javax.swing.JButton();
        jBtn_ir_editar = new javax.swing.JButton();
        jLbl_reloj = new javax.swing.JLabel();
        jLbl_gifmuñeco = new javax.swing.JLabel();
        jLbl_imagenmuñeco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbl_titulo_ResultadosElectorales.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLbl_titulo_ResultadosElectorales.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_titulo_ResultadosElectorales.setText("RESULTADOS ELECTORALES");
        jLbl_titulo_ResultadosElectorales.setName("jLbl_titulo_ResultadosElectorales"); // NOI18N

        jPnl_diputados.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_diputados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIPUTADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 102))); // NOI18N
        jPnl_diputados.setName("jPnl_diputados"); // NOI18N

        jPnl_diputado_correa.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_diputado_correa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eco. Rafael Correa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_diputado_correa.setName("jPnl_diputado_correa"); // NOI18N

        jLbl_imagen_diputado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato1.JPG"))); // NOI18N
        jLbl_imagen_diputado1.setName("jLbl_imagen_diputado1"); // NOI18N

        jLbl_diputado1.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_diputado1.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_diputado1.setText("Ab. Roberto Salas ");
        jLbl_diputado1.setName("jLbl_diputado1"); // NOI18N

        jTxFld_resultado_diputado1.setEditable(false);
        jTxFld_resultado_diputado1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_diputado1.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_diputado1.setName("jTxFld_resultado_diputado1"); // NOI18N
        jTxFld_resultado_diputado1.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPnl_diputado_correaLayout = new javax.swing.GroupLayout(jPnl_diputado_correa);
        jPnl_diputado_correa.setLayout(jPnl_diputado_correaLayout);
        jPnl_diputado_correaLayout.setHorizontalGroup(
            jPnl_diputado_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_diputado_correaLayout.createSequentialGroup()
                .addGroup(jPnl_diputado_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_diputado_correaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPnl_diputado_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_imagen_diputado1)
                            .addComponent(jLbl_diputado1)))
                    .addGroup(jPnl_diputado_correaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jTxFld_resultado_diputado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPnl_diputado_correaLayout.setVerticalGroup(
            jPnl_diputado_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_diputado_correaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLbl_imagen_diputado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbl_diputado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jTxFld_resultado_diputado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnl_diputado_gutierrez.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_diputado_gutierrez.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crnl. Lucio Gutierrez", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_diputado_gutierrez.setName("jPnl_diputado_gutierrez"); // NOI18N

        jLbl_imagen_diputado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato2.JPG"))); // NOI18N
        jLbl_imagen_diputado2.setName("jLbl_imagen_diputado2"); // NOI18N

        jLbl_diputado2.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_diputado2.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_diputado2.setText("Gnrl. Antonio Torres ");
        jLbl_diputado2.setName("jLbl_diputado2"); // NOI18N

        jTxFld_resultado_diputado2.setEditable(false);
        jTxFld_resultado_diputado2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_diputado2.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_diputado2.setName("jTxFld_resultado_diputado2"); // NOI18N
        jTxFld_resultado_diputado2.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPnl_diputado_gutierrezLayout = new javax.swing.GroupLayout(jPnl_diputado_gutierrez);
        jPnl_diputado_gutierrez.setLayout(jPnl_diputado_gutierrezLayout);
        jPnl_diputado_gutierrezLayout.setHorizontalGroup(
            jPnl_diputado_gutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_diputado_gutierrezLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLbl_imagen_diputado2)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_diputado_gutierrezLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbl_diputado2)
                .addContainerGap())
            .addGroup(jPnl_diputado_gutierrezLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTxFld_resultado_diputado2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPnl_diputado_gutierrezLayout.setVerticalGroup(
            jPnl_diputado_gutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_diputado_gutierrezLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_imagen_diputado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLbl_diputado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxFld_resultado_diputado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnl_diputado_mahuad.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_diputado_mahuad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dr. Jamil Mahuad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_diputado_mahuad.setName("jPnl_diputado_mahuad"); // NOI18N

        jLbl_imagen_diputado3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato3.JPG"))); // NOI18N
        jLbl_imagen_diputado3.setName("jLbl_imagen_diputado3"); // NOI18N

        jLbl_diputado3.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_diputado3.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_diputado3.setText("Ing. Cristina Robles");
        jLbl_diputado3.setName("jLbl_diputado3"); // NOI18N

        jTxFld_resultado_diputado3.setEditable(false);
        jTxFld_resultado_diputado3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_diputado3.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_diputado3.setName("jTxFld_resultado_diputado3"); // NOI18N
        jTxFld_resultado_diputado3.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPnl_diputado_mahuadLayout = new javax.swing.GroupLayout(jPnl_diputado_mahuad);
        jPnl_diputado_mahuad.setLayout(jPnl_diputado_mahuadLayout);
        jPnl_diputado_mahuadLayout.setHorizontalGroup(
            jPnl_diputado_mahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_diputado_mahuadLayout.createSequentialGroup()
                .addGroup(jPnl_diputado_mahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_diputado_mahuadLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLbl_imagen_diputado3))
                    .addGroup(jPnl_diputado_mahuadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLbl_diputado3))
                    .addGroup(jPnl_diputado_mahuadLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jTxFld_resultado_diputado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPnl_diputado_mahuadLayout.setVerticalGroup(
            jPnl_diputado_mahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_diputado_mahuadLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLbl_imagen_diputado3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbl_diputado3)
                .addGap(7, 7, 7)
                .addComponent(jTxFld_resultado_diputado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnl_diputado_roldos.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_diputado_roldos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ab. Jaime Roldos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_diputado_roldos.setName("jPnl_diputado_roldos"); // NOI18N

        jLbl_imagen_diputado4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato4.JPG"))); // NOI18N
        jLbl_imagen_diputado4.setName("jLbl_imagen_diputado4"); // NOI18N

        jLbl_diputado4.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_diputado4.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_diputado4.setText("Arq. David Beckan");
        jLbl_diputado4.setName("jLbl_diputado4"); // NOI18N

        jTxFld_resultado_diputado4.setEditable(false);
        jTxFld_resultado_diputado4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_diputado4.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_diputado4.setName("jTxFld_resultado_diputado4"); // NOI18N
        jTxFld_resultado_diputado4.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPnl_diputado_roldosLayout = new javax.swing.GroupLayout(jPnl_diputado_roldos);
        jPnl_diputado_roldos.setLayout(jPnl_diputado_roldosLayout);
        jPnl_diputado_roldosLayout.setHorizontalGroup(
            jPnl_diputado_roldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_diputado_roldosLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLbl_imagen_diputado4)
                .addGap(24, 24, 24))
            .addGroup(jPnl_diputado_roldosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_diputado4)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPnl_diputado_roldosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jTxFld_resultado_diputado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPnl_diputado_roldosLayout.setVerticalGroup(
            jPnl_diputado_roldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_diputado_roldosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbl_imagen_diputado4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbl_diputado4)
                .addGap(7, 7, 7)
                .addComponent(jTxFld_resultado_diputado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLbl_votosblancos_diputados.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_votosblancos_diputados.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_votosblancos_diputados.setText("BLANCOS");
        jLbl_votosblancos_diputados.setName("jLbl_votosblancos_diputados"); // NOI18N

        jTxFld_resulblancos_diputados.setEditable(false);
        jTxFld_resulblancos_diputados.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTxFld_resulblancos_diputados.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_resulblancos_diputados.setName("jTxFld_resulblancos_diputados"); // NOI18N
        jTxFld_resulblancos_diputados.setPreferredSize(new java.awt.Dimension(35, 25));

        jLbl_votosnulos_diputados.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_votosnulos_diputados.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_votosnulos_diputados.setText("NULOS");
        jLbl_votosnulos_diputados.setName("jLbl_votosnulos_diputados"); // NOI18N

        jTxFld_resulnulos_diputados.setEditable(false);
        jTxFld_resulnulos_diputados.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTxFld_resulnulos_diputados.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_resulnulos_diputados.setName("jTxFld_resulnulos_diputados"); // NOI18N
        jTxFld_resulnulos_diputados.setPreferredSize(new java.awt.Dimension(35, 25));

        jLbl_votostotales_diputados.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_votostotales_diputados.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_votostotales_diputados.setText("TOTALES");
        jLbl_votostotales_diputados.setName("jLbl_votostotales_diputados"); // NOI18N

        jTxFld_resultotales_diputados.setEditable(false);
        jTxFld_resultotales_diputados.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTxFld_resultotales_diputados.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_resultotales_diputados.setName("jTxFld_resultotales_diputados"); // NOI18N
        jTxFld_resultotales_diputados.setPreferredSize(new java.awt.Dimension(35, 25));

        jBtn_msn_diputadoganador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_msn_diputadoganador.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_msn_diputadoganador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/msn.jpg"))); // NOI18N
        jBtn_msn_diputadoganador.setText("CANDIDATO GANADOR");
        jBtn_msn_diputadoganador.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_msn_diputadoganador.setName("jBtn_msn_diputadoganador"); // NOI18N
        jBtn_msn_diputadoganador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_msn_diputadoganadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPnl_diputadosLayout = new javax.swing.GroupLayout(jPnl_diputados);
        jPnl_diputados.setLayout(jPnl_diputadosLayout);
        jPnl_diputadosLayout.setHorizontalGroup(
            jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_votosblancos_diputados)
                            .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTxFld_resulblancos_diputados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_votosnulos_diputados)
                            .addComponent(jTxFld_resulnulos_diputados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_votostotales_diputados)
                            .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jTxFld_resultotales_diputados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                                .addComponent(jPnl_diputado_correa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPnl_diputado_gutierrez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                                .addComponent(jPnl_diputado_mahuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPnl_diputado_roldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jBtn_msn_diputadoganador)))
                .addContainerGap())
        );

        jPnl_diputadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPnl_diputado_correa, jPnl_diputado_gutierrez, jPnl_diputado_mahuad, jPnl_diputado_roldos});

        jPnl_diputadosLayout.setVerticalGroup(
            jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_diputadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnl_diputado_correa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnl_diputado_gutierrez, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnl_diputado_mahuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnl_diputado_roldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_diputadosLayout.createSequentialGroup()
                        .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_votosblancos_diputados)
                            .addComponent(jLbl_votostotales_diputados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxFld_resultotales_diputados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPnl_diputadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxFld_resulnulos_diputados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTxFld_resulblancos_diputados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLbl_votosnulos_diputados))
                .addGap(18, 18, 18)
                .addComponent(jBtn_msn_diputadoganador)
                .addContainerGap())
        );

        jPnl_diputadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPnl_diputado_correa, jPnl_diputado_gutierrez, jPnl_diputado_mahuad, jPnl_diputado_roldos});

        jPnl_alcaldes.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_alcaldes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ALCALDES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 102))); // NOI18N
        jPnl_alcaldes.setName("jPnl_alcaldes"); // NOI18N

        jPnl_alcalde_correa.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_alcalde_correa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eco. Rafael Correa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_alcalde_correa.setName("jPnl_alcalde_correa"); // NOI18N

        jLbl_imagen_alcalde1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato5.JPG"))); // NOI18N
        jLbl_imagen_alcalde1.setName("jLbl_imagen_alcalde1"); // NOI18N

        jLbl_alcalde1.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_alcalde1.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_alcalde1.setText("Eco. Renato Benavides");
        jLbl_alcalde1.setName("jLbl_alcalde1"); // NOI18N

        jTxFld_resultado_alcalde1.setEditable(false);
        jTxFld_resultado_alcalde1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_alcalde1.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_alcalde1.setName("jTxFld_resultado_alcalde1"); // NOI18N
        jTxFld_resultado_alcalde1.setPreferredSize(new java.awt.Dimension(30, 20));
        jTxFld_resultado_alcalde1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxFld_resultado_alcalde1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnl_alcalde_correaLayout = new javax.swing.GroupLayout(jPnl_alcalde_correa);
        jPnl_alcalde_correa.setLayout(jPnl_alcalde_correaLayout);
        jPnl_alcalde_correaLayout.setHorizontalGroup(
            jPnl_alcalde_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcalde_correaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPnl_alcalde_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_alcalde1)
                    .addGroup(jPnl_alcalde_correaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLbl_imagen_alcalde1))
                    .addGroup(jPnl_alcalde_correaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jTxFld_resultado_alcalde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPnl_alcalde_correaLayout.setVerticalGroup(
            jPnl_alcalde_correaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_alcalde_correaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_imagen_alcalde1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLbl_alcalde1)
                .addGap(7, 7, 7)
                .addComponent(jTxFld_resultado_alcalde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnl_alcalde_gutierrez.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_alcalde_gutierrez.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crnl. Lucio Gutierrez", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_alcalde_gutierrez.setName("jPnl_alcalde_gutierrez"); // NOI18N

        jLbl_imagen_alcalde2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato6.JPG"))); // NOI18N
        jLbl_imagen_alcalde2.setName("jLbl_imagen_alcalde2"); // NOI18N

        jLbl_alcalde2.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_alcalde2.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_alcalde2.setText("Lcd. Luis Morán");
        jLbl_alcalde2.setName("jLbl_alcalde2"); // NOI18N

        jTxFld_resultado_alcalde2.setEditable(false);
        jTxFld_resultado_alcalde2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_alcalde2.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_alcalde2.setName("jTxFld_resultado_alcalde2"); // NOI18N
        jTxFld_resultado_alcalde2.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPnl_alcalde_gutierrezLayout = new javax.swing.GroupLayout(jPnl_alcalde_gutierrez);
        jPnl_alcalde_gutierrez.setLayout(jPnl_alcalde_gutierrezLayout);
        jPnl_alcalde_gutierrezLayout.setHorizontalGroup(
            jPnl_alcalde_gutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcalde_gutierrezLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPnl_alcalde_gutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_imagen_alcalde2)
                    .addComponent(jLbl_alcalde2)
                    .addGroup(jPnl_alcalde_gutierrezLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTxFld_resultado_alcalde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPnl_alcalde_gutierrezLayout.setVerticalGroup(
            jPnl_alcalde_gutierrezLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_alcalde_gutierrezLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_imagen_alcalde2)
                .addGap(11, 11, 11)
                .addComponent(jLbl_alcalde2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jTxFld_resultado_alcalde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnl_alcalde_mahuad.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_alcalde_mahuad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dr. Jamil Mahuad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_alcalde_mahuad.setName("jPnl_alcalde_mahuad"); // NOI18N

        jLbl_imagen_alcalde3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato7.JPG"))); // NOI18N
        jLbl_imagen_alcalde3.setName("jLbl_imagen_alcalde3"); // NOI18N

        jLbl_alcalde3.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_alcalde3.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_alcalde3.setText("Ab. Fernando Lopéz");
        jLbl_alcalde3.setName("jLbl_alcalde3"); // NOI18N

        jTxFld_resultado_alcalde3.setEditable(false);
        jTxFld_resultado_alcalde3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_alcalde3.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_alcalde3.setName("jTxFld_resultado_alcalde3"); // NOI18N
        jTxFld_resultado_alcalde3.setPreferredSize(new java.awt.Dimension(30, 20));
        jTxFld_resultado_alcalde3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxFld_resultado_alcalde3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnl_alcalde_mahuadLayout = new javax.swing.GroupLayout(jPnl_alcalde_mahuad);
        jPnl_alcalde_mahuad.setLayout(jPnl_alcalde_mahuadLayout);
        jPnl_alcalde_mahuadLayout.setHorizontalGroup(
            jPnl_alcalde_mahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcalde_mahuadLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPnl_alcalde_mahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_alcalde3)
                    .addGroup(jPnl_alcalde_mahuadLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jTxFld_resultado_alcalde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPnl_alcalde_mahuadLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLbl_imagen_alcalde3)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPnl_alcalde_mahuadLayout.setVerticalGroup(
            jPnl_alcalde_mahuadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_alcalde_mahuadLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLbl_imagen_alcalde3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLbl_alcalde3)
                .addGap(7, 7, 7)
                .addComponent(jTxFld_resultado_alcalde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPnl_alcalde_roldos.setBackground(new java.awt.Color(255, 255, 255));
        jPnl_alcalde_roldos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ab. Jaime Roldos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(51, 0, 102))); // NOI18N
        jPnl_alcalde_roldos.setName("jPnl_alcalde_roldos"); // NOI18N

        jLbl_imagen_alcalde4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/candidato8.JPG"))); // NOI18N
        jLbl_imagen_alcalde4.setName("jLbl_imagen_alcalde4"); // NOI18N

        jLbl_alcalde4.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLbl_alcalde4.setForeground(new java.awt.Color(0, 102, 102));
        jLbl_alcalde4.setText("Ing. Armando Peñaherrera");
        jLbl_alcalde4.setName("jLbl_alcalde4"); // NOI18N

        jTxFld_resultado_alcalde4.setEditable(false);
        jTxFld_resultado_alcalde4.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTxFld_resultado_alcalde4.setForeground(new java.awt.Color(102, 0, 0));
        jTxFld_resultado_alcalde4.setName("jTxFld_resultado_alcalde4"); // NOI18N
        jTxFld_resultado_alcalde4.setPreferredSize(new java.awt.Dimension(30, 20));

        javax.swing.GroupLayout jPnl_alcalde_roldosLayout = new javax.swing.GroupLayout(jPnl_alcalde_roldos);
        jPnl_alcalde_roldos.setLayout(jPnl_alcalde_roldosLayout);
        jPnl_alcalde_roldosLayout.setHorizontalGroup(
            jPnl_alcalde_roldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcalde_roldosLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLbl_imagen_alcalde4)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPnl_alcalde_roldosLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jTxFld_resultado_alcalde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_alcalde_roldosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLbl_alcalde4)
                .addContainerGap())
        );
        jPnl_alcalde_roldosLayout.setVerticalGroup(
            jPnl_alcalde_roldosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcalde_roldosLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLbl_imagen_alcalde4)
                .addGap(7, 7, 7)
                .addComponent(jLbl_alcalde4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxFld_resultado_alcalde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLbl_votosblancos_alcaldes.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_votosblancos_alcaldes.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_votosblancos_alcaldes.setText("BLANCOS");
        jLbl_votosblancos_alcaldes.setName("jLbl_votosblancos_alcaldes"); // NOI18N

        jTxFld_resulblancos_alcaldes.setEditable(false);
        jTxFld_resulblancos_alcaldes.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTxFld_resulblancos_alcaldes.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_resulblancos_alcaldes.setName("jTxFld_resulblancos_alcaldes"); // NOI18N
        jTxFld_resulblancos_alcaldes.setPreferredSize(new java.awt.Dimension(35, 25));

        jLbl_votosnulos_alcaldes.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_votosnulos_alcaldes.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_votosnulos_alcaldes.setText("NULOS");
        jLbl_votosnulos_alcaldes.setName("jLbl_votosnulos_alcaldes"); // NOI18N

        jTxFld_resulnulos_alcaldes.setEditable(false);
        jTxFld_resulnulos_alcaldes.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTxFld_resulnulos_alcaldes.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_resulnulos_alcaldes.setName("jTxFld_resulnulos_alcaldes"); // NOI18N
        jTxFld_resulnulos_alcaldes.setPreferredSize(new java.awt.Dimension(35, 25));

        jLbl_votostotales_alcaldes.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_votostotales_alcaldes.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_votostotales_alcaldes.setText("TOTALES");
        jLbl_votostotales_alcaldes.setName("jLbl_votostotales_alcaldes"); // NOI18N

        jTxFld_resultotales_alcaldes.setEditable(false);
        jTxFld_resultotales_alcaldes.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTxFld_resultotales_alcaldes.setForeground(new java.awt.Color(153, 0, 0));
        jTxFld_resultotales_alcaldes.setName("jTxFld_resultotales_alcaldes"); // NOI18N
        jTxFld_resultotales_alcaldes.setPreferredSize(new java.awt.Dimension(35, 25));

        jBtn_msn_alcaldeganador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtn_msn_alcaldeganador.setForeground(new java.awt.Color(51, 0, 102));
        jBtn_msn_alcaldeganador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/msn.jpg"))); // NOI18N
        jBtn_msn_alcaldeganador.setText("CANDIDATO GANADOR");
        jBtn_msn_alcaldeganador.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 102)));
        jBtn_msn_alcaldeganador.setName("jBtn_msn_alcaldeganador"); // NOI18N
        jBtn_msn_alcaldeganador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_msn_alcaldeganadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPnl_alcaldesLayout = new javax.swing.GroupLayout(jPnl_alcaldes);
        jPnl_alcaldes.setLayout(jPnl_alcaldesLayout);
        jPnl_alcaldesLayout.setHorizontalGroup(
            jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                        .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                                .addComponent(jPnl_alcalde_correa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPnl_alcalde_gutierrez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                                .addComponent(jPnl_alcalde_mahuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPnl_alcalde_roldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                                .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                                        .addComponent(jLbl_votosblancos_alcaldes)
                                        .addGap(39, 39, 39))
                                    .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                                        .addComponent(jTxFld_resulblancos_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))
                                .addGap(65, 65, 65)
                                .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLbl_votosnulos_alcaldes)
                                    .addComponent(jTxFld_resulnulos_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jTxFld_resultotales_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLbl_votostotales_alcaldes))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_alcaldesLayout.createSequentialGroup()
                        .addComponent(jBtn_msn_alcaldeganador)
                        .addGap(95, 95, 95))))
        );

        jPnl_alcaldesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPnl_alcalde_correa, jPnl_alcalde_gutierrez, jPnl_alcalde_mahuad, jPnl_alcalde_roldos});

        jPnl_alcaldesLayout.setVerticalGroup(
            jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnl_alcalde_correa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPnl_alcalde_gutierrez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnl_alcalde_mahuad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPnl_alcalde_roldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPnl_alcaldesLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbl_votosblancos_alcaldes)
                            .addComponent(jLbl_votostotales_alcaldes)
                            .addComponent(jLbl_votosnulos_alcaldes))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnl_alcaldesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxFld_resulblancos_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxFld_resulnulos_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxFld_resultotales_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jBtn_msn_alcaldeganador)
                .addContainerGap())
        );

        jPnl_alcaldesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTxFld_resulblancos_alcaldes, jTxFld_resulnulos_alcaldes, jTxFld_resultotales_alcaldes});

        jPnl_alcaldesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPnl_alcalde_correa, jPnl_alcalde_gutierrez, jPnl_alcalde_mahuad, jPnl_alcalde_roldos});

        jBtn_ir_resultados.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_resultados.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_ir_resultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hvfk.JPG"))); // NOI18N
        jBtn_ir_resultados.setText("ATRAS");
        jBtn_ir_resultados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 102)));
        jBtn_ir_resultados.setName("jBtn_ir_resultados"); // NOI18N
        jBtn_ir_resultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_resultadosMouseClicked(evt);
            }
        });

        jBtn_ir_editar.setFont(new java.awt.Font("Tahoma", 1, 12));
        jBtn_ir_editar.setForeground(new java.awt.Color(0, 0, 153));
        jBtn_ir_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/hg.JPG"))); // NOI18N
        jBtn_ir_editar.setText("SALIR");
        jBtn_ir_editar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 102)));
        jBtn_ir_editar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jBtn_ir_editar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jBtn_ir_editar.setName("jBtn_ir_editar"); // NOI18N
        jBtn_ir_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_editarMouseClicked(evt);
            }
        });

        jLbl_reloj.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLbl_reloj.setForeground(new java.awt.Color(51, 0, 102));
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        jLbl_gifmuñeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/muñeco.gif"))); // NOI18N
        jLbl_gifmuñeco.setName("jLbl_gifmuñeco"); // NOI18N

        jLbl_imagenmuñeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_sev1/Recursos/kjj.jpeg"))); // NOI18N
        jLbl_imagenmuñeco.setName("jLbl_imagenmuñeco"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPnl_diputados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtn_ir_resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn_ir_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLbl_gifmuñeco)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbl_imagenmuñeco)
                                .addGap(18, 18, 18)
                                .addComponent(jPnl_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLbl_titulo_ResultadosElectorales)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtn_ir_editar, jBtn_ir_resultados});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPnl_alcaldes, jPnl_diputados});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_titulo_ResultadosElectorales)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jBtn_ir_resultados)
                        .addGap(18, 18, 18)
                        .addComponent(jBtn_ir_editar)
                        .addGap(44, 44, 44)
                        .addComponent(jLbl_gifmuñeco)
                        .addGap(51, 51, 51)
                        .addComponent(jLbl_imagenmuñeco))
                    .addComponent(jPnl_alcaldes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPnl_diputados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtn_ir_editar, jBtn_ir_resultados});

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //metodo para validar votos empates diputados
    private void validar_votosdiputados_empates() {
        int vdpcorrea = Integer.parseInt(jTxFld_resultado_diputado1.getText());
        int vdpgutierrez = Integer.parseInt(jTxFld_resultado_diputado2.getText());
        int vdpmahuad = Integer.parseInt(jTxFld_resultado_diputado3.getText());
        int vdproldos = Integer.parseInt(jTxFld_resultado_diputado4.getText());
        if ((vdpmahuad == vdproldos || vdpgutierrez == vdproldos || vdpgutierrez == vdpmahuad || vdpcorrea == vdproldos || vdpcorrea == vdpmahuad || vdpcorrea == vdpgutierrez)
                || (vdpgutierrez == vdpmahuad && vdpmahuad == vdproldos)
                || (vdpcorrea == vdpgutierrez && vdpgutierrez == vdpmahuad)
                || (vdpmahuad == vdproldos && vdpmahuad == vdpcorrea)
                || (vdpcorrea == vdpgutierrez && vdpcorrea == vdproldos)
                || (vdpcorrea == vdpgutierrez && vdpcorrea == vdpmahuad && vdpcorrea == vdproldos)) {
            JOptionPane.showMessageDialog(null, "NO EXISTE CANDIDATO GANADOR", "******EMPATE*****", 1);
        }
    }
    //metodo para validar votos empates alcaldes
    private void validar_votosalcalde_empates() {
        int valcaldecorrea = Integer.parseInt(jTxFld_resultado_alcalde1.getText());
        int valcaldegutierrez = Integer.parseInt(jTxFld_resultado_alcalde2.getText());
        int valcaldemahuad = Integer.parseInt(jTxFld_resultado_alcalde3.getText());
        int valcalderoldos = Integer.parseInt(jTxFld_resultado_alcalde4.getText());
        if ((valcaldemahuad == valcalderoldos || valcaldegutierrez == valcalderoldos || valcaldegutierrez == valcaldemahuad || valcaldecorrea == valcalderoldos || valcaldecorrea == valcaldemahuad || valcaldecorrea == valcaldegutierrez)
                || (valcaldegutierrez == valcaldemahuad && valcaldemahuad == valcalderoldos)
                || (valcaldecorrea == valcaldegutierrez && valcaldegutierrez == valcaldemahuad)
                || (valcaldemahuad == valcalderoldos && valcaldemahuad == valcaldecorrea)
                || (valcaldecorrea == valcaldegutierrez && valcaldecorrea == valcalderoldos)
                || (valcaldecorrea == valcaldegutierrez && valcaldecorrea == valcaldemahuad && valcaldecorrea == valcalderoldos)) {
            JOptionPane.showMessageDialog(null, "NO EXISTE CANDIDATO GANADOR", "*****EMPATE*****", 1);
        }
    }
    private void jBtn_ir_resultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_resultadosMouseClicked

        // TODO add your handling code here:
        resultados ir = new resultados(); // crea objeto para ir a nueva ventana
        this.setVisible(false); //oculta la ventana actual
        ir.setVisible(true); // para que la ventana este siempre centrada
        ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada

    }//GEN-LAST:event_jBtn_ir_resultadosMouseClicked

    private void jBtn_ir_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_editarMouseClicked
        // TODO add your handling code here:
        editar ir = new editar();// crea objeto para ir a nueva ventana
        this.setVisible(false);//oculta la ventana actual
        ir.setVisible(true);//muestra la nueva ventana
        ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
    }//GEN-LAST:event_jBtn_ir_editarMouseClicked
    private void jTxFld_resultado_alcalde1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxFld_resultado_alcalde1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxFld_resultado_alcalde1ActionPerformed
    private void jTxFld_resultado_alcalde3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxFld_resultado_alcalde3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxFld_resultado_alcalde3ActionPerformed
    //verifica si hay voto mayor alcalde retorna true si existe
    public boolean votomayoralcalde() {
        int vc = Integer.parseInt(jTxFld_resultado_alcalde1.getText().toString());
        int vl = Integer.parseInt(jTxFld_resultado_alcalde2.getText().toString());
        int vj = Integer.parseInt(jTxFld_resultado_alcalde3.getText().toString());
        int vr = Integer.parseInt(jTxFld_resultado_alcalde4.getText().toString());
        if (vc > vl && vc > vj && vc > vr||vl > vc && vl > vj && vl > vr||vj > vc && vj > vl && vj > vr||vr > vc && vr > vl && vr > vj)
            {
               return true;
            }
            else
            {return false;
            }
    }
    //verifica si hay voto mayor alcalde retorna el mayor
    public int votomayor1alcalde() {
        int vm = 0;
        int vc = Integer.parseInt(jTxFld_resultado_alcalde1.getText().toString());
        int vl = Integer.parseInt(jTxFld_resultado_alcalde2.getText().toString());
        int vj = Integer.parseInt(jTxFld_resultado_alcalde3.getText().toString());
        int vr = Integer.parseInt(jTxFld_resultado_alcalde4.getText().toString());
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
    //compara e indica cual candidato es el ganador alcalde
    public int votomayor2alcalde() {
        int i = 0;
        int vc = Integer.parseInt(jTxFld_resultado_alcalde1.getText().toString());
        int vl = Integer.parseInt(jTxFld_resultado_alcalde2.getText().toString());
        int vj = Integer.parseInt(jTxFld_resultado_alcalde3.getText().toString());
        int vr = Integer.parseInt(jTxFld_resultado_alcalde4.getText().toString());
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
    //verifica si hay voto mayor diputado retorna true si existe
    public boolean votomayordiputado() {
        int vc = Integer.parseInt(jTxFld_resultado_diputado1.getText().toString());
        int vl = Integer.parseInt(jTxFld_resultado_diputado2.getText().toString());
        int vj = Integer.parseInt(jTxFld_resultado_diputado3.getText().toString());
        int vr = Integer.parseInt(jTxFld_resultado_diputado4.getText().toString());
        if (vc > vl && vc > vj && vc > vr||vl > vc && vl > vj && vl > vr||vj > vc && vj > vl && vj > vr||vr > vc && vr > vl && vr > vj)
            {
               return true;
            }
            else
            {return false;
            }
    }
    //verifica si hay voto mayor diputado retorna el mayor
    public int votomayor1diputado() {
        int vm = 0;
        int vc = Integer.parseInt(jTxFld_resultado_diputado1.getText().toString());
        int vl = Integer.parseInt(jTxFld_resultado_diputado2.getText().toString());
        int vj = Integer.parseInt(jTxFld_resultado_diputado3.getText().toString());
        int vr = Integer.parseInt(jTxFld_resultado_diputado4.getText().toString());
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
    //compara e indica cual candidato es el ganador diputado
    public int votomayor2diputado() {
        int i = 0;
        int vc = Integer.parseInt(jTxFld_resultado_diputado1.getText().toString());
        int vl = Integer.parseInt(jTxFld_resultado_diputado2.getText().toString());
        int vj = Integer.parseInt(jTxFld_resultado_diputado3.getText().toString());
        int vr = Integer.parseInt(jTxFld_resultado_diputado4.getText().toString());
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
    private void jBtn_msn_diputadoganadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_msn_diputadoganadorMouseClicked
        // TODO add your handling code here:
        //codigo ganador para diputados
        //verifica que no nexista votos para mostar mensaje de error
        if (jTxFld_resultado_diputado1.getText().equals("") && jTxFld_resultado_diputado2.getText().equals("") && jTxFld_resultado_diputado3.getText().equals("") && jTxFld_resultado_diputado4.getText().equals("") && jTxFld_resulnulos_diputados.getText().equals("") && jTxFld_resulblancos_diputados.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "   NO EXISTEN VOTOS  ", " * * *   ERROR   * * *", 0);
        } 
        //caso contrario verifica si hay ganador o empate
        else {
            boolean verificar =votomayordiputado();//llamada al metodo para que retorne true si hay voto mayor
            if (verificar==true) {//si es true
                int mayorpuntaje = votomayor1diputado();//llamada al metodo para indique el resultado mayor
                int ganador=votomayor2diputado();// llamada al metodo para que indique cual es el nombre de ganador
                //muestra el candidato ganador
                if(ganador==1)
                {
                     JOptionPane.showMessageDialog(null, "Ab. Roberto Salas     " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_diputados.getText().toString()))+ "   votos"+"\n(CORREA)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==2)
                {
                    JOptionPane.showMessageDialog(null, "Gnrl. Antonio Torres     " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_diputados.getText().toString()))+ "   votos"+"\n(GUTIERREZ)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==3)
                {
                    JOptionPane.showMessageDialog(null, "Ing. Cristina Robles    " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_diputados.getText().toString()))+ "   votos"+"\n(MAHUAD)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==4)
                {
                     JOptionPane.showMessageDialog(null, "Arq. David Beckan    " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_diputados.getText().toString()))+ "   votos"+"\n(ROLDOS)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
            }
            //caso contrario false
            else {
               //verifica empates
                int c = Integer.parseInt(jTxFld_resultado_diputado1.getText());
                int l = Integer.parseInt(jTxFld_resultado_diputado2.getText());
                int j = Integer.parseInt(jTxFld_resultado_diputado3.getText());
                int r = Integer.parseInt(jTxFld_resultado_diputado4.getText());
                int n = Integer.parseInt(jTxFld_resulnulos_diputados.getText());
                int b = Integer.parseInt(jTxFld_resulblancos_diputados.getText());
                if ((c == l && c == j && c == r) || (l == c && c == j) || (r == l && l == c) || (l == c) || (j == j && j == c) || (j == c) || (r == c) || (r == j && j == l) || (j == l) || (r == l) || (r == j)) {
                    validar_votosdiputados_empates();// llamada al metodo para indicar empate
                }                  
            }
        }
    }//GEN-LAST:event_jBtn_msn_diputadoganadorMouseClicked

    private void jBtn_msn_alcaldeganadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_msn_alcaldeganadorMouseClicked
        // TODO add your handling code here:
        //codigo ganador alcaldes
        //codigo ganador para alcalde
        //verifica que no nexista votos para mostar mensaje de error
        if (jTxFld_resultado_alcalde1.getText().equals("") && jTxFld_resultado_alcalde2.getText().equals("")
                && jTxFld_resultado_alcalde3.getText().equals("") && jTxFld_resultado_alcalde4.getText().equals("")
                && jTxFld_resulnulos_alcaldes.getText().equals("") && jTxFld_resulblancos_alcaldes.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "   NO EXISTEN VOTOS  ", " * * *   ERROR   * * *", 0);
        } 
        //caso contrario verifica si hay ganador o empate
        else {
            boolean verificar =votomayoralcalde();//llamada al metodo para que retorne true si hay voto mayor
            if (verificar==true) {//si es true
                int mayorpuntaje = votomayor1alcalde();//llamada al metodo para indique el resultado mayor
                int ganador=votomayor2alcalde();// llamada al metodo para que indique cual es el nombre de ganador
                //muestra el candidato ganador
                if(ganador==1)
                {
                     JOptionPane.showMessageDialog(null, "Eco. Renato Benavides    " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_alcaldes.getText().toString()))+ "   votos"+"\n(CORREA)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==2)
                {
                    JOptionPane.showMessageDialog(null, "Lcd. Luis Morán    " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_alcaldes.getText().toString()))+ "   votos"+"\n(GUTIERREZ)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==3)
                {
                    JOptionPane.showMessageDialog(null, "Ab. Fernando Lopéz    " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_alcaldes.getText().toString()))+ "   votos"+"\n(MAHUAD)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
                if(ganador==4)
                {
                     JOptionPane.showMessageDialog(null, "Ing. Armando Peñaherrera    " + (mayorpuntaje+Integer.parseInt(jTxFld_resulblancos_alcaldes.getText().toString()))+ "   votos"+"\n(ROLDOS)", " * * *   CANDIDATO GANADOR   * * *", 1);
                }
            }
            //caso contrario false
            else {
                int c = Integer.parseInt(jTxFld_resultado_alcalde1.getText());
                int l = Integer.parseInt(jTxFld_resultado_alcalde2.getText());
                int j = Integer.parseInt(jTxFld_resultado_alcalde3.getText());
                int r = Integer.parseInt(jTxFld_resultado_alcalde4.getText());
                int n = Integer.parseInt(jTxFld_resulnulos_alcaldes.getText());
                int b = Integer.parseInt(jTxFld_resulblancos_alcaldes.getText());
                 //verifica empates
                if ((c == l && c == j && c == r) || (l == c && c == j) || (r == l && l == c) || (l == c) || (j == j && j == c) || (j == c) || (r == c) || (r == j && j == l) || (j == l) || (r == l) || (r == j)) {
                    validar_votosalcalde_empates();// llamada al metodo para indicar empate
                }
            }
        }
    }//GEN-LAST:event_jBtn_msn_alcaldeganadorMouseClicked
    /**
     * @param args the command line arguments
     */
//     public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                    new diputados_alcaldes().setVisible(true); // clase principal
//
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ir_editar;
    private javax.swing.JButton jBtn_ir_resultados;
    private javax.swing.JButton jBtn_msn_alcaldeganador;
    private javax.swing.JButton jBtn_msn_diputadoganador;
    private javax.swing.JLabel jLbl_alcalde1;
    private javax.swing.JLabel jLbl_alcalde2;
    private javax.swing.JLabel jLbl_alcalde3;
    private javax.swing.JLabel jLbl_alcalde4;
    private javax.swing.JLabel jLbl_diputado1;
    private javax.swing.JLabel jLbl_diputado2;
    private javax.swing.JLabel jLbl_diputado3;
    private javax.swing.JLabel jLbl_diputado4;
    private javax.swing.JLabel jLbl_gifmuñeco;
    private javax.swing.JLabel jLbl_imagen_alcalde1;
    private javax.swing.JLabel jLbl_imagen_alcalde2;
    private javax.swing.JLabel jLbl_imagen_alcalde3;
    private javax.swing.JLabel jLbl_imagen_alcalde4;
    private javax.swing.JLabel jLbl_imagen_diputado1;
    private javax.swing.JLabel jLbl_imagen_diputado2;
    private javax.swing.JLabel jLbl_imagen_diputado3;
    private javax.swing.JLabel jLbl_imagen_diputado4;
    private javax.swing.JLabel jLbl_imagenmuñeco;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JLabel jLbl_titulo_ResultadosElectorales;
    private javax.swing.JLabel jLbl_votosblancos_alcaldes;
    private javax.swing.JLabel jLbl_votosblancos_diputados;
    private javax.swing.JLabel jLbl_votosnulos_alcaldes;
    private javax.swing.JLabel jLbl_votosnulos_diputados;
    private javax.swing.JLabel jLbl_votostotales_alcaldes;
    private javax.swing.JLabel jLbl_votostotales_diputados;
    private javax.swing.JPanel jPnl_alcalde_correa;
    private javax.swing.JPanel jPnl_alcalde_gutierrez;
    private javax.swing.JPanel jPnl_alcalde_mahuad;
    private javax.swing.JPanel jPnl_alcalde_roldos;
    private javax.swing.JPanel jPnl_alcaldes;
    private javax.swing.JPanel jPnl_diputado_correa;
    private javax.swing.JPanel jPnl_diputado_gutierrez;
    private javax.swing.JPanel jPnl_diputado_mahuad;
    private javax.swing.JPanel jPnl_diputado_roldos;
    private javax.swing.JPanel jPnl_diputados;
    private javax.swing.JTextField jTxFld_resulblancos_alcaldes;
    private javax.swing.JTextField jTxFld_resulblancos_diputados;
    private javax.swing.JTextField jTxFld_resulnulos_alcaldes;
    private javax.swing.JTextField jTxFld_resulnulos_diputados;
    private javax.swing.JTextField jTxFld_resultado_alcalde1;
    private javax.swing.JTextField jTxFld_resultado_alcalde2;
    private javax.swing.JTextField jTxFld_resultado_alcalde3;
    private javax.swing.JTextField jTxFld_resultado_alcalde4;
    private javax.swing.JTextField jTxFld_resultado_diputado1;
    private javax.swing.JTextField jTxFld_resultado_diputado2;
    private javax.swing.JTextField jTxFld_resultado_diputado3;
    private javax.swing.JTextField jTxFld_resultado_diputado4;
    private javax.swing.JTextField jTxFld_resultotales_alcaldes;
    private javax.swing.JTextField jTxFld_resultotales_diputados;
    // End of variables declaration//GEN-END:variables
}
