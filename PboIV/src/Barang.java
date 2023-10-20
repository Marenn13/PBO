
public class Barang {
    String kodeBarang;
    String nama;
    double harga;
    
    public Barang (){
        
    }
     public Barang (double harga){
       this.harga=harga;
    }
    

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
   
    
    
}
