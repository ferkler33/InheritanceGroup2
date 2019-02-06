
/**
 * The Adult class.
 *
 * @version 2019-2-6
 * @author Shane Maloney
 */
public class Adult extends Person {
    /** The adult's favorite source of entertainment. */
    private String favoriteEntertainment;

    /** The adult's favorite physical activity. */
    private String favoriteActivity;

    /**
     * Constructor for objects of class Adult
     */
    public Adult(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity) {        
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
        if(newAge > 74 && newAge < 18) {
            System.out.println("An adult can not be this age!");
        }
        else { 
            super.setAge(newAge);
        }
    }
	
    /** The getEmploymentStatus method.
     * 
     * @return The current employment status of the adult.
     */
    public String getEmploymentStatus() {
        int age = this.getAge();
        String EmploymentStatus = null;
        if(age >= 18 && age <= 22) {
            EmploymentStatus = "This adult is an intern.";
        }
        else if(age >= 23 && age <= 64) {
            EmploymentStatus = "This adult has a full time job.";
        }
        else if(age >= 65) {
            EmploymentStatus = "This adult is retired.";
        }
        return EmploymentStatus;
    }

    /** The getFavActivity method. 
     * 
     * @return The adult's favorite activity.
     */
    public String getFavActivity() {
        return favoriteActivity;
    }

    /** The getFavEntertainment method. 
     * 
     * @return The adult's favorite source of entertainment.
     */
    public String getFavEntertainment() {
        return favoriteEntertainment;
    }

    /** The setFavActivity method. 
     * 
     * @partam newActivity The adult's new favorite activity.
     */
    public void setFavActivity(String newFavActivity) {
        favoriteActivity = newFavActivity;
    }

    /** The setFavEntertainment method. 
     * 
     * @partam newActivity The adult's new favorite source of entertainment.
     */
    public void setFavEntertainment(String newFavEntertainment) {
        favoriteEntertainment = newFavEntertainment;
    }
}