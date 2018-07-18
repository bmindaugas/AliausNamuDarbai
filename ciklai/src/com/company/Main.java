package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randoMasIlgis1 = (int) (Math.random() * 8) + 3;
        int randoMasIlgis2 = (int) (Math.random() * 8) + 3;

        System.out.println();
        System.out.println("stulpelyje yra -> " + randoMasIlgis1 + " is 20 galimu");
        System.out.println("eiluteje yra -> " + randoMasIlgis2 + " is 20 galimu");


        //Priskiriu random reiksmes masyvui.
        int[][] masyvas20sk = new int[randoMasIlgis1][randoMasIlgis2];
        System.out.println("masyvas20sk ilgis yra -> " + masyvas20sk.length + " is 20 galimu");
        System.out.println();
        int [] sumos = new int[masyvas20sk.length];
//    System.out.println("+++"+masyvas20sk.length+"+++");

//    System.out.print("+++"+sumos+"+++");

        //Kuriu atsitiktines skaiciu reiksmes i masyva.
        for (int i = 0; i < masyvas20sk.length; i++) {
            int sumo = 0;
            for (int j = 0; j < masyvas20sk[i].length; j++) {
                masyvas20sk[i][j] = (int) (Math.random() * 100) - 50;
                sumo += masyvas20sk[i][j];

                //Aido bajeriai %4d.
                System.out.printf("%4d ", masyvas20sk[i][j]);
                //Mano varijantas.
//      System.out.print(masyvas20sk[i][j]+" ");

            }
//      int visasuma = sumo * i;
//      System.out.println("       +"+sumo*i+"+       ");
            sumos[i] += sumo;
            System.out.print("+++-"+sumos[i]+"-+++");
            System.out.println(Arrays.toString(sumos));

            //Apverciu minusinius masyvus.
            if (sumo > 0) {
                System.out.print("suma su pliusu " + sumo);
                System.out.println();
            } else {
                for (int k = randoMasIlgis2 - 1; k > -1; k--) {
                    System.out.printf("%4d ", masyvas20sk[i][k]);
                }
                System.out.print("suma su minusu " + sumo);
                System.out.println();
            }
        }
//Skaiciuoju sumu suma.
        int viso = 0;
        for (int g = 0; g<sumos.length; g++){
            viso += sumos[g];
        }
        System.out.println("ggg"+viso+"ggg");

//        //Nuo cia nereikia.
////////////////////////////////////////////////////////////
//        System.out.println("spauzdinu nuskaityta masyva");
//            for (int e=0; e<masyvas20sk.length; e++){
//                System.out.println(" ");
//                for (int f=0; f<masyvas20sk.length; f++){
//
//                    System.out.print(e+masyvas20sk[e][f]+" ");
//
//                }
//            }
///////////////////////////////////////////////////////////
//              //Bandau su vienu masyvu.
//    int randoMasIlgis = (int) (Math.random() * 20) + 1;
//    System.out.println();
//    System.out.println("stulpelyje yra -> " + randoMasIlgis + " is 20 galimu");
//    int[] masyvas20sk = new int[randoMasIlgis];
//    System.out.println("masyvas20sk ilgis yra -> " + masyvas20sk.length + " is 20 galimu");
//    System.out.println();

    }
}
