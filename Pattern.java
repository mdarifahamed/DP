public class Pattern{
    public static void main(String arg[]){
        // outer loop
        for(int i=1; i<=5; i++){
            // inner loop
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}