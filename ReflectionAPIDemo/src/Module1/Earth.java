package Module1;

public class Earth
{
    private String continent;
    public int population;

    public Earth(String continent, int population)
    {
        this.continent = continent;
        this.population = population;
    }

    public void rotate()
    {
        System.out.println("Module1.Earth () is rotating ");
    }

    private String tellDay()
    {
        return "Sunday";
    }

}
