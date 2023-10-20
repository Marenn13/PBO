
public class Obat extends Barang {
    
    String tglKedaluarsa;
    String dosis;
    
    
    Obat (){
        
    }
    Obat (double harga){
        super (harga);
    }

    public String getTglKedaluarsa() {
        return tglKedaluarsa;
    }

    public void setTglKedaluarsa(String tglKedaluarsa) {
        this.tglKedaluarsa = tglKedaluarsa;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }
    
    
    
}
