/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.util.Arrays;

/**
 *
 * @author 31787622
 */
public class Pilha3 {

    private int tamanhoMaximo = 10;
    private int[] pilhaDeInteiros;
    private int topo = -1;

    public Pilha3() {
        this.pilhaDeInteiros = new int[tamanhoMaximo];
    }

    public void push(int n) {
        topo++;
        pilhaDeInteiros[topo] = n;
    }

    @Override
    public String toString() {
        return Arrays.toString(pilhaDeInteiros);
    }

}
