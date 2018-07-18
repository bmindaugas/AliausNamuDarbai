package com.company;

//import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {
        vidinis();
    }

    public static void vidinis() {
        System.out.println("atejom i vidini");
            try {
        gilesnis();
    } catch (Exception ex){
                System.out.println("pagavau klaida");
                ex.printStackTrace();
            }
            System.out.println("pabaigiam vidini");
        }

        public static void gilesnis()throws Exception{
            System.out.println("atejom o gilesni");
            throw new Exception("gili klaida");
        }
//            throws Exception {
//        throw new Exception("klaida");


//        int i=10;
//        try {
//            System.out.println("pradedam");
//            int[] m = new int[3];
//            m[i]=10;
//            System.out.println("nematom");
//        }catch (Exception ex){
//            System.out.println("klaida"+ex);
//        }finally {
//            System.out.println("finaly");
//        }

    }
//        Skaiciavimai obj = new Skaiciavimai();
//        obj.skaiciavimai();
//        obj.parametrai();




