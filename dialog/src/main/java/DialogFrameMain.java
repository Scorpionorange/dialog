import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/22.
 */
public class DialogFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new DialogFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Dialog Frame Main");
            frame.setVisible(true);
        });
    }
}
