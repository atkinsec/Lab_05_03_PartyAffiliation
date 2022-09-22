public class Main {
    public static void main(String[] args)
    {
        String party = "p";
        System.out.println("What is your Party affiliation? (D,R,I)");

        if (party.equalsIgnoreCase("D"))
            System.out.println(" you get democrat donkey");
        else if (party.equalsIgnoreCase("R"))
            System.out.println("you get republican elephant");
        else if (party.equalsIgnoreCase("I"))
            System.out.println("You get independent person");
        else
            System.out.println("you get other, no party affiliation");
    }

}