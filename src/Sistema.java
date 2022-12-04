
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Sistema {
    
    //
    private List <Funcionario> funcionarios = new ArrayList();
    private List <Administrador> adm = new ArrayList();
    
    
    public void realizarLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite o nome ");
        String nome = sc.next();
        System.out.println(" cpf: ");
        String cpf = sc.next();
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
       if(c.getNivel().equalsIgnoreCase(id)){
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
    public void json(){
       Gson gson = new Gson();
       
        String json = gson.toJson(funcionarios);
        
        
        try {
		//Escreve Json convertido em arquivo chamado "file.json"
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\funcionarios.json");
		writer.write(json);
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }
      
    }
