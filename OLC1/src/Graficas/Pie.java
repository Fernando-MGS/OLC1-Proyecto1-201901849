/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import java.io.File;
import Interfaz.AppForm;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ferna
 */
public class Pie {
    public Pie(){
        
    }
    
    public void graf_Pie(){
        DefaultPieDataset Gpie = new DefaultPieDataset();
        Gpie.setValue("a", new Double(30));
        //DefaultPieDataset.setValue("a", 0);
        Gpie.setValue("b", new Double (1));
        Gpie.setValue("c", new Double (2));
        Gpie.setValue("d", new Double (4));
        JFreeChart chart= ChartFactory.createPieChart("Titulo", Gpie, true, true, true);
        try{
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file = new File("PIE"+AppForm.project_actual+".jpg");
            ChartUtilities.saveChartAsJPEG(file, chart, 640, 480);
        }
        catch(Exception e){
            
        }
    }
    
}
