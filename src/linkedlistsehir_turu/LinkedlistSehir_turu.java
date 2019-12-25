
package linkedlistsehir_turu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedlistSehir_turu {
    
     private static void islemleri_bastır() {
        
         System.out.println("0- işlemleri görüntüle");
         System.out.println("1- Bir sonraki şehre git...");
         System.out.println("2-Bir önceki şehre git... ");
         System.out.println("3- uygulamadan çık");
         
    }

    public static void  Sehirleri_turla(LinkedList<String> Sehir_turu){
        
        ListIterator<String> ıIterator = Sehir_turu.listIterator();
        
        int islem;
        
        islemleri_bastır();
        
        Scanner scanner= new Scanner(System.in);
        
        if (!ıIterator.hasNext()) {
            
            System.out.println("Herhangi bir şehir yok");
            
        }
        boolean cikis=false;
        while (!cikis) {            
            System.out.println("bir işlem seçiniz:");
            
            islem=scanner.nextInt();
            
            switch(islem){
                
                case 0 :
                    islemleri_bastır();
                    break;
                case  1:
                      if (ıIterator.hasNext()) {
                        
                          System.out.println("sonraki şehre gidiliyor:"+ıIterator.next());
                    }else{
                          
                          System.out.println("sonrasında gidilecek şehir kalmadı...");
                          
                      }
                      break;
                    
                case 2:
                    
                    if (ıIterator.hasPrevious()) {
                        System.out.println("önceki şehre gidiliyor"+ıIterator.hasPrevious());
                    }else{
                        
                        System.out.println("gidilecek şehir kalmadı..");
                    }
                    break;
                    
                case 3:
                    cikis=true;
                    System.out.println("öncesinde sistemden çıkılıyor");
                    break;
                    
                    
                    
                
            }
            
            
        }
        
    }
    
    
    public static void main(String[] args) {
       
        LinkedList<String> Sehirler= new LinkedList<String>();
        
        Sehirler.add("Ankara");
        Sehirler.add("BUrsa");
        Sehirler.add("Trabzon");
        Sehirler.add("Kayseri");
        
        
        Sehirleri_turla(Sehirler);
    }

   
    
}
