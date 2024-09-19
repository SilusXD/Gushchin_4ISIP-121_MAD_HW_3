public class Dog extends Animal_2 implements Animal {
    @Override
    public void makeSound()
    {
        System.out.println("Гав");
    }

    @Override
    public void move()
    {
        System.out.println("Собака бегает");
    }
}
