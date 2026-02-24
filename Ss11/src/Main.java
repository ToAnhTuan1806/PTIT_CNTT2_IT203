import com.rikkeiedu.arena.GameCharacter;
import com.rikkeiedu.arena.ISkill;
import com.rikkeiedu.arena.Mage;
import com.rikkeiedu.arena.Warrior;

//mảng 3 phần tử + Goblin anonymous + loop for + null-check
public class Main {
    public static void main(String[] args) {
        //khai báo mảng
        GameCharacter[] characters= new GameCharacter[3];

        characters[0]=new Warrior("Thỏ", 120, 20, 5);
        characters[1]=new Mage("Hary Potter", 90, 18, 60);
        // gobin
        characters[2]= new GameCharacter("Gobin", 70, 0) {
            @Override
            public void attack(GameCharacter target) {
                if (target==null || !this.isAlive()) {
                    return;
                }
                System.out.println("Goblin cắn trộm...");
                target.takeDamage(10);
            }

            @Override
            public void showStatus() {
                System.out.println("- " + name + " | HP: " + hp + " | (Goblin Anonymous)");
            }
        };

        //Mô phỏng: mỗi nhân vật đánh nhân vật kế tiếp (vài lượt)
        for(int round=1;round<=3;round++) {
            System.out.println("\n ROUND "+ round);
            for(int i=0;i<characters.length;i++) {
                if(characters[i]==null) {
                    continue;
                }
                GameCharacter attacker=characters[i];
                GameCharacter target=characters[(i+1)%characters.length];

                //nêu target chết thì bo qua
                if (target==null || !target.isAlive()) {
                    continue;
                }
                // demo: round 2 cho ai có skill thì dùng ultimate
                if (round == 2 && attacker instanceof ISkill) {
                    ((ISkill) attacker).useUltimate(target);
                } else {
                    attacker.attack(target);
                }
            }
        }

        System.out.println("\nTổng số nhân vật đã tạo: " + GameCharacter.count);

        //in trạng thái cuối cùng
        System.out.println("\n TRẠNG THÁI CUỐI");
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == null){
                continue;
            }
            characters[i].showStatus();
        }
    }
}