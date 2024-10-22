public class Person {
    String name;
    Person father, mother;
    Person[] colleagues;

    public static void main(String[] arguments) {
        /* Person a = new Person();
        a.name = "Claudia";
        Person b = new Person();
        b.name = "Peter";
        a.father = b;
        b.name = "Pesche";
        b = new Person();
        b.name = "Susanne";
        a.mother = b;
        b.father = new Person();
        b.father.name = "Albert";
        b = null;
        System.out.println(a.father.name);
        System.out.println(a.mother.name);
        System.out.println(a.mother.father.name); */
        // System.out.println(a.father.mother.name); // NullPointerException

        Person a = new Person();
        a.name = "Felix";
        Person b = new Person();
        b.name = "Regula";
        a.colleagues = new Person[2];
        a.colleagues[0] = b;
        a.colleagues[1] = new Person();
        a.colleagues[1].name = "Beat";
        b.colleagues = new Person[2];
        b.colleagues[0] = a;
        b.colleagues[1] = a.colleagues[1];
        b.colleagues[1].name = "Beatus";
        a = a.colleagues[0];
        System.out.println(a.name);
        a = a.colleagues[0];
        System.out.println(a.name);
        a = a.colleagues[1];
        System.out.println(a.name);
        a.colleagues = b.colleagues;
        a = a.colleagues[0];
        System.out.println(a.name);
        
    }
}
