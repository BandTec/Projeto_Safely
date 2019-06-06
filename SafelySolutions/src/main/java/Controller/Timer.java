/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ntborges
 */
public class Timer {


    public static void execucao() {
     java.util.Timer timer = new java.util.Timer();
     TimerTask task = new TimerTask() {
            
            @Override
            public void run() {
                System.out.print(RealizarLeitura.pegaLeitura().toString());
                try {
                    EnvioBanco.salvarLeitura(RealizarLeitura.pegaLeitura());
                } catch (SQLException ex) {
                    Logger.getLogger(Timer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        long delay = 0; //
        long period = 1000;
        timer.schedule(task, delay, period);
    }
    
}
