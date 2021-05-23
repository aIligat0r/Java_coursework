public class Debt {
    private String surname, name; // Imya, Familiya doljnika
    private int debt; // Сумма долга

    // Конструктор
    public Debt(String surname, String name, int debt) throws Exception {
        if (surname.equals("")) throw new Exception("Invalid surname!");
        this.surname = surname;

        if (name.equals("")) throw new Exception("Invalid name!");
        this.name = name;

        if(debt <= 0) throw new Exception("Invalid debt value!");
        this.debt = debt;
    }

    // Геттеры
    public String getData() {
        return getShortName() + " - " + getDebt() + "$"; // Ivanov I. - 100$
    }

    public String getShortName() {
        String surname = this.surname.substring(0, 1).toUpperCase() + this.surname.substring(1).toLowerCase();
        String name = this.name.substring(0, 1).toUpperCase();

        return surname + " " + name + ".";
    }

    public String getSurname() { return this.surname; }
    public String getName() { return this.name; }

    public int getDebt() { return this.debt; }

    // Сеттеры
    public void changeSurname(String surname) throws Exception {
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
        if (surname.equals("")) {
            throw new Exception("Invalid surname!");
        }
        this.surname = surname;
    }

    public void changeName(String name) throws Exception {
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        if (name.equals("")) {
            throw new Exception("Invalid name!");
        }
        this.name = name;
    }

    public void changeDebt(int debt) throws Exception {
        if (debt <= 0) {
            throw new Exception("Invalid debt value!");
        } else {
            this.debt = debt;
        }
    }
}
