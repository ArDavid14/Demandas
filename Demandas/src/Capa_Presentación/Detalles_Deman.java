/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Capa_Presentación;

import Capa_Juzgado.DataDemandado;
import Capa_Juzgado.DataDemandante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dcubi
 */
public class Detalles_Deman extends javax.swing.JPanel {

    /**
     * Creates new form Detalles_Deman
     */
    public Detalles_Deman() {
        initComponents();
        ListarDemandante();
        ListarDemandado();
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
        //tabla.addColumn("Estado");
        
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
            //tabla.setValueAt(x.getDemdt_Telef(), j, 7);
            j++;
        }
        this.Tabla_Detalle.setModel(tabla);
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
        //tabla1.addColumn("Estado");
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
            //tabla1.setValueAt(x.getDemdd_Telef(), i, 7);
            i++;
        }
        this.jTable1.setModel(tabla1);
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
        Buscartex = new javax.swing.JTextField();
        Buscarbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Detalle = new javax.swing.JTable();
        Titulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Buscartex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscartexActionPerformed(evt);
            }
        });

        Buscarbutton.setBackground(new java.awt.Color(0, 102, 204));
        Buscarbutton.setForeground(new java.awt.Color(255, 255, 255));
        Buscarbutton.setText("Buscar");

        Tabla_Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_Detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tabla_DetalleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Detalle);

        Titulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        Titulo.setText("Demandas realizadas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(454, 454, 454))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Buscartex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscarbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buscartex, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscarbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscartexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscartexActionPerformed
        
    }//GEN-LAST:event_BuscartexActionPerformed

    private void Tabla_DetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_DetalleMousePressed
        
    }//GEN-LAST:event_Tabla_DetalleMousePressed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
    }//GEN-LAST:event_jTable1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscarbutton;
    private javax.swing.JTextField Buscartex;
    private javax.swing.JTable Tabla_Detalle;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
