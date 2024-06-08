package com.jobsheet14.praktikum01;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Graph27 {
    int vertex;
    DoubleLinkedList27 list[];
    public Graph27(int v) {
        vertex = v;
        list = new DoubleLinkedList27[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList27();
        }
    }
    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak); <-- tambahkan jika graph yang dibuat adalah undirected graph
    }
    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) 
        ('A' + (asal)) + ": " + (totalIn));
        System.out.println("OutDegree dari Gedung " + (char) 
        ('A' + (asal)) + ": " + (totalOut));
        System.out.println("Degree dari Gedung " + (char) 
        ('A' + (asal)) + ": " + (totalIn + totalOut));
        System.out.println("Degree dari Gedung " + (char)
        ('A' + asal) + ": " + (list[asal].size()));
    }
    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " 
                + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) 
                    + " (" + (list[i].getJarak(j)) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
    public boolean isConnected(int asal, int tujuan) throws Exception {
        boolean[] visited = new boolean[vertex];
        Queue<Integer> queue = new LinkedList<>();
        visited[asal] = true;
        queue.add(asal);
        while (!queue.isEmpty()) {
            int current = queue.poll();  
            DoubleLinkedList27 currentList = list[current];
            for (int i = 0; i < currentList.size(); i++) {
                int neighbor = currentList.get(i);
                if (neighbor == tujuan) {
                    return true;
                }
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }
}