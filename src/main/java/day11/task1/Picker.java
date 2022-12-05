package day11.task1;

public class Picker {
    int salary;
    boolean isPayed;

    public Picker(int salary, boolean isPayed){
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public int getSalary(){
        return this.salary;
    }

    public boolean getIsPayed(){
        return this.isPayed;
    }

    public String toString(){
        return salary + "," + isPayed;
    }

    public int doWork(){
        salary = salary + 80;
        return salary;
    }
}
