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
    
    public Linea(){
        
    }
    
    public void graf_Line(){
    for(Line l: AppForm.file.getLinea()){
        double pt = 0;
        String eje = "";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
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
    try{
            final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
            final File file = new File("PIE"+AppForm.project_actual+".jpg");
//            ChartUtilities.saveChartAsJPEG(file, chart, 640, 480);
        }
        catch(Exception e){
            
        }
    }
   
}
