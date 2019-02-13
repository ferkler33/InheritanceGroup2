
/**
 * Main class.
 *
 * @author Group 2
 * @version 2019-2-13
 */
public class Main { 
    public static void main(String[] args) {
        Person Billy = new Person("Billy", 35, 200, 'M');
        Billy.getName();
        Billy.getAge();        
        Billy.getWeight();
        Billy.getGender();

        Toddler Lacy = new Toddler("Lacy", 3, 13, 'F', "Spongebob", "Crying", "Rattle");
        Lacy.getName();
        Lacy.getAge();        
        Lacy.getWeight();
        Lacy.getGender();
        Lacy.getSchool();
        Lacy.getFavoriteToy(); 

        Child Sam = new Child("Sam", 12, 135, 'M', "Video Games", "Lacrosse");
        Sam.getName();
        Sam.getAge();        
        Sam.getWeight();
        Sam.getGender();
        Sam.getSchool();

        Adolescent Cathy = new Adolescent("Cathy", 17, 105, 'F', "Netflix", "Listen to music", "Single");
        Cathy.getName();
        Cathy.getAge();        
        Cathy.getWeight();
        Cathy.getGender();
        Cathy.getSchool();
        Cathy.getRelationshipStatus();
    }
}
