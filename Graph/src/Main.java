import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creazione di un'oggetto scanner che prende in input i dati dallo User
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci la grandezza della matrice (input x input) : ");

        //ricezione della grandezza della matrice dall'utente
        int matriceSize = input.nextInt();
        System.out.println();

        //Creazione di un'oggetto di classe MatriceDiAdiacenza che crea una matrice di grandezza stabilita da matriceSize
        MatriceDiAdiacenza matrice = new MatriceDiAdiacenza(matriceSize);

        //Creazione di un'oggetto di classe ListaDiAdiacenza che crea una Hashmap che prende i dati della matrice
        ListaDiAdiacenza lista = new ListaDiAdiacenza();

        int x, y;

        for(int i = 0; i < matrice.getMatriceSize()*matrice.getMatriceSize(); i++){ //ciclo for per eseguire gli input dei archi grandezza x grandezza per ottenere area della matrice
            System.out.print("Inserire il numero della righa(INSERIRE -10 PER TERMINARE): ");
            x = input.nextInt(); //input di x(riga)
            System.out.print("Inserire il numero della colonna(INSERIRE -10 PER TERMINARE): ");
            y = input.nextInt(); //input di y(colonna)

            if ((x == -10 || y == -10)){ //if per uscire dal ciclo se verifica l'input di un numero negativo
                break;

            } else if (x >= 0 && y >= 0) { //else-if per convalidare se il numero inserito sia valido per la grandezza stabilita
                if (x >= matriceSize || y >= matriceSize){
                    System.out.println("numeri inseriti invalidi");
                } else {
                    matrice.addArco(x, y);
                    lista.addArco(x, y);
                    lista.addVertice(x);
                }
            }
        }

        /* for (int i = 0; i < matriceSize; i++){ crea tutti i vertici in base alla grandezza della matrice
            lista.addVertice(x);
        } */
        
        matrice.printMatrice();
        lista.printList();
    }
}
