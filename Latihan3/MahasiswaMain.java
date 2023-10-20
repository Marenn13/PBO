

package latihanpbo;


public class MahasiswaMain {

    
    public static void main(String[] args) {
        
         Mahasiswa objMhs = new Mahasiswa();
        objMhs.setNIM(225314001);
        objMhs.setNama("Erika");
        objMhs.tampil();
        
        Mahasiswa objMhs2 = new Mahasiswa("Arya");
        objMhs2.setNIM(225314003);
        objMhs2.tampil();
        
        Mahasiswa objMhs3 = new Mahasiswa("Andi",225314002);
        objMhs3.tampil();
    }
}

    
    

