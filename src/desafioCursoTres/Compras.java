package desafioCursoTres;


public class Compras {
    // atributos
    private double saldo;
    private double limite;
    private String nomeObjetoCompra;
    private double valorObjetoCompra;

    //construtor
    public  Compras (double limite){
        this.limite = limite;
    }

    // getters e setters
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeObjetoCompra() {
        return nomeObjetoCompra;
    }

    public void setNomeObjetoCompra(String nomeObjetoCompra) {
        this.nomeObjetoCompra = nomeObjetoCompra;
    }

    public void setValorObjetoCompra(double valorObjetoCompra) {
        this.valorObjetoCompra = valorObjetoCompra;
    }

    public double getValorObjetoCompra() {
        return valorObjetoCompra;
    }

    // métodos
    @Override
    public String toString() {
        return this.nomeObjetoCompra + " - " + this.valorObjetoCompra;
    }

    public double realizandoCompra(){
        if ( this.valorObjetoCompra > this.saldo){
            return -1;
        }else{
            return this.saldo -= this.valorObjetoCompra;
        }
    }
}
