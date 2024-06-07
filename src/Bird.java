public class Bird extends Pet implements Animal{
    public Bird(String breed, String name, int age) {
        super(breed, name, age);
    }

    @Override
    public String getSound() {
        return "fee-bee";
    }

    @Override
    public String getFood() {
        return "Seeds, fruits";
    }

    @Override
    String getInfo() {
        return "Bird breed: "+getBreed()+", Bird name: "+getName()+", Bird age: "+getAge();
    }
}
