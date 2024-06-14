package main.java.list.OperacoesBasicas.desafios;

import java.util.ArrayList;
import java.util.List;

public class ListaCarrinho {

    private List<Item> carrinhoList;
    double valorTotal;

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinhoList = new ArrayList<>();
    }

    public void removerItem(String nome) {
        List<String> listaRemove = new ArrayList<>();
        for (Item c: carrinhoList) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                listaRemove.add(nome);
            }
        }
        carrinhoList.removeAll(listaRemove);
    }

    public double calcularValorTotal() {
        for (Item c: carrinhoList){
           this.valorTotal = c.getPreco() * c.getQuantidade();

        }
        return this.valorTotal;
    }

    public int exibirItens() {
        return carrinhoList.size();
    }


//    public static void main(String[] args) {
//        Item listaItem = new Item();
//
//
//        System.out.println("O numero total de elementos é: " + listaItem.exibirIens());
//    }






}
