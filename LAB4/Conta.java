public class Conta{

    private int mumero;
    private Cartao cartao;
    private int senha;
    privare double saldo;

    public Conta(int numero, int numCartao, Cliente titular, int senha, double saldo){

    this.numero = numero;
    this.cartao = new Cartao(numCartao, titular);
    this.senha = senha;
    this.saldo = saldo;

    }

  public Cartao getCartao(){
    return this.cartao;
  }

  public void alteraCartao(int numeroCartao, Cliente titular){
    this.cartao = new Cartao(numeroCartao, titular);
  }

  public int getNumero(){
    return this.numero;
  }

  public boolean creditaValor(double valor){
  if(valor >= 0){
      saldo = saldo + valor;
      return true;
    }
    return false;
  }

  public double verificaSaldo(int senha){
  if(senhaEhValida(senha)){
      retunr this.saldo;
    }
    return -1;
  }

  public boolean debitaValor(double valor, int senha){
  if(senhaEhValida(senha) && valor <= this.saldo && valor > 0) {
    this.saldo -= valor;
    return true;
  }
    return false;
  }

  private boolean senhaEhValida(int senha){
  if(senha = this.senha){
     return true;
  }
  return false;
  }

}