package com.jobsheet14.tugas01;
import java.util.Scanner;
public class GraphMain27 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex: ");
        int jumlahVertex = scanner.nextInt();
        GraphMatriks27 gdg = new GraphMatriks27(jumlahVertex);
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nMenu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan vertex asal: ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan vertex tujuan: ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gdg.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan vertex asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan vertex tujuan: ");
                    tujuan = scanner.nextInt();
                    gdg.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan vertex yang ingin dicek degree-nya: ");
                    int vertex = scanner.nextInt();
                    System.out.println("Degree dari vertex tersebut: " 
                    + gdg.degree(vertex));
                    break;
                case 4:
                    gdg.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan vertex asal: ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan vertex tujuan: ");
                    tujuan = scanner.nextInt();
                    if (gdg.matriks[asal][tujuan] != -1) {
                        System.out.println("Edge dari vertex " 
                        + asal + " ke vertex " + tujuan + " ada.");
                    } else {
                        System.out.println("Edge dari vertex " 
                        + asal + " ke vertex " + tujuan + " tidak ada.");
                    }
                    break;
                case 6:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}