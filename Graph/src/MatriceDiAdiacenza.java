public class MatriceDiAdiacenza {
    private int [][] matrice; //creo la matrice
    private int matriceSize; //grandezza della matrice

    //aggiunge un arco all'interno della matrice di grandezza prestabilita
    public void addArco(int righa, int colonna) {
        matrice[righa][colonna] = 1; //prendo dal parametro la righa e colonna che sono collegate tra di loro (archi collegati tra di loro)
    }

    //getter per la grandezza di matrice
    public int getMatriceSize() {
        return matriceSize;
    }

    //Visualizzatore in output della matrice
    public void printMatrice(){
        for(int i = 0; i < matriceSize; i++){ //primo for per la righa
            for(int j = 0; j < matriceSize; j++){ //secondo for per la colonna
                System.out.print(matrice[i][j]); //print della matrice
            }
            System.out.println(); //andare a capo
        }
    }

    //contructor che inizializza la grandezza della matrice
    public MatriceDiAdiacenza(int matriceSize){
        this.matriceSize = matriceSize; //prende il valore dato nel parametro e lo assegna a matriceSize
        matrice = new int[this.matriceSize][this.matriceSize]; //aggiornamento grandezza della matrice
    }
}
