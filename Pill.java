/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;

import java.lang.Object;

/**
 *
 * @author Pichau
 */
public class Pill {

    private int maxitens = 100;
    public int itens;
    public Object[] pilha;
    public int topo;

    public Pill() {
        this.itens = maxitens;
        this.topo = this.itens - 1;
        this.pilha = new Object[itens];

    }

    public Pill(int itens) {
        this.itens = itens;
        this.topo = this.itens - 1;
        this.pilha = new Object[this.itens];

    }

    public Object add(Object x) {

        if (!cheia()) {
            try {
                this.pilha[topo] = x;
                topo--;
                return this.pilha;
            } catch (Exception e) {
                System.out.println("Adicione algo valido");
                return this.pilha;
            }
        } else {
            System.out.println("Pilha cheia");
            return this.pilha;
        }
        

    }

    public Object remove() {
        if (vazia()) {
            System.out.println("Pilha vazia");
        } else {
            topo++;
        }
        return (this.pilha);
    }

    private boolean cheia() {
        return (topo < 0);
    }

    private boolean vazia() {
        return (topo == itens - 1);
    }

    public void print() {
        if (!vazia()) {
            for (int i = itens - 1; i != this.topo; i--) {
                System.out.println(this.pilha[i]);
            }
        } else {
            System.out.println("Pilha vazia");
        }
    }
}
