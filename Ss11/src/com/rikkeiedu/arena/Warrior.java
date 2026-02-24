package com.rikkeiedu.arena;

//chiến binh xu hướng tấn công vật lý và dùng giáp
public class Warrior extends GameCharacter implements ISkill{
    public int armor;
    public Warrior(String name, int hp, int attackPower, int armor){
        super(name, hp, attackPower);
        this.armor = armor;
    }

    //attack thường= attackDamge
    @Override
    public void attack(GameCharacter target) {
        if(target==null || !this.isAlive()){
            return;
        }
        System.out.println(name + " chém "+ target.getName() + " gây " + attackPower + " sát thương");
        target.takeDamage(attackPower);
    }

    //nhận sát thương = damge-armor(min=0)
    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        int realDamage = damage-armor;
        if(realDamage < 0){
            realDamage=0;
        }

        System.out.println(name + " đỡ bằng giáp, nhận "+ realDamage +  " sát thương");
    }

    //chiêu cuối: damge= attackPower*2, mất 10% máu hiện tại
    @Override
    public void useUltimate(GameCharacter target) {
        if(target==null || !this.isAlive()){
            return;
        }
        int dmg= attackPower*2;
        System.out.println(name + " dùng chiêu \"Đấm ngàn cân\" lên " + target.getName()
                + " gây " + dmg + " sát thương!");
        target.takeDamage(dmg);

        //mất 10% hp hiện tại
        int loss= (int) Math.ceil(this.hp*0.1);
        this.hp-=loss;
        if(this.hp<0){
            this.hp=0;
            System.out.println(name + " bị phản tác dụng, mất " + loss + " HP");
        }
        if(this.hp==0){
            System.out.println(name + " đã bị hạ gục");
        }
    }

    @Override
    public void showStatus() {
        System.out.println("- " + name + " | HP: " + hp + " | Armor: " + armor);
    }
}
