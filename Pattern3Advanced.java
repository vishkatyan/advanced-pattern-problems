public class Pattern3Advanced {
    /*
    Inverse of Pattern 2 Advanced
    **********
    ****  ****
    ***    ***
    **      **
    *        *
     */
    public static void Pattern3(int n){
        for(int i=0;i<n;i++){
            //stars --> (n-i)
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //spaces --> (2*i)
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            //stars --> (n-i)
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern3(5);
    }
}
