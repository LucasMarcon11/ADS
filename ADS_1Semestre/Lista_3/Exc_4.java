
package Lista_3;

import java.util.Scanner;

public class Exc_4 {

     public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
          
          int saldo = 0;
          int operacao = 0;
          int saldoAnterior = 0;
          
          boolean interruptor1 = false;
          boolean interruptor2 = false;
          
          do {
               
               do {
                    
                    System.out.print("\t* ============================ *\n");
                    System.out.print("\t* ==== DIGITE A OPERAÇÃO! ==== *\n");
                    System.out.print("\t* ============================ *\n");
                    System.out.print("\t* ==== 1) Verificar saldo ==== *\n");
                    System.out.print("\t* ==== 2) Depositar saldo ==== *\n");
                    System.out.print("\t* ==== 3) Sacar um valor  ==== *\n");
                    System.out.print("\t* ==== 4) Saldo anterior  ==== *\n");
                    System.out.print("\t* ==== 5) Sair            ==== *\n");
                    System.out.print("\t* ============================ *\n");
                    System.out.printf("\t* Dígito: "); int x = sc.nextInt();
                    
                    if ((x != 1) && (x != 2) && (x != 3) && (x != 4) && (x != 5)) {
                         
                         System.out.print("\n\n \tDígito incorreto!");
                    } else {
                         
                         operacao = x;
                         interruptor2 = true;
                    }
               } while (interruptor2 == false);
               
               switch (operacao) {
                    
                    case 1:
                         System.out.println("\n\n");
                         System.out.print("\t* ==================================== *\n");
                        System.out.printf("\t* ===== Saldo atual: R$ %.2f", (double) saldo);
                         System.out.print("\t ===== *\n");
                         System.out.print("\t* ==================================== *\n");
                         System.out.println("\n\n");
                         
                         break;
                         
                    case 2:
                         
                         System.out.println("\n\n");
                         System.out.print("\t Digite o valor do depósito ou digite 0 para voltar ao menu: ");
                         int deposito = sc.nextInt();
                         System.out.println("\n\n");
                         
                         if (deposito == 0) {
                              
                              break;
                         } else {
                              
                              if (deposito >= 10) {
                              
                                   saldo += deposito;
                              } else {

                                   System.out.print("\t* ======================================================= *\n");
                                   System.out.print("\t* === Valor insuficiente ou incorreto para depositar! === *\n");
                                   System.out.print("\t* ======================================================= *\n");
                                   System.out.println("\n\n");
                              }

                              break;
                         }
                         
                    case 3:
                         System.out.println("\n\n");
                         System.out.print("\t Digite o valor a ser sacado ou digite 0 para voltar ao menu: ");
                         int saque = sc.nextInt();
                         
                         if (saque == 0) {
                              
                              break;
                         } else {
                              
                              if ((saque > saldo) || (saque < 0)) {
                              
                                   System.out.println("\n\n");
                                   System.out.print("\t* ========================================== *\n");
                                   System.out.print("\t* ===== Valor indisponível para saque! ===== *\n");
                                   System.out.print("\t* ========================================== *\n");
                                   System.out.println("\n\n");
                                   
                                   break;
                              } else {

                                   System.out.println("\n\n");
                                   System.out.print("\t* =================================== *\n");
                                   System.out.print("\t* === Deseja sacar em notas de... === *\n");
                                   System.out.print("\t* =================================== *\n");
                                   System.out.print("\t* ===         1) R$ 02,00         === *\n");
                                   System.out.print("\t* ===         2) R$ 05,00         === *\n");
                                   System.out.print("\t* ===         3) R$ 10,00         === *\n");
                                   System.out.print("\t* ===         4) R$ 20,00         === *\n");
                                   System.out.print("\t* ===         5) R$ 50,00         === *\n");
                                   System.out.print("\t* ===         6) R$ 100,0         === *\n");
                                   System.out.print("\t* ===     7) Operação padrão      === *\n");
                                   System.out.print("\t* ===     8) Voltar ao meunu      === *\n");
                                   System.out.print("\t* =================================== *\n");
                                   System.out.print("\t* Notas: "); int x = sc.nextInt();

                                   switch (x) {

                                        case 1:
                                             
                                             saldoAnterior = saldo;
                                             saldo -= saque;

                                             int notasDois = saque / 2;
                                             int restoDois = saque % 2;

                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(" com " +notasDois+ " nota(s) de R$ 02,00. ");

                                             if (restoDois > 0) {

                                                  System.out.printf("O resto do valor não sacado (R$ %.2f", (double) restoDois);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += restoDois;
                                             }
                                             
                                             System.out.println("\n\n\n");
                                             break;
                                        case 2:
                                             
                                             saldoAnterior = saldo;
                                             saldo -= saque;

                                             int notasCinco = saque / 5;
                                             int restoCinco = saque % 5;

                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(" com " +notasCinco+ " nota(s) de R$ 05,00. ");

                                             if (restoCinco > 0) {

                                                  System.out.printf("O resto do valor não sacado (R$ %.2f", (double) restoCinco);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += restoCinco;
                                             }

                                             System.out.println("\n\n\n");
                                             break;
                                        case 3:
                                             
                                             saldoAnterior = saldo;
                                             saldo -= saque;

                                             int notasDez = saque / 10;
                                             int restoDez = saque % 10;

                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(" com " +notasDez+ " nota(s) de R$ 10,00. ");

                                             if (restoDez > 0) {

                                                  System.out.printf("O resto do valor não sacado (R$ %.2f", (double) restoDez);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += restoDez;
                                             }

                                             System.out.println("\n\n\n");
                                             break;
                                        case 4:
                                             
                                             saldoAnterior = saldo;
                                             saldo -= saque;

                                             int notasVinte = saque / 20;
                                             int restoVinte = saque % 20;

                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(" com " +notasVinte+ " nota(s) de R$ 20,00. ");

                                             if (restoVinte > 0) {

                                                  System.out.printf("O resto do valor não sacado (R$ %.2f", (double) restoVinte);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += restoVinte;
                                             }

                                             System.out.println("\n\n\n");
                                             break;
                                        case 5:
                                             
                                             saldoAnterior = saldo;
                                             saldo -= saque;

                                             int notasCinquenta = saque / 50;
                                             int restoCinquenta = saque % 50;

                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(" com " +notasCinquenta+ " nota(s) de R$ 50,00. ");

                                             if (restoCinquenta > 0) {

                                                  System.out.printf("O resto do valor não sacado (R$ %.2f", (double) restoCinquenta);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += restoCinquenta;
                                             }

                                             System.out.println("\n\n\n");
                                             break;
                                        case 6:
                                             
                                             saldoAnterior = saque;
                                             saldo -= saldo;

                                             int notasCem = saque / 100;
                                             int restoCem = saque % 100;

                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(" com " +notasCem+ " nota(s) de R$ 100,00. ");

                                             if (restoCem > 0) {

                                                  System.out.printf("O resto do valor não sacado (R$ %.2f", (double) restoCem);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += restoCem;
                                             }

                                             System.out.println("\n\n\n");
                                             break;
                                        case 7:
                                             
                                             saldoAnterior = saldo;
                                             saldo -= saque;
                                             
                                             int cem;
                                             int cinquenta;
                                             int vinte;
                                             int dez;
                                             int cinco = 0;
                                             int dois;
                                             
                                             int resto;
                                             
                                             cem = saque / 100;
                                             resto = saque % 100;
                                             
                                             cinquenta = resto / 50;
                                             resto %= 50;
                                             
                                             vinte = resto / 20;
                                             resto %= 20;
                                             
                                             dez = resto / 10;
                                             resto %= 10;
                                             
                                             if ((saque % 2) == 0) {
                                                  
                                                  dois = resto / 2;
                                                  resto %= 2;
                                             } else {
                                                  
                                                  cinco = resto / 5;
                                                  resto %= 5;

                                                  dois = resto / 2;
                                                  resto %= 2;
                                             }
                                             
                                             System.out.println("\n\n");
                                             System.out.printf("        O saque realizado foi de R$ %.2f", (double) saque);
                                             System.out.print(", com ");
                                             
                                             if (cem > 0) {
                                                  
                                                  System.out.print(cem+ " nota(s) de R$ 100,00; ");
                                             } 
                                             if (cinquenta > 0) {
                                                  
                                                  System.out.print(cinquenta+ " nota(s) de R$ 50,00; ");
                                             }
                                             if (vinte > 0) {
                                                  
                                                  System.out.print(vinte+ " nota(s) de R$ 20,00; ");
                                             }
                                             if (dez > 0) {
                                                  
                                                  System.out.print(dez+ " nota(s) de R$ 10,00; ");
                                             }
                                             if (cinco > 0) {
                                                  
                                                  System.out.print(cinco+ " nota(s) de R$ 05,00; ");
                                             }
                                             if (dois > 0) {
                                                  
                                                  System.out.print(dois+ " nota(s) de R$ 02,00. ");
                                             }
                                             if (resto > 0) {
                                                  
                                                  System.out.println("");
                                                  System.out.printf("\tO resto do valor não sacado (R$ %.2f", (double) resto);
                                                  System.out.print("), devido a natureza matemática, será devolvido a conta.\n");
                                                  saldo += resto;
                                             }
                                        
                                             System.out.println("\n\n\n");
                                             break;
                                        case 8:
                                             
                                             System.out.println("\n\n");
                                             
                                             break;
                                   }
                              }
                         }
                         
                         break;
                    case 4:
                         
                         System.out.println("\n\n");
                         System.out.print("\t* ==================================== *\n");
                        System.out.printf("\t* ===== Saldo anterior: R$ %.2f", (double) saldoAnterior);
                         System.out.print("\t ===== *\n");
                         System.out.print("\t* ==================================== *\n");
                         System.out.println("\n\n");
                         
                         break;
                    case 5:
                         
                         interruptor1 = true;
                         
                         break;
               }
               
          } while (interruptor1 == false);
     }
}