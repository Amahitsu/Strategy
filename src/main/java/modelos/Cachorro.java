package modelos;

import comportamentos.Andar;
import comportamentos.Latir;

public class Cachorro extends Animal{
    
    public Cachorro(){
        
        super.nome = "Cachorro";
        super.andar = new Andar();
        super.latir = new Latir();
        
    }
    
    
}
