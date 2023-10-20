

package SegitigaPrisma;


public class SegitigaPrisma {
    
    
    public double hitungKelilng (){
       double sisi=2;
       return sisi + sisi+ sisi;
    }
    public double hitLuasSelimut (){
        double tinggi= 5.0;
        return hitungKelilng ()* tinggi;
    }
    public double hitLuasAlas (){
        double alas =3.0;
        double tinggi = 7.0;
        return 0.5 *alas*tinggi;
       }
    public double HitLuasPrisma (){
        return 2* (hitLuasAlas () + hitLuasSelimut());
        
    }
    }
    
    

        
    
    

