//Random Class
public class ComparablesExample{
    public String name;
    public int yearDiscovered;
    public String population;

    public ComparablesExample(String name, int yearDiscovered, String population){
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.population = population; }

    public String toString(){
        String s = "Animal name: "+ name+"\nYear Discovered: "+yearDiscovered+"\nPopulation: "+population;
        return s;
    }

//compares the integer value of two instances (the year discovered field) of comparablesExample
public int compareTo(ComparablesExample other) {
    return Integer.compare(this.yearDiscovered, other.yearDiscovered);
}
}