import jdk.nashorn.internal.runtime.ECMAException;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String args[]) {
        /*ArrayList<String> st_names = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter names of students: ");
            String name = scanner.nextLine();
            if (!name.equals("Enough"))
                st_names.add(name);
            else
                break;
        } while (true);
        System.out.println(st_names.toString());*/

        int name;
        Scanner scanner = new Scanner(System.in);
        try {
           name = scanner.nextInt();
        }catch(Exception rola){
            System.out.println(rola);
        }
    }
}
