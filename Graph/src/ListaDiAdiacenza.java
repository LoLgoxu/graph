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
        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(destination, new ArrayList<>());
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // For undirected graph
    }

    // Print della lista adiacente
    public void printList() {
        for (Integer vertex : adjList.keySet()) {
            System.out.print(vertex + ": ");
            for (Integer edge : adjList.get(vertex)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}
