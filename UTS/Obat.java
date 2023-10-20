
package UTS;

public class Obat {
    private String NamaObat;
    private int Stok;
    private String Dosis;
    private int hargaObat;
    
   public Obat (){
       
   }
    public Obat (String NamaObat, int Stok, String Dosis, int hargaObat){
        this.NamaObat=NamaObat;
        this.Stok=Stok;
        this.Dosis=Dosis;
        this.hargaObat=hargaObat;
        
    }

    public String getNamaObat() {
        return NamaObat;
    }

    public void setNamaObat(String NamaObat) {
        this.NamaObat = NamaObat;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String Dosis) {
        this.Dosis = Dosis;
        
    }
       public int gethargaObat() {
        return hargaObat;
    }

    public void sethargaObat(String Dosis) {
        this.hargaObat = hargaObat;
    }
    
    
    
}

    