import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

 public static LocalDate datas(){

  int ano;
  int mes;
  int dia;

  LocalDate LocalDate = java.time.LocalDate.now();
  Scanner leia = new Scanner(System.in);
  System.out.println("PRIMEIRO ANO: ");
  ano = leia.nextInt();

  System.out.println("PRIMEIRO MÊS: ");
  mes = leia.nextInt();

  System.out.println("PRIMEIRO DIA: ");
  dia = leia.nextInt();



  LocalDate data = LocalDate.of(ano, mes, dia);

  return data;

 }
  public static void main(String[] args) {
   LocalDate data1 = datas();
   LocalDate data2 = datas();

   Period periodo =  Period.between(data1,data2);
   System.out.println(periodo.getYears()  +  " anos entre as duas datas");
   System.out.println(periodo.getMonths() +  " meses entre as duas datas");
   System.out.println(periodo.getDays()   + " Dias");

 }

}