/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakeyboard.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import datakeyboard.model.Keyboard;

public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addKeyboard(Keyboard key){
        String insertKey = "INSERT INTO `keyboard`(`id`, `nama`, `tgl_beli`,`merk`,`pembayaran`)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertKey);
            stmtInsert.setString(1, key.getIdpelanggan());
            stmtInsert.setString(2, key.getNama());
            stmtInsert.setString(3, key.getTanggalBeli());
            stmtInsert.setString(4, key.getMerk());
            stmtInsert.setString(5, key.getPembayaran());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
