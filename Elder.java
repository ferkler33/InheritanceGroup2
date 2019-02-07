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

    /** The adult's relationship status. */
    private String relationshipStatus;
    /**
     * Constructor for objects of class Elder
     */
    public Elder(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity, String theRelationshipStatus) {
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
        if( newAge < 75) {
            System.out.println("An Elder can not be younger than 75!");
        }
        else { 
            super.setAge(newAge);
        }
    }

    /** The getFavActivity method. 
     * 
     * @return The elder's favorite activity.
     */
    public String getFavActivity() {
        return favoriteActivity;
    }

    /** The getFavEntertainment method. 
     * 
     * @return The elder's favorite source of entertainment.
     */
    public String getFavEntertainment() {
        return favoriteEntertainment;
    }

    /**
     * The getRelationshipStatus method.
     * 
     * @return The elder's relationship status.
     */
    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    /**
     * The setRelationshipStatus method.
     *
     * @param newRealtionshipStatus The elder's new favorite activity.
     */
    public void setRelationshipStatus(String newRelationshipStatus) {
        if(!newRelationshipStatus.equalsIgnoreCase("single") || !newRelationshipStatus.equalsIgnoreCase("taken") || !newRelationshipStatus.equalsIgnoreCase("engaged") || !newRelationshipStatus.equalsIgnoreCase("married") || !newRelationshipStatus.equalsIgnoreCase("widowed")) {
            System.out.println("Invalid relationship status.");
        }
        else {
            relationshipStatus = newRelationshipStatus;
        }
    }

    /** The setFavActivity method. 
     * 
     * @param newActivity The elder's new favorite activity.
     */
    public void setFavActivity(String newFavActivity) {
        favoriteActivity = newFavActivity;
    }

    /** The setFavEntertainment method. 
     * 
     * @param newActivity The elder's new favorite source of entertainment.
     */
    public void setFavEntertainment(String newFavEntertainment) {
        favoriteEntertainment = newFavEntertainment;
    }
}
