package com.company;
//import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here


//        //Mano daugybos lentele
//        for (int i=1; i<10; i++){
//            for (int j=1; j<10; j++){
//                System.out.println(i+" x "+j+" = "+i*j);
//            }
//        }
////////////////////////////////////////////////////
//        //Mano skaiciu vartymas
//        for (int i=1; i<=5; i++){
//            if (i%2 !=0) {
//                for (int j = 1; j <= 5; j++) {
//                    System.out.print(i*j);
//                }
//            }
//               else {
//                for (int j=5; j>=1; j--){
//                    System.out.print(j*i);
//                }
//            }
//            System.out.println(" ");
//        }
//////////////////////////////////////////
//        //Bandau liekana.
//        int i = 3;
//        System.out.println(i%2);
//////////////////////////////////////////
//          //Masyvai
//          int mas[] = new int [5];
//            mas[3] = 254;
//            System.out.println(mas[3]);
//////////////////////////////////////////
//          int mas[] = {2,5,415,68,2};
//            System.out.println(mas[2]);
//////////////////////////////////////////
//            int mas[] = new int[5];
//            for (int index = 0; index<mas.length; index++){
//                System.out.println(index+" - - "+mas[index]);
//            }
//////////////////////////////////////////
//            //Random
//            double r = Math.random()*10;
//            System.out.println(r);
//////////////////////////////////////////
//            //Su import random
//            Random kauliukas = new Random();
//            int skaicius;
//            for (int i=0; i<5; i++) {
//                skaicius = 1 + kauliukas.nextInt(6);
//                System.out.println(skaicius);
//            }
///////////////////////////////////////////////////////////

            //Namu darbas susikuriu dvimati masyva.

        int randoMasIlgis1 = (int)(Math.random()*20)+1;
//        int randoMasIlgis2 = (int)(Math.random()*20)+1;

            System.out.println();
            System.out.println("stulpelyje yra -> "+randoMasIlgis1+" is 20 galimu");
            System.out.println("eiluteje yra -> "+randoMasIlgis1+" is 20 galimu");

        int[][] masyvas20sk = new int[randoMasIlgis1][randoMasIlgis1];
            System.out.println("masyvas20sk ilgis yra -> "+masyvas20sk.length+" is 20 galimu");
            System.out.println();

        for (int i=0; i<masyvas20sk.length; i++){
            int sumo = 0;
                for (int j=0; j<masyvas20sk[i].length; j++) {
                    masyvas20sk[i][j] = (int)(Math.random()*100)-50;

                    sumo += masyvas20sk[i][j];
                    //Aido bajeriai.
            System.out.printf("%4d ",masyvas20sk[i][j]);
                }
            System.out.print("suma "+sumo);
                System.out.println();
            }

        System.out.println("spauzdinu nuskaityta masyva");
            for (int e=0; e<masyvas20sk.length; e++){
                System.out.println(" ");
                for (int f=0; f<masyvas20sk.length; f++){

                    System.out.print(e+masyvas20sk[e][f]+" ");

                }
            }

//
///////////////////////////////////////////////////////////
//        //RANDOM
//        int skSuma = 0;
//        int randoMasIlgis = (int)(Math.random()*100)+1;
//        int[] masyvas100sk = new int[randoMasIlgis];
//
//        System.out.println(masyvas100sk.length);
//
//        int[]a = new int[10];
//        System.out.println("masyvo ilgis "+a.length);
//
//        double r = Math.random()*10;
//        int sas = (int) r +1;
//
////        System.out.println(a[i]);
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
