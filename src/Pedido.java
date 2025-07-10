import java.util.Date;
public class Pedido {
    private int idPedido;
    private int idCliente;
    private double valorTotal;
    private String statusPedido;
    private Date dataPedido;


    public Pedido (int idPedido, int idCliente, double valorTotal,String statusPedido, Date dataPedido) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
        this.statusPedido = statusPedido;
        this.dataPedido = dataPedido;
    }



  
    /* Getters */

    public int getIdPedido() {
        return idPedido;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatusPedido() {
        return statusPedido;
    }
    
    public Date getDataPedido() {
        return dataPedido;
    }

    /* Setters */

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
    
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

}
