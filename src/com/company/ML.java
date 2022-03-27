package com.company;

public class ML {
    private String Nomor, Nama, Rasyid;
    private String[][] setdata = new String[5][2];

    public ML(String id, String nick) {
        Nomor = id;
        Nama = nick;
        String[][] setdata = {
                {"2112012", "Pekcuy"},
                {"234512", "xiao"},
                {"120123", "Yotsuba"},
                {"3454231", "Akusiapa"},
                {"1233432", "GojoSatoru"}
        };
        this.setdata = setdata;
    }

    private boolean Pesanan() {
        for (int i = 0; i < setdata.length; i++) {
            if (setdata[i][0].equals(Nomor)) {
                if (setdata[i][1].equals(Nama)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void transaksi() {
        Boolean Trans = Pesanan();
        if (Trans == true) {
            System.out.println("Transaksi Berhasil");
            System.out.println("ID : " + Nomor);
            System.out.println("NICK : " + Nama);
        } else {
            System.out.println("Masukan ID dan Nick dengan benar");
        }
    }
}
