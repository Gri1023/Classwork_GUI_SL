import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class Application
{
    // constructor is run at the start of the program
    public Application ()
    {
        gui = new GUI (this);
        state = false;
    }

    // the "state" of this simple application is just a boolean, and
    // this method will change the state by flipping the value
    public void flipState ()
    {
        state = !state;
    }

    public boolean getState () { return state; }
    private GUI gui;
    private boolean state;
}