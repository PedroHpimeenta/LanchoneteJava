/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class  Funcionario extends Usuario{

    private String cargo;
    private String salario;
    private int idFuncionario;
   

    public Funcionario() {
    }

    public Funcionario(String cargo, String salario,int idFuncionario) {
        this.cargo = cargo;
        this.salario = salario;
        this.idFuncionario =idFuncionario;
        
    }

    public Funcionario(String cargo, String salario,int idFuncionario, String nome, String CPF, String telefone, String endereco, String login, String senha) {
        super(nome, cpf,id, telefone, endereco, login, senha);
        this.cargo = cargo;
        this.salario = salario;
}

    
    
  public  void alterarInformações(){
  
  };
}
