package main;

import javax.swing.JOptionPane;
import modelos.Cachorro;
import modelos.Gato;
import modelos.Peixe;

public class Strategy {

    public static void main(String[] args) {
       Cachorro cachorro = new Cachorro();
        
       cachorro.MostrarNome();
       cachorro.Andar();
       cachorro.Latir();
       
       
       Gato gato = new Gato();       

       gato.MostrarNome();
       gato.Andar();
       gato.Latir();
       
        Peixe peixe = new Peixe();
        
        peixe.MostrarNome();
        peixe.Andar();
        peixe.Latir();
                
       
    }
}
