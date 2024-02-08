
package tombokhasznalata;


public class TombosFeladat {
    
    public static void main(String[] args) {
        
        String[] nevek = {"Fanni", "Csenge", "Zsófi"};
        int[] korok = {22, 23, 25};
        int TOMB_MERET = 3;
        
        nevek = new String[TOMB_MERET];
        nevek [0] = "Fanni";
        nevek [1] = "Csenge";
        nevek [2] = "Zsófi";
        
        korok = new int[TOMB_MERET];
        korok [0] = 22;
        korok [1] = 23;
        korok [2] = 25;
        
        System.out.println("Versenyzők kora: ");
        int osszKor = 0;
        for (int i = 0; i< TOMB_MERET; i++){
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%5s kora: %3d év\n", nev, kor);
            osszKor += kor;
            
        }
        double atlag = (double)osszKor / korok.length;
        System.out.printf("A versenyzők átlag kora: %.2f év\n", atlag);
        
        
    }
    
}
