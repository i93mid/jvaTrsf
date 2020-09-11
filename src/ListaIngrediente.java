package transformers.java;

import java.util.ArrayList;

public class ListaIngrediente {

    private ArrayList<String> listaIngrediente= new ArrayList<String>();

    public ListaIngrediente(ArrayList<String> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }

    public ArrayList<String> getListaIngrediente() {
        return this.listaIngrediente;
    }

    public void setListaIngrediente(ArrayList<String> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }
    public void printListaIngrediente(){
        System.out.println("sunt "+listaIngrediente.size()+"in lista");
        for(int i=0;i<listaIngrediente.size();i++){
            System.out.println((i+1)+"."+listaIngrediente.get(i));
        }
    }
}
