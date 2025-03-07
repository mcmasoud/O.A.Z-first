public class class1 {
        public static void main(String [] args){
            for(int i=2;i<=100;i++){
                int division=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                       division++;}
                    }
                if(division==2){
                    System.out.println(i);}}}}