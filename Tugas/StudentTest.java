

package Tugas;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        
        Student[] roster = new Student[40];
        System.out.print("Berapa banyak Under ? ");
        int ju=sc.nextInt();
        System.out.print("Berapa banyak Grad? ");
        int jg=sc.nextInt();
         
        System.out.println("Masukkan data Under");
        for (int i=0;i<ju;i++)
        {
            System.out.print("Masukkan nama Under ke-"+(i+1)+" ");
            roster[i] = new UndergraduateStudent();
            roster[i].setName(sc.next());
            System.out.print("\nMasukkan skor test ke 1 data under-"+(i+1)+" ");
            roster[i].setTestScore(1, sc.nextInt());
            System.out.print("\nMasukkan skor test ke 2 data under-"+(i+1)+" ");
            roster[i].setTestScore(2, sc.nextInt());
            System.out.print("\nMasukkan skor test ke 3 data under-"+(i+1)+" ");
            roster[i].setTestScore(3, sc.nextInt());
        }
       
       System.out.println("\nMasukkan data Grad");
        for (int i=ju;i<ju+jg;i++)
        {
            System.out.println("Masukkan nama Grad ke-"+(i+1) +" ");
            roster[i] = new GraduateStudent();
            roster[i].setName(sc.next());
            System.out.print("\nMasukkan skor test ke 1 data grad-"+(i+1)+" ");
            roster[i].setTestScore(1, sc.nextInt());
            System.out.print("\nMasukkan skor test ke 2 data grad-"+(i+1)+" ");
            roster[i].setTestScore(2, sc.nextInt());
            System.out.print("\nMasukkan skor test ke 3 data grad-"+(i+1)+" ");
            roster[i].setTestScore(3, sc.nextInt());
        }
        
        int undergradCount = 0;
        
        for (int i = 0; i < (ju+jg); i++)
	 {
            System.out.println(roster[i].getName());
            System.out.println(roster[i].getCourseGrade());
            if (roster[i] instanceof GraduateStudent)
             System.out.println(((GraduateStudent)roster[i]).getJumlah());
        }
    }

    }
    

