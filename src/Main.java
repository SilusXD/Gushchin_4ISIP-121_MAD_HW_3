import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Task_1_2
        /*Person person = new Person("Иван", 18, Gender.Мужской);
        Worker worker = new Worker("Петр", 20, Gender.Мужской, 55000);
        Manager manager = new Manager("Инна", 20, Gender.Женский, 70000, new Worker[]{worker});

        person.print();
        System.out.println();

        worker.print();
        System.out.println();

        manager.print();

        System.out.println("-----------------");

        person.plusAge();
        person.changeName("Александр");
        person.print();*/

        //Task_3
        /*Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.makeSound();
        dog.makeSound();
        cow.makeSound();*/

        //Task_4
        /*Car car = new Car();
        Bike bike = new Bike();

        car.move();
        bike.move();*/

        //Task_5
        /*Book book = new Book("Хроники бобика", "Бобика", 2024);
        Library library = new Library();

        library.addBook(book);
        System.out.println(library.findBookByAuthor("Бобика").getTitle());
        System.out.println(library.findBookByYear(2024).getTitle());*/

        //Task_6
        /*BankAccount bankAccount = new BankAccount(232323, 10000);
        bankAccount.takeMoney(11000);
        bankAccount.addMoney(12000);
        bankAccount.takeMoney(20000);*/

        //Task_7
        /*TestObject testObject1 = new TestObject();
        System.out.println(TestObject.getCounter());

        TestObject testObject2 = new TestObject();
        TestObject testObject3 = new TestObject();
        TestObject testObject4 = new TestObject();

        System.out.println(TestObject.getCounter());*/

        //Task_8
        /*Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(2,4);

        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());*/

        //Task_9
        /*Fish fish = new Fish();
        Bird bird = new Bird();
        Dog dog = new Dog();

        fish.move();
        bird.move();
        dog.move();*/

        //Task_10
        /*Student student1 = new Student("Оля", 121, 5);
        Student student2 = new Student("Антон", 221, 3);
        Student student3 = new Student("Елена", 221, 5);

        University university = new University();

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.sortStudentsByName();
        university.sortStudentsByGrade(0);*/

        //Task11
        /*Product product1 = new Product("Молоко", 65, 40);
        Product product2 = new Product("Чай", 200, 50);
        Product product3 = new Product("Сахар", 70, 100);

        Market market = new Market();

        market.addProduct(product1);
        market.addProduct(product2);
        market.addProduct(product3);

        Product pr = market.findProduct("Чай");
        pr.print();

        market.removeProduct(pr);

        pr = market.findProduct("Чай");
        pr.print();*/

        //Task12
        /*CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        creditCard.pay();
        creditCard.refund();

        payPal.pay();
        payPal.refund();*/

        //Task13
        /*UniqueID uniqueID1 = new UniqueID();
        UniqueID uniqueID2 = new UniqueID();
        UniqueID uniqueID3 = new UniqueID();
        UniqueID uniqueID4 = new UniqueID();

        System.out.println(uniqueID1.getId());
        System.out.println(uniqueID2.getId());
        System.out.println(uniqueID3.getId());
        System.out.println(uniqueID4.getId());*/

        //Task14
        /*Point point1 = new Point(-5,8);
        Point point2 = new Point(10,5);

        Rectangle1 rectangle = new Rectangle1(point1, point2);
        System.out.println("Площадь: " + rectangle.area());*/

        //Task15
        /*ComplexNumber complexNumber1 = new ComplexNumber(4,2);
        ComplexNumber complexNumber2 = new ComplexNumber(-5,3);
        complexNumber1.print();
        complexNumber2.print();
        System.out.println();

        complexNumber1.sum(complexNumber2).print();
        complexNumber1.sub(complexNumber2).print();
        complexNumber1.mult(complexNumber2).print();
        complexNumber1.div(complexNumber2).print();*/

        //Task16
        /*double[][] mass1 = new double[][]{{1,2,3},{1,2,3},{1,2,3}};
        double[][] mass2 = new double[][]{{1,2,3},{1,2,3},{1,2,3}};

        Matrix matrix1 = new Matrix(mass1);
        Matrix matrix2 = new Matrix(mass2);

        matrix1.print();
        System.out.println();

        matrix2.print();
        System.out.println();

        matrix1.sum(matrix2).print();
        System.out.println();
        matrix1.sum(5).print();
        System.out.println();

        matrix1.mult(matrix2).print();
        System.out.println();
        matrix1.mult(5).print();
        System.out.println();*/

        //Task17
        /*Sword sword = new Sword("Приносящий радость", 23);

        Player player = new Player("Павел", sword, 100);
        Enemy enemy = new Enemy("Зомби", 100, 20);

        while (true)
        {
            System.out.print(player.getName() + ": "); player.attack(enemy);
            System.out.println("Система: " + "HP " + enemy.getName() + " = " + enemy.getHealth());
            System.out.println();
            if(enemy.getHealth() < 0)
            {
                System.out.println("Выиграл " + player.getName() + "!");
                break;
            }

            System.out.print(enemy.getName() + ": "); enemy.attack(player);
            System.out.println("Система: " + "HP " + player.getName() + " = " + player.getHealth());
            System.out.println();
            if(player.getHealth() < 0)
            {
                System.out.println("Выиграл " + enemy.getName() + "!");
                break;
            }
        }*/

        //Task18
        /*Product1 product1 = new Product1("Молоко", 65);
        Product1 product2 = new Product1("Колбаса", 350.32);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        order.print();*/

        //Task19
        /*Smartphone smartphone = new Smartphone("Apple");
        Laptop laptop = new Laptop("Lenovo");

        smartphone.turnOn();
        smartphone.takePhoto();
        smartphone.turnOff();

        laptop.turnOn();
        laptop.turnOnKeyboardLed();
        laptop.turnOff();*/

        //Task20
        Scanner in = new Scanner(System.in);
        Game game = new Game();

        game.initBoard();
        game.printBoard();


        while(true)
        {
            if(game.getLastPutChar() == 'O')
            {
                System.out.print("Введите позицию X: "); game.selectChar(in.nextInt(), 'X');
            }
            else
            {
                System.out.print("Введите позицию O: "); game.selectChar(in.nextInt(), 'O');
            }

            game.printBoard();

            if(game.checkWin())
            {
                break;
            }
        }

    }
}

