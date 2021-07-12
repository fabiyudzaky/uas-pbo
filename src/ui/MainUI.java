package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MainUI {
    private JTextField textField1;
    private JFormattedTextField formattedTextField1;
    private JButton simpanButton;
    private JButton kembalikanBukuButton;
    private JButton editButton;
    private JButton deleteButton;
    private JTable showTable;
    private JPanel rootPanel;

    public MainUI(){
        createTable();
    }

    public JPanel getRootPanel(){
        return rootPanel;
    }

    public void createTable(){
        showTable.setModel(new DefaultTableModel(
            null,
            new String[]{"ID", "Judul Buku", "Tanggal Pinjam", "Tanggal Harus Kembali", "Tanggal Kembali", "Denda", "Biaya Sewa"}
        ));
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
