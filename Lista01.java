/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto01;

import br.edu.fatecfranca.projeto01.exe0.Produto;

/**
 *
 * @author 1090482113003
 */
public class Lista01 {

    public static void main(String[] args) {
       
        // Vamos instaciar a classe Produto
        Produto obj1 = new Produto();
        obj1.nome = "Máscara";
        obj1.qtde = 5;
        obj1.preco = 100;
        obj1.comprar(10);        
        obj1.mostrar();
           
        // Vamos instanciar explorando o método construtor. Método que tem o mesmo nome da classe. Método que inicializa as variáveis da CLASSE
        Produto obj2 = new Produto("Bola de basquete", 13, 19);
        obj2.mostrar();
        
        Produto obj3 = new Produto("Fortnite", 13, 31.90);
        obj3.comprar(10);
        obj3.vender(20);
        obj3.subir(0);
        obj3.abaixar(31.90);
        obj3.mostrar();
        
    }
}
