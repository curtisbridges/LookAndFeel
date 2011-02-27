package com.curtisbridges.swing;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
    public void run() {
        // TestFrame frame = new TestFrame();
        // frame.show();

        showLookAndFeels();
    }

    private void showLookAndFeels() {
        Object[] lnfs = UIManager.getInstalledLookAndFeels();
        for (int i = 0; i < lnfs.length; i++) {
            System.out.println(lnfs[i]);
        }
    }

    private static void setLnF() {
        try {
            String lnf = UIManager.getSystemLookAndFeelClassName();
            System.out.print("Setting the look and feel (" + lnf + ")...");

            // Options:
            // Metal javax.swing.plaf.metal.MetalLookAndFeel
            // CDE/Motif com.sun.java.swing.plaf.motif.MotifLookAndFeel
            // Windows com.sun.java.swing.plaf.windows.WindowsLookAndFeel
            // Windows Classic

            // com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel
            UIManager.setLookAndFeel(lnf);

            System.out.println("Done.");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String[] argv) {
        setLnF();

        Main test = new Main();
        test.run();
    }

    class TestFrame extends JFrame {
        public TestFrame() {
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(640, 480);
        }
    }
}
