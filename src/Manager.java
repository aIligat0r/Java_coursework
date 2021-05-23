import java.util.ArrayList;

public class Manager {
    private ArrayList<Debt> Database;

    public Manager() {
        Database = new ArrayList<>();
    }

    public void add(Debt d) {
        Database.add(d);
    }

    public void delete(int index) throws Exception {
        if (index <= 0 || index > Database.size()) throw new Exception("Invalid index.");

        Database.remove(index - 1);
    }

    public void list() {
        if (Database.isEmpty()) System.out.println("There is no debts to list.");
        else {
            for(int i = 0; i < Database.size(); i++) {
                System.out.println((i + 1) + ". " + Database.get(i).getData());
            }
        }
    }

    public void getMaxDebt() {
        if (Database.isEmpty()) {
            System.out.println("There is no debts to show");
        } else {
            int maxDebt = Database.get(0).getDebt();

            for(int i = 1; i < Database.size(); i++) {
                if (Database.get(i).getDebt() > maxDebt) {
                    maxDebt = Database.get(i).getDebt();
                }
            }

            for(int i = 0; i < Database.size(); i++) {
                Debt temp = Database.get(i);
                if(temp.getDebt() == maxDebt) System.out.println("MAX DEBT: " + temp.getData() + "(" + (i + 1) + ")");
            }
        }
    }

    public void getMinDebt() {
        if(Database.isEmpty()) {
            System.out.println("There is no debts to show");
        } else {
            int minDebt = Database.get(0).getDebt();

            for(int i = 1; i < Database.size(); i++) {
                if(Database.get(i).getDebt() < minDebt) {
                    minDebt = Database.get(i).getDebt();
                }
            }

            for(int i = 0; i < Database.size(); i++) {
                Debt temp = Database.get(i);
                if(temp.getDebt() == minDebt) {
                    System.out.println("MIN DEBT: " + temp.getData() + "(" + (i + 1) + ")");
                }
            }
        }
    }
}
