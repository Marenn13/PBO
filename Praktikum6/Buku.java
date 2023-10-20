

package pbo6;

public class Buku {
    private String KodeBuku;
    private  Peminjam Buku ;
    private int HariSewa;
    private final int biaya= 20000;
    private final int jumHari=6;
    private final int denda = 3000;
    
    public Buku (){
        
    }
    public Buku (String KodeBuku, int Harisewa){
        this.KodeBuku= KodeBuku;
        this.HariSewa= Harisewa;
    }
    public Buku ( Peminjam Buku){
        this.Buku = Buku;
       
    }
    public Buku (int HariSewa){
        this.HariSewa=HariSewa;
    }

    public String getKodeBuku() {
        return KodeBuku;
    }

    public void setKodeBuku(String KodeBuku) {
        this.KodeBuku = KodeBuku;
    }

    public Peminjam getBuku() {
        return Buku;
    }

    public void setBuku(Peminjam Buku) {
        this.Buku = Buku;
    }

    public int getHariSewa() {
        return HariSewa;
    }

    public void setHariSewa(int HariSewa) {
        this.HariSewa = HariSewa;
    }

    
    public double HitBiaya (){
        
       double  a = biaya +(HariSewa - jumHari )*denda;
       return a;
    }
    
}
