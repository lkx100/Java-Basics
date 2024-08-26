class Human {
    private int age;
    private String name;
    public void setAge(int age) {this.age = age;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public String getName() {return name;}
}

class GetterSetters {
    public static void main(String[] args) {
        Human person = new Human();
        person.setAge(24);
        person.setName("Lucky Kumar");
        System.out.println("Age: " + person.getAge());
        System.out.println("Name: " + person.getName());
    }
}