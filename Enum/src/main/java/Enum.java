import java.io.FileInputStream;
import java.io.IOException;


public class Enum extends Description{
    @Override
    void getDescription() {

        System.out.println(summer);
        super.getDescription();

    }

    final String summer = "Summer is the hottest season";

    public static void main(String[] args) throws IOException {

        Season season = Season.Summer;
        if (season == Season.Summer) {
            FileInputStream myFavSeason = new FileInputStream("Enum/src/main/java/TimeOfYear.txt");
            int i;
            while ((i = myFavSeason.read()) != -1) {
                System.out.print((char) i);

            }
            System.out.println("\n");
        }

        loveSeason();

        Enum description = new Enum();
        description.getDescription();

        infoAboutSeasons();




    }

    static void loveSeason() {
        Season loveSeason = Season.Winter;
        switch (loveSeason) {
            case Winter:
                System.out.println("I love winter, because I like snowboarding.");
            case Spring:
                System.out.println("I love spring because I like to see how threes bloom.");
            case Summer:
                System.out.println("I love summer because I can play tennis outside.");
            case Autumn:
                System.out.println("I love autumn because I like autumn colours\n");
        }
    }
    static void infoAboutSeasons(){

        Season.Winter.setAverageTemperature(-3.0);
        Season.Spring.setAverageTemperature(11.0);
        Season.Summer.setAverageTemperature(17.0);
        Season.Autumn.setAverageTemperature(10.0);

        int j=0;
        while (j<3) {
            System.out.println("Winter is the season when people can make a snowman. " +
                    "The average temperature is " + Season.Winter.averageTemperature+"°");
            System.out.println("Spring is the season when the nature comes alive." +
                    " The average temperature is  " +Season.Spring.averageTemperature+"°");
            System.out.println("Summer is the season when people usually go on holiday or" +
                    "spend a lot of time in the countryside" +
                    "The average temperature is " +Season.Summer.averageTemperature+"°");
            System.out.println("Autumn is the season when people harvest for example potatoes" +
                    "The average temperature is "+Season.Autumn.averageTemperature+"°\n");
            break;

        }
        j++;
        }
    }

enum Season {
    Winter,
    Spring,
    Summer,
    Autumn;
    double averageTemperature;


    public void setAverageTemperature(double averageTemperature) {

                this.averageTemperature = averageTemperature;
        }

}

class Description {

    void getDescription() {
             System.out.println("Winter is the coldest season\n");

    }
}





