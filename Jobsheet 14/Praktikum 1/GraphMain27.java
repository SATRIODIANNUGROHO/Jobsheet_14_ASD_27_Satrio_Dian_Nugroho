package com.jobsheet14.praktikum01;
import java.util.Scanner;
public class GraphMain27 {
    public static void main(String[] args) throws Exception {
        Graph27 gedung = new Graph27(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex : ");
        int v = scanner.nextInt();
        Graph27 graph = new Graph27(v);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        System.out.print("Masukkan gedung asal : ");
        int asal = scanner.nextInt();
        System.out.print("Masukkan gedung tujuan : ");
        int tujuan = scanner.nextInt();
        if (graph.isConnected(asal, tujuan)) {
            System.out.println("Gedung " + (char)('A' + asal) + " dan " 
            + (char)('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char)('A' + asal) + " dan " 
            + (char)('A' + tujuan) + " tidak bertetangga");
        }
    }
}