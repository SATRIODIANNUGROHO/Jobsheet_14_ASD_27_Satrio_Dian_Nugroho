package com.jobsheet14.tugas01;
public class GraphMatriks27 {
    int vertex;
    int[][] matriks;
    public GraphMatriks27(int v) {
        vertex = v;
        matriks = new int[v][v];
    }
    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }
    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }
    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + i) 
                    + " (" + (matriks[i][j]) + " m), ");
                } 
            }
            System.out.println();
        }
    }
    public int outDegree(int vertex) {
        int degree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[vertex][i] != -1) {
                degree++;
            }
        }
        return degree;
    }
    public int inDegree(int vertex) {
        int degree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[i][vertex] != -1) {
                degree++;
            }
        }
        return degree;
    }
    public int degree(int vertex) {
        return outDegree(vertex) + inDegree(vertex);
    }
    public int hitungEdge() {
        int edgeCount = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    edgeCount++;
                }
            }
        }
        return edgeCount;
    }
}