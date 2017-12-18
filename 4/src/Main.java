import entity.Abiturient;

public class Main {
    public static void main(String[] args) {
        Abiturient iharZybko = new Abiturient();
        iharZybko.setId(1);
        iharZybko.setFirstName("Igor");
        iharZybko.setLastName("Zibko");
        iharZybko.setMiddleName("Olegovich");
        iharZybko.setAddress("Ross");
        iharZybko.setMarks("Math", 2);
        iharZybko.setMarks("Rus. Lit.", 10);
        iharZybko.setMobileNumber("12432563524");
        System.out.println(iharZybko);

        Abiturient alekSavek = new Abiturient();
        alekSavek.setId(2);
        alekSavek.setFirstName("Alik");
        alekSavek.setLastName("Savik");
        alekSavek.setMiddleName("Kotovich");
        alekSavek.setAddress("Barabanovichi");
        alekSavek.setMarks("Tryd", 0);
        alekSavek.setMarks("Chemistry", 5);
        alekSavek.setMobileNumber("6666666");
        System.out.println(alekSavek);
        }
}