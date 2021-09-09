/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import Interfaz.AppForm;
import Contenedor.PIE;
import java.io.File;
import Interfaz.AppForm;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ferna
 */
public class Pie {

    public Pie() {

    }

    public void graf_Pie() {
        int ver = 1;
        for (PIE p : AppForm.file.getPie()) {
            double pt = 0;
            String eje = "";
            DefaultPieDataset Gpie = new DefaultPieDataset();
            for (int i = 0; i < p.getEjex().size(); i++) {
                if (p.getEjex().get(i).charAt(0) == '"') {
                    //es una cadena
                    eje = p.getEjex().get(i);
                } else {
                    //es una variable o un numero
                    eje = AppForm.nombre_glob(p.getEjex().get(i));

                }

                //  System.out.println(a.charAt(0) + "-" + c);
                try {
                    //System.out.println("tratando "+p.getValue().get(i));
                    pt = Double.valueOf(p.getValue().get(i));
                    //System.out.println(c);
                } catch (Exception e) {
                    String [] ar=p.getValue().get(i).split("-");
                    if (ar.length<=1) {
                        pt = AppForm.valor_glob(p.getValue().get(i));
                    }else{
                        System.out.println(p.getValue().get(i));
                        pt = AppForm.def_especifico(p.getValue().get(i));
                    }
                    
                }

                Gpie.setValue(eje, pt);
            }

            //Gpie.setValue("c", new Double(2));
            //Gpie.setValue("d", new Double(4));
            JFreeChart chart = ChartFactory.createPieChart(p.getTitle(), Gpie, true, true, true);
            try {
                final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
               final File file = new File("Graficas/PIE " + ver + " " + AppForm.project_actual + ".jpg");
               /* String ruta= file.getPath()+"/PIE " + ver   + AppForm.project_actual+".jpg";
                final File fil= new File(ruta);
                System.out.println(ruta);*/
                ChartUtilities.saveChartAsJPEG(file, chart, 640, 480, info);
            } catch (Exception e) {
                
            }
            ver++;
        }

    }

}
