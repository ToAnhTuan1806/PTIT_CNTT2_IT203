import java.math.BigDecimal;

public class Employee {
    private String id;
    private String name;
    private BigDecimal salary;

    //k tham so
    public Employee(){
        id="Unknow";
        name="Unknow";
        salary=BigDecimal.ZERO;
    }

    //co ma va ten
    public Employee(String id,String name){
        this.id=id;
        this.name=name;
        this.salary=BigDecimal.ZERO;
    }

    //co day du ma, ten, luong
    public Employee(String id,String name,BigDecimal salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    // pthuc hien thi thong tin
    public  void displayInfo(){
        System.out.println("Ma nv: "+ id);
        System.out.println("Ten nv: "+ name);
        System.out.println("Luong : "+ salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E001", "Nguyen Van Moi");
        Employee e3 = new Employee("E002", "Tran Thi Moi", new BigDecimal("5000.0"));

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }

}

