package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


//        //Mano daugybos lentele
//        for (int i=1; i<10; i++){
//            for (int j=1; j<10; j++){
//                System.out.println(i+" x "+j+" = "+i*j);
//            }
//        }


        //Mano skaiciu vartymas
        for (int i=1; i<=5; i++){
            if (i%2 !=0) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(i*j);
                }
            }
               else {
                for (int j=5; j>=1; j--){
                    System.out.print(j*i);
                }
            }
            System.out.println(" ");
        }

//        int i = 3;
//        System.out.println(i%2);



//        RANDOM
//        int skSuma = 0;
//        int masIlgis = (int)(Math.random()*10)+1;
//        int[] masyvas100sk = new int[masIlgis];
//
//        System.out.println("Masyvo ilgis");

//        int[]a = new int[10];
//        System.out.println("masyvo ilgis "+a.length);
//
//        double r = Math.random()*10;
//        int sas = (int) r +1;
//
//        System.out.println(a[i]);
//        System.out.println(sas);



//        double r = Math.random()*100;
//        int sas = (int) r +1;
//
//        //kopijuoja masyva
//        int[]m={123};
//        int[]tm = new int[m.length+1];
//        for(int i=0; i<m.length; i++){
//            tm[i]=m[i];
//        }

//        int[][]dm=new int[2][3];
//
//        int[] m = new int[3];
//        m[1]=5;
//        System.out.println(m[1]);

//        for (int i=0; i<m.length; i++){
//            System.out.println(m[i]);
//        }


//        //skaiciu vartymas
//        for (int i=1; i<=5; i++){
//           if (i%2 != 0){
//               for (int j = 1; j<=5; j++){
//                   System.out.print(i*j+" ");
//               }
//           }
//           else {
//               for (int j=5; j>=1; j--){
//                   System.out.print(i*j+" ");
//               }
//           }
//            System.out.println();
//            }


//        int i = 1;
//        while (i <= 10){
//            int j = 1;
//            while (j <= 10){
//                System.out.print(i + "x");
//            System.out.print(j + "=");
//            System.out.println(i * j);
//            j++;
//        }
//        i++;
//    }
//        for (int i=1; i<=10; i++){
//            for (int j=1; j<=10; j++){
//                System.out.print(i+"x");
//                System.out.print(j+"=");
//                System.out.println(i*j);
//            }
//        }


//        for (int i=1; i<10; i+=3){
//            System.out.println(il);
//        }

//        int i = 0;
//        int j = 0;
//        while ( i<10 );{
//            i++;
//            do {
//                System.out.println(i);
//            }
//            while (j < 10);{
//                j++;
//                System.out.println(i + "x" + j + "=" + i * j);
//            }
//        }


    }
}
