/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Capa_Presentación;
import Capa_Datos.Conexion;
import Capa_Juzgado.DataApoderadoDemdd;
import Capa_Juzgado.DataApoderadoDemdt;
import Capa_Juzgado.DataDemandado;
import Capa_Juzgado.DataDemandante;
import Capa_Juzgado.DataDetalleProceso;
import Capa_Juzgado.DataProceso;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    Conexion con = new Conexion();
    
    public Principal() {
        initComponents();
        LimpiarCajasTexto();
        ListarDemandado();
        ListarApoderadoDemdd();
        ListarDemandante();
        ListarApoderadoDemdt();
        Listardetalle_Proceso();
        listar_proceso();
    }
    public void LimpiarCajasTexto()
    {
        this.ID.setText("");
        this.Nom.setText("");
        this.TipID.setText("");
        this.correo.setText("");
        this.direc.setText("");
        this.telef.setText("");
        
        
        this.IDdeman.setText("");
        this.Nomdeman.setText("");
        this.TipIDdeman.setText("");
        this.Correodeman.setText("");
        this.Direcdeman.setText("");
        this.telfdeman.setText("");
        
        this.ID_apo.setText("");
        this.NomApo.setText("");
        this.TipIDapo.setText("");
        this.CorreoApo.setText("");
        this.DirecApo.setText("");
        this.Telapo.setText("");
        
        this.ID_apodeman.setText("");
        this.NomApodeman.setText("");
        this.TipIDapodeman.setText("");
        this.CorreoApodeman.setText("");
        this.DirecApodeman.setText("");
        this.Telapondeman.setText("");
    }
    
     public void ListarDemandado()
    {
        DefaultTableModel tabla1=new DefaultTableModel();
        DataDemandado objdem=new DataDemandado();
        ArrayList<DataDemandado> lista3=new ArrayList();
        lista3=objdem.ListaDemandado();
        tabla1.addColumn("ID");
        tabla1.addColumn("Nombre");
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
            tabla1.setValueAt(x.getDemdd_TipoID(), i, 2);
            tabla1.setValueAt(x.getDemdd_Correo(), i, 3);
            tabla1.setValueAt(x.getDemdd_Direc(), i, 4);
            tabla1.setValueAt(x.getDemdd_Telef(), i,5);
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
            tabla.setValueAt(x.getDemdt_TipoID(),j,2);
            tabla.setValueAt(x.getDemdt_Correo(), j, 3);
            tabla.setValueAt(x.getDemdt_Direc(), j, 4);
            tabla.setValueAt(x.getDemdt_Telef(), j, 5);
            j++;
        }
    }
      
      public void ListarApoderadoDemdd()
    {
        DefaultTableModel tabla3=new DefaultTableModel();
        DataApoderadoDemdd objAdem=new DataApoderadoDemdd();
        ArrayList<DataApoderadoDemdd> lista3=new ArrayList();
        lista3=objAdem.ListaApodeDemdd();
        tabla3.addColumn("ID");
        tabla3.addColumn("Nombre");
        tabla3.addColumn("Tipo ID");
        tabla3.addColumn("Correo");
        tabla3.addColumn("Direccion");
        tabla3.addColumn("Telefono");
        tabla3.setRowCount(lista3.size());
        int i=0;
        for (DataApoderadoDemdd x: lista3) 
        {
            tabla3.setValueAt(x.getApoDemdd_ID(), i, 0);
            tabla3.setValueAt(x.getApoDemdd_Nom(), i, 1);
            tabla3.setValueAt(x.getApoDemdd_TipoID(), i, 2);
            tabla3.setValueAt(x.getApoDemdd_Correo(), i, 3);
            tabla3.setValueAt(x.getApoDemdd_Direc(), i, 4);
            tabla3.setValueAt(x.getApoDemdd_Telef(), i, 5);
            i++;
        }
        
    }
      
      public void ListarApoderadoDemdt()
    {
        DefaultTableModel tabla4=new DefaultTableModel();
        DataApoderadoDemdt objAdem=new DataApoderadoDemdt();
        ArrayList<DataApoderadoDemdt> lista3=new ArrayList();
        lista3=objAdem.ListaApoDemdt();
        tabla4.addColumn("ID");
        tabla4.addColumn("Nombre");
        tabla4.addColumn("Tipo ID");
        tabla4.addColumn("Correo");
        tabla4.addColumn("Direccion");
        tabla4.addColumn("Telefono");
        tabla4.setRowCount(lista3.size());
        int i=0;
        for (DataApoderadoDemdt x: lista3) 
        {
            tabla4.setValueAt(x.getApoDemdt_ID(), i, 0);
            tabla4.setValueAt(x.getApoDemdt_Nom(), i, 1);
            tabla4.setValueAt(x.getApoDemdt_TipoID(), i, 2);
            tabla4.setValueAt(x.getApoDemdt_Correo(), i, 3);
            tabla4.setValueAt(x.getApoDemdt_Direc(), i, 4);
            tabla4.setValueAt(x.getApoDemdt_Telef(), i, 5);
            i++;
        }
        
    }
      
    public void Listardetalle_Proceso()
    {
       DefaultTableModel tabla1=new DefaultTableModel();
        DataDetalleProceso objdem=new DataDetalleProceso();
        ArrayList<DataDetalleProceso> lista6=new ArrayList();
        lista6=objdem.ListaDetalleproceso();
        tabla1.addColumn("Num_Detalle");
        tabla1.addColumn("Estado");
        tabla1.addColumn("Num_Radicado");
        tabla1.addColumn("ID_Demdt");
        tabla1.addColumn("ID_ApoDemdt");
        tabla1.addColumn("ID_Demdd");
        tabla1.addColumn("ID_ApoDemdd");
        tabla1.setRowCount(lista6.size());
        int i=0;
        for (DataDetalleProceso x: lista6) 
        {
            tabla1.setValueAt(x.getDetalle_numdetalle(), i, 0);
            tabla1.setValueAt(x.getDetalle_estado(), i, 1);
            tabla1.setValueAt(x.getDetalle_fknumradi(), i, 2);
            tabla1.setValueAt(x.getDetalle_fkiddemandante(), i, 3);
            tabla1.setValueAt(x.getDetalle_fkidapdemandante(), i, 4);
            tabla1.setValueAt(x.getDetalle_fkiddemandado(), i, 5);
            tabla1.setValueAt(x.getDetalle_fkidapdemandado(), i, 6);
            i++;
        }
        
    
    }
    
    public void listar_proceso()
    {
        DefaultTableModel tabla1 = new DefaultTableModel();
        DataProceso objpro = new DataProceso();
        ArrayList<DataProceso> lista2=new ArrayList();
        lista2=objpro.ListarProceso();
        tabla1.addColumn("Numero de Radicado");
        tabla1.addColumn("Fecha de inicio");
        tabla1.addColumn("Contrato que lo modifico");
        int i =0;
        for (DataProceso x: lista2) {
            tabla1.setValueAt(x.getPr_numradicado(), i, 0);
            tabla1.setValueAt(x.getPr_fechain(), i, 1);
            tabla1.setValueAt(x.getPr_fkcontr(), i, 2);
            
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
        jPanel1 = new javax.swing.JPanel();
        correo = new javax.swing.JTextField();
        correotex = new javax.swing.JLabel();
        telef = new javax.swing.JTextField();
        Teleftex = new javax.swing.JLabel();
        direc = new javax.swing.JTextField();
        directex = new javax.swing.JLabel();
        TipID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        Nomtex = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        IDtex = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        BsTex1 = new javax.swing.JTextField();
        BSbutton1 = new javax.swing.JButton();
        Confirbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Titulo3 = new javax.swing.JLabel();
        CorreoApo = new javax.swing.JTextField();
        CorreoApotex = new javax.swing.JLabel();
        Telapo = new javax.swing.JTextField();
        Telapotex = new javax.swing.JLabel();
        DirecApo = new javax.swing.JTextField();
        DirecApotex = new javax.swing.JLabel();
        TipIDapo = new javax.swing.JTextField();
        DNIapotex = new javax.swing.JLabel();
        NomApo = new javax.swing.JTextField();
        NomApotex = new javax.swing.JLabel();
        ID_apo = new javax.swing.JTextField();
        ID_apotex = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        BsTex = new javax.swing.JTextField();
        BSbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Correodeman = new javax.swing.JTextField();
        Correodemantex = new javax.swing.JLabel();
        telfdeman = new javax.swing.JTextField();
        telfdemantex = new javax.swing.JLabel();
        Direcdeman = new javax.swing.JTextField();
        Direcdemantex = new javax.swing.JLabel();
        TipIDdeman = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Nomdemtxt = new javax.swing.JLabel();
        Nomdeman = new javax.swing.JTextField();
        IDdeman = new javax.swing.JTextField();
        IDdemantex = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        BsTex2 = new javax.swing.JTextField();
        BSbutton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CorreoApodeman = new javax.swing.JTextField();
        CorreoApodemantex = new javax.swing.JLabel();
        DirecApodeman = new javax.swing.JTextField();
        Telapondemantex = new javax.swing.JLabel();
        Telapondeman = new javax.swing.JTextField();
        DirecApodemantex = new javax.swing.JLabel();
        TipIDapodeman = new javax.swing.JTextField();
        DNIapodemantex = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        NomApodeman = new javax.swing.JTextField();
        NomApodemantex = new javax.swing.JLabel();
        ID_apodeman = new javax.swing.JTextField();
        ID_apodemantex = new javax.swing.JLabel();
        Titulo4 = new javax.swing.JLabel();
        BsTex3 = new javax.swing.JTextField();
        BSbutton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Numradicado = new javax.swing.JTextField();

        bg.setBackground(new java.awt.Color(255, 255, 255));

        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });

        correotex.setText("Correo electronico");

        telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefKeyTyped(evt);
            }
        });

        Teleftex.setText("Telefono");

        direc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direcKeyTyped(evt);
            }
        });

        directex.setText("Direccion");

        TipID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipIDActionPerformed(evt);
            }
        });
        TipID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TipIDKeyTyped(evt);
            }
        });

        jLabel2.setText("Tipo ID");

        Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomKeyTyped(evt);
            }
        });

        Nomtex.setText("Nombre ");

        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });

        IDtex.setText("ID demandante");

        Titulo1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo1.setText("Demandante");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "NIT", "CE" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        BSbutton1.setText("Buscar id");
        BSbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Teleftex, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(correotex, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(directex, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(IDtex, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(97, 97, 97))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(telef, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(direc, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TipID, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(Nomtex)
                                            .addGap(172, 172, 172))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BsTex1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Titulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(BSbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Nom, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BsTex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSbutton1))
                .addGap(5, 5, 5)
                .addComponent(IDtex, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Nomtex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directex, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Teleftex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correotex, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

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

        Titulo3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo3.setText("Apoderado Demandante");

        CorreoApo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoApoKeyTyped(evt);
            }
        });

        CorreoApotex.setText("Correo electronico");

        Telapo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelapoActionPerformed(evt);
            }
        });
        Telapo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelapoKeyTyped(evt);
            }
        });

        Telapotex.setText("Telefono");

        DirecApo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirecApoActionPerformed(evt);
            }
        });
        DirecApo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DirecApoKeyTyped(evt);
            }
        });

        DirecApotex.setText("Direccion");

        TipIDapo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipIDapoActionPerformed(evt);
            }
        });
        TipIDapo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TipIDapoKeyTyped(evt);
            }
        });

        DNIapotex.setText("Tipo id");

        NomApo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomApoActionPerformed(evt);
            }
        });
        NomApo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomApoKeyTyped(evt);
            }
        });

        NomApotex.setText("Nombre");

        ID_apo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_apoActionPerformed(evt);
            }
        });
        ID_apo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ID_apoKeyTyped(evt);
            }
        });

        ID_apotex.setText("ID_Apoderado");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "NIT", "CE" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        BSbutton.setText("Buscar id");
        BSbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CorreoApotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(138, 138, 138))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Telapotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(190, 190, 190))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DirecApotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(186, 186, 186))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(DNIapotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TipIDapo)
                            .addComponent(DirecApo)
                            .addComponent(Telapo)
                            .addComponent(ID_apo)
                            .addComponent(CorreoApo)
                            .addComponent(NomApo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ID_apotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(154, 154, 154))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(BsTex)
                                .addGap(18, 18, 18)
                                .addComponent(BSbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NomApotex, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo3))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BsTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ID_apotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID_apo)
                .addGap(3, 3, 3)
                .addComponent(NomApotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomApo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNIapotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipIDapo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirecApotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirecApo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telapotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telapo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CorreoApotex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CorreoApo)
                .addGap(31, 31, 31))
        );

        Correodeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreodemanActionPerformed(evt);
            }
        });
        Correodeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreodemanKeyTyped(evt);
            }
        });

        Correodemantex.setText("Correo electronico");

        telfdeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telfdemanKeyTyped(evt);
            }
        });

        telfdemantex.setText("Telefono");

        Direcdeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DirecdemanKeyTyped(evt);
            }
        });

        Direcdemantex.setText("Direccion");

        TipIDdeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TipIDdemanKeyTyped(evt);
            }
        });

        jLabel1.setText("Tipo ID");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "NIT", "CE" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Nomdemtxt.setText("Nombre ");

        Nomdeman.setMinimumSize(new java.awt.Dimension(0, 0));
        Nomdeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomdemanActionPerformed(evt);
            }
        });
        Nomdeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomdemanKeyTyped(evt);
            }
        });

        IDdeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDdemanActionPerformed(evt);
            }
        });
        IDdeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDdemanKeyTyped(evt);
            }
        });

        IDdemantex.setText("ID demandado");

        Titulo2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo2.setText("Demandado");

        BSbutton2.setText("Buscar id");
        BSbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSbutton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BsTex2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BSbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Correodemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(telfdemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Direcdemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Direcdeman, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(telfdeman, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Correodeman, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TipIDdeman, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addComponent(IDdeman, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nomdemtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IDdemantex)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(Nomdeman, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BsTex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSbutton2))
                .addGap(8, 8, 8)
                .addComponent(IDdemantex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDdeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Nomdemtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nomdeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipIDdeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Direcdemantex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Direcdeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telfdemantex, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telfdeman, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correodeman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        CorreoApodeman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoApodemanActionPerformed(evt);
            }
        });
        CorreoApodeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoApodemanKeyTyped(evt);
            }
        });

        CorreoApodemantex.setText("Correo electronico");

        DirecApodeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DirecApodemanKeyTyped(evt);
            }
        });

        Telapondemantex.setText("Telefono");

        Telapondeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelapondemanKeyTyped(evt);
            }
        });

        DirecApodemantex.setText("Direccion");

        TipIDapodeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TipIDapodemanKeyTyped(evt);
            }
        });

        DNIapodemantex.setText("Tipo id");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "NIT", "CE" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        NomApodeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomApodemanKeyTyped(evt);
            }
        });

        NomApodemantex.setText("Nombre");

        ID_apodeman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ID_apodemanKeyTyped(evt);
            }
        });

        ID_apodemantex.setText("ID_Apoderado");

        Titulo4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Titulo4.setText("Apoderado Demandado");

        BSbutton3.setText("Buscar id");
        BSbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSbutton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CorreoApodemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Telapondemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DirecApodemantex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomApodemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(DNIapodemantex, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID_apodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TipIDapodeman)
                                    .addComponent(Telapondeman, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DirecApodeman)
                                    .addComponent(CorreoApodeman)
                                    .addComponent(ID_apodeman)
                                    .addComponent(NomApodeman))))
                        .addGap(72, 72, 72))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BsTex3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BSbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BsTex3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSbutton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID_apodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID_apodeman, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(NomApodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NomApodeman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNIapodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TipIDapodeman, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirecApodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DirecApodeman, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Telapondemantex, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telapondeman, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CorreoApodemantex, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CorreoApodeman, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        jLabel3.setText("Numero de radicado del proceso:");

        Numradicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumradicadoActionPerformed(evt);
            }
        });
        Numradicado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumradicadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(Confirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(Numradicado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Numradicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String mensaje;
        mensaje=jComboBox2.getSelectedItem().toString();
        TipIDapo.setText(mensaje);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String mensaje;
        mensaje=jComboBox1.getSelectedItem().toString();
        TipIDdeman.setText(mensaje);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ConfirbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirbuttonActionPerformed

        if(Nom.getText().length()!=0&&ID.getText().length()!=0
            &&TipID.getText().length()!=0&&correo.getText().length()!=0&&direc.getText().length()!=0
            &&telef.getText().length()!=0&&IDdeman.getText().length()!=0&&Nomdeman.getText().length()!=0
            &&TipIDdeman.getText().length()!=0
            &&Correodeman.getText().length()!=0&&Direcdeman.getText().length()!=0
            &&telfdeman.getText().length()!=0&&NomApo.getText().length()!=0&&ID_apo.getText().length()!=0
            &&TipIDapo.getText().length()!=0&&CorreoApo.getText().length()!=0&&DirecApo.getText().length()!=0
            &&Telapo.getText().length()!=0&&ID_apodeman.getText().length()!=0&&NomApodeman.getText().length()!=0
            &&TipIDapodeman.getText().length()!=0
            &&CorreoApodeman.getText().length()!=0&&DirecApodeman.getText().length()!=0
            &&Telapondeman.getText().length()!=0&&Numradicado.getText().length()!=0){
            
            try {
                
            
            DataDemandante objart=new DataDemandante();
            objart.setDemt_ID(Long.parseLong(this.ID.getText()));
            objart.setDemdt_Nom(this.Nom.getText());
            objart.setDemdt_TipoID(this.TipID.getText());
            objart.setDemdt_Correo(this.correo.getText());
            objart.setDemdt_Direc(this.direc.getText());
            objart.setDemdt_Telef(Long.parseLong(this.telef.getText()));
            //JOptionPane.showMessageDialog(null, objart.GuardarDemandante());
            objart.GuardarDemandante();
            ListarDemandante();

            DataDemandado objmed=new DataDemandado();
            objmed.setDemdd_ID(Long.parseLong(this.IDdeman.getText()));
            objmed.setDemdd_Nom(this.Nomdeman.getText());
            objmed.setDemdd_TipoID(this.TipIDdeman.getText());
            objmed.setDemdd_Correo(this.Correodeman.getText());
            objmed.setDemdd_Direc(this.Direcdeman.getText());
            objmed.setDemdd_Telef(Long.parseLong(this.telfdeman.getText()));
            //JOptionPane.showMessageDialog(null, objmed.GuardarDemandado());
            objmed.GuardarDemandado();
            ListarDemandado();
            
            DataApoderadoDemdt objapo=new DataApoderadoDemdt();
            objapo.setApoDemdt_ID(Long.parseLong(this.ID_apo.getText()));
            objapo.setApoDemdt_Nom(this.NomApo.getText());
            objapo.setApoDemdt_TipoID(this.TipIDapo.getText());
            objapo.setApoDemdt_Correo(this.CorreoApo.getText());
            objapo.setApoDemdt_Direc(this.DirecApo.getText());
            objapo.setApoDemdt_Telef(Long.parseLong(this.Telapo.getText()));
        //JOptionPane.showMessageDialog(null, objapo.GuardarApoDemandante());
        objapo.GuardarApoDemandante();
        ListarApoderadoDemdt();
        
        
        DataApoderadoDemdd objapod=new DataApoderadoDemdd();
        objapod.setApoDemdd_ID(Long.parseLong(this.ID_apodeman.getText()));
        objapod.setApoDemdd_Nom(this.NomApodeman.getText());
        objapod.setApoDemdd_TipoID(this.TipIDapodeman.getText());
        objapod.setApoDemdd_Correo(this.CorreoApodeman.getText());
        objapod.setApoDemdd_Direc(this.DirecApodeman.getText());
        objapod.setApoDemdd_Telef(Long.parseLong(this.Telapondeman.getText()));
        //JOptionPane.showMessageDialog(null, objapod.GuardarApoDemandado());
        objapod.GuardarApoDemandado();
        ListarApoderadoDemdd();
        
        DataProceso objpr = new DataProceso();
        //ResultSet ca = con.listar("Select * from   where FKCod_Cargo ="+ this..getText());
        objpr.setPr_numradicado(Long.parseLong(this.Numradicado.getText()));
        objpr.setPr_fechain("2023-03-24");
        objpr.setPr_fkcontr("1");
        //JOptionPane.showMessageDialog(null, objpr.GuardarDetallep());
        objpr.GuardarDetallep();
                listar_proceso();
        
        DataDetalleProceso objdet = new DataDetalleProceso();
        objdet.setDetalle_estado("En proceso");
        objdet.setDetalle_fknumradi(Long.parseLong(this.Numradicado.getText()));
        objdet.setDetalle_fkiddemandante(Long.parseLong(this.ID.getText()));
        objdet.setDetalle_fkidapdemandante(Long.parseLong(this.ID_apo.getText()));
        objdet.setDetalle_fkiddemandado(Long.parseLong(this.IDdeman.getText()));
        objdet.setDetalle_fkidapdemandado(Long.parseLong(this.ID_apodeman.getText()));
        //JOptionPane.showMessageDialog(null, objdet.GuardarDetalle());
        objdet.GuardarDetalle();
        Listardetalle_Proceso();
                } catch (Exception ex) {
            System.out.println(ex);
        }
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe rellenar todas las caisillas para confirmar");
        }
        
        
        
        LimpiarCajasTexto();
        JOptionPane.showMessageDialog(null, "Se ha agregado la información");
    }//GEN-LAST:event_ConfirbuttonActionPerformed

    private void CorreodemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreodemanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreodemanActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String mensaje;
        mensaje=jComboBox3.getSelectedItem().toString();
        TipIDapodeman.setText(mensaje);
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        String mensaje;
        mensaje=jComboBox4.getSelectedItem().toString();
        TipID.setText(mensaje);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void IDdemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDdemanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDdemanActionPerformed

    private void TipIDapoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipIDapoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TipIDapoActionPerformed

    private void ID_apoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_apoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!(numeros)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_ID_apoKeyTyped

    private void NomApoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomApoKeyTyped
        // TODO add your handling code here:
        
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==27;
        if (!(minusculas||mayusculas||espacio||borrar)) {
            evt.consume();
        }
        
        
        
    }//GEN-LAST:event_NomApoKeyTyped

    private void ID_apoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_apoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_apoActionPerformed

    private void TipIDapoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipIDapoKeyTyped
        // TODO add your handling code here:
        evt.consume();
    }//GEN-LAST:event_TipIDapoKeyTyped

    private void TipIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipIDActionPerformed

    private void TipIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipIDKeyTyped
        // TODO add your handling code here:
                evt.consume();
    }//GEN-LAST:event_TipIDKeyTyped

    private void TipIDdemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipIDdemanKeyTyped
        // TODO add your handling code here:
                evt.consume();
    }//GEN-LAST:event_TipIDdemanKeyTyped

    private void TipIDapodemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TipIDapodemanKeyTyped
        // TODO add your handling code here:
                evt.consume();
    }//GEN-LAST:event_TipIDapodemanKeyTyped

    private void NomApoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomApoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomApoActionPerformed

    private void TelapoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelapoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_TelapoKeyTyped

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();}
    }//GEN-LAST:event_IDKeyTyped

    private void telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_telefKeyTyped

    private void IDdemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDdemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_IDdemanKeyTyped

    private void telfdemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telfdemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_telfdemanKeyTyped

    private void ID_apodemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ID_apodemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_ID_apodemanKeyTyped

    private void TelapondemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelapondemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_TelapondemanKeyTyped

    private void DirecApoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DirecApoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==127;
        boolean numeros = key >= 48 && key <= 57;
        
        int i=0;
        if (!(minusculas||mayusculas||espacio||borrar||numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_DirecApoKeyTyped

    private void CorreoApoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoApoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean punto = key == 46;
        boolean arroba = key == 64;
        boolean borrar = key ==27;
                boolean numeros = key >= 48 && key <= 57;
        int i =0;
        if (!(minusculas||mayusculas||espacio||borrar||punto||arroba||numeros)) {
            evt.consume();
    }  
    }//GEN-LAST:event_CorreoApoKeyTyped

    private void NomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==27;
        int i=0;
        if (!(minusculas||mayusculas||espacio||borrar)) {
            evt.consume();
        }
    }//GEN-LAST:event_NomKeyTyped

    private void direcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direcKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==27;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas||mayusculas||espacio||borrar||numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_direcKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean punto = key == 46;
        boolean arroba = key == 64;
        boolean borrar = key ==27;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas||mayusculas||espacio||borrar||punto||arroba||numeros)) {
            evt.consume();
    }  
    }//GEN-LAST:event_correoKeyTyped

    private void NomdemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomdemanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomdemanActionPerformed

    private void NomdemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomdemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==27;
        int i=0;
        if (!(minusculas||mayusculas||espacio||borrar)) {
            evt.consume();
        }
    }//GEN-LAST:event_NomdemanKeyTyped

    private void DirecdemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DirecdemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==27;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas||mayusculas||espacio||borrar||numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_DirecdemanKeyTyped

    private void CorreodemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreodemanKeyTyped
