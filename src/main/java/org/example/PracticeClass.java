package org.example;

public class PracticeClass {
    static class Output {
        void go(){
            int value = 7;
            for(int i=1; i<8; i++){
                value++;
                if(i > 4){
                    System.out.print(++value + " ");
                }
                if (value > 14){
                    System.out.println(" i = " + i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Output o = new Output();
        o.go();


//        double x = 2.22;
//        int y = (byte) x;
//
//        System.out.println(x);
//        System.out.println("Casting result: " + y);
    }
}
