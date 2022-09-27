public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mem", "moundae");
        Person p2 = new Person("Abdel","Fatah");
        Person p3 = new Person("Jam", "Moundae");
        Person[] names = {p1,p2,p3};
        PersonHandler thePerson = new PersonHandler(names);

        System.out.println(thePerson.whileLoop());
        System.out.println(thePerson.forLoop());
        System.out.println(thePerson.forEachLoop());
    }
}
