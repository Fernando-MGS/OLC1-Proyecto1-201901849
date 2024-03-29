/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.fife.ui.rtextarea.RTextScrollPane;
import Analizador.AnalizadorLenguaje;
import AnalizadorJS.AnalizadorLenguajeJS;
import ContenedorJS.List_File;
import ContenedorJS.Archivo;
import ContenedorJS.Clases;
import ContenedorJS.Comentarios;
import ContenedorJS.Funciones;
import ContenedorJS.Variables;
import ContenedorJS.Archivo;
import ContenedorJS.ContentFile;
import Contenedor.FCA;
import Tokens.*;
import Comparador.*;
//import Errores.Error.*;
import Errores.List_Error;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import Reportes.Reporte;
import Comparador.*;
import Contenedor.*;
import Reportes.Resumen;
import Graficas.*;
import java.io.PrintWriter;

/**
 *
 * @author ferna
 */
public class AppForm extends javax.swing.JFrame {

    /**
     * Creates new form AppForm
     */
    FileWriter filewriter = null;
    PrintWriter printw = null;
    public static ArrayList<Resumenes> resumenes1 = new ArrayList<Resumenes>();
    public static ArrayList<Resumenes> resumenes2 = new ArrayList<Resumenes>();
    private static int turno = 0;
    public static int contador_lineas = 0;
    public static int contador_func = 0;
    public static FCA file;
    public ArrayList<GLOBALES> GLB;
    public String fichero_actual;
    public static Resumen resumen = new Resumen();
    public static Archivo save_file = new Archivo();
    public static ArrayList<Comentarios> save_comm = new ArrayList<Comentarios>();
    public static ArrayList<Clases> save_class = new ArrayList<Clases>();
    public static ArrayList<Funciones> save_funciones = new ArrayList<Funciones>();
    public static ArrayList<Variables> save_vars = new ArrayList<Variables>();
    public static ArrayList<String> temp_info = new ArrayList<String>();
    public static String project_actual;
    public static String file_actual;
    public static String file_report;
    public static List_Token tokens;
    public static List_Error errors;
    public static List_File Proyecto1;
    public static List_File Proyecto2;
    public static double PT_general;
    public static ArrayList<PT_especifico> Class_Especificos = new ArrayList<PT_especifico>();
    public static ArrayList<PT_especifico> Comm_Especificos = new ArrayList<PT_especifico>();
    public static ArrayList<PT_especifico> Var_Especificos = new ArrayList<PT_especifico>();
    public static ArrayList<PT_especifico> Funcs_Especificos = new ArrayList<PT_especifico>();
    public static PT_General General = new PT_General();
    public ArrayList<ContentFile> project1 = new ArrayList<ContentFile>();
    public ArrayList<ContentFile> project2 = new ArrayList<ContentFile>();
    private JTabbedPane tpnTabs;
    private int tab = 0;
    private final JFileChooser chooser;
    private final JFileChooser chooser_new;

