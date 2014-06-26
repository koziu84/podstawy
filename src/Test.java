import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Test{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj cyfrę od 0 do 9: ");
        String str = br.readLine();
        int liczba = 0;
        if(str.length()==1 && Character.isDigit(str.charAt(0))){
            System.out.println("hurra podałeś cyfrę");
            liczba = Integer.parseInt(str);
        }
        else{
            System.out.println("niestety podałeś nieprawidłowe dane");
        }
    }
}


//Czytaj więcej na: http://javastart.pl/klasy/klasy-oslonowe/#ixzz33893EDzG