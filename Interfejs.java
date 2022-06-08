import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfejs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pomoc pom=new Pomoc(0, 0);
        int petla1=0;
        while(petla1==0){
            try {
                System.out.println("\nKontrola lotow!\n");
                pom = Komendy.wybierzUzytkownika();
            } catch (Exception e) {
                if(e.getMessage()==null){
                    System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                }
                else System.out.println("\n"+e.getMessage()+" Sprobuj ponownie!\n");
            }
                if(pom.getX()==1){
                    pom=new Pomoc(0, 0);
                    int petla2=0;
                    while(petla2==0){
                        try{
                            System.out.println("\nWybierz operaje:");
                            System.out.println("1. Dodaj samolot");
                            System.out.println("2. Usun samolot");
                            System.out.println("3. Dodaj lotnisko");
                            System.out.println("4. Usun lotnisko");
                            System.out.println("5. Dodaj trase");
                            System.out.println("6. Usun trase");
                            System.out.println("7. Dodaj Klienta");
                            System.out.println("8. Usun Klienta");
                            System.out.println("9. Dodaj Posrednika");
                            System.out.println("10. Usun Posrednika");
                            System.out.println("11. Pokaz dane systemu");
                            System.out.println("12. Zapisz stan systemu do pliku");
                            System.out.println("13. Wczytaj stan systemu z pliku");
                            System.out.println("14. Wyloguj");
                            System.out.println("\n0. Zakoncz program!");
                            int x=scan.nextInt();
                                try{
                                    switch (x) {
                                        case 1:
                                            Komendy.dodajSamolot();
                                            break;
                                        case 2:
                                            Komendy.usunSamolot();
                                            break;
                                        case 3:
                                            Komendy.dodajLotnisko();
                                            break;
                                        case 4:
                                            Komendy.usunLotnisko();
                                            break;
                                        case 5:
                                            Komendy.dodajTrase();
                                            break;
                                        case 6:
                                            Komendy.usunTrase();
                                            break;
                                        case 7:
                                            Komendy.dodajKlienta();
                                            break;
                                        case 8:
                                            Komendy.usunKlienta();
                                            break;
                                        case 9:
                                            Komendy.dodajPosrednika();
                                            break;
                                        case 10:
                                            Komendy.usunPosrednika();
                                            break;
                                        case 11:
                                        int petla3=0;
                                        while (petla3==0){
                                            try {
                                                System.out.println("\nWybierz liste do wyswietlenia:");
                                                System.out.println("1. Lotniska");
                                                System.out.println("2. Samoloty");
                                                System.out.println("3. Trasy");
                                                System.out.println("4. Rezerwacje");
                                                System.out.println("5. Klienci");
                                                System.out.println("6. Posrednicy");
                                                System.out.println("\n0. Cofnij");
                                                try {
                                                    x = scan.nextInt();
                                                    switch (x) {
                                                        case 1:
                                                            BazaDanych.getLotniska();
                                                            break;
                                                        case 2:
                                                            BazaDanych.getSamoloty();
                                                            break;    
                                                        case 3:
                                                            BazaDanych.getTrasy();
                                                            break;
                                                        case 4:
                                                            BazaDanych.getRezerwacje();
                                                            break;
                                                        case 5:
                                                            BazaDanych.getKlienci();
                                                            break;
                                                        case 6:
                                                            BazaDanych.getPosrednicy();
                                                            break;
                                                        case 0:
                                                            petla3=1;
                                                            break;
                                                        default:
                                                            System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                                            break;
                                                    }
                                                } catch (Exception e) {
                                                    if(e.getMessage()==null){
                                                        System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                                    }
                                                    else System.out.println("\n"+e.getMessage()+" Sprobuj ponownie!\n");
                                                }
                                            } catch (InputMismatchException e){
                                                System.out.println("\nNieprawidlowa liczba! Spobuj ponownie!\n");
                                                scan.next();
                                            }
                                        }
                                        break;
                                        case 12:
                                            Komendy.zapis();
                                            break;  
                                        case 13:
                                            Komendy.wczytywanie();
                                            break;
                                        case 14:
                                            petla2 = 1;
                                            break;
                                        case 0:
                                            petla1 = 1;
                                            petla2 = 1;
                                            break;
                                        default:
                                            System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                            break;
                                    }
                            } catch (Exception e) {
                                if(e.getMessage()==null){
                                    System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                }
                                else System.out.println("\n"+e.getMessage()+" Sprobuj ponownie!\n");
                            }
                        }
                        catch (InputMismatchException e){
                            System.out.println("\nNieprawidlowa liczba! Spobuj ponownie!\n");
                            scan.next(); 
                        }
                    }
                }
                else if(pom.getX()==2){
                    int y = pom.getY();
                    pom=new Pomoc(0, 0);
                    int petla2=0;
                    while(petla2==0){
                        try{
                            int x;
                            System.out.println("1. Rezerwuj");
                            System.out.println("2. Sprawdz swoje loty");
                            System.out.println("3. Sprawdz dostepne trasy");
                            System.out.println("4. Wyloguj");
                            System.out.println("\n0. Zakoncz program!");
                            x = scan.nextInt();
                            try{
                                switch (x) {
                                    case 1:
                                        BazaDanych.Klienci.get(y).rezerwujLot();
                                        break;
                                    case 2:
                                        System.out.println(BazaDanych.Klienci.get(y).wykupioneLoty);
                                        break;
                                    case 3:
                                        BazaDanych.getTrasy();
                                        break;
                                    case 4:
                                        petla2=1;
                                        break;
                                    case 0:
                                        petla1=1;
                                        petla2=1;
                                        break;
                                    default:
                                        System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                        break;    
                                }
                            }catch (Exception e){
                                if(e.getMessage()==null){
                                    System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                }
                                else System.out.println("\n"+e.getMessage()+" Sprobuj ponownie!\n");    
                            }
                        }catch (InputMismatchException e){
                            System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                            scan.next();
                        }
                    }
                }
                else if(pom.getX()==3){
                    int y = pom.getY();
                    pom=new Pomoc(0, 0);
                    int petla2=0;
                    while(petla2==0){
                        try{
                            int x;
                            System.out.println("1. Rezerwuj");
                            System.out.println("2. Sprawdz swoje loty");
                            System.out.println("3. Sprawdz dostepne trasy");
                            System.out.println("4. Wyloguj");
                            System.out.println("\n0. Zakoncz program!");
                            x = scan.nextInt();
                            try{
                                switch (x) {
                                    case 1:
                                        BazaDanych.Posrednicy.get(y).rezerwujBilety();
                                        break;
                                    case 2:
                                        System.out.println(BazaDanych.Posrednicy.get(y).wykupioneLoty);
                                        break;
                                    case 3:
                                        BazaDanych.getTrasy();
                                        break;
                                    case 4:
                                        petla2=1;
                                        break;
                                    case 0:
                                        petla1=1;
                                        petla2=1;
                                        break;
                                    default:
                                        System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                        break;    
                                }
                            }catch (Exception e){
                                if(e.getMessage()==null){
                                    System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                                }
                                else System.out.println("\n"+e.getMessage()+" Sprobuj ponownie!\n");    
                            }
                        }catch (InputMismatchException e){
                            System.out.println("\nNieprawidlowa liczba! Sprobuj ponownie!\n");
                            scan.next();
                        }
                    }
                }
        }
    }   
}   