    public AppForm() {
        initComponents();
        this.chooser = new JFileChooser();
        this.chooser_new = new JFileChooser();
        chooser.setFileFilter(new FileNameExtensionFilter("Lenguaje de Reportería", "fca"));
        this.setSize(853, 705);
        this.setMinimumSize(new Dimension(448, 490));
        this.setTitle("Editor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p_editor = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        panel_con = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        consl = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, java.awt.Color.darkGray));
        jPanel3.setMaximumSize(new java.awt.Dimension(550, 500));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Editor");
        jLabel1.setFocusable(false);

        p_editor.setBackground(java.awt.Color.darkGray);
        p_editor.setForeground(java.awt.Color.lightGray);
        p_editor.setMaximumSize(new java.awt.Dimension(530, 445));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Consola");

        consl.setBackground(new java.awt.Color(186, 184, 255));
        consl.setColumns(20);
        consl.setForeground(new java.awt.Color(51, 51, 51));
        consl.setRows(5);
        jScrollPane1.setViewportView(consl);
        consl.getAccessibleContext().setAccessibleName("");

        panel_con.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(panel_con, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_editor, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(panel_con))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Archivo");
        jMenu2.setOpaque(false);

        jMenuItem1.setText("Abrir Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Guardar Cómo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setText("Guardar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(51, 51, 51));
        jMenu3.setText("Pestañas");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Crear Pestaña");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setText("Eliminar Pestaña");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu5.setForeground(new java.awt.Color(51, 51, 51));
        jMenu5.setText("Ejecutar");

        jMenuItem6.setText("Ejecutar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Consola");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(java.awt.Color.darkGray);
        jMenu6.setForeground(new java.awt.Color(51, 51, 51));
        jMenu6.setText("Reporte");

        jMenuItem8.setText("Reporte de Errores");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setText("Reporte Estadístico");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("Reporte de Tokens");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Reporte JSON");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        nuevaPestaña();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Component selected = p_editor.getSelectedComponent();
        p_editor.remove(selected);
        //tpnTabs.add(rootPane)
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String txt = "";
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = chooser.getSelectedFile();
            txt = OpenFile(archivo);
            file_actual = archivo.getName();
            fichero_actual = archivo.getAbsolutePath();
            nuevaPestaña(txt, archivo.getName(), archivo.getAbsolutePath());
        }

        // TODO add your handling code here:
        /*try {
            Component selected = p_editor.getSelectedComponent();
            JTextArea txt = (JTextArea) selected;
            txt.setText(texto);
        } catch (Exception e) {
            tab++;
            JTextArea txt = new JTextArea();
            txt.setSize(518, 436);
            txt.setForeground(Color.GREEN);
            txt.setBackground(new Color(62, 0, 61, 255));
            JScrollPane scroll = new JScrollPane(txt);
            txt.setText(texto);
            p_editor.add(new MyTab(), "Pestaña " + tab);
        }*/

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Execute();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
/*        File folder2 = new File("Graficas/Lineas");
        File[] File_list2 = folder2.listFiles();
        for (File file : File_list2) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        folder2 = new File("Graficas/Barras");
        File_list2 = folder2.listFiles();
        for (File file : File_list2) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        folder2 = new File("Graficas/Pie");
        File_list2 = folder2.listFiles();
        for (File file : File_list2) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }*/
        Linea line = new Linea();
        line.resumen();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Reporte report = new Reporte();
        report.ReporteToken(tokens);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Reporte report = new Reporte();
        report.ReporteError(errors);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Reporte report = new Reporte();
        report.ReporteJSON();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        /*Pie p = new Pie();
        p.graf_Pie();*/
 /*Linea l = new Linea();
        l.graf_Line();*/
        guardar();


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        guardar_new();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        graficas();
        Reporte reporte = new Reporte();
        reporte.Resumen();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    public static String OpenFile(File file) {
        String aux, texto = "";
        if (file != null) {
            try {
                FileReader files = new FileReader(file);
                try (BufferedReader read = new BufferedReader(files)) {
                    while ((aux = read.readLine()) != null) {
                        texto += aux + "\n";
                    }
                }
                return texto;
            } catch (IOException ex) {
                System.err.println("Error en Archivo: " + ex.getMessage());
            }
        }
        return null;
    }

    private void nuevaPestaña() {
        tab++;
        p_editor.add(new Pane(), "Pestaña " + tab);

    }

    private void nuevaPestaña(String texto, String titulo, String path) {
        p_editor.add(new Pane(texto, path), titulo);
    }

    public void infoConsola(String txt) {
        String aux = consl.getText() + "\n";
        aux = aux + txt;
        this.consl.setText(aux);
    }

    public void newConsola(String txt) {
        this.consl.setText(txt);
    }

    private void Execute() {
        limpiar();
        Pane mytab = ((Pane) p_editor.getSelectedComponent());
        tokens = new List_Token();
        errors = new List_Error();
        Proyecto1 = new List_File();
        Proyecto2 = new List_File();
        if (mytab.isEmptyText()) {
            JOptionPane.showMessageDialog(this, "Ingrese un archivo para analizar");
            return;
        }
        file_actual = p_editor.getTitleAt(p_editor
                .getSelectedIndex());
        file_report = p_editor.getTitleAt(p_editor
                .getSelectedIndex());
        consl.setText("");
        //obteniendo texto   
        //System.out.println("ANALIZANDO......");
        consl.setText("INICIANDO ANALISIS");
        consl.setText(consl.getText() + "\nREALIZANDO ANALISIS LEXICO Y SINTACTICO");
        Pane t = (Pane) p_editor.getSelectedComponent();
        //obteniendo texto   
        //  System.out.println("ANALIZANDO......");
        AnalizadorLenguaje.getInstancia();
        AnalizadorLenguaje.LimpiarInstancia();
        file = AnalizadorLenguaje.AnalizarCodigo(t.getText(), p_editor.getTitleAt(p_editor
                .getSelectedIndex()));
        if (file != null) {
            consl.setText(consl.getText() + "\n" + "ANALISIS FCA COMPLETADO");
            //file.Print();
            String[] ruta = file.getRuta1().split("-");
            ruta[0] = ruta[0].replace("\"", "");
            ruta[1] = ruta[1].replace("\"", "");
            escribir("INICIANDO ANALISIS JS");
            executeJS(ruta);
            analysisJS();
            //print_class();
            //print_project();
            escribir("FINALIZADO ANALISIS JS");
            escribir("INICIANDO CALCULO DEL PUNTEO");
            Repitencias punteos = new Repitencias();
            punteos.Comparacion();
            defValoresGlobales();
            escribir("CALCULO DEL PUNTEO FINALIZADO");
            /* Reporte reporte = new Reporte();
            reporte.Resumen();
            graficas();*/
            //file.Print();
            //tokens.Console();
            //listFilesForFolder(folder);
            //System.out.println("Código sin errores sintácticos-léxicos");
            // escribirInformacionExitoEnConsola("Finalizado con éxito");
        } else {
            consl.setText(consl.getText() + "\n" + "Existen errores");
            errors.Console();
            consl.setText(consl.getText() + "\n" + "NO SE PUDO COMPLETAR EL ANALISIS");
            //escribirErrorEnConsola("Finalizado con errores");
            /*AnalizadorLenguaje.errores.stream().forEach((er) -> {
                escribirErrorEnConsola(er.toString());
            });*/
        }

    }

    public void guardar() {
        try {
            Pane t = (Pane) p_editor.getSelectedComponent();
            filewriter = new FileWriter(t.getPath());
            printw = new PrintWriter(filewriter);
            printw.print(t.getText());
            printw.close();
            escribir("SE GUARDÓ CON EXITO");
        } catch (Exception e) {
            escribir("OCURRIÓ UN ERROR AL GUARDAR EL ARCHIVO");
        }
    }

    public void guardar_new() {
        try {
            File archivo= null;
            if (chooser_new.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                archivo = chooser_new.getSelectedFile();
                //System.out.println(archivo.getAbsolutePath());
            }
            Pane t = (Pane) p_editor.getSelectedComponent();
            filewriter = new FileWriter(archivo.getAbsolutePath()+".fca");
            printw = new PrintWriter(filewriter);
            printw.print(t.getText());
            printw.close();
            escribir("SE GUARDÓ CON EXITO");
        } catch (Exception e) {
            escribir("OCURRIÓ UN ERROR AL GUARDAR EL ARCHIVO");
        }
    }

    public void limpiar() {
        File folder2 = new File("Graficas/Lineas");
        File[] File_list2 = folder2.listFiles();
        for (File file : File_list2) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        folder2 = new File("Graficas/Barras");
        File_list2 = folder2.listFiles();
        for (File file : File_list2) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        folder2 = new File("Graficas/Pie");
        File_list2 = folder2.listFiles();
        for (File file : File_list2) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        resumenes1= new ArrayList<Resumenes>();
        resumenes2= new ArrayList<Resumenes>();
        consl.setText("");
        turno = 0;
        resumen = new Resumen();
        save_file = new Archivo();
        save_comm = new ArrayList<Comentarios>();
        save_class = new ArrayList<Clases>();
        save_funciones = new ArrayList<Funciones>();
        save_vars = new ArrayList<Variables>();
        temp_info = new ArrayList<String>();
        project_actual = "";
        file_report = "";
        tokens = new List_Token();
        errors = new List_Error();
        Proyecto1 = new List_File();
        Proyecto2 = new List_File();
        Class_Especificos = new ArrayList<PT_especifico>();
        Comm_Especificos = new ArrayList<PT_especifico>();
        Var_Especificos = new ArrayList<PT_especifico>();
        Funcs_Especificos = new ArrayList<PT_especifico>();
        project1 = new ArrayList<ContentFile>();
        project2 = new ArrayList<ContentFile>();
    }

    public void analysisJS() {
        project1.forEach((t) -> {
            project_actual = "Proyecto 1";
            file_actual = t.name;
            //System.out.println("Analizando " + t.name);
            AnalizadorLenguajeJS.getInstancia();
            AnalizadorLenguajeJS.LimpiarInstancia();
            //ContentFile txt = project1.get(1);
            AnalizadorLenguajeJS.AnalizarCodigo(t.contenido, "");
            save_InfoJS();
        });
        turno = 1;
        project2.forEach((t) -> {
            file_actual = t.name;
            project_actual = "Proyecto 2";
            AnalizadorLenguajeJS.getInstancia();
            AnalizadorLenguajeJS.LimpiarInstancia();
            //ContentFile txt = project1.get(1);
            AnalizadorLenguajeJS.AnalizarCodigo(t.contenido, "");
            save_InfoJS();
        });
        //file_actual = project1.get(1).name;

    }

    public void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public void executeJS(String[] paths) {
        File folder1 = new File(paths[0]);
        File[] File_list = folder1.listFiles();
        File folder2 = new File(paths[1]);
        File[] File_list2 = folder2.listFiles();
        for (File file : File_list) {
            if (!file.isDirectory()) {
                String ruta = paths[0] + "\\" + file.getName();
                project1.add(new ContentFile(file.getName(), muestraContenido(ruta)));
                //System.out.println(paths[0]+"\\"+file.getName());
                //addFiles(paths[0] + "\\" + file.getName());
            }
        }
        //System.out.println("_____________________");
        for (File file : File_list2) {
            if (file.isFile()) {
                String ruta = paths[1] + "\\" + file.getName();
                project2.add(new ContentFile(file.getName(), muestraContenido(ruta)));
                //System.out.println(paths[1] + "\\" + file.getName());
            }
        }
        //System.out.println(project1.size());
    }

    public String muestraContenido(String archivo) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(archivo));
            String temp = "";
            String bfRead = "";
            while ((bfRead = bf.readLine()) != null) {
                temp = temp + "\n" + bfRead;
            }
            texto = temp;
            //consl.setText(texto);
        } catch (Exception e) {
        }
        return (texto);
    }

    public static void escribir(String txt) {
        String aux = consl.getText();
        aux = aux + "\n" + txt;
        consl.setText(aux);
    }

    public void setFCA(FCA analisis) {
        file = analisis;
        file.Print();
    }

    public static void save_InfoJS() {
        save_file = new Archivo();
        save_file.setClases(save_class);
        save_file.setComments(save_comm);
        save_file.setFuncs(save_funciones);
        save_file.setVars(save_vars);
        save_file.setName(file_actual);
        save_file.setProject(project_actual);
        if (turno == 0) {
            //save_file(save_class,save_comm,save_funciones,save_vars,file_actual,project_actual);
            //System.out.println("bandera");
            Proyecto1.add(save_file);
            save_class = new ArrayList<Clases>();
            save_comm = new ArrayList<Comentarios>();
            save_funciones = new ArrayList<Funciones>();
            save_vars = new ArrayList<Variables>();
        } else {
            Proyecto2.add(save_file);
            save_class = new ArrayList<Clases>();
            save_comm = new ArrayList<Comentarios>();
            save_funciones = new ArrayList<Funciones>();
            save_vars = new ArrayList<Variables>();
        }
    }

    public void print_project() {
        Proyecto1.forEach((t) -> {
            t.print_file();
        });
        System.out.println("----------------------");
        Proyecto2.forEach((t) -> {
            t.print_file();
        });

    }

    public static void print_class() {
        save_class.forEach((t) -> {
            t.print();
        });
    }

    public static double def_especifico(String name) {
       // System.out.println("=================");
        double pt = 0;
        String[] aux = name.split("-");

        if (aux[0].equalsIgnoreCase("puntajeespecifico")) {
            aux[1] = aux[1].replace("\"", "");
            aux[2] = aux[2].replace("\"", "");
            aux[3] = aux[3].replace("\"", "");
         //   System.out.println(aux[0] + "-" + aux[1] + "-" + aux[2] + "-" + aux[3]);
            if (aux[2].equalsIgnoreCase("clase")) {
                pt = valor_clas(aux[3], aux[1]);
            } else if (aux[2].equalsIgnoreCase("variable")) {
                pt = valor_va(aux[3], aux[1]);
            } else if (aux[2].equalsIgnoreCase("comentario")) {
                pt = valor_com(aux[1]);
            } else if (aux[2].equalsIgnoreCase("funcion") || aux[2].equalsIgnoreCase("metodo")) {
                pt = valor_fun(aux[3], aux[1]);
            }
        }
        //System.out.println("el pt es " + pt);
        return pt;
    }

    public void defValoresGlobales() {
        for (GLOBALES glob : file.getGLB()) {
            if (glob.getTipo() == 2) {
                String[] aux = glob.getValor_s().split("-");

                if (aux[0].equalsIgnoreCase("puntajeespecifico")) {
                    aux[1] = aux[1].replace("\"", "");
                    aux[2] = aux[2].replace("\"", "");
                    aux[3] = aux[3].replace("\"", "");
                   // System.out.println(aux[0] + "-" + aux[1] + "-" + aux[2] + "-" + aux[3]);
                    if (aux[2].equalsIgnoreCase("clase")) {
                        glob.setValor_d(valor_class(aux[3], aux[1]));
                    } else if (aux[2].equalsIgnoreCase("variable")) {
                        glob.setValor_d(valor_var(aux[3], aux[1]));
                    } else if (aux[2].equalsIgnoreCase("comentario")) {
                        glob.setValor_d(valor_comm(aux[1]));
                    } else if (aux[2].equalsIgnoreCase("funcion") || aux[2].equalsIgnoreCase("metodo")) {
                        glob.setValor_d(valor_func(aux[3], aux[1]));
                    }
                } else {
                    glob.setValor_d(PT_general);
                }
            }
        }
    }

    public void graficas() {
        if (file.getBar() != null) {
            Barra bar_g = new Barra();
            bar_g.graf_Barra();
        }
        if (file.getPie() != null) {
            Pie bar_g = new Pie();
            bar_g.graf_Pie();
        }
        if(file.getLinea()!=null){
            Linea bar_g = new Linea();
            bar_g.graf_Line();
        }
    }

    public static String nombre_glob(String name) {
        String a = "";
        ArrayList<GLOBALES> t = file.getGLB();
        for (GLOBALES g : t) {
            if (g.getTipo() == 0 && g.getNombre().equals(name)) {
                a = g.getValor_s();
            }
        }
        return a;
    }

    public static double valor_glob(String name) {
        double a = 0;
        ArrayList<GLOBALES> t = file.getGLB();
        for (GLOBALES g : t) {
            if (g.getTipo() == 1 && g.getNombre().equals(name)) {
                a = g.getValor_d();
            }
            if (g.getTipo() == 2 && g.getNombre().equals(name)) {
                a = g.getValor_d();
            }
        }
        return a;
    }

    public double valor_class(String name, String file) {
        double punteo = 0;
        for (PT_especifico pt : Class_Especificos) {
            if (pt.nombre.equals(name) || pt.nombre2.equals(name)) {
                if (pt.file.equals(file) || pt.file1.equals(file)) {
                   // System.out.println("Hizo match" + name);
                    punteo = pt.Punteo;
                    break;
                }
            }
        }
        return punteo;
    }

    public static double valor_clas(String name, String file) {
        double punteo = 0;
        for (PT_especifico pt : Class_Especificos) {
            if (pt.nombre.equals(name) || pt.nombre2.equals(name)) {
                if (pt.file.equals(file) || pt.file1.equals(file)) {
                   // System.out.println("Hizo match" + name);
                    punteo = pt.Punteo;
                    break;
                }
            }
        }
        return punteo;
    }

    public double valor_var(String name, String file) {
        double punteo = 0;
        for (PT_especifico pt : Var_Especificos) {
            if (pt.nombre.equals(name) || pt.nombre2.equals(name)) {
                if (pt.file.equals(file) || pt.file1.equals(file)) {
                  //  System.out.println("Hizo match " + name);
                    punteo = pt.Punteo;
                    break;
                }
            }
        }
        return punteo;
    }

    public static double valor_va(String name, String file) {
        double punteo = 0;
        for (PT_especifico pt : Var_Especificos) {
            if (pt.nombre.equals(name) || pt.nombre2.equals(name)) {
                if (pt.file.equals(file) || pt.file1.equals(file)) {
                   // System.out.println("Hizo match" + name);
                    punteo = pt.Punteo;
                    break;
                }
            }
        }
        return punteo;
    }

    public double valor_comm(String file) {
        double punteo = 0;
        for (PT_especifico pt : Comm_Especificos) {
            if (pt.file.equals(file) || pt.nombre2.equals(file)) {
                punteo = pt.Punteo;
                break;
            }
        }
        return punteo;
    }

    public static double valor_com(String file) {
        double punteo = 0;
        for (PT_especifico pt : Comm_Especificos) {
            if (pt.file.equals(file) || pt.nombre2.equals(file)) {
                punteo = pt.Punteo;
                break;
            }
        }
        return punteo;
    }

    public double valor_func(String name, String file) {
        double punteo = 0;
        for (PT_especifico pt : Funcs_Especificos) {
            if (pt.nombre.equals(name) || pt.nombre2.equals(name)) {
                if (pt.file.equals(file) || pt.file1.equals(file)) {
                   // System.out.println("Hizo match" + name);
                    punteo = pt.Punteo;
                    break;
                }
            }
        }
        return punteo;
    }

    public static double valor_fun(String name, String file) {
        double punteo = 0;
        for (PT_especifico pt : Funcs_Especificos) {
            if (pt.nombre.equals(name) || pt.nombre2.equals(name)) {
                if (pt.file.equals(file) || pt.file1.equals(file)) {
                    //System.out.println("Hizo match" + name);
                    punteo = pt.Punteo;
                    break;
                }
            }
        }
        return punteo;
    }

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
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea consl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane p_editor;
    private javax.swing.JScrollPane panel_con;
    // End of variables declaration//GEN-END:variables
}
