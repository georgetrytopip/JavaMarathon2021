package day11.task1;

public class Courier {
    int salary;
    boolean isPayed;

    public Courier(int salary, boolean isPayed){
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
        salary = salary + 100;
        return salary;
    }








}
