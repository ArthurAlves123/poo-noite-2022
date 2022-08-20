/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto01.exe0;

/**
 *
 * @author 1090482113003
 */
public class Produto {
    
    // Vamos criar os atributos da classe 
    // Atributos são chamados de variáveis
    public int qtde; // tipo de dado é int (tipo primitivo)
    public double preco; // tipo de dado é double (tipo primitivo)
    public String nome; // tipo de dado é String (uma classe)
    // cria um método construtor
    public Produto(){
        
    }
    //cria um método construtor
    public Produto(String nome, int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    // método que compra um produto, aumentando sua qtde. Método não retorna nada
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    // Método vender, subtrai do estoque(qtde)
    public void vender(int x){
        if(this.qtde >= x){
            this.qtde = this.qtde - x;
        }
        else System.out.println("Sem estoque");
    }
    
    // Método mostrar, mostra a caixa de mensagem abaixo
    public void mostrar(){
        System.out.println("Nome: " + this.nome + "\nQtde: " + this.qtde + "\nPreço: " + this.preco + "\n");
    }
    
    // Método subir, aumenta o preco do produto
    public void subir(double x){
        this.preco += x;
    }
    
    // Método abaixar, abaixa o preco do produto
    public void abaixar(double x){
        if(x <= this.preco){
            this.preco -= x;
        }
        else System.out.println("O preço do produto não pode ser negativo.");
    }
}