int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean punto = key == 46;
        boolean arroba = key == 64;
        boolean borrar = key ==27;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas||mayusculas||espacio||borrar||punto||arroba||numeros)) {
            evt.consume();
    }  
    }//GEN-LAST:event_CorreodemanKeyTyped

    private void NomApodemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomApodemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        boolean borrar = key ==27;
        if (!(minusculas||mayusculas||espacio||borrar||numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_NomApodemanKeyTyped

    private void DirecApodemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DirecApodemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean borrar = key ==27;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas||mayusculas||espacio||borrar||numeros)) {
            evt.consume();}
    }//GEN-LAST:event_DirecApodemanKeyTyped

    private void CorreoApodemanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoApodemanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoApodemanActionPerformed

    private void CorreoApodemanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoApodemanKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key ==32;
        boolean punto = key == 46;
        boolean arroba = key == 64;
        boolean borrar = key ==27;
        int i=0;
                boolean numeros = key >= 48 && key <= 57;
        if (!(minusculas||mayusculas||espacio||borrar||punto||arroba||numeros)) {
            evt.consume();

        }
    }//GEN-LAST:event_CorreoApodemanKeyTyped

    private void DirecApoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirecApoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirecApoActionPerformed

    private void NumradicadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumradicadoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        int i=0;
        if (!(numeros)) {
            evt.consume();
        }
        
    }//GEN-LAST:event_NumradicadoKeyTyped

    private void TelapoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelapoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelapoActionPerformed

    private void NumradicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumradicadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumradicadoActionPerformed

    private void BSbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSbuttonActionPerformed
        Conexion con = new Conexion();
        DataApoderadoDemdt objdem = new DataApoderadoDemdt();
        long i = objdem.getApoDemdt_ID();
        try {
            ResultSet cad = con.listar("Select * from Apoderado_Demandante where id_Apdemandante = " + this.BsTex.getText());

                while (cad.next()) {

                    ID_apo.setText(cad.getString("id_Apdemandante"));
                    NomApo.setText(cad.getString("nombre"));
                    TipIDapo.setText(cad.getString("tipo_id"));
                    CorreoApo.setText(cad.getString("correo_electronico"));
                    DirecApo.setText(cad.getString("direccion"));
                    Telapo.setText(cad.getString("telefono"));
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_BSbuttonActionPerformed

    private void BSbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSbutton1ActionPerformed
Conexion con = new Conexion();
        DataDemandante objdem = new DataDemandante();
        long i = objdem.getDemt_ID();
        try {
            ResultSet cad = con.listar("Select * from Demandante where id_demandante = " + this.BsTex1.getText());

                while (cad.next()) {

                    ID.setText(cad.getString("id_demandante"));
                    Nom.setText(cad.getString("nombre"));
                    TipID.setText(cad.getString("tipo_id"));
                    correo.setText(cad.getString("correo_electronico"));
                    direc.setText(cad.getString("direccion"));
                    telef.setText(cad.getString("telefono"));
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_BSbutton1ActionPerformed

    private void BSbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSbutton2ActionPerformed
Conexion con = new Conexion();
        DataDemandado objdem = new DataDemandado();
        long i = objdem.getDemdd_ID();
        try {
            ResultSet cad = con.listar("Select * from Demandado where id_demandado = " + this.BsTex2.getText());

                while (cad.next()) {

                    IDdeman.setText(cad.getString("id_demandado"));
                    Nomdeman.setText(cad.getString("nombre"));
                    TipIDdeman.setText(cad.getString("tipo_id"));
                    Correodeman.setText(cad.getString("correo_electronico"));
                    Direcdeman.setText(cad.getString("direccion"));
                    telfdeman.setText(cad.getString("telefono"));
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }              
    }//GEN-LAST:event_BSbutton2ActionPerformed

    private void BSbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSbutton3ActionPerformed
        Conexion con = new Conexion();
        DataApoderadoDemdd objdem = new DataApoderadoDemdd();
        long i = objdem.getApoDemdd_ID();
        try {
            ResultSet cad = con.listar("Select * from Apoderado_Demandado where id_apdemandado = " + this.BsTex3.getText());

                while (cad.next()) {

                    ID_apodeman.setText(cad.getString("id_apdemandado"));
                    NomApodeman.setText(cad.getString("nombre"));
                    TipIDapodeman.setText(cad.getString("tipo_id"));
                    CorreoApodeman.setText(cad.getString("correo_electronico"));
                    DirecApodeman.setText(cad.getString("direccion"));
                    Telapondeman.setText(cad.getString("telefono"));
                }
        } catch (SQLException ex) {
            System.out.println(ex);
        }                
                // TODO add your handling code here:
    }//GEN-LAST:event_BSbutton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSbutton;
    private javax.swing.JButton BSbutton1;
    private javax.swing.JButton BSbutton2;
    private javax.swing.JButton BSbutton3;
    private javax.swing.JTextField BsTex;
    private javax.swing.JTextField BsTex1;
    private javax.swing.JTextField BsTex2;
    private javax.swing.JTextField BsTex3;
    private javax.swing.JButton Confirbutton;
    private javax.swing.JTextField CorreoApo;
    private javax.swing.JTextField CorreoApodeman;
    private javax.swing.JLabel CorreoApodemantex;
    private javax.swing.JLabel CorreoApotex;
    private javax.swing.JTextField Correodeman;
    private javax.swing.JLabel Correodemantex;
    private javax.swing.JLabel DNIapodemantex;
    private javax.swing.JLabel DNIapotex;
    private javax.swing.JTextField DirecApo;
    private javax.swing.JTextField DirecApodeman;
    private javax.swing.JLabel DirecApodemantex;
    private javax.swing.JLabel DirecApotex;
    private javax.swing.JTextField Direcdeman;
    private javax.swing.JLabel Direcdemantex;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField ID_apo;
    private javax.swing.JTextField ID_apodeman;
    private javax.swing.JLabel ID_apodemantex;
    private javax.swing.JLabel ID_apotex;
    private javax.swing.JTextField IDdeman;
    private javax.swing.JLabel IDdemantex;
    private javax.swing.JLabel IDtex;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField NomApo;
    private javax.swing.JTextField NomApodeman;
    private javax.swing.JLabel NomApodemantex;
    private javax.swing.JLabel NomApotex;
    private javax.swing.JTextField Nomdeman;
    private javax.swing.JLabel Nomdemtxt;
    private javax.swing.JLabel Nomtex;
    private javax.swing.JTextField Numradicado;
    private javax.swing.JTextField Telapo;
    private javax.swing.JTextField Telapondeman;
    private javax.swing.JLabel Telapondemantex;
    private javax.swing.JLabel Telapotex;
    private javax.swing.JLabel Teleftex;
    private javax.swing.JTextField TipID;
    private javax.swing.JTextField TipIDapo;
    private javax.swing.JTextField TipIDapodeman;
    private javax.swing.JTextField TipIDdeman;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JPanel bg;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correotex;
    private javax.swing.JTextField direc;
    private javax.swing.JLabel directex;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField telef;
    private javax.swing.JTextField telfdeman;
    private javax.swing.JLabel telfdemantex;
    // End of variables declaration//GEN-END:variables
}
