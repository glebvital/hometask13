public class Cat extends Pet implements Animal{

    public Cat(String breed, String name, int age) {
        super(breed, name, age);
    }

    @Override
    public String getSound() {
        return "Mew";
    }

    @Override
    public String getFood() {
        return "Meat, fish, cat food";
    }

    @Override
    String getInfo() {
        return "Cat breed: "+getBreed()+", Cat name: "+getName()+", Cat age: "+getAge();
    }
}
