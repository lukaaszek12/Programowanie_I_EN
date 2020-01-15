import javax.management.InstanceNotFoundException;

public class LinearSearch {
    public static void main(String[] args){

        int[] tab=new int[]{2,4,1,6,7,23,72,34};

        try{ //blok try-catch wykorzystany do obslugi wystapienia wyjatku
            System.out.println(linearSearch(tab, 3));
        }
        catch (Exception e){
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int[] tab, int x) throws InstanceNotFoundException {
        for(int i=0; i<tab.length; i++){ //iterowanie po dlugosci tablicy
            if(tab[i]==x){ //sprawdzanie czy element zostal znaleziony
                return i; //zwracamy indeks pierwszego znalezionego elementu
            }
        }

        throw new InstanceNotFoundException(); //jezeli nic nie zostalo znalezione rzucamy wyjatkiem
    }
}
