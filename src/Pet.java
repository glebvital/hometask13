abstract class Pet {
    private String breed;
    private String name;
    private int age;

    public Pet(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract String getInfo();
}
