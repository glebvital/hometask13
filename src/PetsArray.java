import java.util.ArrayList;

public class PetsArray {
    ArrayList<Pet> pets = new ArrayList<>();

    public void addPet(Pet pet){
        if (pet!=null){
            System.out.println(pet.getName()+" have been added!");
            pets.add(pet);
        }
    }
    public void removePet(String name){
        for (Pet pet : pets){
            if (name.equals(pet.getName())){
                System.out.println(pet.getName()+" have been removed!");
                pets.remove(pet);
                return;
            }
        }
    }
    public void listPets(){
        System.out.println("---------");
        for (Pet pet : pets){
            System.out.println(pet.getInfo());
        }
        System.out.println("---------");
    }
}
