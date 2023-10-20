
public class mahasiswa {
    
    String nama;
    double uts1,uts2,uas;

    public double HitFinal() {
        double Final = 0.3 * uts1 + 0.3 * uts2 + 0.4 * uas;
        return Final;
    }
    
    public String konversi(){
        if(HitFinal()>=80){
            return "A";
        } else if (HitFinal() >= 65 && HitFinal() < 80) {
            return "B";
        } else if (HitFinal() >= 55 && HitFinal() < 65) {
            return "C";
        } else if (HitFinal() >= 45 && HitFinal() < 55) {
            return "D";
        } else {
            return "E";
        }
        
    }

}
    

