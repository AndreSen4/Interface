
//Calculadora implementará OpMat que por sua vez, exigirá tudo que foi pedido nela.
class Calculadora implements OperacaoMatematica {

 // Metodo calculo Soma.
 @Override
 public void soma(double operando1, double operando2) {
  System.out.println("Soma: " + operando1 + operando2);
 }

 // Metodo calculo Subtração.
 @Override
 public void subtracao(double operando1, double operando2) {
  System.out.println("Subtração: " + (operando1 - operando2));
 }

 // //Metodo calculo Multiplicação.
 @Override
 public void multiplicacao(double operando1, double operando2) {
  System.out.println("Multiplicação: " + operando1 * operando2);
 }

 // O metodo abaixo está comentado, para mostrar a exigência da interface nos
 // métodos requisitados por ela. Ao tirar o calculo das barras(comentário), o
 // programa funcionará normalmente.

 // @Override
 // public void divisao(double operando1, double operando2)
 // {System.out.println("Divisão: " + operando1 / operando2);}

}
