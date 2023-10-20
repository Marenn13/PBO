

package praktikumpbo;

//import java.util.Scanner;


public class pegawaiMain {
    public static void main(String[] args) {
        Pegawai pgw=new Pegawai ();
        pgw.setNama("Maren");
        pgw.setNIP(182);
        pgw.setGaji_pokok(5000000);
        pgw.setJamLembur(2);
        pgw.setJumlah_anak(1);
        
        
        System.out.println("Nama :"+pgw.getNama());
        System.out.println("NIP  :"+pgw.getNIP());
        System.out.println("Gaji Pokok :"+pgw.getGaji_pokok());
        System.out.println("Jam Lembur :"+pgw.getJamLembur());
        System.out.println("Jumlah Anak :"+pgw.getJumlah_anak());
        System.out.println("Gaji Total :"+pgw.gajiTotal());
        
        
    }
}
