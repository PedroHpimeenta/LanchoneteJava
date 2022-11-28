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
    private String idFuncionario;
   

    public Funcionario() {
    }

    public Funcionario(String cargo, String salario,String idFuncionario) {
        this.cargo = cargo;
        this.salario = salario;
        this.idFuncionario =idFuncionario;
        
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

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "cargo=" + cargo + ", salario=" + salario + ", idFuncionario=" + idFuncionario + '}';
    }
    
}
