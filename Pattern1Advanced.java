public class Pattern1Advanced {
    /*
    Print Crown pattern
    *        *        *
    **      ***      **
    ***    *****    ***
    ****  *******  ****
    *******************

     */
    public static void Pattern1(int n){
        // stars
        for(int i=0;i<n;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<1+(2*i);j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern1(5);
    }
}
