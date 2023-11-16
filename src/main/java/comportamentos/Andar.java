package comportamentos;

import javax.swing.JOptionPane;


public class Andar implements IAndar {
    
    @Override
    public void Andar(){
        JOptionPane.showMessageDialog(null, " Anda ");
    }
    
}
