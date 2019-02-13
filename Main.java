
/**
 * Main class.
 *
 * @author Group 2
 * @version 2019-2-13
 */
public class Main { 
    public static void main(String[] args) {
        Person Billy = new Person("Billy", 35, 200, 'M');
        System.out.println(Billy.getName());
        System.out.println(Billy.getAge());        
        System.out.println(Billy.getWeight());
        System.out.println(Billy.getGender());

        Toddler Lacy = new Toddler("Lacy", 3, 13, 'F', "Spongebob", "Crying", "Rattle");
        System.out.println(Lacy.getName());
        System.out.println(Lacy.getAge());        
        System.out.println(Lacy.getWeight());
        System.out.println(Lacy.getGender());
        System.out.println(Lacy.getSchool());
        System.out.println(Lacy.getFavoriteToy()); 

        Child Sam = new Child("Sam", 12, 135, 'M', "Video Games", "Lacrosse");
        System.out.println(Sam.getName());
        System.out.println(Sam.getAge());        
        System.out.println(Sam.getWeight());
        System.out.println(Sam.getGender());
        System.out.println(Sam.getSchool());

        Adolescent Cathy = new Adolescent("Cathy", 17, 105, 'F', "Netflix", "Listen to music", "Single");
        System.out.println(Cathy.getName());
        System.out.println(Cathy.getAge());        
        System.out.println(Cathy.getWeight());
        System.out.println(Cathy.getGender());
        System.out.println(Cathy.getSchool());
        System.out.println(Cathy.getRelationshipStatus());

    }
}
