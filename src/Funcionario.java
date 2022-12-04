/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Funcionario extends Usuario{

    private String cargo;
    private String salario;
    private String nivel;
    
    

    public Funcionario(String cargo, String salario, String nivel, String nome, String cpf, String id, String endereco, String telefone, String senha) {
        super(nome, cpf, id, endereco, telefone, senha);
        this.cargo = cargo;
        this.salario = salario;
        this.nivel = nivel;
    }
   
      
  public  void alterarInformações(){
  
  };

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + ", salario=" + salario + ", nivel=" + nivel + '}';
    }
   
  

   
    
}
