import javax.swing.*;
import java.awt.*;

public class OptionsPanel{

    private JPanel panel = new JPanel();
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints gridBagConstraints =  new GridBagConstraints();
    private GridBagConstraints optionsLabelConstraints = new GridBagConstraints();

    private MenuButton menuButton = new MenuButton("Main Menu", "MainMenu");
    private GridBagConstraints menuButtonConstraints = new GridBagConstraints();

    private JLabel optionsLabel;
    protected OptionsPanel(){
        initializeOptionsLabel();
        initializeMenuButton();
        initializePanel();
    }

    private void initializeMenuButton(){
        menuButton.getMenuButton().setBackground(Color.WHITE);
        menuButton.getMenuButton().setFocusable(false);
        menuButton.getMenuButton().setPreferredSize(new Dimension(150, 30));
        menuButtonConstraints.gridy = 2;
        menuButtonConstraints.insets = new Insets(0,-330,-340,0);
    }


    private void initializePanel(){
        panel.setLayout(gridBagLayout); //GridBagLayOut is added to Panel
        panel.setBackground(Color.ORANGE); //Orange background because it looks nice


        panel.add(optionsLabel, optionsLabelConstraints);

        gridBagConstraints.gridy = 2;
        panel.add(menuButton.getMenuButton(), menuButtonConstraints);
    }

    protected MenuButton getMenuButton(){
        return menuButton;
    }

    private void initializeOptionsLabel(){
        optionsLabel = new JLabel("Options");
        optionsLabel.setFont(new Font("", Font.BOLD, 75));
        optionsLabelConstraints.insets = new Insets(-150,0,150,0);
    }

    protected JPanel getPanel() {
        return panel;
    }

}
