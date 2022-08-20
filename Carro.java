/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto01.exe0;

/**
 *
 * @author 1090482113003
 */
public class Carro {
    public String marca, modelo;
    public double velAtual;
    public boolean statusMotor; // true or false
    
    // crie os dois construtores da classe carro
    
    public Carro(){
        
    }
    public Carro(String marca, String modelo, double velAtual, boolean statusMotor){
        this.marca = marca;
        this.modelo = modelo;
        this.velAtual = velAtual;
        this.statusMotor = statusMotor;
    }
    
    // faça um método para ligar o motor do carro
    public void ligar(){
        if(!statusMotor){
            this.statusMotor = true;
        }
        this.statusMotor = true;
    }
    
    // faça um método para desligar o motor do carro
    public void desligar(){
        if (this.velAtual > 0){
            this.velAtual = 0;
        }
        if(this.statusMotor){
            this.statusMotor = false;
        }
    }
    
    // faça um método para acelerar o carro x de unidades
    public void acelerar(double x){
        this.velAtual += x;
    }
    
    // faça um método para frear o carro x de unidades
    public void frear(double x){
        if(this.velAtual < x){
            System.out.println("O carro não consegue frear mais.");
        }
        else this.velAtual -= x;
    }
    
}
