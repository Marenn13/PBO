

package pbo6;


public class Fraction {
private int numerator;
private int denominator;

public Fraction (){
    this (0,1);
}
public Fraction (int number){
    this (number,1);
}
public Fraction ( Fraction frac){
    this (frac.getNumerator(), frac.getDenominator());
}
public Fraction (int num, int denom) {
     setNumerator (num);
     setDenominator (denom);
    
}
public Fraction add (Fraction frac) {
    int a, b, c, d;
    Fraction sum;
    a = this.getNumerator ();
    b = this.getDenominator ();
  
    c = this.getNumerator ();
    d = this.getDenominator ();
    sum = new Fraction (a*d + b*c, b*d);
    return sum;
}

public boolean equals (Fraction number ){
    return  numerator == number.getNumerator() && denominator == number.getDenominator();
}
public int getDenominator(){
    return denominator;
}
public int getNumerator (){
    return numerator;
}
public void setDenominator (int denom){
    denominator = denom;
}
public void setNumerator (int num){
    numerator=num;
}
public String toString (){
    return getNumerator ( ) + " / " +getDenominator ();
}
    }

 

class  Fraction_Test1 {
    public static void main(String[] args) {
        Fraction f1;
        Fraction f2;
        Fraction f3;
 
    f1= new Fraction (1, 2);
    f2= new Fraction (3, 4);

    f3 = f1.add (f2);
    
        System.out.println("Sum of " + f1.toString() + " and " + f2.toString() + " is "+ f3.toString());
}
}   
      

    


    
    
    

