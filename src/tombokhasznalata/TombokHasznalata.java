
package tombokhasznalata;


public class TombokHasznalata {

    
    public static void main(String[] args) {
        //indexek:
        String[] tomb = {"egy", "kettő", "három"};
        
        /*memória címet írja ki, nem a tartalmat:*/
        //System.out.println("tömb: " + tomb);
        
        /*tömb mérete nem változtatható*/
        
        System.out.println("A tömb elemei: ");
        for(int i=0; i < tomb.length; i++);
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
            
        tomb = new String [4];
        System.out.println("Az öres tömb: ");
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        tomb[2] = "zwei";
        System.out.println("részben - németül - feltöltött tömb: ");
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        System.out.println("Vegyesen feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "null";
        tomb[3] = "null";
        
        
        
        
    }
    
}
