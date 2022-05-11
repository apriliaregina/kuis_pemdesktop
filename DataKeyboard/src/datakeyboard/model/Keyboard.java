
package datakeyboard.model;


public class Keyboard {
    private String idpelanggan;
    private String nama;
    private String tanggalBeli;
    private String merk;
    private String pembayaran;

    public Keyboard(String idpelanggan, String nama, String tanggalBeli, String merk, String pembayaran) {
        this.idpelanggan = idpelanggan;
        this.nama = nama;
        this.tanggalBeli = tanggalBeli;
        this.merk = merk;
        this.pembayaran = pembayaran;
    }

    public String getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(String idpelanggan) {
        this.idpelanggan = idpelanggan;
        
    }
        public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalBeli() {
        return tanggalBeli;
    }

    public void setTanggalBeli(String tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }




}