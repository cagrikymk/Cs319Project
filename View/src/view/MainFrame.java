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
            setLayout(null);
            
            OptionsPanel optionsPanel = new OptionsPanel();
            optionsPanel.setBounds(0, 0, 1280, 800);
            optionsPanel.setVisible(false);
            add(optionsPanel);
            
            PlayButtonPanel playButtonPanel = new PlayButtonPanel();
            add(playButtonPanel);
            playButtonPanel.setBounds(0, 250, 1280, 100);
            
            JButton playButton = new JButton("Play");
            playButtonPanel.add(playButton);
            playButton.setBounds(590, 30, 100, 40);
            
            OptionsButtonPanel optionsButtonPanel = new OptionsButtonPanel();
            add(optionsButtonPanel);
            optionsButtonPanel.setBounds(0, 350, 1280, 100);
            
            JButton optionsButton = new JButton("Options");
            optionsButtonPanel.add(optionsButton);
            optionsButton.setBounds(590, 30, 100, 40);
            optionsButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    optionsPanel.setVisible(true);
                    //optionsButtonPanel.setVisible(false);
                    //playButtonPanel.setVisible(false);
                }
            }
            );
            
            optionsButtonPanel.setVisible(true);
            playButtonPanel.setVisible(true);
            
            
            
            
//            JButton exitButton = new JButton("EXIT");
//            exitButton.setBounds(600, 500, 80, 35);
//            add(exitButton);
//            exitButton.addActionListener(new ActionListener(){
//                public void actionPerformed(ActionEvent e){
//                    System.exit(0);
//                }
//            }
//            );

            

            
            
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1280, 800);
        }

    }
    public class PlayButtonPanel extends JPanel{
        public PlayButtonPanel() {
            setBackground(Color.BLACK);
            setLayout(new FlowLayout());
            
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1280, 100);
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
    
    public class OptionsButtonPanel extends JPanel{
        public OptionsButtonPanel() {
            setBackground(Color.BLACK);
            setLayout(new FlowLayout());
            
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1280, 100);
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

    public class OptionsPanel extends JPanel {

        public OptionsPanel() {
            setBackground(Color.CYAN);
            setLayout(null);
            JLabel label1 = new JLabel("Merhaba", JLabel.RIGHT);
            label1.setBounds(0, 350, 600, 100);
            add(label1);
            
            JButton button1 = new JButton("Click");
            button1.setBounds(1000,700,100,40);
            add(button1);
            button1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        setVisible(false);
                        
                }
            }
            );
            
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(1280, 800);
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
            return new Dimension(1280, 800);
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