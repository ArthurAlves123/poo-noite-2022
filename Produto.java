/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto01;

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
    
    public void vender(int x){
        if(this.qtde >= x){
            this.qtde = this.qtde - x;
        }
        else System.out.println("Sem estoque");
    }
}
