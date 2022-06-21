// 2. Napisać program obliczający średnią arytmetyczną z wszystkich podanych liczb ujemnych oraz iloczyn liczb dodatnich. Liczby wczytywane są od użytkownika, koniec wczytywania oznacza podanie liczby 0. 
import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe ");
    int iloczyn=1;
    int srednia=0;
    int i=0;
    int suma=0;
    int liczba=scanner.nextInt();
    while(liczba!=0)
          { 
      if(liczba>0)
      {
      iloczyn=iloczyn*liczba;
      }
      if(liczba<0)
      {
      suma=liczba+suma;
        i++;
      }
      
      
     liczba=scanner.nextInt();
          }
    if(i==0){
      System.out.println("brak ujemnych liczb");
    }
    else{
        srednia=suma/i;
     System.out.println("Suma  "+suma);
    System.out.println("Srednia  "+srednia);
    System.out.println("Iloczyn  "+iloczyn);
    }

  }
}