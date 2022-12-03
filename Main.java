package main;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner  i= new Scanner(System.in);
        int mat,fizik,kimya,cog,muzik,turkce;
        
        // veri alma bölümü


        System.out.println("Matematik notunu gir:");
         
        mat = i.nextInt();

        System.out.println("Fizik notunu gir:");
         
        fizik = i.nextInt();

        System.out.println(">Kimya notunu gir:");
         
        kimya = i.nextInt();

        System.out.println("Cografya notunu gir:");
         
         cog = i.nextInt();
       
         System.out.println("Muzik notunu gir:");
         
         muzik = i.nextInt();

        System.out.println("Turkce notunu gir:");
         
         turkce = i.nextInt();
            
         // alınan verilerin işlenmesi ve otalamayı bulma

        int  toplam = ( mat + fizik + kimya + cog + muzik + turkce );

        double ortalama = toplam  / 6; 
        
        boolean gecti = ortalama > 60;
        
        String gect = gecti ? "Gecti" : "Gecmez" ;
        System.out.print("Ortalamaniz:"+ ortalama + gect);
        
         // @author Hakan Çoban
         // https://app.patika.dev/hknxx
        
}
}