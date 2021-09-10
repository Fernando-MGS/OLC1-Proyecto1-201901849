/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Contenedor.Line;
import Interfaz.AppForm;
import java.io.File;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author ferna
 */
public class Linea {

    public Linea() {

    }

    public void graf_Line() {
        
        int var = 0;
        for (Line l : AppForm.file.getLinea()) {
            System.out.println("Tam1 es " + AppForm.resumenes1.size());
            System.out.println("Tam2 es " + AppForm.resumenes2.size());
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (int i = 0; i < AppForm.resumenes1.size(); i++) {
                String FileName= l.getFile().replaceAll("\"", "");
                System.out.println(FileName+" vs "+AppForm.resumenes1.get(i).getNombre()+" vs "+AppForm.resumenes2.get(i).getNombre());
                if (FileName.equals(AppForm.resumenes1.get(i).getNombre())) {
                    dataset.setValue(AppForm.resumenes1.get(i).getVariables(), "Proyecto 1", "Variables");
                    dataset.setValue(AppForm.resumenes2.get(i).getVariables(), "Proyecto 2", "Variables");
                    dataset.setValue(AppForm.resumenes1.get(i).getFunciones(), "Proyecto 1", "Metodos/Funciones");
                    dataset.setValue(AppForm.resumenes2.get(i).getFunciones(), "Proyecto 2", "Metodos/Funciones");
                    dataset.setValue(AppForm.resumenes1.get(i).getClases(), "Proyecto 1", "Clases");
                    dataset.setValue(AppForm.resumenes2.get(i).getClases(), "Proyecto 2", "Clases");
                    dataset.setValue(AppForm.resumenes1.get(i).getComentarios(), "Proyecto 1", "Comentarios");
                    dataset.setValue(AppForm.resumenes2.get(i).getComentarios(), "Proyecto 2", "Comentarios"); 
                }
            }
            JFreeChart chart = ChartFactory.createLineChart("Resumen de " + l.getTitle(), "Cantidad", "", dataset, PlotOrientation.VERTICAL, true, true, false);
            try {
                final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
                final File file = new File("Graficas/Lineas/line" + var + AppForm.project_actual + ".jpg");
                ChartUtilities.saveChartAsJPEG(file, chart, 640, 480, info);

            } catch (Exception e) {

            }
            var++;
        }

        /*dataset.setValue (128, "Beijing", "Alcanfor");
    dataset.setValue (524, "Beijing", "Maple");
    dataset.setValue (425, "Beijing", "Lishu");
    dataset.setValue (368, "Beijing", "Pino");
    dataset.setValue (986, "Beijing", "Cypress");
    dataset.setValue (529, "Beijing", "Árbol de ciruela");
    dataset.setValue (724, "Beijing", "Milán");
    dataset.setValue (659, "Beijing", "Elm");
    dataset.setValue (874, "Beijing", "Melocotonero");
    dataset.setValue (258, "Beijing", "Oak");*/
        //JFreeChart chart = ChartFactory.createLineChart ("Mapa de árbol", "Provincia y ciudad","Número de árboles", dataset,PlotOrientation.VERTICAL,true,true,false);
       /* try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file = new File("PIE" + AppForm.project_actual + ".jpg");
//            ChartUtilities.saveChartAsJPEG(file, chart, 640, 480);
        } catch (Exception e) {

        }*/
        resumen();
    }

    public void resumen() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        dataset.setValue(AppForm.resumen.getVar1(), "Proyecto 1", "Variables");
        dataset.setValue(AppForm.resumen.getVar2(), "Proyecto 2", "Variables");
        dataset.setValue(AppForm.resumen.getFunciones1(), "Proyecto 1", "Funciones");
        dataset.setValue(AppForm.resumen.getFunciones2(), "Proyecto 2", "Funciones");
        dataset.setValue(AppForm.resumen.getClass1(), "Proyecto 1", "Clases");
        dataset.setValue(AppForm.resumen.getClass2(), "Proyecto 2", "Clases");
        dataset.setValue(AppForm.resumen.getComentarios1(), "Proyecto 1", "Comentarios");
        dataset.setValue(AppForm.resumen.getComentarios2(), "Proyecto 2", "Comentarios");
        JFreeChart chart = ChartFactory.createLineChart("Resumen general", "", "Cantidad", dataset, PlotOrientation.VERTICAL, true, true, false);
        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file = new File("Graficas/Lineas/Resumen" + AppForm.project_actual + ".jpg");
            ChartUtilities.saveChartAsJPEG(file, chart, 640, 480, info);
        } catch (Exception e) {

        }
    }

    public void res() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        double poblacion = 25;
        int esperanza_de_vida = 5;
        double defunciones;
        double poblacion_neta;

        double tc = 0.2; // tasa de crecimiento 20%
        double tm = 0.4; // tasa de mortalidad 40%

        JFreeChart chart = ChartFactory.createLineChart(
                "Calculo demografico",
                "Tiempo",
                "Población",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );
        try {
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file = new File("Linea.jpg");
            ChartUtilities.saveChartAsJPEG(file, chart, 640, 480, info);
        } catch (Exception e) {

        }

        //Mostramos la grafica en pantalla
        /*ChartFrame fr = new ChartFrame("Calculo Demografico I", chart);
        fr.pack();
        fr.setVisible(true);*/
    }
}
