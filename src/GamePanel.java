import javax.swing.*;
import java.awt.*;

public class GamePanel {

    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints buttonConstraints = new GridBagConstraints();
    private GridBagConstraints infoConstraints = new GridBagConstraints();
    private JPanel panel = new JPanel(); //Crates panel
    private JLabel player1Score;
    private JLabel player2Score;
    private JLabel roundCount;


    public GamePanel(){ //Each part initialized in different methods for easier debugging
        initializePanel(); //Bottom layer gets created
    }


    private void initializePanel(){
        panel.setLayout(gridBagLayout); //GridBagLayOut is added to Panel
        panel.setBackground(Color.ORANGE); //Orange background because it looks nice
    }

    public JPanel getPanel() {
        return panel;
    }
}

