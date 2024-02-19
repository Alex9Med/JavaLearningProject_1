package com.MAG.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(110,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(50);
        System.out.println(randomInt);

        int randomNegativeInt = DataGeneratorUtil.getRandomInt(-50);
        System.out.println(randomNegativeInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("yandex.ru"));
        System.out.println(DataGeneratorUtil.getRandomEmail("mail.ru"));
        System.out.println(DataGeneratorUtil.getRandomEmail("outlook.com"));

        Customer customer1 = new Customer("Ion Palamaru", "Masculin", 16548);
        String infoAboutCostumer1 = customer1.toString();
        System.out.println(infoAboutCostumer1);

        customer1.setAge(30);
        System.out.println(customer1.toString());

        System.out.println("Varsta lui Ion este:" + customer1.getAge());
        System.out.println("Prenumele lui Palamaru este:" + customer1.getName());

        Customer customer2 = new Customer("Maria Rotaru", "Feminin", 25);
        System.out.println(customer2.toString());

        customer2.setName("Maria Palamaru");
        System.out.println(customer2.toString());

        Customer customer3 = new Customer("Andrei Spinei", "Masculin", 32);
        System.out.println(customer3.toString());

        customer3.setName("Andrei Valuta");
        System.out.println(customer3.toString());

        customer3.setAge(18);
        System.out.println("Varsta lui Andrei: " + customer3.getAge());

        System.out.println("Numele a lui customer3: " + customer3.getName());
        System.out.println(customer3.toString());

        Customer customer4 = new Customer("Dorin Munteanu", "Neindetificat", -2);
        System.out.println(customer4.toString());

        customer4.setName("Dorina Munteanu");
        customer4.setGen("Feminin");
        customer4.setAge(27);

        System.out.println("Numele lui Dorin este deja: " + customer4.getName());
        System.out.println("Genul lui Dorina este: " + customer4.getGen());
        System.out.println("Varsta lui Dorina: " + customer4.getAge());

        String infoAboutCostumer4 = customer4.toString();
        System.out.println(infoAboutCostumer4);

    }
}
