package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

TelefonuNumeriai aidas = new TelefonuNumeriai("namu","5656565");

TelefonuNumeriai[] aidoNumeriai = new TelefonuNumeriai[3];
aidoNumeriai[0] = new TelefonuNumeriai("darbo","9898988");
aidoNumeriai[1] = new TelefonuNumeriai("sutenerio", "2323232");

aidoNumeriai[2] = aidas;

}

    }

