// Take a input from user and print the multiplication table.

import java.util.Scanner;

class Problem4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    for(int i=1; i<=10;i++){
      System.out.printf(" %d * %d = %d %n", num, i, (num*i));
    }
  }
}
