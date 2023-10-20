
package pbo6;

public class BukuMain {

    public static void main(String[] args) {
        Peminjam b1= new Peminjam (" Je ", " 182", " Jogja");
        Buku book1 = new Buku ( "224",4);
        
        Peminjam b2= new Peminjam (" e", " 1842", " Jogja");
        Buku book2=new Buku (b2);
        book2.setHariSewa(5);
        
        Peminjam b3= new Peminjam (" J ", " 184", " Jogja"); 
        System.out.println("=== PERPUSTAKAAN===");
        
        System.out.println("Nama     :"+b1.getNama());
        System.out.println("Id       :"+b1.getId());
        System.out.println("Alamat   :"+b1.getAlamat());
        System.out.println("Kode Buku: "+book1.getKodeBuku());
        System.out.println("Biaya    :"+book1.HitBiaya());
        System.out.println("**************************");
        
        System.out.println("Nama     :"+b2.getNama());
        System.out.println("Id       :"+b2.getId());
        System.out.println("Alamat   :"+b2.getAlamat());
        System.out.println("Biaya    :"+book2.HitBiaya());
        System.out.println("**************************");
        
        System.out.println("Nama     :"+b3.getNama());
        System.out.println("Id       :"+b3.getId());
        System.out.println("Alamat   :"+b3.getAlamat());
      
        System.out.println("*****************************");
        
        
    }
    
}
