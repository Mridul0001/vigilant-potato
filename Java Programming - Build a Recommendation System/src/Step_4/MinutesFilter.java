package Step_4;

/**Capstone Project
 * Java Programming - Building a Recommendation System
 * @author Mridul Mahajan*/

public class MinutesFilter implements Filter{

    private int min;
    private int max;
    public MinutesFilter(int min, int max){
        this.min = min;
        this.max = max;
    }
    @Override
    public boolean satisfies(String id) {
        int minutes = MovieDatabase.getMinutes(id);
        return (minutes >= min && minutes <= max );
    }
}