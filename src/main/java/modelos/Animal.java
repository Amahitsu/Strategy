package modelos;
import comportamentos.IAndar;
import comportamentos.ILatir;
import javax.swing.JOptionPane;

public class Animal {
    
    String nome;
    
    IAndar andar;
    ILatir latir;
    
    public void MostrarNome(){
        JOptionPane.showMessageDialog(null, this.nome = nome);
    }
    
    public void Latir(){
        this.latir.Latir();
    }
    
    public void Andar(){
        this.andar.Andar();
    }
    
    public void setandar(IAndar andar) {
        this.andar = andar;
    }

    public void setLatir(ILatir latir) {
        this.latir = latir;
    }
    
    
    


}
