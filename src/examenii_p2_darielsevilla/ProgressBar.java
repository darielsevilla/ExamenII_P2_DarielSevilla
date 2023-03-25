/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_darielsevilla;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author HP
 */
public class ProgressBar extends Thread{
    private JProgressBar pb;
    private Deporte deporte;

    public ProgressBar() {
    }

    public ProgressBar(JProgressBar pb, Deporte deporte) {
        this.pb = pb;
        this.deporte = deporte;
    }

    public JProgressBar getPb() {
        return pb;
    }

    public void setPb(JProgressBar pb) {
        this.pb = pb;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public void run(){
        pb.setMaximum(deporte.getTorneos().size()*7);
        pb.setValue(0);
        while(pb.getValue() != pb.getMaximum()){
            pb.setValue(pb.getValue()+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        pb.setValue(0);
    }
    
    @Override
    public String toString() {
        return pb.toString();
    }
    
    
    
}
