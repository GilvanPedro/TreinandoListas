package br.com;

import br.com.View.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        // Inicia a interface gráfica
        javax.swing.SwingUtilities.invokeLater(() -> {
            new BibliotecaView().setVisible(true);
        });
    }
}
