package Step_5;
/**Capstone Project
 * Java Programming - Building a Recommendation System
 * @author Mridul Mahajan*/

import java.util.ArrayList;

public interface Rater {
    public void addRating(String item, double rating);
    public boolean hasRating(String item);
    public String getID();
    public double getRating(String item);
    public int numRatings();
    public ArrayList<String> getItemsRated();
}
