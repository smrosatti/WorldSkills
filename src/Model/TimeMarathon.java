/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author SARA
 */
public class TimeMarathon {
    
    public String hours(){
        try {
             int min, hora, diaa, seg;
             LocalDateTime hoje = LocalDateTime.now();
             LocalDateTime datacorrida = LocalDateTime.of(2017, Month.SEPTEMBER, 5, 1, 1);
             Duration duracao = Duration.between(hoje, datacorrida);
              min = (int) duracao.toMinutes();
                            hora = min / 60;
                            min = min % 60;
                            diaa = hora / 24;
                            hora = hora % 24;
                          String  horas = (diaa + " days " + hora + " hours and " + min + " minutes until the race starts!");
                            return horas;
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
    
}
