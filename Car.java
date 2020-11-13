public class Car {
    public String name;
    public String model;
    public int yearModel;
    public double engine;
    public String color;
    public boolean isActive;
/*
    public int sum(int num1, int num2){
        return num1 + num2;
    }
    public void printName(){
        System.out.println(name +" "+ model);
    }
    public int getYear() {  //getter
        return yearModel;
    }
    public void setYear(int yearModel){  //setter
        this.yearModel = yearModel;
    }
    public double getEngine() {  //getter
        return engine;
    }
    public void setEngine(double engine){  //setter
        this.engine = engine;
    }

 */
//getters ans setters written manually (above)

    //below automatically


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
