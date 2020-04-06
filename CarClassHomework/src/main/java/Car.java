public class Car {
    private int yearModel;
    private String make;
    private float speed;

   public Car(int yearModel, String make){
   
       speed = 0;
   }
   
    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
   
        public float accelerate(){
        speed += 5;
        return speed;
        }  
        public float brake(){
        speed -= 5;
        return speed;
        }
}
