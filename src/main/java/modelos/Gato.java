package modelos;

import comportamentos.Andar;
import comportamentos.NaoLatir;


public class Gato extends Animal{
    
    public Gato(){
        
        super.nome = "Gato";
        super.latir = new NaoLatir();
        super.andar = new Andar();
    }
    
}
