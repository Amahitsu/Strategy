package comportamentos;

import javax.swing.JOptionPane;

public class NaoAndar implements IAndar{
    
    @Override
    public void Andar(){
        JOptionPane.showMessageDialog(null, " Não anda ");
    }
    
}
