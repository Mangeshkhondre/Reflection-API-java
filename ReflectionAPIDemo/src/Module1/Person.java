package Module1;

public class Person extends Earth
{
    public String name;
    private String gender;
    public int age;
    final public String country ="India";

    public Person(String continent, int population, String name, String gender, int age)
    {
        super(continent, population);
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person(String continent, int population, int age) {
        super(continent, population);
        this.age = age;
    }

    private Person(String continent, int population, String gender, int age)
    {
        super(continent, population);
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name)
    {
        this.name=name;
    }


    public String getName()
    {
        return name;
    }

    final public void SayHello()
    {
        System.out.println("Hello World");
    }

    @Override
    public String toString()
    {
        return String.format("Name = %s, Age = &d, Gender = %s",name,age,gender);
    }
}
