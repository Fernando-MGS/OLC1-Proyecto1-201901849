/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Interfaz.AppForm;
import java.io.File;
import java.util.ArrayList;
import Contenedor.Barras;
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
public class Barra {

    public Barra() {

    }

    public void graf_Barra() {
        int var = 1;
        
        for (Barras b : AppForm.file.getBar()) {
            double pt = 0;
            String eje = "";
            DefaultCategoryDataset Gpie = new DefaultCategoryDataset();
            for (int i = 0; i < b.getEjex().size(); i++) {
                if (b.getEjex().get(i).charAt(0) == '"') {
                    //es una cadena
                    eje = b.getEjex().get(i);
                } else {
                    //es una variable o un numero
                    eje = AppForm.nombre_glob(b.getEjex().get(i));
                }
                try {
                    pt = Double.valueOf(b.getValue().get(i));
                    //System.out.println(c);
                } catch (Exception e) {
                    String [] ar=b.getValue().get(i).split("-");
                    if (ar.length<=1) {
                        pt = AppForm.valor_glob(b.getValue().get(i));
                    }else{
                        System.out.println(b.getValue().get(i));
                        pt = AppForm.def_especifico(b.getValue().get(i));
                    }
                    //pt = AppForm.valor_glob(b.getValue().get(i));
                }
                //System.out.println(pt);
                Gpie.setValue(pt, eje, eje);
            }

            JFreeChart chart = ChartFactory.createBarChart(b.getTitle(), b.getTitlex(), b.getTitley(), Gpie, PlotOrientation.VERTICAL, true, true, false);
            try {
                final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
                final File file = new File("Graficas/BARRA-" + var + "-" + AppForm.project_actual + ".jpg");
                ChartUtilities.saveChartAsJPEG(file, chart, 640, 480, info);
            } catch (Exception e) {
                //System.out.println(e);
            }
            var++;
        }

    }

}

