/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class Cliente extends Usuario {
    String pedidos;

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }
    
    public void realizarPedido(){
    
    };

    @Override
    public String toString() {
        return "Cliente{" + "pedidos=" + pedidos + '}';
    }
    
}
