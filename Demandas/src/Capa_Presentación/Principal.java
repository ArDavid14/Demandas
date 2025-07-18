/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Capa_Presentación;
import Capa_Juzgado.DataDemandado;
import Capa_Juzgado.DataDemandante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Dcubi
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        LimpiarCajasTexto();
        ListarDemandado();
    }
    public void LimpiarCajasTexto()
    {
        this.ID.setText("");
        this.Nom.setText("");
        this.Apellido.setText("");
        this.TipID.setText("");
        this.correo.setText("");
        this.direc.setText("");
        this.telef.setText("");
        
        
        this.IDdeman.setText("");
        this.Nomdeman.setText("");
        this.Apellidodeman.setText("");
        this.TipIDdeman.setText("");
        this.Correodeman.setText("");
        this.Direcdeman.setText("");
        this.telfdeman.setText("");
    }
    
     public void ListarDemandado()
    {
        DefaultTableModel tabla1=new DefaultTableModel();
        DataDemandado objdem=new DataDemandado();
        ArrayList<DataDemandado> lista3=new ArrayList();
        lista3=objdem.ListaDemandado();
        tabla1.addColumn("ID");
        tabla1.addColumn("Nombre");
        tabla1.addColumn("Apellido");
        tabla1.addColumn("Tipo ID");
        tabla1.addColumn("Correo");
        tabla1.addColumn("Direccion");
        tabla1.addColumn("Telefono");
        tabla1.setRowCount(lista3.size());
        int i=0;
        for (DataDemandado x: lista3) 
        {
            tabla1.setValueAt(x.getDemdd_ID(), i, 0);
            tabla1.setValueAt(x.getDemdd_Nom(), i, 1);
            tabla1.setValueAt(x.getDemdd_Apel(), i, 2);
            tabla1.setValueAt(x.getDemdd_TipoID(), i, 3);
            tabla1.setValueAt(x.getDemdd_Correo(), i, 4);
            tabla1.setValueAt(x.getDemdd_Direc(), i, 5);
            tabla1.setValueAt(x.getDemdd_Telef(), i, 6);
            i++;
        }
        
    }
      public void ListarDemandante()
    {
        DefaultTableModel tabla=new DefaultTableModel();
        DataDemandante objart=new DataDemandante();
        ArrayList<DataDemandante> lista2=new ArrayList();
        lista2=objart.ListaDemandante();
        tabla.addColumn("ID");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Tipo ID");
        tabla.addColumn("Correo");
        tabla.addColumn("Direccion");
        tabla.addColumn("Telefono");
        tabla.setRowCount(lista2.size());
        int j=0;
        for (DataDemandante x: lista2) 
        {
            tabla.setValueAt(x.getDemt_ID(), j, 0);
            tabla.setValueAt(x.getDemdt_Nom(), j, 1);
            tabla.setValueAt(x.getDemdt_Apel(), j, 2);
            tabla.setValueAt(x.getDemdt_TipoID(),j,3);
            tabla.setValueAt(x.getDemdt_Correo(), j, 4);
            tabla.setValueAt(x.getDemdt_Direc(), j, 5);
            tabla.setValueAt(x.getDemdt_Telef(), j, 6);
            j++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Nomtex = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        DNItex = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        directex = new javax.swing.JLabel();
        direc = new javax.swing.JTextField();
        Teleftex = new javax.swing.JLabel();
        telef = new javax.swing.JTextField();
        correotex = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        Nomdemtxt = new javax.swing.JLabel();
        Nomdeman = new javax.swing.JTextField();
        DNIdemantex = new javax.swing.JLabel();
        Apellidodeman = new javax.swing.JTextField();
        Direcdemantex = new javax.swing.JLabel();
        Direcdeman = new javax.swing.JTextField();
        telfdemantex = new javax.swing.JLabel();
        telfdeman = new javax.swing.JTextField();
        Correodemantex = new javax.swing.JLabel();
        Correodeman = new javax.swing.JTextField();
        Confirbutton = new javax.swing.JButton();
        IDtex = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        TipID = new javax.swing.JTextField();
        TipIDdeman = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDdemantex = new javax.swing.JLabel();
        IDdeman = new javax.swing.JTextField();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        Nomtex.setText("Nombre Demandante");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        Titulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
        Titulo.setText("Formato Demanda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(203, 203, 203))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        DNItex.setText("Apellido");

        directex.setText("Direccion");

        Teleftex.setText("Telefono");

        correotex.setText("Correo electronico");

        Nomdemtxt.setText("Nombre demandado");

        Nomdeman.setMinimumSize(new java.awt.Dimension(0, 0));

        DNIdemantex.setText("Apellido");

        Direcdemantex.setText("Direccion");

        telfdemantex.setText("Telefono");

        Correodemantex.setText("Correo electronico");

        Confirbutton.setBackground(new java.awt.Color(0, 102, 204));
        Confirbutton.setForeground(new java.awt.Color(255, 255, 255));
        Confirbutton.setText("confirmar");
        Confirbutton.setBorder(null);
        Confirbutton.setBorderPainted(false);
        Confirbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirbuttonActionPerformed(evt);
            }
        });

        IDtex.setText("ID demandante");

        jLabel1.setText("Tipo ID");

        jLabel2.setText("Tipo ID");

        IDdemantex.setText("ID demandado");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(Confirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Nomtex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(382, 382, 382))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(DNItex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(327, 327, 327))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(Teleftex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(301, 301, 301))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addComponent(correotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(249, 249, 249))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(correo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(telef, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(direc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 8, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                                .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(TipID, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(directex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52)))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Nomdemtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(521, 521, 521))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Direcdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(635, 635, 635))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(telfdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(639, 639, 639))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(Correodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(587, 587, 587))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(DNIdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(647, 647, 647))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Direcdeman)
                                    .addComponent(telfdeman)
                                    .addComponent(Correodeman)
                                    .addComponent(Nomdeman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(Apellidodeman)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(203, 203, 203))
                                            .addComponent(TipIDdeman))))
                                .addGap(168, 168, 168))))))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ID)
                        .addGap(328, 328, 328))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(IDdeman)
                                .addGap(345, 345, 345))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(IDtex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(582, 582, 582))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(IDdemantex)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(IDtex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDdeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nomtex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nomdemtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nom)
                    .addComponent(Nomdeman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNItex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DNIdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido)
                    .addComponent(Apellidodeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipIDdeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Direcdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direc)
                    .addComponent(Direcdeman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Teleftex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telfdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telef)
                    .addComponent(telfdeman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Correodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(Correodeman))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Confirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirbuttonActionPerformed
    DataDemandante objart=new DataDemandante();
        objart.setDemt_ID(Integer.parseInt(this.ID.getText()));
        objart.setDemdt_Nom(this.Nom.getText());
        objart.setDemdt_Apel(this.Apellido.getText());
        objart.setDemdt_TipoID(this.TipID.getText());
        objart.setDemdt_Correo(this.correo.getText());
        objart.setDemdt_Direc(this.direc.getText());
        objart.setDemdt_Telef(Long.parseLong(this.telef.getText()));
        JOptionPane.showMessageDialog(null, objart.GuardarDemandante());
        ListarDemandante();
        
        
       DataDemandado objmed=new DataDemandado();
        objmed.setDemdd_ID(Integer.parseInt(this.IDdeman.getText()));
        objmed.setDemdd_Nom(this.Nomdeman.getText());
        objmed.setDemdd_Apel(this.Apellidodeman.getText());
        objmed.setDemdd_TipoID(this.TipIDdeman.getText());
        objmed.setDemdd_Correo(this.Correodeman.getText());
        objmed.setDemdd_Direc(this.Direcdeman.getText());
        objmed.setDemdd_Telef(Long.parseLong(this.telfdeman.getText()));
        JOptionPane.showMessageDialog(null, objmed.GuardarDemandado());
        ListarDemandado();
    }//GEN-LAST:event_ConfirbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Apellidodeman;
    private javax.swing.JButton Confirbutton;
    private javax.swing.JTextField Correodeman;
    private javax.swing.JLabel Correodemantex;
    private javax.swing.JLabel DNIdemantex;
    private javax.swing.JLabel DNItex;
    private javax.swing.JTextField Direcdeman;
    private javax.swing.JLabel Direcdemantex;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField IDdeman;
    private javax.swing.JLabel IDdemantex;
    private javax.swing.JLabel IDtex;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Nomdeman;
    private javax.swing.JLabel Nomdemtxt;
    private javax.swing.JLabel Nomtex;
    private javax.swing.JLabel Teleftex;
    private javax.swing.JTextField TipID;
    private javax.swing.JTextField TipIDdeman;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correotex;
    private javax.swing.JTextField direc;
    private javax.swing.JLabel directex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField telef;
    private javax.swing.JTextField telfdeman;
    private javax.swing.JLabel telfdemantex;
    // End of variables declaration//GEN-END:variables
}
