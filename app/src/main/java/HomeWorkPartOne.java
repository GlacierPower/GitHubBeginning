
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//The first part
public class HomeWorkPartOne extends Phone { //Наследование от класса Phone

    public HomeWorkPartOne() {
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    void receiveCall() throws IOException {

        super.receiveCall();
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) throws IOException {

        List<String> listOfNames = Files.readAllLines(Paths.get("app/src/main/java/Name.txt"));
        String[] namesArray = listOfNames.toArray(new String[0]); //Массив имён

        Phone firstPhone  =new Phone(); //Создание экземпляра класса
        firstPhone.name = namesArray[0];//Присваивание перого имени из файла
        firstPhone.model="Sony Ericsson K750";
        firstPhone.phoneNumber="+375(29)937-99-92";
        firstPhone.weight = 99.0;
        System.out.println("Model: "+firstPhone.model + "\nPhone number: " +firstPhone.phoneNumber +
                "\nWeight:"+firstPhone.weight+" g\n");
        firstPhone.receiveCall(); //Вызов метода

        Phone secondPhone = new Phone();
        secondPhone.name = namesArray[1];
        secondPhone.model="Nokia 3310";
        secondPhone.phoneNumber="+8(90)110-11-01";
        secondPhone.weight=79.6;
        System.out.println("\nModel: "+secondPhone.model + "\nPhone number: " +secondPhone.phoneNumber +
                "\nWeight:"+secondPhone.weight+" g\n");
        secondPhone.receiveCall();

        Phone thirdPhone = new Phone();
        thirdPhone.name = namesArray[2];
        thirdPhone.model="Siemens CX65";
        thirdPhone.phoneNumber="+375(17)202-03-27";
        thirdPhone.weight=18.1;
        System.out.println("\nModel: "+thirdPhone.model + "\nPhone number: " +thirdPhone.phoneNumber +
                "\nWeight:"+thirdPhone.weight+" g\n");
        thirdPhone.receiveCall();
    }
}
class Phone{ //Создание класса Phone
    String model;
    String phoneNumber;
    Double weight;
    String name;

    void receiveCall() throws IOException {

    System.out.println(name+ " is calling " + phoneNumber);

        }


}




