public class Ejercicio {
    public static void main (String[] args) {
        // Inicializando clases
        Client Alejo = new Client(20, "Alejo", "212312", 2000);
        Worker Tony = new Worker(25, "Tony", "371923", 21);

        // Mostrando datos
        System.out.println("Tengo " + Alejo.age + " años");
        System.out.println("Me llamo " + Alejo.name);
        System.out.println("Mi numero de telefono es: " + Alejo.phoneNumber);
        System.out.println("Mi credito es de: " + Alejo.credit);

        System.out.println("Tengo " + Tony.age + " años");
        System.out.println("Me llamo " + Tony.name);
        System.out.println("Mi numero de telefono es " + Tony.phoneNumber);
        System.out.println("Mi salario es de " + Tony.salary + " la hora");



    }
}

class Person {
    int age;
    String name;
    String phoneNumber;

}

class Client extends Person {
    int credit;

    public Client (int age, String name, String phoneNumber, int credit) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.credit = credit;

    }

}

class Worker extends Person {
    float salary;

    public Worker (int age, String name, String phoneNumber, float salary) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;

    }

}