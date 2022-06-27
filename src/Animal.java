public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public String getName() {
        return name;

    }

    public void setName(String name){
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Say() {
        System.out.println("Я говорю");
    }
    public void Go() {
        System.out.println("Я иду");

    }
    public void Drink() {
        System.out.println("я пью");
    }
    public void Eat(){
        System.out.println("Я ем");
    }

    public String toString() {

        String a;
        if (age%10==1&&age%100!=11){
            a="год";
        }
        else if (age%10>=2 && age%10<=4 && !(age%100>=12&& age%100 <= 14)){
            a="года";
        }
        else {
            a="лет";
        }

        return "Привет! меня зовут " + name +", мне "+ age +" "+ a +", я вешу - "+ weight +" кг, мой цвет - "+ color;
    }
}
