import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();

        manager.add(new Debt(
                "Ivanov",
                "Ivan",
                100
        ));
        manager.add(new Debt(
                "Petrov",
                "Petr",
                30
        ));

        manager.add(new Debt(
                "Gebenov",
                "Umar",
                1500
        ));

        System.out.println("Commands list:");
        help();

        String answer;
        do {
            Scanner in = new Scanner(System.in);

            System.out.println("\nCommand:");
            answer = in.next();
            if(answer.equals("/exit")) break;

            try {
                switch (answer) {
                    case "/help":
                        help();
                        break;
                    case "/list":
                        manager.list();
                        System.out.println("\n");

                        break;
                    case "/add":
                        String surname, name;
                        int debt;

                        System.out.println("Input surname:");
                        surname = in.next();

                        System.out.println("Input name:");
                        name = in.next();

                        System.out.println("Input debt:");
                        debt = in.nextInt();

                        manager.add(new Debt(surname, name, debt));

                        break;
                    case "/del":
                        System.out.println("Input index:");
                        int index = in.nextInt();

                        manager.delete(index);

                        break;
                    case "/getmax":
                        manager.getMaxDebt();
                        System.out.println("\n");

                        break;
                    case "/getmin":
                        manager.getMinDebt();
                        System.out.println("\n");

                        break;
                }
            } catch(Exception e) {
                System.out.println("Error!");
                e.printStackTrace();
            }

        } while(!answer.equals("/end"));
    }

    private static void help(){
        System.out.println("/list - show persons");
        System.out.println("/add - add person");
        System.out.println("/del - delete persons");
        System.out.println("/getmax - get person, who have max DEBT");
        System.out.println("/getmin - get person, who have min DEBT");
        System.out.println("/exit - exit");
        }
}
