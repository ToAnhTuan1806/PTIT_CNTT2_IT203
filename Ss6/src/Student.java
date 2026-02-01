public class Student {
    private String stdId;
    private String stdName;
    int birthYear;
    double avgScore;

    public Student(String stdId, String stdName, int birthYear, double avgScore) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.birthYear = birthYear;
        this.avgScore = avgScore;
    }

    public void displayInfo(){
        System.out.println("Ma sv: "+stdId);
        System.out.println("Ho ten: "+stdName);
        System.out.println("Nam sinh: "+birthYear);
        System.out.println("Diem trung binh: "+avgScore);
    }

    public static void main(String[] args) {
        Student s1= new Student("D24100", "To Anh Tun", 2006, 10.0);
        s1.displayInfo();
    }
}


