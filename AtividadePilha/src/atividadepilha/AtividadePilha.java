/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepilha;
import atividadepilha.Livros;
import java.util.Scanner;
import java.util.Stack;
public class AtividadePilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int value = 0;
            System.out.println("Escolha o exercicio");
            int esc = sc.nextInt();
        switch(esc){
            case 1:
                Stack<Integer> Pilha_par = new Stack<>();
                Stack<Integer> Pilha_impar = new Stack<>();
                for (int i = 0; i < 10; i++){
                    System.out.println("Digite um valor entre 1 e 100");
                    value = sc.nextInt();
                    if (value < 1 || value > 100){
                        while (value < 1 || value > 100){
                        System.out.println("Valor invalido, tente novamente ");
                        value = sc.nextInt();
                        }
                    }
                    if (value % 2 == 0){
                        Pilha_par.push(value);
                    } else{
                        Pilha_impar.push(value);
                    }
                }
                System.out.println("Pilha par:");
                for (int i = 0; i < Pilha_par.size(); i++){
                    System.out.println(Pilha_par.get(i));
                }
                System.out.println("Pilha impar:");
                for (int i = 0; i < Pilha_impar.size(); i++){
                    System.out.println(Pilha_impar.get(i));
                }
            break;
            case 2:
                Stack<Integer> temp = new Stack<>();
                Stack<Integer> numeros = new Stack<>();
                for (int i = 0; i < 10; i++){
                    System.out.println("Digite um valor entre 1 e 100");
                    value = sc.nextInt();
                    if (value < 1 || value > 100){
                        while (value < 1 || value > 100){
                        System.out.println("Valor invalido, tente novamente ");
                        value = sc.nextInt();
                        }
                    }
                    temp.push(value);
                }
                System.out.println("Pilha par:");
                for (int i = 0; i < temp.size(); i++){
                    if (temp.get(i) % 2 == 0){
                        numeros.push(temp.get(i));
                    } else{
                        temp.pop();
                    }
                }
                for (int i = 0; i < numeros.size(); i++){
                    System.out.println(numeros.peek());
                    numeros.pop();
                }
            break;
            case 3:
                String autor;
                String nome;
                int ano;
                int inbs;
                System.out.println("Escolha quantos livros você deseja adicionar");
                int num = sc.nextInt();
                for (int i = 0; i < num; i++){
                    autor = sc.toString();
                    nome = sc.toString();
                    ano = sc.nextInt();
                    inbs = sc.nextInt();
                    adicionar(nome, autor, ano, inbs);
                }
            break;
        }
    }
}