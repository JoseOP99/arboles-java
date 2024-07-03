
package view;

import arbolAVL.ArchivoIdentificadorLlamadas;
import arbolAVL.Contacto;
import arbolNArio.ArchivosContactosEjecutivos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Pantalla extends javax.swing.JFrame {

    ArchivoIdentificadorLlamadas identificadorLlamadas = new ArchivoIdentificadorLlamadas();
    ArchivosContactosEjecutivos contactosEjecutivos = new ArchivosContactosEjecutivos();
    final static boolean agreg = true;
    final static boolean noAgreg = false;

    public Pantalla() {
        initComponents();
        panelIdentificador.setVisible(false);
        panelEjecutivo.setVisible(false);
        identificadorLlamadas.cargarContacos();
        contactosEjecutivos.cargarContacos();

    }

    public void limpiarTabla(JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            for (int j = 0; j < tabla.getColumnCount(); j++) {
                tabla.setValueAt("", i, j);
            }
        }
    }

    public void desac() {
        panelEjecutivo.setVisible(false);
        contenedorNuevoHijo.setVisible(false);
        contenedorNuevoEjecutivo.setVisible(false);
        contenedorConLinea.setVisible(false);
        panelIdentificador.setVisible(false);
        contenedoAgregarI.setVisible(false);
        contenedorIdentificarLlamada.setVisible(false);
        botonbasededatoseje.setVisible(false);
        botonbasededatosejehijo.setVisible(false);
        botonbasededatoside.setVisible(false);
        conMosEje.setVisible(false);
        conMosEje1.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        panelIdentificador = new javax.swing.JPanel();
        contenedorIdentificarLlamada = new javax.swing.JPanel();
        tituloIdentificarLlamada = new javax.swing.JLabel();
        tFContactoIdentificar = new javax.swing.JTextField();
        botonIdentificarLlamada = new javax.swing.JButton();
        conMosEje1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEje1 = new javax.swing.JTable();
        contenedoAgregarI = new javax.swing.JPanel();
        tituloAgregarContactoI = new javax.swing.JLabel();
        tFContactoIde = new javax.swing.JTextField();
        txtContactoIde = new javax.swing.JLabel();
        tFNombreIde = new javax.swing.JTextField();
        txtNombreIde = new javax.swing.JLabel();
        botonAgregarI = new javax.swing.JButton();
        botonbasededatoside = new javax.swing.JButton();
        panelEjecutivo = new javax.swing.JPanel();
        contenedorNuevoEjecutivo = new javax.swing.JPanel();
        txtNuevoEjecutivo = new javax.swing.JLabel();
        txtContactoE = new javax.swing.JLabel();
        tfNuevoEjecuivoEe = new javax.swing.JTextField();
        botonAgregarNuevoEjecutivo = new javax.swing.JButton();
        txtContactoE1 = new javax.swing.JLabel();
        tfNuevoEjecuivoHijo = new javax.swing.JTextField();
        botonbasededatoseje = new javax.swing.JButton();
        contenedorNuevoHijo = new javax.swing.JPanel();
        txtPadreE = new javax.swing.JLabel();
        txtHijoE = new javax.swing.JLabel();
        tfHijoE = new javax.swing.JTextField();
        tFPadreE = new javax.swing.JTextField();
        botonAgregarNuevoHijo = new javax.swing.JButton();
        txtNuevoEjecutivo1 = new javax.swing.JLabel();
        botonbasededatosejehijo = new javax.swing.JButton();
        contenedorConLinea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfContLinea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLinea = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        conMosEje = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEje = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArbolAVL = new javax.swing.JMenu();
        menuIdentificar = new javax.swing.JMenuItem();
        menuAgrregar = new javax.swing.JMenuItem();
        menuMostrarI = new javax.swing.JMenuItem();
        menuEjecutivos = new javax.swing.JMenu();
        menuAgremarN1 = new javax.swing.JMenuItem();
        menuAgregarHijo = new javax.swing.JMenuItem();
        menulinea = new javax.swing.JMenuItem();
        menuMostrarE = new javax.swing.JMenuItem();
        menuSalir2 = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(500, 300));

        panelIdentificador.setPreferredSize(new java.awt.Dimension(500, 300));

        contenedorIdentificarLlamada.setPreferredSize(new java.awt.Dimension(500, 300));

        tituloIdentificarLlamada.setText("Identificar LLamada");

        tFContactoIdentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFContactoIdentificarActionPerformed(evt);
            }
        });

        botonIdentificarLlamada.setText("Continuar");
        botonIdentificarLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIdentificarLlamadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorIdentificarLlamadaLayout = new javax.swing.GroupLayout(contenedorIdentificarLlamada);
        contenedorIdentificarLlamada.setLayout(contenedorIdentificarLlamadaLayout);
        contenedorIdentificarLlamadaLayout.setHorizontalGroup(
            contenedorIdentificarLlamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorIdentificarLlamadaLayout.createSequentialGroup()
                .addGroup(contenedorIdentificarLlamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorIdentificarLlamadaLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tituloIdentificarLlamada))
                    .addGroup(contenedorIdentificarLlamadaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tFContactoIdentificar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorIdentificarLlamadaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botonIdentificarLlamada)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        contenedorIdentificarLlamadaLayout.setVerticalGroup(
            contenedorIdentificarLlamadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorIdentificarLlamadaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloIdentificarLlamada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tFContactoIdentificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIdentificarLlamada)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tablaEje1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Contactos", "Nombre"
            }
        ));
        jScrollPane3.setViewportView(tablaEje1);

        javax.swing.GroupLayout conMosEje1Layout = new javax.swing.GroupLayout(conMosEje1);
        conMosEje1.setLayout(conMosEje1Layout);
        conMosEje1Layout.setHorizontalGroup(
            conMosEje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conMosEje1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        conMosEje1Layout.setVerticalGroup(
            conMosEje1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conMosEje1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );

        contenedoAgregarI.setPreferredSize(new java.awt.Dimension(500, 300));

        tituloAgregarContactoI.setText("Agregar Contacto");

        tFContactoIde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFContactoIdeActionPerformed(evt);
            }
        });

        txtContactoIde.setText("Contacto");

        tFNombreIde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFNombreIdeActionPerformed(evt);
            }
        });

        txtNombreIde.setText("Nombre");

        botonAgregarI.setText("Agregar");
        botonAgregarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarIActionPerformed(evt);
            }
        });

        botonbasededatoside.setText("Guardar en la BD");
        botonbasededatoside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbasededatosideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedoAgregarILayout = new javax.swing.GroupLayout(contenedoAgregarI);
        contenedoAgregarI.setLayout(contenedoAgregarILayout);
        contenedoAgregarILayout.setHorizontalGroup(
            contenedoAgregarILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedoAgregarILayout.createSequentialGroup()
                .addGroup(contenedoAgregarILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedoAgregarILayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(botonAgregarI))
                    .addGroup(contenedoAgregarILayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(tituloAgregarContactoI))
                    .addGroup(contenedoAgregarILayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtContactoIde))
                    .addGroup(contenedoAgregarILayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(contenedoAgregarILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFContactoIde, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFNombreIde, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contenedoAgregarILayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(txtNombreIde))
                    .addGroup(contenedoAgregarILayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(botonbasededatoside)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedoAgregarILayout.setVerticalGroup(
            contenedoAgregarILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedoAgregarILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloAgregarContactoI)
                .addGap(18, 18, 18)
                .addComponent(txtContactoIde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tFContactoIde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtNombreIde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tFNombreIde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAgregarI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonbasededatoside)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelIdentificadorLayout = new javax.swing.GroupLayout(panelIdentificador);
        panelIdentificador.setLayout(panelIdentificadorLayout);
        panelIdentificadorLayout.setHorizontalGroup(
            panelIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conMosEje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIdentificadorLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(contenedorIdentificarLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIdentificadorLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(contenedoAgregarI, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        panelIdentificadorLayout.setVerticalGroup(
            panelIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdentificadorLayout.createSequentialGroup()
                .addGroup(panelIdentificadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conMosEje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelIdentificadorLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(contenedorIdentificarLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contenedoAgregarI, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEjecutivo.setPreferredSize(new java.awt.Dimension(800, 300));

        txtNuevoEjecutivo.setText("Nuevo Ejecutivo");

        txtContactoE.setText("Ejecutivo");

        tfNuevoEjecuivoEe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNuevoEjecuivoEeActionPerformed(evt);
            }
        });

        botonAgregarNuevoEjecutivo.setText("Agregar");
        botonAgregarNuevoEjecutivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarNuevoEjecutivoActionPerformed(evt);
            }
        });

        txtContactoE1.setText("Hijo");

        tfNuevoEjecuivoHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNuevoEjecuivoHijoActionPerformed(evt);
            }
        });

        botonbasededatoseje.setText("Guardar en la BD");
        botonbasededatoseje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbasededatosejeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorNuevoEjecutivoLayout = new javax.swing.GroupLayout(contenedorNuevoEjecutivo);
        contenedorNuevoEjecutivo.setLayout(contenedorNuevoEjecutivoLayout);
        contenedorNuevoEjecutivoLayout.setHorizontalGroup(
            contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorNuevoEjecutivoLayout.createSequentialGroup()
                .addGroup(contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorNuevoEjecutivoLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(txtNuevoEjecutivo))
                    .addGroup(contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorNuevoEjecutivoLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(botonAgregarNuevoEjecutivo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonbasededatoseje))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorNuevoEjecutivoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorNuevoEjecutivoLayout.createSequentialGroup()
                                    .addComponent(txtContactoE1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfNuevoEjecuivoHijo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contenedorNuevoEjecutivoLayout.createSequentialGroup()
                                    .addComponent(txtContactoE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfNuevoEjecuivoEe, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        contenedorNuevoEjecutivoLayout.setVerticalGroup(
            contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorNuevoEjecutivoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtNuevoEjecutivo)
                .addGap(18, 18, 18)
                .addGroup(contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactoE)
                    .addComponent(tfNuevoEjecuivoEe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactoE1)
                    .addComponent(tfNuevoEjecuivoHijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(contenedorNuevoEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarNuevoEjecutivo)
                    .addComponent(botonbasededatoseje))
                .addContainerGap())
        );

        txtPadreE.setText("Ingrese el padre");

        txtHijoE.setText("Ingrese el hijo");

        tFPadreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFPadreEActionPerformed(evt);
            }
        });

        botonAgregarNuevoHijo.setText("Agregar");
        botonAgregarNuevoHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarNuevoHijoActionPerformed(evt);
            }
        });

        txtNuevoEjecutivo1.setText("Nuevo Hijo");

        botonbasededatosejehijo.setText("Guardar en la BD");
        botonbasededatosejehijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbasededatosejehijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorNuevoHijoLayout = new javax.swing.GroupLayout(contenedorNuevoHijo);
        contenedorNuevoHijo.setLayout(contenedorNuevoHijoLayout);
        contenedorNuevoHijoLayout.setHorizontalGroup(
            contenedorNuevoHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorNuevoHijoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(contenedorNuevoHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contenedorNuevoHijoLayout.createSequentialGroup()
                        .addComponent(txtHijoE)
                        .addGap(29, 29, 29)
                        .addComponent(tfHijoE))
                    .addGroup(contenedorNuevoHijoLayout.createSequentialGroup()
                        .addComponent(txtPadreE)
                        .addGap(18, 18, 18)
                        .addComponent(tFPadreE, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(contenedorNuevoHijoLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txtNuevoEjecutivo1))
            .addGroup(contenedorNuevoHijoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(botonAgregarNuevoHijo)
                .addGap(18, 18, 18)
                .addComponent(botonbasededatosejehijo))
        );
        contenedorNuevoHijoLayout.setVerticalGroup(
            contenedorNuevoHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorNuevoHijoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNuevoEjecutivo1)
                .addGap(11, 11, 11)
                .addGroup(contenedorNuevoHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPadreE)
                    .addComponent(tFPadreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(contenedorNuevoHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHijoE)
                    .addComponent(tfHijoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contenedorNuevoHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarNuevoHijo)
                    .addComponent(botonbasededatosejehijo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedorConLinea.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel1.setText("Linea");

        tablaLinea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Contactos"
            }
        ));
        jScrollPane1.setViewportView(tablaLinea);

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorConLineaLayout = new javax.swing.GroupLayout(contenedorConLinea);
        contenedorConLinea.setLayout(contenedorConLineaLayout);
        contenedorConLineaLayout.setHorizontalGroup(
            contenedorConLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorConLineaLayout.createSequentialGroup()
                .addGroup(contenedorConLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorConLineaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(contenedorConLineaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfContLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(contenedorConLineaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        contenedorConLineaLayout.setVerticalGroup(
            contenedorConLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorConLineaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorConLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
        );

        tablaEje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Contactos"
            }
        ));
        jScrollPane2.setViewportView(tablaEje);

        javax.swing.GroupLayout conMosEjeLayout = new javax.swing.GroupLayout(conMosEje);
        conMosEje.setLayout(conMosEjeLayout);
        conMosEjeLayout.setHorizontalGroup(
            conMosEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(conMosEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conMosEjeLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(320, 320, 320)))
        );
        conMosEjeLayout.setVerticalGroup(
            conMosEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
            .addGroup(conMosEjeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(conMosEjeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelEjecutivoLayout = new javax.swing.GroupLayout(panelEjecutivo);
        panelEjecutivo.setLayout(panelEjecutivoLayout);
        panelEjecutivoLayout.setHorizontalGroup(
            panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjecutivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedorNuevoHijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(contenedorNuevoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addComponent(contenedorConLinea, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addComponent(conMosEje, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelEjecutivoLayout.setVerticalGroup(
            panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjecutivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEjecutivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addComponent(contenedorConLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conMosEje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEjecutivoLayout.createSequentialGroup()
                        .addComponent(contenedorNuevoHijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contenedorNuevoEjecutivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEjecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE))
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEjecutivo, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
        );

        menuArbolAVL.setText("Identificador de llamadas");
        menuArbolAVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArbolAVLActionPerformed(evt);
            }
        });

        menuIdentificar.setText("Identificar llamada");
        menuIdentificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIdentificarActionPerformed(evt);
            }
        });
        menuArbolAVL.add(menuIdentificar);

        menuAgrregar.setText("Agregar Contacto");
        menuAgrregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgrregarActionPerformed(evt);
            }
        });
        menuArbolAVL.add(menuAgrregar);

        menuMostrarI.setText("Mostrar");
        menuMostrarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarIActionPerformed(evt);
            }
        });
        menuArbolAVL.add(menuMostrarI);

        jMenuBar1.add(menuArbolAVL);

        menuEjecutivos.setText("Contactos ejecutivos");

        menuAgremarN1.setText("Agregar nuevo ejecutivo");
        menuAgremarN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgremarN1ActionPerformed(evt);
            }
        });
        menuEjecutivos.add(menuAgremarN1);

        menuAgregarHijo.setText("Agregar nuevo hijo");
        menuAgregarHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarHijoActionPerformed(evt);
            }
        });
        menuEjecutivos.add(menuAgregarHijo);

        menulinea.setText("Contactos de una linea");
        menulinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulineaActionPerformed(evt);
            }
        });
        menuEjecutivos.add(menulinea);

        menuMostrarE.setText("Mostrar");
        menuMostrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMostrarEActionPerformed(evt);
            }
        });
        menuEjecutivos.add(menuMostrarE);

        jMenuBar1.add(menuEjecutivos);

        menuSalir2.setText("Salir");

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuSalir2.add(menuSalir);

        jMenuBar1.add(menuSalir2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuIdentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIdentificarActionPerformed
        desac();
        panelIdentificador.setVisible(true);
        contenedorIdentificarLlamada.setVisible(true);

    }//GEN-LAST:event_menuIdentificarActionPerformed

    private void menuAgrregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgrregarActionPerformed
        desac();
        tFNombreIde.setEditable(true);
        tFContactoIde.setEditable(true);
        botonAgregarI.setEnabled(true);
        tFContactoIde.setText(null);
        tFNombreIde.setText(null);
        panelIdentificador.setVisible(true);
        contenedoAgregarI.setVisible(true);
    }//GEN-LAST:event_menuAgrregarActionPerformed

    private void menuMostrarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarIActionPerformed
        desac();
        panelIdentificador.setVisible(true);
        conMosEje1.setVisible(true);
        ArrayList<Contacto> conIde = new ArrayList<Contacto>();
        conIde = identificadorLlamadas.mostrar();
        limpiarTabla(tablaEje1);
        if (conIde.size() > 100) {
            JOptionPane.showMessageDialog(null, "solo mostraremos los 100 primeros datos del arbol");
            for (int i = 0; i < 100; i++) {
                tablaEje1.setValueAt(conIde.get(i).getContacto(), i, 0);
                tablaEje1.setValueAt(conIde.get(i).getNombre(), i, 1);
            }
        } else {
            for (int i = 0; i < conIde.size() - 1; i++) {
                tablaEje1.setValueAt(conIde.get(i).getContacto(), i, 0);
                tablaEje1.setValueAt(conIde.get(i).getNombre(), i, 1);
            }
        }
    }//GEN-LAST:event_menuMostrarIActionPerformed

    private void menuArbolAVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArbolAVLActionPerformed

    }//GEN-LAST:event_menuArbolAVLActionPerformed

    private void menuAgremarN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgremarN1ActionPerformed
        desac();
        panelEjecutivo.setVisible(true);
        contenedorNuevoEjecutivo.setVisible(true);
        botonbasededatoseje.setVisible(false);
        tfNuevoEjecuivoEe.setEditable(true);
        tfNuevoEjecuivoHijo.setEditable(true);
        botonAgregarNuevoEjecutivo.setEnabled(true);
        tfNuevoEjecuivoEe.setText(null);
        tfNuevoEjecuivoHijo.setText(null);
    }//GEN-LAST:event_menuAgremarN1ActionPerformed

    private void menulineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulineaActionPerformed
        desac();
        panelEjecutivo.setVisible(true);
        contenedorConLinea.setVisible(true);

    }//GEN-LAST:event_menulineaActionPerformed

    private void menuMostrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMostrarEActionPerformed
        desac();
        panelEjecutivo.setVisible(true);
        conMosEje.setVisible(true);
        ArrayList<String> conEjec = new ArrayList<String>();
        conEjec = contactosEjecutivos.mostrar();
        limpiarTabla(tablaEje);
        if (conEjec.size() > 100) {
            JOptionPane.showMessageDialog(null, "solo mostraremos los 100 primeros datos del arbol");
            int j = 1;
            for (int i = 0; i < 100; i++) {
                tablaEje.setValueAt(conEjec.get(j), i, 0);
                j++;
            }
        } else {
            int j = 1;
            for (int i = 0; i < conEjec.size()-1; i++) {
                tablaEje.setValueAt(conEjec.get(j), i, 0);
                j++;
                
            }
        }
    }//GEN-LAST:event_menuMostrarEActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuAgregarHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarHijoActionPerformed
        desac();
        panelEjecutivo.setVisible(true);
        contenedorNuevoHijo.setVisible(true);
        tFPadreE.setEditable(true);
        tfHijoE.setEditable(true);
        botonAgregarNuevoHijo.setEnabled(true);
        botonbasededatosejehijo.setVisible(false);
        tFPadreE.setText(null);
        tfHijoE.setText(null);
    }//GEN-LAST:event_menuAgregarHijoActionPerformed

    private void botonIdentificarLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIdentificarLlamadaActionPerformed
        identificadorLlamadas.buscar(tFContactoIdentificar.getText());
        tFContactoIdentificar.setText(null);
    }//GEN-LAST:event_botonIdentificarLlamadaActionPerformed

    private void tFContactoIdentificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFContactoIdentificarActionPerformed
    }//GEN-LAST:event_tFContactoIdentificarActionPerformed

    private void botonAgregarNuevoHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarNuevoHijoActionPerformed
        contactosEjecutivos.nuevoHijo(tFPadreE.getText(), tfHijoE.getText(), agreg);
        tFPadreE.setEditable(false);
        tfHijoE.setEditable(false);
        botonAgregarNuevoHijo.setEnabled(false);
        botonbasededatosejehijo.setVisible(true);
    }//GEN-LAST:event_botonAgregarNuevoHijoActionPerformed

    private void botonAgregarNuevoEjecutivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarNuevoEjecutivoActionPerformed
        contactosEjecutivos.nuevoEjecutivo(tfNuevoEjecuivoEe.getText(), tfNuevoEjecuivoHijo.getText(), agreg);
        botonbasededatoseje.setVisible(true);
        tfNuevoEjecuivoEe.setEditable(false);
        tfNuevoEjecuivoHijo.setEditable(false);
        botonAgregarNuevoEjecutivo.setEnabled(false);

    }//GEN-LAST:event_botonAgregarNuevoEjecutivoActionPerformed

    private void tfNuevoEjecuivoEeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNuevoEjecuivoEeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNuevoEjecuivoEeActionPerformed

    private void botonAgregarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIActionPerformed
        identificadorLlamadas.nuevoCont(tFNombreIde.getText(), tFContactoIde.getText(), agreg);
        tFNombreIde.setEditable(false);
        tFContactoIde.setEditable(false);
        botonAgregarI.setEnabled(false);
        botonbasededatoside.setVisible(true);
    }//GEN-LAST:event_botonAgregarIActionPerformed

    private void tFNombreIdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFNombreIdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFNombreIdeActionPerformed

    private void tFContactoIdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFContactoIdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFContactoIdeActionPerformed

    private void tFPadreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFPadreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFPadreEActionPerformed

    private void tfNuevoEjecuivoHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNuevoEjecuivoHijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNuevoEjecuivoHijoActionPerformed

    private void botonbasededatosejeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbasededatosejeActionPerformed
        contactosEjecutivos.nuevoEjecutivo(tfNuevoEjecuivoEe.getText(), tfNuevoEjecuivoHijo.getText(), noAgreg);
        botonbasededatoseje.setVisible(false);
        tfNuevoEjecuivoEe.setEditable(true);
        tfNuevoEjecuivoHijo.setEditable(true);
        botonAgregarNuevoEjecutivo.setEnabled(true);
        tfNuevoEjecuivoEe.setText(null);
        tfNuevoEjecuivoHijo.setText(null);
    }//GEN-LAST:event_botonbasededatosejeActionPerformed

    private void botonbasededatosejehijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbasededatosejehijoActionPerformed
        contactosEjecutivos.nuevoHijo(tFPadreE.getText(), tfHijoE.getText(), noAgreg);
        tFPadreE.setEditable(true);
        tfHijoE.setEditable(true);
        botonAgregarNuevoHijo.setEnabled(true);
        botonbasededatosejehijo.setVisible(false);
        tFPadreE.setText(null);
        tfHijoE.setText(null);
    }//GEN-LAST:event_botonbasededatosejehijoActionPerformed

    private void botonbasededatosideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbasededatosideActionPerformed
        identificadorLlamadas.nuevoCont(tFNombreIde.getText(), tFContactoIde.getText(), noAgreg);
        tFNombreIde.setEditable(true);
        tFContactoIde.setEditable(true);
        tFContactoIde.setText(null);
        tFNombreIde.setText(null);
        botonbasededatoside.setVisible(false);
        botonAgregarI.setEnabled(true);
    }//GEN-LAST:event_botonbasededatosideActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> lineaC = new ArrayList<String>();
        limpiarTabla(tablaLinea);
        if (contactosEjecutivos.buscar(tfContLinea.getText()) != null) {
            lineaC = contactosEjecutivos.linea(tfContLinea.getText(), contactosEjecutivos.buscar(tfContLinea.getText()));
            for (int i = 0; i < lineaC.size(); i++) {
                tablaLinea.setValueAt(lineaC.get(i), i, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene hijos o no existe");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarI;
    private javax.swing.JButton botonAgregarNuevoEjecutivo;
    private javax.swing.JButton botonAgregarNuevoHijo;
    private javax.swing.JButton botonIdentificarLlamada;
    private javax.swing.JButton botonbasededatoseje;
    private javax.swing.JButton botonbasededatosejehijo;
    private javax.swing.JButton botonbasededatoside;
    private javax.swing.JPanel conMosEje;
    private javax.swing.JPanel conMosEje1;
    private javax.swing.JPanel contenedoAgregarI;
    private javax.swing.JPanel contenedorConLinea;
    private javax.swing.JPanel contenedorIdentificarLlamada;
    private javax.swing.JPanel contenedorNuevoEjecutivo;
    private javax.swing.JPanel contenedorNuevoHijo;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menuAgregarHijo;
    private javax.swing.JMenuItem menuAgremarN1;
    private javax.swing.JMenuItem menuAgrregar;
    private javax.swing.JMenu menuArbolAVL;
    private javax.swing.JMenu menuEjecutivos;
    private javax.swing.JMenuItem menuIdentificar;
    private javax.swing.JMenuItem menuMostrarE;
    private javax.swing.JMenuItem menuMostrarI;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuSalir2;
    private javax.swing.JMenuItem menulinea;
    private javax.swing.JPanel panelEjecutivo;
    private javax.swing.JPanel panelIdentificador;
    private javax.swing.JTextField tFContactoIde;
    private javax.swing.JTextField tFContactoIdentificar;
    private javax.swing.JTextField tFNombreIde;
    private javax.swing.JTextField tFPadreE;
    private javax.swing.JTable tablaEje;
    private javax.swing.JTable tablaEje1;
    private javax.swing.JTable tablaLinea;
    private javax.swing.JTextField tfContLinea;
    private javax.swing.JTextField tfHijoE;
    private javax.swing.JTextField tfNuevoEjecuivoEe;
    private javax.swing.JTextField tfNuevoEjecuivoHijo;
    private javax.swing.JLabel tituloAgregarContactoI;
    private javax.swing.JLabel tituloIdentificarLlamada;
    private javax.swing.JLabel txtContactoE;
    private javax.swing.JLabel txtContactoE1;
    private javax.swing.JLabel txtContactoIde;
    private javax.swing.JLabel txtHijoE;
    private javax.swing.JLabel txtNombreIde;
    private javax.swing.JLabel txtNuevoEjecutivo;
    private javax.swing.JLabel txtNuevoEjecutivo1;
    private javax.swing.JLabel txtPadreE;
    // End of variables declaration//GEN-END:variables
}
