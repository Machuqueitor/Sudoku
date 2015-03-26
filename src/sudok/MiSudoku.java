package sudok;

import com.sun.javafx.geom.Matrix3f;
import javax.swing.JOptionPane;

/**
 *
 * @author Machuqueitor
 */
public class MiSudoku extends javax.swing.JFrame {

    public Sudoku sk;

    public MiSudoku(Sudoku sk) {
        initComponents();
        this.sk = sk;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c14 = new javax.swing.JTextField();
        c15 = new javax.swing.JTextField();
        c16 = new javax.swing.JTextField();
        c17 = new javax.swing.JTextField();
        c18 = new javax.swing.JTextField();
        c19 = new javax.swing.JTextField();
        c20 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        c24 = new javax.swing.JTextField();
        c25 = new javax.swing.JTextField();
        c26 = new javax.swing.JTextField();
        c27 = new javax.swing.JTextField();
        c28 = new javax.swing.JTextField();
        c29 = new javax.swing.JTextField();
        c30 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        c33 = new javax.swing.JTextField();
        c34 = new javax.swing.JTextField();
        c35 = new javax.swing.JTextField();
        c36 = new javax.swing.JTextField();
        c37 = new javax.swing.JTextField();
        c38 = new javax.swing.JTextField();
        c39 = new javax.swing.JTextField();
        c40 = new javax.swing.JTextField();
        c41 = new javax.swing.JTextField();
        c42 = new javax.swing.JTextField();
        c43 = new javax.swing.JTextField();
        c44 = new javax.swing.JTextField();
        c45 = new javax.swing.JTextField();
        c46 = new javax.swing.JTextField();
        c47 = new javax.swing.JTextField();
        c48 = new javax.swing.JTextField();
        c49 = new javax.swing.JTextField();
        c50 = new javax.swing.JTextField();
        c51 = new javax.swing.JTextField();
        c52 = new javax.swing.JTextField();
        c53 = new javax.swing.JTextField();
        c54 = new javax.swing.JTextField();
        c55 = new javax.swing.JTextField();
        c56 = new javax.swing.JTextField();
        c57 = new javax.swing.JTextField();
        c58 = new javax.swing.JTextField();
        c59 = new javax.swing.JTextField();
        c60 = new javax.swing.JTextField();
        c61 = new javax.swing.JTextField();
        c62 = new javax.swing.JTextField();
        c63 = new javax.swing.JTextField();
        c64 = new javax.swing.JTextField();
        c65 = new javax.swing.JTextField();
        c66 = new javax.swing.JTextField();
        c67 = new javax.swing.JTextField();
        c68 = new javax.swing.JTextField();
        c69 = new javax.swing.JTextField();
        c70 = new javax.swing.JTextField();
        c71 = new javax.swing.JTextField();
        c72 = new javax.swing.JTextField();
        c73 = new javax.swing.JTextField();
        c74 = new javax.swing.JTextField();
        c75 = new javax.swing.JTextField();
        c76 = new javax.swing.JTextField();
        c77 = new javax.swing.JTextField();
        c78 = new javax.swing.JTextField();
        c79 = new javax.swing.JTextField();
        c80 = new javax.swing.JTextField();
        c81 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        c1.setBackground(new java.awt.Color(204, 204, 255));
        c1.setCaretColor(new java.awt.Color(51, 153, 255));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1KeyTyped(evt);
            }
        });

        c2.setBackground(new java.awt.Color(204, 204, 255));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2KeyTyped(evt);
            }
        });

        c3.setBackground(new java.awt.Color(204, 204, 255));
        c3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c3KeyTyped(evt);
            }
        });

        c4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4KeyTyped(evt);
            }
        });

        c5.setEditable(false);
        c5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c5KeyTyped(evt);
            }
        });

        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        c6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c6KeyTyped(evt);
            }
        });

        c7.setBackground(new java.awt.Color(204, 204, 255));
        c7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c7KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c7KeyTyped(evt);
            }
        });

        c8.setBackground(new java.awt.Color(204, 204, 255));
        c8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c8KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c8KeyTyped(evt);
            }
        });

        c9.setBackground(new java.awt.Color(204, 204, 255));
        c9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c9KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c9KeyTyped(evt);
            }
        });

        c10.setBackground(new java.awt.Color(204, 204, 255));
        c10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c10KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c10KeyTyped(evt);
            }
        });

        c11.setBackground(new java.awt.Color(204, 204, 255));
        c11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c11KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c11KeyTyped(evt);
            }
        });

        c12.setBackground(new java.awt.Color(204, 204, 255));
        c12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c12KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c12KeyTyped(evt);
            }
        });

        c13.setEditable(false);
        c13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c13KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c13KeyTyped(evt);
            }
        });

        c14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c14KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c14KeyTyped(evt);
            }
        });

        c15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c15KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c15KeyTyped(evt);
            }
        });

        c16.setBackground(new java.awt.Color(204, 204, 255));
        c16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c16KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c16KeyTyped(evt);
            }
        });

        c17.setEditable(false);
        c17.setBackground(new java.awt.Color(204, 204, 255));
        c17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c17KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c17KeyTyped(evt);
            }
        });

        c18.setBackground(new java.awt.Color(204, 204, 255));
        c18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c18KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c18KeyTyped(evt);
            }
        });

        c19.setEditable(false);
        c19.setBackground(new java.awt.Color(204, 204, 255));
        c19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c19KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c19KeyTyped(evt);
            }
        });

        c20.setBackground(new java.awt.Color(204, 204, 255));
        c20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c20KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c20KeyTyped(evt);
            }
        });

        c21.setEditable(false);
        c21.setBackground(new java.awt.Color(204, 204, 255));
        c21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c21KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c21KeyTyped(evt);
            }
        });

        c22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c22KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c22KeyTyped(evt);
            }
        });

        c23.setEditable(false);
        c23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c23KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c23KeyTyped(evt);
            }
        });

        c24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c24KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c24KeyTyped(evt);
            }
        });

        c25.setEditable(false);
        c25.setBackground(new java.awt.Color(204, 204, 255));
        c25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c25KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c25KeyTyped(evt);
            }
        });

        c26.setBackground(new java.awt.Color(204, 204, 255));
        c26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c26KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c26KeyTyped(evt);
            }
        });

        c27.setEditable(false);
        c27.setBackground(new java.awt.Color(204, 204, 255));
        c27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c27KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c27KeyTyped(evt);
            }
        });

        c28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c28KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c28KeyTyped(evt);
            }
        });

        c29.setEditable(false);
        c29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c29KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c29KeyTyped(evt);
            }
        });

        c30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c30KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c30KeyTyped(evt);
            }
        });

        c31.setBackground(new java.awt.Color(204, 204, 255));
        c31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c31KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c31KeyTyped(evt);
            }
        });

        c32.setBackground(new java.awt.Color(204, 204, 255));
        c32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c32KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c32KeyTyped(evt);
            }
        });

        c33.setEditable(false);
        c33.setBackground(new java.awt.Color(204, 204, 255));
        c33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c33KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c33KeyTyped(evt);
            }
        });

        c34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c34KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c34KeyTyped(evt);
            }
        });

        c35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c35KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c35KeyTyped(evt);
            }
        });

        c36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c36KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c36KeyTyped(evt);
            }
        });

        c37.setEditable(false);
        c37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c37KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c37KeyTyped(evt);
            }
        });

        c38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c38KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c38KeyTyped(evt);
            }
        });

        c39.setEditable(false);
        c39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c39KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c39KeyTyped(evt);
            }
        });

        c40.setBackground(new java.awt.Color(204, 204, 255));
        c40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c40KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c40KeyTyped(evt);
            }
        });

        c41.setBackground(new java.awt.Color(204, 204, 255));
        c41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c41KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c41KeyTyped(evt);
            }
        });

        c42.setBackground(new java.awt.Color(204, 204, 255));
        c42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c42KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c42KeyTyped(evt);
            }
        });

        c43.setEditable(false);
        c43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c43KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c43KeyTyped(evt);
            }
        });

        c44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c44KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c44KeyTyped(evt);
            }
        });

        c45.setEditable(false);
        c45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c45KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c45KeyTyped(evt);
            }
        });

        c46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c46KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c46KeyTyped(evt);
            }
        });

        c47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c47KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c47KeyTyped(evt);
            }
        });

        c48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c48KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c48KeyTyped(evt);
            }
        });

        c49.setEditable(false);
        c49.setBackground(new java.awt.Color(204, 204, 255));
        c49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c49KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c49KeyTyped(evt);
            }
        });

        c50.setBackground(new java.awt.Color(204, 204, 255));
        c50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c50KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c50KeyTyped(evt);
            }
        });

        c51.setBackground(new java.awt.Color(204, 204, 255));
        c51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c51KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c51KeyTyped(evt);
            }
        });

        c52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c52KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c52KeyTyped(evt);
            }
        });

        c53.setEditable(false);
        c53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c53KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c53KeyTyped(evt);
            }
        });

        c54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c54KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c54KeyTyped(evt);
            }
        });

        c55.setEditable(false);
        c55.setBackground(new java.awt.Color(204, 204, 255));
        c55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c55KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c55KeyTyped(evt);
            }
        });

        c56.setBackground(new java.awt.Color(204, 204, 255));
        c56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c56KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c56KeyTyped(evt);
            }
        });

        c57.setEditable(false);
        c57.setBackground(new java.awt.Color(204, 204, 255));
        c57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c57KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c57KeyTyped(evt);
            }
        });

        c58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c58KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c58KeyTyped(evt);
            }
        });

        c59.setEditable(false);
        c59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c59KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c59KeyTyped(evt);
            }
        });

        c60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c60KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c60KeyTyped(evt);
            }
        });

        c61.setEditable(false);
        c61.setBackground(new java.awt.Color(204, 204, 255));
        c61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c61KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c61KeyTyped(evt);
            }
        });

        c62.setBackground(new java.awt.Color(204, 204, 255));
        c62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c62KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c62KeyTyped(evt);
            }
        });

        c63.setEditable(false);
        c63.setBackground(new java.awt.Color(204, 204, 255));
        c63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c63KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c63KeyTyped(evt);
            }
        });

        c64.setBackground(new java.awt.Color(204, 204, 255));
        c64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c64KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c64KeyTyped(evt);
            }
        });

        c65.setEditable(false);
        c65.setBackground(new java.awt.Color(204, 204, 255));
        c65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c65KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c65KeyTyped(evt);
            }
        });

        c66.setBackground(new java.awt.Color(204, 204, 255));
        c66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c66KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c66KeyTyped(evt);
            }
        });

        c67.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c67KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c67KeyTyped(evt);
            }
        });

        c68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c68KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c68KeyTyped(evt);
            }
        });

        c69.setEditable(false);
        c69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c69KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c69KeyTyped(evt);
            }
        });

        c70.setBackground(new java.awt.Color(204, 204, 255));
        c70.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c70KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c70KeyTyped(evt);
            }
        });

        c71.setBackground(new java.awt.Color(204, 204, 255));
        c71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c71KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c71KeyTyped(evt);
            }
        });

        c72.setBackground(new java.awt.Color(204, 204, 255));
        c72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c72KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c72KeyTyped(evt);
            }
        });

        c73.setBackground(new java.awt.Color(204, 204, 255));
        c73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c73KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c73KeyTyped(evt);
            }
        });

        c74.setBackground(new java.awt.Color(204, 204, 255));
        c74.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c74KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c74KeyTyped(evt);
            }
        });

        c75.setBackground(new java.awt.Color(204, 204, 255));
        c75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c75KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c75KeyTyped(evt);
            }
        });

        c76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c76KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c76KeyTyped(evt);
            }
        });

        c77.setEditable(false);
        c77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c77KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c77KeyTyped(evt);
            }
        });

        c78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c78KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c78KeyTyped(evt);
            }
        });

        c79.setBackground(new java.awt.Color(204, 204, 255));
        c79.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c79KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c79KeyTyped(evt);
            }
        });

        c80.setBackground(new java.awt.Color(204, 204, 255));
        c80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c80KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c80KeyTyped(evt);
            }
        });

        c81.setBackground(new java.awt.Color(204, 204, 255));
        c81.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c81KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c81KeyTyped(evt);
            }
        });

        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c73, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(c64)
                    .addComponent(c55)
                    .addComponent(c46)
                    .addComponent(c37)
                    .addComponent(c28)
                    .addComponent(c19)
                    .addComponent(c10)
                    .addComponent(c1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(c11)
                    .addComponent(c20)
                    .addComponent(c29)
                    .addComponent(c38)
                    .addComponent(c47)
                    .addComponent(c56)
                    .addComponent(c65)
                    .addComponent(c74))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(c12)
                    .addComponent(c21)
                    .addComponent(c30)
                    .addComponent(c39)
                    .addComponent(c48)
                    .addComponent(c57)
                    .addComponent(c75)
                    .addComponent(c66, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(c13)
                            .addComponent(c22)
                            .addComponent(c31)
                            .addComponent(c40)
                            .addComponent(c49)
                            .addComponent(c58)
                            .addComponent(c67)
                            .addComponent(c76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(c14)
                            .addComponent(c23)
                            .addComponent(c32)
                            .addComponent(c41)
                            .addComponent(c50)
                            .addComponent(c59)
                            .addComponent(c68)
                            .addComponent(c77))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(c15)
                            .addComponent(c24)
                            .addComponent(c33)
                            .addComponent(c42)
                            .addComponent(c51)
                            .addComponent(c60)
                            .addComponent(c69)
                            .addComponent(c78))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c7, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(c16)
                            .addComponent(c25)
                            .addComponent(c34)
                            .addComponent(c43)
                            .addComponent(c52)
                            .addComponent(c61)
                            .addComponent(c70)
                            .addComponent(c79))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c8, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(c17)
                            .addComponent(c26)
                            .addComponent(c35)
                            .addComponent(c44)
                            .addComponent(c53)
                            .addComponent(c62)
                            .addComponent(c71)
                            .addComponent(c80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c9, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(c18)
                            .addComponent(c27)
                            .addComponent(c36)
                            .addComponent(c45)
                            .addComponent(c54)
                            .addComponent(c63)
                            .addComponent(c72)
                            .addComponent(c81)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
    }//GEN-LAST:event_c2ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
    }//GEN-LAST:event_c6ActionPerformed

    public void unDigito(java.awt.event.KeyEvent evt, javax.swing.JTextField casilla, int fila) {
        if (casilla.getText().length() > 0) {

            if (evt.getKeyCode() == 8) {

                for (int i = 0; i < sk.mr.matriz.length; i++) {
                    if (!"".equals(casilla.getText()) && sk.mr.matriz[fila][i] == Integer.parseInt(casilla.getText())) {
                        sk.mr.matriz[fila][i] = 0;
                        casilla.setText("");
                        evt.consume();
                    }
                }
            }
            casilla.setText("");
            evt.consume();
        }
    }

    public void filtrarTecla(java.awt.event.KeyEvent evt, javax.swing.JTextField casilla, int fila, int columna) {
        char tecla = evt.getKeyChar();
        boolean val1 = false, val2 = false, val3 = false;

        if ((tecla <= '9' && tecla >= '1')) {

            val1 = sk.mr.repetidosColumna((int) tecla - 48, columna);
            val2 = sk.mr.repetidosFila((int) tecla - 48, fila);
            val3 = sk.mr.repetidosCuadrante(fila, columna, (int) tecla - 48);

            if (val1 == true || val2 == true || val3 == true) {

                evt.consume();
                ;
            } else {
                sk.mr.matriz[fila][columna] = (int) tecla - 48;
            }

        } else {
            evt.consume();
        }
    }
    private void c1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyTyped
        filtrarTecla(evt, c1, 0, 0);
    }//GEN-LAST:event_c1KeyTyped

    private void c2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyTyped
        filtrarTecla(evt, c2, 0, 1);
    }//GEN-LAST:event_c2KeyTyped

    private void c3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyTyped
        filtrarTecla(evt, c3, 0, 2);
    }//GEN-LAST:event_c3KeyTyped

    private void c5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyTyped
        filtrarTecla(evt, c5, 0, 4);
    }//GEN-LAST:event_c5KeyTyped

    private void c4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyTyped
        filtrarTecla(evt, c4, 0, 3);
    }//GEN-LAST:event_c4KeyTyped

    private void c6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyTyped
        filtrarTecla(evt, c6, 0, 5);
    }//GEN-LAST:event_c6KeyTyped

    private void c7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyTyped
        filtrarTecla(evt, c7, 0, 6);
    }//GEN-LAST:event_c7KeyTyped

    private void c8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyTyped
        filtrarTecla(evt, c8, 0, 7);
    }//GEN-LAST:event_c8KeyTyped

    private void c9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyTyped
        filtrarTecla(evt, c9, 0, 8);
    }//GEN-LAST:event_c9KeyTyped

    private void c10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c10KeyTyped
        filtrarTecla(evt, c10, 1, 0);
    }//GEN-LAST:event_c10KeyTyped

    private void c11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c11KeyTyped
        filtrarTecla(evt, c11, 1, 1);
    }//GEN-LAST:event_c11KeyTyped

    private void c12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c12KeyTyped
        filtrarTecla(evt, c12, 1, 2);
    }//GEN-LAST:event_c12KeyTyped

    private void c13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c13KeyTyped
        filtrarTecla(evt, c13, 1, 3);
    }//GEN-LAST:event_c13KeyTyped

    private void c14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c14KeyTyped
        filtrarTecla(evt, c14, 1, 4);
    }//GEN-LAST:event_c14KeyTyped

    private void c15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c15KeyTyped
        filtrarTecla(evt, c15, 1, 5);
    }//GEN-LAST:event_c15KeyTyped

    private void c16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c16KeyTyped
        filtrarTecla(evt, c16, 1, 6);
    }//GEN-LAST:event_c16KeyTyped

    private void c17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c17KeyTyped
        filtrarTecla(evt, c17, 1, 7);
    }//GEN-LAST:event_c17KeyTyped

    private void c18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c18KeyTyped
        filtrarTecla(evt, c18, 1, 8);
    }//GEN-LAST:event_c18KeyTyped

    private void c19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c19KeyTyped
        filtrarTecla(evt, c19, 2, 0);
    }//GEN-LAST:event_c19KeyTyped

    private void c20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c20KeyTyped
        filtrarTecla(evt, c20, 2, 1);
    }//GEN-LAST:event_c20KeyTyped

    private void c21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c21KeyTyped
        filtrarTecla(evt, c21, 2, 2);
    }//GEN-LAST:event_c21KeyTyped

    private void c22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c22KeyTyped
        filtrarTecla(evt, c22, 2, 3);
    }//GEN-LAST:event_c22KeyTyped

    private void c23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c23KeyTyped
        filtrarTecla(evt, c23, 2, 4);
    }//GEN-LAST:event_c23KeyTyped

    private void c24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c24KeyTyped
        filtrarTecla(evt, c24, 2, 5);
    }//GEN-LAST:event_c24KeyTyped

    private void c25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c25KeyTyped
        filtrarTecla(evt, c25, 2, 6);
    }//GEN-LAST:event_c25KeyTyped

    private void c26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c26KeyTyped
        filtrarTecla(evt, c26, 2, 7);
    }//GEN-LAST:event_c26KeyTyped

    private void c27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c27KeyTyped
        filtrarTecla(evt, c27, 2, 8);
    }//GEN-LAST:event_c27KeyTyped

    private void c28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c28KeyTyped
        filtrarTecla(evt, c28, 3, 0);
    }//GEN-LAST:event_c28KeyTyped

    private void c29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c29KeyTyped
        filtrarTecla(evt, c29, 3, 1);
    }//GEN-LAST:event_c29KeyTyped

    private void c30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c30KeyTyped
        filtrarTecla(evt, c30, 3, 2);
    }//GEN-LAST:event_c30KeyTyped

    private void c31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c31KeyTyped
        filtrarTecla(evt, c31, 3, 3);
    }//GEN-LAST:event_c31KeyTyped

    private void c32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c32KeyTyped
        filtrarTecla(evt, c32, 3, 4);
    }//GEN-LAST:event_c32KeyTyped

    private void c33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c33KeyTyped
        filtrarTecla(evt, c33, 3, 5);

    }//GEN-LAST:event_c33KeyTyped

    private void c34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c34KeyTyped
        filtrarTecla(evt, c34, 3, 6);

    }//GEN-LAST:event_c34KeyTyped

    private void c35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c35KeyTyped
        filtrarTecla(evt, c35, 3, 7);

    }//GEN-LAST:event_c35KeyTyped

    private void c36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c36KeyTyped
        filtrarTecla(evt, c36, 3, 8);

    }//GEN-LAST:event_c36KeyTyped

    private void c37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c37KeyTyped
        filtrarTecla(evt, c37, 4, 0);

    }//GEN-LAST:event_c37KeyTyped

    private void c38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c38KeyTyped
        filtrarTecla(evt, c38, 4, 1);

    }//GEN-LAST:event_c38KeyTyped

    private void c39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c39KeyTyped
        filtrarTecla(evt, c39, 4, 2);

    }//GEN-LAST:event_c39KeyTyped

    private void c40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c40KeyTyped
        filtrarTecla(evt, c40, 4, 3);

    }//GEN-LAST:event_c40KeyTyped

    private void c41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c41KeyTyped
        filtrarTecla(evt, c41, 4, 4);

    }//GEN-LAST:event_c41KeyTyped

    private void c42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c42KeyTyped
        filtrarTecla(evt, c42, 4, 5);

    }//GEN-LAST:event_c42KeyTyped

    private void c43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c43KeyTyped
        filtrarTecla(evt, c43, 4, 6);

    }//GEN-LAST:event_c43KeyTyped

    private void c44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c44KeyTyped
        filtrarTecla(evt, c44, 4, 7);

    }//GEN-LAST:event_c44KeyTyped

    private void c45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c45KeyTyped
        filtrarTecla(evt, c45, 4, 8);

    }//GEN-LAST:event_c45KeyTyped

    private void c46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c46KeyTyped
        filtrarTecla(evt, c46, 5, 0);

    }//GEN-LAST:event_c46KeyTyped

    private void c47KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c47KeyTyped
        filtrarTecla(evt, c47, 5, 1);

    }//GEN-LAST:event_c47KeyTyped

    private void c48KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c48KeyTyped
        filtrarTecla(evt, c48, 5, 2);

    }//GEN-LAST:event_c48KeyTyped

    private void c49KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c49KeyTyped
        filtrarTecla(evt, c49, 5, 3);

    }//GEN-LAST:event_c49KeyTyped

    private void c50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c50KeyTyped
        filtrarTecla(evt, c50, 5, 4);

    }//GEN-LAST:event_c50KeyTyped

    private void c51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c51KeyTyped
        filtrarTecla(evt, c51, 5, 5);

    }//GEN-LAST:event_c51KeyTyped

    private void c52KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c52KeyTyped
        filtrarTecla(evt, c52, 5, 6);

    }//GEN-LAST:event_c52KeyTyped

    private void c53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c53KeyTyped
        filtrarTecla(evt, c53, 5, 7);

    }//GEN-LAST:event_c53KeyTyped

    private void c54KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c54KeyTyped
        filtrarTecla(evt, c54, 5, 8);

    }//GEN-LAST:event_c54KeyTyped

    private void c55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c55KeyTyped
        filtrarTecla(evt, c55, 6, 0);

    }//GEN-LAST:event_c55KeyTyped

    private void c56KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c56KeyTyped
        filtrarTecla(evt, c56, 6, 1);

    }//GEN-LAST:event_c56KeyTyped

    private void c57KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c57KeyTyped
        filtrarTecla(evt, c57, 6, 2);

    }//GEN-LAST:event_c57KeyTyped

    private void c58KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c58KeyTyped
        filtrarTecla(evt, c58, 6, 3);

    }//GEN-LAST:event_c58KeyTyped

    private void c59KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c59KeyTyped
        filtrarTecla(evt, c59, 6, 4);

    }//GEN-LAST:event_c59KeyTyped

    private void c60KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c60KeyTyped
        filtrarTecla(evt, c60, 6, 5);

    }//GEN-LAST:event_c60KeyTyped

    private void c61KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c61KeyTyped
        filtrarTecla(evt, c61, 6, 6);

    }//GEN-LAST:event_c61KeyTyped

    private void c62KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c62KeyTyped
        filtrarTecla(evt, c62, 6, 7);

    }//GEN-LAST:event_c62KeyTyped

    private void c63KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c63KeyTyped
        filtrarTecla(evt, c63, 6, 8);

    }//GEN-LAST:event_c63KeyTyped

    private void c64KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c64KeyTyped
        filtrarTecla(evt, c64, 7, 0);

    }//GEN-LAST:event_c64KeyTyped

    private void c65KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c65KeyTyped
        filtrarTecla(evt, c65, 7, 1);

    }//GEN-LAST:event_c65KeyTyped

    private void c66KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c66KeyTyped
        filtrarTecla(evt, c66, 7, 2);

    }//GEN-LAST:event_c66KeyTyped

    private void c67KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c67KeyTyped
        filtrarTecla(evt, c67, 7, 3);

    }//GEN-LAST:event_c67KeyTyped

    private void c68KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c68KeyTyped
        filtrarTecla(evt, c68, 7, 4);

    }//GEN-LAST:event_c68KeyTyped

    private void c69KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c69KeyTyped
        filtrarTecla(evt, c69, 7, 5);

    }//GEN-LAST:event_c69KeyTyped

    private void c70KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c70KeyTyped
        filtrarTecla(evt, c70, 7, 6);

    }//GEN-LAST:event_c70KeyTyped

    private void c71KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c71KeyTyped
        filtrarTecla(evt, c71, 7, 7);

    }//GEN-LAST:event_c71KeyTyped

    private void c72KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c72KeyTyped
        filtrarTecla(evt, c72, 7, 8);

    }//GEN-LAST:event_c72KeyTyped

    private void c73KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c73KeyTyped
        filtrarTecla(evt, c73, 8, 0);

    }//GEN-LAST:event_c73KeyTyped

    private void c74KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c74KeyTyped
        filtrarTecla(evt, c74, 8, 1);

    }//GEN-LAST:event_c74KeyTyped

    private void c75KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c75KeyTyped
        filtrarTecla(evt, c75, 8, 2);

    }//GEN-LAST:event_c75KeyTyped

    private void c76KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c76KeyTyped
        filtrarTecla(evt, c76, 8, 3);

    }//GEN-LAST:event_c76KeyTyped

    private void c77KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c77KeyTyped
        filtrarTecla(evt, c77, 8, 4);

    }//GEN-LAST:event_c77KeyTyped

    private void c78KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c78KeyTyped
        filtrarTecla(evt, c78, 8, 5);

    }//GEN-LAST:event_c78KeyTyped

    private void c79KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c79KeyTyped
        filtrarTecla(evt, c79, 8, 6);

    }//GEN-LAST:event_c79KeyTyped

    private void c80KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c80KeyTyped
        filtrarTecla(evt, c80, 8, 7);

    }//GEN-LAST:event_c80KeyTyped

    private void c81KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c81KeyTyped
        filtrarTecla(evt, c81, 8, 8);

    }//GEN-LAST:event_c81KeyTyped

    private void c1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyPressed
        unDigito(evt, c1, 0);

    }//GEN-LAST:event_c1KeyPressed

    private void c1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_c1KeyReleased

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

    }//GEN-LAST:event_c1ActionPerformed

    private void c2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyPressed
        unDigito(evt, c2, 0);
        // TODO add your handling code here:
    }//GEN-LAST:event_c2KeyPressed

    private void c3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyPressed
        unDigito(evt, c3, 0);
        // TODO add your handling code here:
    }//GEN-LAST:event_c3KeyPressed

    private void c4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyPressed
        unDigito(evt, c4, 0);
    }//GEN-LAST:event_c4KeyPressed

    private void c5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyPressed
        unDigito(evt, c5, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_c5KeyPressed

    private void c6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyPressed
        unDigito(evt, c6, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_c6KeyPressed

    private void c7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyPressed
        unDigito(evt, c7, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_c7KeyPressed

    private void c8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyPressed
        unDigito(evt, c8, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_c8KeyPressed

    private void c9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyPressed
        unDigito(evt, c9, 0);        // TODO add your handling code here:
    }//GEN-LAST:event_c9KeyPressed

    private void c10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c10KeyPressed
        unDigito(evt, c10, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c10KeyPressed

    private void c11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c11KeyPressed
        unDigito(evt, c11, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c11KeyPressed

    private void c12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c12KeyPressed
        unDigito(evt, c12, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c12KeyPressed

    private void c13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c13KeyPressed
        unDigito(evt, c13, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c13KeyPressed

    private void c14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c14KeyPressed
        unDigito(evt, c14, 1);      // TODO add your handling code here:
    }//GEN-LAST:event_c14KeyPressed

    private void c15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c15KeyPressed
        unDigito(evt, c15, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c15KeyPressed

    private void c16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c16KeyPressed
        unDigito(evt, c16, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c16KeyPressed

    private void c17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c17KeyPressed
        unDigito(evt, c17, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c17KeyPressed

    private void c18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c18KeyPressed
        unDigito(evt, c18, 1);        // TODO add your handling code here:
    }//GEN-LAST:event_c18KeyPressed

    private void c19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c19KeyPressed
        unDigito(evt, c19, 1);         // TODO add your handling code here:
    }//GEN-LAST:event_c19KeyPressed

    private void c20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c20KeyPressed
        unDigito(evt, c20, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c20KeyPressed

    private void c21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c21KeyPressed
        unDigito(evt, c21, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c21KeyPressed

    private void c22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c22KeyPressed
        unDigito(evt, c22, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c22KeyPressed

    private void c23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c23KeyPressed
        unDigito(evt, c23, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c23KeyPressed

    private void c24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c24KeyPressed
        unDigito(evt, c24, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c24KeyPressed

    private void c25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c25KeyPressed
        unDigito(evt, c25, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c25KeyPressed

    private void c26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c26KeyPressed
        unDigito(evt, c26, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c26KeyPressed

    private void c27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c27KeyPressed
        unDigito(evt, c27, 2);         // TODO add your handling code here:
    }//GEN-LAST:event_c27KeyPressed

    private void c28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c28KeyPressed
        unDigito(evt, c28, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c28KeyPressed

    private void c29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c29KeyPressed
        unDigito(evt, c29, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c29KeyPressed

    private void c30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c30KeyPressed
        unDigito(evt, c30, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c30KeyPressed

    private void c31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c31KeyPressed
        unDigito(evt, c31, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c31KeyPressed

    private void c32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c32KeyPressed
        unDigito(evt, c32, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c32KeyPressed

    private void c33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c33KeyPressed
        unDigito(evt, c33, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c33KeyPressed

    private void c34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c34KeyPressed
        unDigito(evt, c34, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c34KeyPressed

    private void c35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c35KeyPressed
        unDigito(evt, c35, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c35KeyPressed

    private void c36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c36KeyPressed
        unDigito(evt, c36, 3);         // TODO add your handling code here:
    }//GEN-LAST:event_c36KeyPressed

    private void c37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c37KeyPressed
        unDigito(evt, c37, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c37KeyPressed

    private void c38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c38KeyPressed
        unDigito(evt, c38, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c38KeyPressed

    private void c39KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c39KeyPressed
        unDigito(evt, c39, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c39KeyPressed

    private void c40KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c40KeyPressed
        unDigito(evt, c40, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c40KeyPressed

    private void c41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c41KeyPressed
        unDigito(evt, c41, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c41KeyPressed

    private void c42KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c42KeyPressed
        unDigito(evt, c42, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c42KeyPressed

    private void c43KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c43KeyPressed
        unDigito(evt, c43, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c43KeyPressed

    private void c44KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c44KeyPressed
        unDigito(evt, c44, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c44KeyPressed

    private void c45KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c45KeyPressed
        unDigito(evt, c45, 4);         // TODO add your handling code here:
    }//GEN-LAST:event_c45KeyPressed

    private void c46KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c46KeyPressed
        unDigito(evt, c46, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c46KeyPressed

    private void c47KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c47KeyPressed
        unDigito(evt, c47, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c47KeyPressed

    private void c48KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c48KeyPressed
        unDigito(evt, c48, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c48KeyPressed

    private void c49KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c49KeyPressed
        unDigito(evt, c49, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c49KeyPressed

    private void c50KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c50KeyPressed
        unDigito(evt, c50, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c50KeyPressed

    private void c51KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c51KeyPressed
        unDigito(evt, c51, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c51KeyPressed

    private void c52KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c52KeyPressed
        unDigito(evt, c52, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c52KeyPressed

    private void c53KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c53KeyPressed
        unDigito(evt, c53, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c53KeyPressed

    private void c54KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c54KeyPressed
        unDigito(evt, c54, 5);         // TODO add your handling code here:
    }//GEN-LAST:event_c54KeyPressed

    private void c55KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c55KeyPressed
        unDigito(evt, c55, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c55KeyPressed

    private void c56KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c56KeyPressed
        unDigito(evt, c56, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c56KeyPressed

    private void c57KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c57KeyPressed
        unDigito(evt, c57, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c57KeyPressed

    private void c58KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c58KeyPressed
        unDigito(evt, c58, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c58KeyPressed

    private void c59KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c59KeyPressed
        unDigito(evt, c59, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c59KeyPressed

    private void c60KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c60KeyPressed
        unDigito(evt, c60, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c60KeyPressed

    private void c61KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c61KeyPressed
        unDigito(evt, c61, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c61KeyPressed

    private void c62KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c62KeyPressed
        unDigito(evt, c62, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c62KeyPressed

    private void c63KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c63KeyPressed
        unDigito(evt, c63, 6);         // TODO add your handling code here:
    }//GEN-LAST:event_c63KeyPressed

    private void c64KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c64KeyPressed
        unDigito(evt, c64, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c64KeyPressed

    private void c65KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c65KeyPressed
        unDigito(evt, c65, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c65KeyPressed

    private void c66KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c66KeyPressed
        unDigito(evt, c66, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c66KeyPressed

    private void c67KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c67KeyPressed
        unDigito(evt, c67, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c67KeyPressed

    private void c68KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c68KeyPressed
        unDigito(evt, c68, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c68KeyPressed

    private void c69KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c69KeyPressed
        unDigito(evt, c69, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c69KeyPressed

    private void c70KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c70KeyPressed
        unDigito(evt, c70, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c70KeyPressed

    private void c71KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c71KeyPressed
        unDigito(evt, c71, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c71KeyPressed

    private void c72KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c72KeyPressed
        unDigito(evt, c72, 7);         // TODO add your handling code here:
    }//GEN-LAST:event_c72KeyPressed

    private void c73KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c73KeyPressed
        unDigito(evt, c73, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c73KeyPressed

    private void c74KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c74KeyPressed
        unDigito(evt, c74, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c74KeyPressed

    private void c75KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c75KeyPressed
        unDigito(evt, c75, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c75KeyPressed

    private void c76KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c76KeyPressed
        unDigito(evt, c76, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c76KeyPressed

    private void c77KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c77KeyPressed
        unDigito(evt, c77, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c77KeyPressed

    private void c78KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c78KeyPressed
        unDigito(evt, c78, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c78KeyPressed

    private void c79KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c79KeyPressed
        unDigito(evt, c79, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c79KeyPressed

    private void c80KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c80KeyPressed
        unDigito(evt, c80, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c80KeyPressed

    private void c81KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c81KeyPressed
        unDigito(evt, c81, 8);         // TODO add your handling code here:
    }//GEN-LAST:event_c81KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (sk.mr.verificarFilasColumnas() == true || sk.mr.verificarCuadrante()==true) {
            
            JOptionPane.showMessageDialog(null, "Sudoku Incorrecto");
        }else{
             JOptionPane.showMessageDialog(null, "Sudoku CORRECTO");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField c1;
    public javax.swing.JTextField c10;
    public javax.swing.JTextField c11;
    public javax.swing.JTextField c12;
    public javax.swing.JTextField c13;
    public javax.swing.JTextField c14;
    public javax.swing.JTextField c15;
    public javax.swing.JTextField c16;
    public javax.swing.JTextField c17;
    public javax.swing.JTextField c18;
    public javax.swing.JTextField c19;
    public javax.swing.JTextField c2;
    public javax.swing.JTextField c20;
    public javax.swing.JTextField c21;
    public javax.swing.JTextField c22;
    public javax.swing.JTextField c23;
    public javax.swing.JTextField c24;
    public javax.swing.JTextField c25;
    public javax.swing.JTextField c26;
    public javax.swing.JTextField c27;
    public javax.swing.JTextField c28;
    public javax.swing.JTextField c29;
    public javax.swing.JTextField c3;
    public javax.swing.JTextField c30;
    public javax.swing.JTextField c31;
    public javax.swing.JTextField c32;
    public javax.swing.JTextField c33;
    public javax.swing.JTextField c34;
    public javax.swing.JTextField c35;
    public javax.swing.JTextField c36;
    public javax.swing.JTextField c37;
    public javax.swing.JTextField c38;
    public javax.swing.JTextField c39;
    public javax.swing.JTextField c4;
    public javax.swing.JTextField c40;
    public javax.swing.JTextField c41;
    public javax.swing.JTextField c42;
    public javax.swing.JTextField c43;
    public javax.swing.JTextField c44;
    public javax.swing.JTextField c45;
    public javax.swing.JTextField c46;
    public javax.swing.JTextField c47;
    public javax.swing.JTextField c48;
    public javax.swing.JTextField c49;
    public javax.swing.JTextField c5;
    public javax.swing.JTextField c50;
    public javax.swing.JTextField c51;
    public javax.swing.JTextField c52;
    public javax.swing.JTextField c53;
    public javax.swing.JTextField c54;
    public javax.swing.JTextField c55;
    public javax.swing.JTextField c56;
    public javax.swing.JTextField c57;
    public javax.swing.JTextField c58;
    public javax.swing.JTextField c59;
    public javax.swing.JTextField c6;
    public javax.swing.JTextField c60;
    public javax.swing.JTextField c61;
    public javax.swing.JTextField c62;
    public javax.swing.JTextField c63;
    public javax.swing.JTextField c64;
    public javax.swing.JTextField c65;
    public javax.swing.JTextField c66;
    public javax.swing.JTextField c67;
    public javax.swing.JTextField c68;
    public javax.swing.JTextField c69;
    public javax.swing.JTextField c7;
    public javax.swing.JTextField c70;
    public javax.swing.JTextField c71;
    public javax.swing.JTextField c72;
    public javax.swing.JTextField c73;
    public javax.swing.JTextField c74;
    public javax.swing.JTextField c75;
    public javax.swing.JTextField c76;
    public javax.swing.JTextField c77;
    public javax.swing.JTextField c78;
    public javax.swing.JTextField c79;
    public javax.swing.JTextField c8;
    public javax.swing.JTextField c80;
    public javax.swing.JTextField c81;
    public javax.swing.JTextField c9;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
