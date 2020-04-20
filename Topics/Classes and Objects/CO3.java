class Patient{
    String patientName;
    double height, weight;

    Patient(String name, double h, double w){
        this.patientName = name;
        this.height = h;
        this.weight = w;
    }

    double computeBMI(){
        return (this.weight / (this.height * this.height));
    }

    public static void main(String[] args){
        Patient p1 = new Patient("Average Male", 1.7, 70);
        System.out.println("BMI : " + p1.computeBMI());
    }
}
