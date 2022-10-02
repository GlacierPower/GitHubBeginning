import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HomeWorkPartTwo {
    @RequiresApi(api = Build.VERSION_CODES.O)

    public static void main(@NonNull String[] args) throws IOException {
        List<String > name = Files.readAllLines(Paths.get("app/src/main/java/Name.txt"));
        String[] namesArray = name.toArray(new String[0]);
        //Создание экземпляра класса с тремя парметрми
    Phones first = new Phones("Samsung C100","+375(29)963-89-98",34.5);
    first.name=namesArray[3];
        first.receiveCall();
        //Создание экземпляра класса с двумя парметрми
    Phones second =new Phones("Motorola MPx200","+375(44)958-61-31");
        second.name=namesArray[4];
        second.receiveCall();//Вызов методов
        second.sendMessage();

    }
}
class Phones{//Создание класса
    String model;
    String phoneNumber;
    Double weight;
    String name;
    public Phones(String model, String phoneNumber, Double weight){// Конструктор с тремя параметрми
        this.model=model;
        this.phoneNumber=phoneNumber;
        this.weight =weight;
        this.name = name;
    }
    public Phones(String model,String phoneNumber){// Конструкторс двумя парметрми
        this.model=model;
        this.phoneNumber=phoneNumber;
    }
    Phones(){//Конструктор без парметров

    }
    void receiveCall(){
        System.out.println(name+ " is calling "+ phoneNumber);
    }
    void sendMessage() throws IOException {
        BufferedReader number=new BufferedReader(new InputStreamReader(System.in)); //создание бафер
        System.out.println("Enter phone number");
        phoneNumber=number.readLine().toString();//Присиваю номеру число введенное с клавиатуры
        System.out.println("We are sending out a love message to the world " + phoneNumber);

    }
}