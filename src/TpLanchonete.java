
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author pedro
 */
public class TpLanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario(" teste", "213232", "123");
        System.out.println(" digite o cargo ");
        String cargo = sc.next();
        System.out.println(" salario: ");
        String salario = sc.next();
        System.out.println(" id: ");
        String id = sc.next();
        Funcionario f2 = new Funcionario(cargo,salario,id);
        
        
        Sistema s = new Sistema();
        s.addFuncionario(f);
        s.addFuncionario(f2);
        System.out.println(s.exibirFuncionarios());   
       
        s.removerFuncionario("123");
        System.out.println(s.exibirFuncionarios()); 
    }
    
}
