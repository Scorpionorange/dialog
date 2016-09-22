import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ScorpionOrange on 2016/09/21.
 * A sample modal dialog that displays a message and waits for the user to click the Ok button.
 */
public class AboutDialog extends JDialog{
    public AboutDialog(JFrame owner){
        super(owner, "About DialogTest", true);
        setSize(500, 300);
        //add HTML label to center
        add(
                new JLabel(
                        "<html>" +
                                "<h1><i>Core Java</i></h1>" +
                                "<hr>&nbsp &nbsp &nbsp " +
                                "By Cay Horstmann and Gray Cornell. " +
                                "&nbsp &nbsp &nbsp" +
                        "</html>"),
                BorderLayout.CENTER);
        //Ok button closes the dialog
        JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        //add Ok button to southern border
        JPanel panel = new JPanel();
        panel.add(ok);
        add(panel, BorderLayout.SOUTH);
        pack();
    }
}
