public class Employee implements Workable, Eatable, Sleepable {

    @Override
    public void work() {
        IOManager.printMessage("Employee is working");
    }

    @Override
    public void eat() {
        IOManager.printMessage("Employee is eating");
    }

    @Override
    public void sleep() {
        IOManager.printMessage("Employee is sleeping");
    }

}
