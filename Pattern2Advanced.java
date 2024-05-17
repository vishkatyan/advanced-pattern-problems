public class Pattern2Advanced {
    /*
    Non-standard Pattern Problems (Half-cut hollow diamond)
    *        *
    **      **
    ***    ***
    ****  ****
    **********
     */
    public static void Pattern2(int n){
        for(int i=0;i<n;i++){
            // stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        Pattern2(5);
    }
}
