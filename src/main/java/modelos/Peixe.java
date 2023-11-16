package modelos;

import comportamentos.NaoAndar;
import comportamentos.NaoLatir;

public class Peixe extends Animal{
    
    public Peixe(){
        
        super.nome = "Peixe";
        super.andar = new NaoAndar();
        super.latir = new NaoLatir();
    }
    
}
