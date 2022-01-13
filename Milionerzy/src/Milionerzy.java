import java.util.*;

public class Milionerzy {
    public static void main(String[] args) throws Exception {
        System.out.println("Witaj z grze Milionerzy! Jak masz na imie?");
        Scanner scan = new Scanner (System.in);
        String imie = scan.nextLine();
        int wynik = 0;
        System.out.println("Witaj " + imie + ". Wpisz numer wybranej odpowiedzi. Oto pytania:");

// Pytanie 1
        System.out.println("");
        System.out.println("1) W którym roku był Potop Szwecki?");
        Map<String, String> odpowiedz1 = new HashMap<>();
                odpowiedz1.put("1", "1655 r.");
                odpowiedz1.put("2", "1552 r.");
                odpowiedz1.put("3", "1589 r.");     

                Iterator<Map.Entry<String, String>> it1 = odpowiedz1.entrySet().iterator();
        
                while (it1.hasNext()) {
                    Map.Entry<String, String> pair = it1.next();
                    
                    System.out.format("  %s. %s%n", pair.getKey(), 
                            pair.getValue());
                }       

        Scanner pytanie1 = new Scanner (System.in);
        int potop = pytanie1.nextInt();

        while (true) {

             if (potop == 1){
                System.out.println("Twoja odpowiedź to opowiedź nr " + potop + ". Otrzymujesz 1 punkt;");
                wynik++;
                break;
            } else if (potop == 2 || potop == 3){
                System.out.println("Twoja odpowiedź to odpowiedź nr " + potop + ". Otrzymujesz 0 punktów;");
                System.out.print("Poprawna odpowiedź to: ");
                System.out.println(odpowiedz1.get("1"));
                break;
            } else {
                System.out.println("Podaj odpowiedź od 1 do 3:");
                pytanie1 = new Scanner (System.in);
                potop = pytanie1.nextInt();
            }
        }

// Pytanie 2
        System.out.println("");
        System.out.println("2) Kiedy była bitwa pod Wiedniem?");
        Map<String, String> odpowiedz2 = new HashMap<>();
                odpowiedz2.put("1", "25 maja 1622 r.");
                odpowiedz2.put("2", "12 września 1683 r.");
                odpowiedz2.put("3", " 10 kwietnia 1725 r.");     

                Iterator<Map.Entry<String, String>> it2 = odpowiedz2.entrySet().iterator();
        
                while (it2.hasNext()) {
                    Map.Entry<String, String> pair = it2.next();
                    
                    System.out.format("  %s. %s%n", pair.getKey(), 
                            pair.getValue());
                }       

        Scanner pytanie2 = new Scanner (System.in);
        int wieden = pytanie2.nextInt();

        while (true) {

             if (wieden == 2){
                System.out.println("Twoja odpowiedź to opowiedź nr " + wieden + ". Otrzymujesz 1 punkt;");
                wynik++;
                break;
            } else if (wieden == 1 || wieden == 3){
                System.out.println("Twoja odpowiedź to odpowiedź nr " + wieden + ". Otrzymujesz 0 punktów;");
                System.out.print("Poprawna odpowiedź to: ");
                System.out.println(odpowiedz2.get("2"));
                break;
            } else {
                System.out.println("Podaj odpowiedź od 1 do 3:");
                pytanie2 = new Scanner (System.in);
                wieden = pytanie2.nextInt();
            }
        }

// Pytanie 3
        System.out.println("");
        System.out.println("3) Które zwierzę śpi nawet 22 godziny na dobę:");
        Map<String, String> odpowiedz3 = new HashMap<>();
                odpowiedz3.put("1", "kret");
                odpowiedz3.put("2", "koala");
                odpowiedz3.put("3", "panda");     

                Iterator<Map.Entry<String, String>> it3 = odpowiedz3.entrySet().iterator();

                while (it3.hasNext()) {
                    Map.Entry<String, String> pair = it3.next();
                    
                    System.out.format("  %s. %s%n", pair.getKey(), 
                            pair.getValue());
                }       

        Scanner pytanie3 = new Scanner (System.in);
        int ssak = pytanie3.nextInt();

        while (true) {

            if (ssak == 2){
                System.out.println("Twoja odpowiedź to opowiedź nr " + ssak + ". Otrzymujesz 1 punkt;");
                wynik++;
                break;
            } else if (ssak == 1 || ssak == 3){
                System.out.println("Twoja odpowiedź to odpowiedź nr " + ssak + ". Otrzymujesz 0 punktów;");
                System.out.print("Poprawna odpowiedź to: ");
                System.out.println(odpowiedz3.get("2"));
                break;
            } else {
                System.out.println("Podaj odpowiedź od 1 do 3:");
                pytanie3 = new Scanner (System.in);
                ssak = pytanie3.nextInt();
            }
        }
    System.out.print("Twoje suma punktów to: " + wynik);




    }
}     