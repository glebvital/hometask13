public class Dog extends Pet implements Animal{
    public Dog(String breed, String name, int age) {
        super(breed, name, age);
    }


    @Override
    public String getSound() {
        return "Woof";
    }

    @Override
    public String getFood() {
        return "Meat, fish, dog food";
    }

    @Override
    String getInfo() {
        return "Dog breed: "+getBreed()+", Dog name: "+getName()+", Dog age: "+getAge();
    }
}
