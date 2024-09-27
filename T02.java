// 12S24041- Nikah Suchia
// 12S24011- Pedro Simangunsong

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stok, tahunterbit;
        String judul, penulis, penerbit, formatbukuelektronik, iSBN, kategori;
        double hargapembelian, minimummargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbukuelektronik = input.nextLine();
        hargapembelian = Double.parseDouble(input.nextLine());
        minimummargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            kategori = "best pick";
        } else {
            if (rating > 4.5 && rating < 4.7) {
                kategori = "must read";
            } else {
                if (rating > 4.0 && rating < 4.5) {
                    kategori = "recommended";
                } else {
                    if (rating > 3.0 && rating < 4.0) {
                        kategori = "average";
                    } else {
                        if (kategori < 3.0) {
                            kategori = "low";
                        } else {
                            kategori = "";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "/" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
