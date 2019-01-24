
/**
 * The Child class.
 *
 * @author Samuel Ferkler
 * @version 2019-1-23
 */
public class Child extends Person {
    /** The childs favorite source of entertainment. */
    private String favoriteEntertainment;

    /** The childs favorite physical activity. */
    private String favoriteActivity;

    /**
     * Constructor for objects of class Child
     */
    public Child(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity) {
        super(theName, theAge, theWeight, theGender);
        favoriteEntertainment = entertainment;
        favoriteActivity = activity;
    }

    @Override
    /** The setAge method.
     * 
     * @param newAge The new age.
     */
    public void setAge(int newAge) {
        if(newAge > 12 && newAge < 0) {
            System.out.println("A child can not be this age!");
        }
        else { 
            super.setAge(newAge);
        }
    }

}
