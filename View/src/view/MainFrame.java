import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame {

    public static void main(String[] args) {
        new MainFrame();
    }

    public MainFrame() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = new JFrame("NewClass");
                
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new MainPanel());
                frame.pack();
                frame.setLocationRelativeTo(null);
                
                frame.setVisible(true);
            }
        });
    }

    public class MainPanel extends JPanel {

        public MainPanel() {
            setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

            OptionsPanel p1 = new OptionsPanel();
            p1.setVisible(true);
            add(p1);
            
            JButton b1 = new JButton("Options");
            add(b1);
            b1.setLocation(100, 250);
            b1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if ( !p1.isVisible())
                        p1.setVisible(true);
                }
            }
            );
            
            JButton exit = new JButton("EXIT");
            add(exit);
            exit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
            );
            
            
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(800, 600);
        }

    }

    public class OptionsPanel extends JPanel {

        public OptionsPanel() {
            setBackground(Color.GREEN);
            JLabel label1 = new JLabel("Merhaba", JLabel.RIGHT);
            setLayout(new FlowLayout());
            add(label1);
            JButton button1 = new JButton("Click");
            button1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        setVisible(false);   
                }
            }
            );
            add(button1);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(800, 600);
        }

        @Override
        public Dimension getMinimumSize() {
            return getPreferredSize();
        }

        @Override
        public Dimension getMaximumSize() {
            return getPreferredSize();
        }

    }

    public class CreditsPanel extends JPanel {

        public CreditsPanel() {
            setBackground(Color.RED);
            
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 50);
        }

        @Override
        public Dimension getMinimumSize() {
            return getPreferredSize();
        }

        @Override
        public Dimension getMaximumSize() {
            return getPreferredSize();
        }

    }

}