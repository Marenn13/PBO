
public class PegawaiMain {

    
    public static void main(String[] args) {
       
        Manajer mjr= new Manajer (456);
        mjr.setNama("Marenn");
        mjr.setTunjJabatan(400000);
        mjr.setGaPok(6000000);
        
        System.out.println("Nama          : "+mjr.getNama());
        System.out.println("NPP           : "+ mjr.getNpp());
        System.out.println("Gaji Pokok    : " + mjr.getGaPok());
        System.out.println("Total Gaji    : " + mjr.Totalgaji());
        
        System.out.println();
        
        Marketing mark= new Marketing (6758);
        mark.setNama("Grace");
        mark.setBonus(350000);
        mark.setGaPok(5000000);
        
        System.out.println("Nama          : "+mark.getNama());
        System.out.println("NPP           : "+mark.getNpp());
        System.out.println("Gaji Pokok    : "+mark.getGaPok());
        System.out.println("Total Gaji    : "+ mark.TotalGaji());
        
        System.out.println(); 
        
        Honorer hnr= new Honorer (675);
        hnr.setNama("Ria");
        hnr.setGaPok(4500000);
        hnr.setGajiLembur(400000);
        
        System.out.println("Nama          : "+hnr.getNama());
        System.out.println("NPP           : "+hnr.getNpp());
        System.out.println("Gaji Pokok    : "+hnr.getGaPok());
        System.out.println("Total Gaji    : "+hnr.TotalGaji());
        
    }
    
}
