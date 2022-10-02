


public class Birds extends Bird {

    public Birds(String birdName,String birdVoice) {
        super(birdName, birdVoice);
    }

    public static void main(String[] args){
    Bird first = new Bird("Penguin","Uuiiiiii");
    first.setFly();
    Bird second = new Bird("Raven","Karrrr");
    second.setFly();
    Bird third = new Bird("Pigeon", "Kurlik Kurlik");
    third.setFly();

    }
}
class Bird{

    String name;
    Boolean fly;
    String voice;

    public Bird(String birdName,  String birdVoice){
    this.name=birdName;
    this.voice=birdVoice;
    }

    void setFly(){
            if(name.equals("Penguin")){
                fly=false;
                System.out.println("Fly: "+fly+"\n"+name +" can't fly");
            }
            else {
                fly=true;
                System.out.println("Fly: "+fly+"\n"+name +" can fly");
            }

        }
    }
