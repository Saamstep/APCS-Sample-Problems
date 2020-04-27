import java.util.*;
public class lastsupper {

        private static disciple disciples[] = {
                new disciple("Jesus",0,true),
                new disciple("Peter",1,false), // also called Simon
                new disciple("Andrew",1,false),
                new disciple("James",2,false), // two of them
                new disciple("John",1,false),
                new disciple("Philip",1,false),
                new disciple("Bartholomew",1,false),
                new disciple("Thomas",1,false),
                new disciple("Matthew",1,false),
                new disciple("Thaddaeus",1,false),
                new disciple("Simon",2,false),
                new disciple("Judas",2,false) // Thaddaeus was also called Judas
        };

        public static void whoIs(String n)
        {
            disciple local = null;
            for(int i = 0; i < disciples.length; i++) {
                if (disciples[i].getName().equals(n)) {
                    local = disciples[i];
                }
            }
                if(local == null) {
                    System.out.println(n + " was not one of the 12.");
                } else if(local.isMessiah()) {
                    System.out.println(n + " was the Messiah.");
                } else if(local.nDisciples() > 1) {
                    System.out.println("There were "+ local.nDisciples() +" named "+ local.getName() + ".");
                } else {
                    System.out.println(n + " was a Disciple.");
                }
                local = null;
        };

        public static void main(String args[])
        {
            whoIs("John");
            whoIs("Byron");
            whoIs("Jesus");
            System.out.print("Enter a name (first name only, capitalized)? ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            whoIs(name);
        }

}
