/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dao.ModelDao;
import Model.Role;

/**
 *
 * @author SARA
 */
public class Cadastros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // ModelDao dao = new ModelDao();
        //Charity c = new Charity("Charity 1", "Charity for runners", "/Imagem/c1.png");
       // Country c = new Country("BRA", "BRAZIL", "/Imagem/brasilflag.png");
        //Gender c = new Gender("Female");
        //List<Gender> g = dao.getList("Gender");
        //for(int i = 0; i<g.size(); i++){
           // System.out.printf("%s\n", g.toString());
       // }
       ModelDao dao = new ModelDao();
        Role re = new Role("Coordinator");
        dao.add(re);
        dao = new ModelDao();
        Role ree = new Role("Runner");
        dao.add(ree);
        //Charity d = new Charity("Charity 2", "Charity for runners again", "/Imagem/c2.png");
       // Country d = new Country("DEU", "GERMANY", "/Imagem/alemanhaflag.png");
       // Country e = new Country("USA", "UNITED STATES", "/Imagem/euaflag.png");
      // Gender e = new Gender("Male");
        // dao = new ModelDao();
        // dao.add(e);
        
        
    }
    
}
