public class classy {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(" ");}
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }}
