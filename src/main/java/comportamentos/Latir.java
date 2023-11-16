package comportamentos;

import javax.swing.JOptionPane;

public class Latir implements ILatir{
    
    @Override
    public void Latir(){
        JOptionPane.showMessageDialog(null, "Au Au");
    }
    
}
