
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
        this.setAge(theAge);
        favoriteEntertainment = entertainment;
        favoriteActivity = activity;
    }

    @Override
    /** The setAge method.
     * 
     * @param newAge The new age.
     */
    public void setAge(int newAge) {
        if(newAge > 12 && newAge < 3) {
            System.out.println("A child can not be this age!");
        }
        else { 
            super.setAge(newAge);
        }
    }

    /** The getSchool method.
     * 
     * @return The kind of school the child is currently enrolled at, pre-school, elementery, etc.
     */
    public String getSchool() {
        int age = this.getAge();
        String schoolString = null;
        if(age >= 0 && age < 2) {
            schoolString = "This child is too young to be enrolled at any type of institution.";
        }
        else if(age == 3) {
            schoolString = "This child is currently in Pre-K.";
        }
        else if(age == 4 || age == 5) {
            schoolString = "This child is currently in Kindergarten.";
        }
        else if(age >= 6 || age < 12) {
            schoolString = "This child is currently enrolled in Elementary School.";
        }
        return schoolString;
    }

    /** The getFavActivity method. 
     * 
     * @return The child's favorite activity.
     */
    public String getFavActivity() {
        return favoriteActivity;
    }

    /** The getFavEntertainment method. 
     * 
     * @return The child's favorite source of entertainment.
     */
    public String getFavEntertainment() {
        return favoriteEntertainment;
    }

    /** The setFavActivity method. 
     * 
     * @param newActivity The child's new favorite activity.
     */
    public void setFavActivity(String newFavActivity) {
        favoriteActivity = newFavActivity;
    }

    /** The setFavEntertainment method. 
     * 
     * @param newActivity The child's new favorite source of entertainment.
     */
    public void setFavEntertainment(String newFavEntertainment) {
        favoriteEntertainment = newFavEntertainment;
    }
}
