
/**
 * The Adolescent class.
 *
 * @author Lori Imbesi
 * @version 2019-02-06
 */
public class Adolescent extends Person {

    /**The adolescent's favorite source of entertainment.*/
    private String favoriteEntertainment;

    /**The adolescent's favorite physical activity.*/
    private String favoriteActivity;

    /** The adult's relationship status. */
    private String relationshipStatus;

    /**Constructor for objects of class Adolescent*/
    public Adolescent(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity, String theRelationshipStatus) {
        super(theName, theAge, theWeight, theGender);
        this.setAge(theAge);
        favoriteEntertainment = entertainment;
        favoriteActivity = activity;
        relationshipStatus = theRelationshipStatus;
    }

    @Override
    /** The setAge method.
     *
     * @param newAge The new age.
     */
    public void setAge(int newAge) {
        if (newAge >= 18 && newAge < 12) {
            System.out.println("An adolescent cannot be this age!");
        } else {
            super.setAge(newAge);
        }
    }

    /**
     * The getSchool method.
     *
     * @return The kind of school the person is currently enrolled at, pre-school, elementary, etc.
     */
    public String getSchool() {
        int age = this.getAge();
        String schoolString = null;
        if (age >= 0 && age < 2) {
            schoolString = "This child is too young to be enrolled at any type of institution.";
        } else if (age == 3) {
            schoolString = "This child is currently in Pre-K.";
        } else if (age == 4 || age == 5) {
            schoolString = "This child is currently in Kindergarten.";
        } else if (age >= 6 || age < 12) {
            schoolString = "This child is currently enrolled in Elementary School.";
        } else if (age >= 12 && age < 14) {
            schoolString = "This adolescent is currently enrolled in Middle School.";
        } else if (age >= 14 && age < 19) {
            schoolString = "This adolescent is currently enrolled in High School.";
        }
        return schoolString;
    }

    /**
     * The getFavActivity method.
     *
     * @return The adolescent's favorite activity.
     */
    public String getFavActivity() {
        return favoriteActivity;
    }

    /**
     * The getFavEntertainment method.
     *
     * @return The adolescent's favorite source of entertainment.
     */
    public String getFavEntertainment() {
        return favoriteEntertainment;
    }

    /**
     * The getRelationshipStatus method.
     * 
     * @return The adolescent's relationship status.
     */
    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * The setRelationshipStatus method.
     *
     * @param newRealtionshipStatus The adolescent's new favorite activity.
     */
    public void setRelationshipStatus(String newRelationshipStatus) {
        if(newRelationshipStatus.equalsIgnoreCase("single") || newRelationshipStatus.equalsIgnoreCase("taken")) {
            relationshipStatus = newRelationshipStatus;
        }
        else {
            System.out.println("Invalid relationship status.");
        }
    }

    /**
     * The setFavActivity method.
     *
     * @param newActivity The adolescent's new favorite activity.
     */
    public void setFavActivity(String newFavActivity) {
        favoriteActivity = newFavActivity;
    }

    /**
     * The setFavEntertainment method.
     *
     * @param newActivity The adolescent's new favorite source of entertainment.
     */
    public void setFavEntertainment(String newFavEntertainment) {
        favoriteEntertainment = newFavEntertainment;
    }
}

