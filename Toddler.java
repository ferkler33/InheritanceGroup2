
/**
 *
 * @author Leona Henion <LHenion@mail.dccc.edu>
 */
public class Toddler extends Person
{

    /**
     * The toddler's favorite source of entertainment.
     */
    private String favoriteEntertainment;

    /**
     * The toddler's favorite physical activity.
     */
    private String favoriteActivity;

    /**
     * The toddler's favorite toy.
     */
    private String favoriteToy;

    public Toddler(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity, String theToy)
    {
        super(theName, theAge, theWeight, theGender);
        this.setAge(theAge);
        favoriteEntertainment = entertainment;
        favoriteActivity = activity;
        favoriteToy = theToy;
    }

    /**
     * Constructor for objects of class Toddler
     */
    public Toddler(String theName, int theAge, double theWeight, char theGender, String entertainment, String activity)
    {
        super(theName, theAge, theWeight, theGender);
        this.setAge(theAge);
        favoriteEntertainment = entertainment;
        favoriteActivity = activity;
    }

    @Override
    /**
     * The setAge method.
     *
     * @param newAge The new age.
     */
    public void setAge(int newAge)
    {
        if (newAge > 3 && newAge <= 0)
        {
            System.out.println("A toddler cannot be this age!");
        }
        else
        {
            super.setAge(newAge);
        }
    }

    /**
     * The getSchool method.
     *
     * @return The kind of school the toddler is currently enrolled at, Day-care,
     * pre-school, elementary, etc.
     */
    public String getSchool()
    {
        int age = this.getAge();
        String schoolString = null;
        if (age < 1)
        {
            schoolString = "This Toddler is too young to be enrolled at any type of institution.";
        }
        else if (age == 0 || age <= 2)
        {
            schoolString = "This Toddler is currently enrolled in a Daycare program.";
        }
        else if(age == 3)
        {

            schoolString = "This toddler is currently enrolled in a pre-school.";
        }
        return schoolString;
    }

    /**
     * The getFavActivity method.
     *
     * @return The Toddler's favorite activity.
     */
    public String getFavActivity()
    {
        return favoriteActivity;
    }

    /**
     * The getFavEntertainment method.
     *
     * @return The Toddler's favorite source of entertainment.
     */
    public String getFavEntertainment()
    {
        return favoriteEntertainment;
    }

    /**
     * The getFavoriteToy method.
     *
     * @return The Toddler's favorite toy.
     */
    public String getFavoriteToy()
    {
        return favoriteToy;
    }

    /**
     * The setFavoriteToy method.
     *
     * @return The Toddler's favorite toy.
     */
    public void setFavoriteToy(String favoriteToy)
    {

        this.favoriteToy = favoriteToy;

    }

    /**
     * The setFavActivity method.
     *
     * @partam newActivity The Toddler's new favorite activity.
     */
    public void setFavActivity(String newFavActivity)
    {
        favoriteActivity = newFavActivity;
    }

    /**
     * The setFavEntertainment method.
     *
     * @partam newActivity The Toddler's new favorite source of entertainment.
     */
    public void setFavEntertainment(String newFavEntertainment)
    {
        favoriteEntertainment = newFavEntertainment;
    }
}
