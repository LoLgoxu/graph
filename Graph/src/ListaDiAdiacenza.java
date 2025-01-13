import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListaDiAdiacenza {
    // creazione di una Hashmap che ha come chiave interi e valori stabiliti poi dagli indici delle righe nella matrice
    private HashMap<Integer, List<Integer>> adjList;

    // Initializza la Hashmap
    public ListaDiAdiacenza() {
        adjList = new HashMap<>();
    }

    // Aggiunge un Vertice
    public void addVertice(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>()); // mette nel vertice tutti gli indici delle celle utilizzate
    }

    // Aggiunge un Arco
    public void addArco(int source, int destination) {
        adjList.putIfAbsent(source, new ArrayList<>()); // se assente mettere nella hash map nella x la chiave e nella lista i valori
        adjList.putIfAbsent(destination, new ArrayList<>()); // stessa cosa ma nella y
        adjList.get(source).add(destination); // aggiunge il valore di source alla destinazione
        // adjList.get(destination).add(source); // For undirected graph
    }

    // Print della lista adiacente
    public void printList() {
        for (Integer vertex : adjList.keySet()) { // il vertice Integer loop each time la grandezza del keyset da 0 alla grandezza della lista
            System.out.print(vertex + "-> "); // output = 0 : listEdges
            for (Integer edge : adjList.get(vertex)) { // l'arco Integer loop each time la lunghezza del vertice
                System.out.print(edge + " "); // output = vertice : 1 2 0 ---
            }
            System.out.println();
        }
    }
}
