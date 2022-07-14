public class Cat {
    private String name;
    private double age;

    public Cat(String name, double age){
        setName(name);
        setAge(age);
    }

    public void setName(String name) {this.name = name;}
    public String getName(){return name;}
    public void setAge(double age) {this.age = age;}
    public double getAge(){return age;}
}
