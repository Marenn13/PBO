
public class Pakian extends Barang {
    String ukuran;
    String warna;
    double discount;
    
    Pakian (){
        
    }
     public Pakian (double harga){
         super(harga);
     }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
       
     
    
}
