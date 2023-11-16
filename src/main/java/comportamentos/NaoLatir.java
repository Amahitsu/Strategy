package comportamentos;

import javax.swing.JOptionPane;

public class NaoLatir implements ILatir {

    @Override
    public void Latir() {
        JOptionPane.showMessageDialog(null, "Não late");
    }
    
    
    
}
