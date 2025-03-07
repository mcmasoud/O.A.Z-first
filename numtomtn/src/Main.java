import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sadgan, dahgan, yekan;
        String res = "";
        System.out.println("enter a number between 1 to 1000 :");
        int n = sc.nextInt();
        if (n > 1000 && n < 1) {
            System.out.println("Invalid number");
        } else {
            if (n == 1000) {
                System.out.println("hezar");
            } else if (n >= 10 && n <= 19) {
                if (n == 10) System.out.println("dah");
                if (n == 11) System.out.println("yazdah");
                if (n == 12) System.out.println("davazdah");
                if (n == 13) System.out.println("sizdah");
                if (n == 14) System.out.println("chahardah");
                if (n == 15) System.out.println("ponzdah");
                if (n == 16) System.out.println("shonzdah");
                if (n == 17) System.out.println("hefdah");
                if (n == 18) System.out.println("hejdah");
                if (n == 19) System.out.println("nozdah");
            } else {
                sadgan = n / 100;
                n -= sadgan * 100;
                switch (sadgan) {
                    case 1:
                        res += "sad ";
                        break;
                    case 2:
                        res += "divist ";
                        break;
                    case 3:
                        res += "sisad ";
                        break;
                    case 4:
                        res += "chaharsad ";
                        break;
                    case 5:
                        res += "ponsad ";
                        break;
                    case 6:
                        res += "shishsad ";
                        break;
                    case 7:
                        res += "haftsad ";
                        break;
                    case 8:
                        res += "hashtsad ";
                        break;
                    case 9:
                        res += "nohsad ";
                }if(sadgan!=0 && n%100!=0){res+="o ";}
            }
        }
        dahgan = n / 10;
        switch (dahgan) {
            case 2:
                res += "bist ";
                break;
            case 3:
                res += "si ";
                break;
            case 4:
                res += "chehel ";
                break;
            case 5:
                res += "panjah ";
                break;
            case 6:
                res += "shast ";
                break;
            case 7:
                res += "haftad ";
                break;
            case 8:
                res += "hashtad ";
                break;
            case 9:
                res += "navad ";


        }if(dahgan!=0){res+="o ";}
        yekan = n % 10;
        switch (yekan) {
            case 1:
                res += "yek";
                break;
            case 2:
                res += "do";
                break;
            case 3:
                res += "se";
                break;
            case 4:
                res += "chahar";
                break;
            case 5:
                res += "panj";
                break;
            case 6:
                res += "shish";
                break;
            case 7:
                res += "haft";
                break;
            case 8:
                res += "hasht";
                break;
            case 9:
                res += "noh";
        }
        System.out.println(res);
    }}


