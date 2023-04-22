package CompleteJavaBasics;

public class StringInJava {
    public static void main(String[] args) {

        // String literal refers to  an existing object. It will not create a new object.
        String name = "Naren Bagavathy";
        String name1 = "Naren Bagavathy";
        System.out.println(name);
        System.out.println(name1);

        // Unlike String literal, String object creates a new object.
        String namesList = new String("Welcome to core java");
        String name2 = new String("Welcome to core java");
        System.out.println(namesList);
        System.out.println(name2);

        String professionName = "Naren UiPath Certified Professional";
        String[] splittedString = professionName.split(" ");

        String[] splittedString1 = professionName.split("UiPath");


        System.out.println("Trimmed Name String: " + splittedString[0].trim());
        System.out.println("Trimmed UiPath String: " + splittedString1[1]);

        System.out.println("Trimmed UiPath String: " + splittedString1[1].trim());
        System.out.println("Trimmed Certified String: " + splittedString[2].trim());
        System.out.println("Trimmed Professional String: " + splittedString[3].trim());


        for (String names: splittedString) {
            System.out.println(names);
        }

        for(int i= professionName.length()-1; i>=0; i--) {
            System.out.println("Reveresed String: " + professionName.charAt(i));
        }

        }
}
