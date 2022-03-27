package com.company;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Main {
    static void harga(int data) {
        if (data == 1) {
            System.out.println("\n133\uD83D\uDC8E - 31K");
        } else if (data == 2) {
            System.out.println("\n266\uD83D\uDC8E - 63K");
        } else if (data == 3) {
            System.out.println("\n400\uD83D\uDC8E - 94K");
        } else if (data == 4) {
            System.out.println("\n532\uD83D\uDC8E - 125K");
        } else if (data == 5) {
            System.out.println("\n670\uD83D\uDC8E - 156K");
        } else if (data == 6) {
            System.out.println("\n1342\uD83D\uDC8E - 311K");
        } else if (data == 7) {
            System.out.println("\n2700\uD83D\uDC8E - 622K");
        } else {
            System.out.println("nominal salah");
        }
    }

    static void list() {
        System.out.println("list Diamond Mobile Legends");
        System.out.println("1. 133\uD83D\uDC8E - 31K\n" +
                "2. 266\uD83D\uDC8E - 63K\n" +
                "3. 400\uD83D\uDC8E - 94K\n" +
                "4. 534\uD83D\uDC8E - 125K\n" +
                "5. 670\uD83D\uDC8E - 156K\n" +
                "6. 1342\uD83D\uDC8E - 311K\n" +
                "7. 2700\uD83D\uDC8E - 622K");
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        .list();
        Thread.sleep(5000);
        System.out.println("\nSelamat Datang di Tokoped Shop");
        System.out.println("Top up Games Mobile Legends");
        System.out.print("Masukan ID : ");
        String ID = sc.next();
        System.out.print("Masukan NICK : ");
        String NICK = sc.next();
        System.out.print("Masukan Nominal : ");
        int NOM = sc.nextInt();

        ML Trans = new ML(ID, NICK);

        harga(NOM);
        Trans.transaksi();
        LocalDateTime waktu = LocalDateTime.now();
        System.out.println(waktu.format(DateTimeFormatter.ofPattern("dd-MM-yyyy \nHH:mm:ss")));
        Thread.sleep(1000);
        System.out.println("\nDatang lagi yah mazzeh :)");
    }
}
