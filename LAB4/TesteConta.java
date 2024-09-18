public class TesteConta{
  public void main(String[] args){

     Cliente cliente = new Cliente("123", "Joao");
     Conta c1 = new Conta(1, 12345, cliente, 123, 200);

     c1.creditaValor(100);
     c1.debitaValor(50,123);

     system.out.println(c1.verificaSaldo(123));
















  }


}