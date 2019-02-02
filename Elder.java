/**
 * The Elder class.
 *
 * @author Austin Hallman
 * @version 2019-2-2
 */
public class Elder extends Person {
    /** The Elder favorite source of entertainment. */
    private String favoriteEntertainment;

    /** The Elder favorite physical activity. */
    private String favoriteActivity;

    /**
     * Constructor for objects of class Elder
     */
    public Elder(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity) {
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
        if( newAge < 75) {
            System.out.println("An Elder can not be younger than 75!");
        }
        else { 
            super.setAge(newAge);
        }
    }

}
