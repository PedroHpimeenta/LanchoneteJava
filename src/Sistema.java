
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Sistema {
    private List <Funcionario> funcionarios = new ArrayList();
    private List <Administrador> adminstradores = new ArrayList();
    public void realizarLogin(){
    };
    public void alterarCliente(){
    };
    public void incluirPedido(){
    };
    public void editarPedido(){
    };
    public void cancelarPedido(){
    };
    public void extratoPedido(){
    };
    public void dadosPedido(){
    };
    public void alterarSenha(){
    };
    public void incluirCliente(){
    };
    public void excluirCliente(){
    };
    public void addFuncionario(Funcionario a){
        funcionarios.add(a);
    };
    public void alterarFuncionario(){
    };
    public void alterarConta(){
    };
    public void alterarAdm(){
    };
     public boolean removerFuncionario(String id){
       for(Funcionario c : funcionarios){
       if(c.getIdFuncionario().equalsIgnoreCase(id)){
          funcionarios.remove(c);
          return true;
       }
       }
       return false;
        }
     public String exibirFuncionarios(){
       String s = " ";
         int i = 1;
     for (Funcionario f : funcionarios){
         s+= "  Funcionarios: " + (i++) + "  ";
       s+= f.toString() + " \n";
     }
     return s;
   }
    
}
