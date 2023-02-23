package metodusok;

public class Metodusok {

    public static void main(String[] args) {
        int szamn=elso10szamosszege();
        String szam = (szamn)
        kiir(szam)
        szamn=osszead(1,1);
        kiir(szamn)
        kiir(osszead(1,2),osszead(3,4);
        szamn=osszead(1,osszead(1, osszead(4, 4)));
        kiir(szamn);  
        kiir(Math.sqrt(osszead(1, osszead(3, 2)))));   
        
    }
    
    private static int elso10szamosszege(){
     int osszeg=0;
        for (int i = 0; i < 10; i++) {
            osszeg+=1;
        }
        return osszeg;
    }
    
    private static int osszead(int a , int b){
        return a+b;
    }
    
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    } 
}
