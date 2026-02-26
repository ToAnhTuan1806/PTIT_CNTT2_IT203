import java.util.LinkedList;

public class Bai4 {
    private LinkedList<String> queue;
    public Bai4() {
        queue = new LinkedList<>();
    }
    //benh nhan thuong
    public void patientCheckIn(String name){
        queue.addLast(name);
        System.out.println(name+ " da vao hang cho");
    }
    //ca nguy kich
    public void emergencyCheckIn(String name){
        queue.addLast(name);
        System.out.println("ca khan cap: "+ name+ " duoc uu tien");
    }
    //bac si goi benh nhan
    public void treatPatient(){
        if(queue.isEmpty()){
            System.out.println("khong con benh nhan");
            return;
        }
        String patient = queue.removeFirst();

        System.out.println("Dang xu ly: "+ patient);
    }
    public static void main(String[] args) {
        Bai4 room = new Bai4();
        room.patientCheckIn("benh nhan A");
        room.patientCheckIn("benh nhan B");
        room.emergencyCheckIn("benh nhan C");
        System.out.println("\n--- bat dau dieu tri ---");
        room.treatPatient();
        room.treatPatient();
        room.treatPatient();
    }
}
