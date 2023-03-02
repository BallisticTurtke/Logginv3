package evan.nguyen;

import evan.nguyen.database.UserDatabase;
import evan.nguyen.gui.Login;
import evan.nguyen.gui.Registration;
import evan.nguyen.gui.Home;
import evan.nguyen.gui.Reservation;
import evan.nguyen.objects.User;

import javax.swing.*;

public class Helsman {
    private UserDatabase userDatabase = new UserDatabase();
    private Login loginPage = new Login(this);
    private Registration registrationPage = new Registration(this);
    private Home homePage = new Home(this);
    private Reservation reservationPage = new Reservation(this);
    private User activeUser;
    private JPanel currentPanel;
    private JFrame frame = new JFrame();

    public Helsman() {
        setCurrentPanel(homePage.alphaPanel);
    }

    public void setCurrentPanel(JPanel panel) {
        this.currentPanel = panel;
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,375);
        frame.setVisible(true);
    }

}
