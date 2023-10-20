
public class Makanan extends Barang {
    
    String Kedaluarsa;
    String daerah_asal;
    
    
    Makanan (){
        
    }
    Makanan (double harga){
        super(harga);
    }

    public String getKedaluarsa() {
        return Kedaluarsa;
    }

    public void setKedaluarsa(String Kedaluarsa) {
        this.Kedaluarsa = Kedaluarsa;
    }

    public String getDaerah_asal() {
        return daerah_asal;
    }

    public void setDaerah_asal(String daerah_asal) {
        this.daerah_asal = daerah_asal;
    }
    
    
     
    
}
