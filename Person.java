
/**
 * The Person class.
 *
 * @author Samuel Ferkler
 * @version 2019-1-23
 */
public class Person {
    /** The name of the object. */
    private String name;

    /** The age of this person. */
    private int age;

    /** The weight of this person. */
    private double weight;

    /** The gender of this person. */
    private char gender;

    /**
     * Constructor for class Person
     */
    public Person(String theName, int theAge, double theWeight, char theGender) {
        name = theName;
        age = theAge;
        weight = theWeight;
        gender = theGender;        
    }

    /** The get name method.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /** The get age method.
     * 
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /** The get weight method.
     * 
     * @return The weight of the person.
     */
    public double getWeight() {
        return weight;
    }

    /** The get gender method.
     * 
     * @return The gender of the person.
     */

    public char getGender() {
        return gender;
    }

    /** The setName method.
     * 
     * @param newName The new name.
     */
    public void setName(String newName) {
        name = newName;
    }

    /** The setAge method.
     * 
     * @param newAge The new age.
     */
    public void setAge(int newAge) {
        age = newAge;
    }

    /** The setWeight method.
     * 
     * @param newWeight The new weight.
     */
    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    /** The setgender method.
     * 
     * @param newGender The new gender.
     */
    public void setGender(char newGender) {
        if((newGender != 'M') || (newGender != 'F')) {
            System.out.println("Please enter M or F for gender.");
        }
        else {
            gender = newGender;
        }
    }
}
