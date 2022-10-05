public class Cars {
    public static void main(String[] args) {
    SuperCar Lada =  new SuperCar(new WheelIsRotating());
    Lada.wheels();
    }
}
class WheelIsRotating implements IRotate{

    @Override
    public void wheelsIsRotating() {
        System.out.println("Wheels is rotating");
    }
}
interface IRotate{
    void wheelsIsRotating();
}
class SuperCar{
    IRotate iRotate;
    public SuperCar(IRotate rotate){
        this.iRotate = rotate;
    }
    void wheels(){
        iRotate.wheelsIsRotating();
    }
}




