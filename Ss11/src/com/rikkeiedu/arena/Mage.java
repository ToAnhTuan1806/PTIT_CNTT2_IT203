package com.rikkeiedu.arena;

//pháp sư dùng phép thuật thiên về mana
public class Mage extends GameCharacter implements ISkill{
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana){
        super(name, hp, attackPower);
        this.mana = mana;
    }

    //đủ mana thì oánh mạnh, thiếu mana oánh yếu
    @Override
    public void attack(GameCharacter target) {
        if(target==null || !this.isAlive()){
            return;
        }

        int dmg;
        if (mana>=5){
            dmg=attackPower;
            mana-=5;
            System.out.println(name + " bắn phép thường, tốn 5 mana, gây " + dmg + " sát thương");
        }else{
            dmg=attackPower/2;
            System.out.println(name + " thiếu mana, đánh yếu, gây " + dmg + " sát thương");
        }
        target.takeDamage(dmg);
    }

    //chiêu cuối "Hoả cầu" cần mana>=50, tốn 50 mana, dam=attackPower*3
    @Override
    public void useUltimate(GameCharacter target) {
        if (target == null || !this.isAlive()) return;

        if (mana < 50) {
            System.out.println(name + " không đủ mana để dùng \"Hỏa cầu\" (cần 50 mana)");
            return;
        }
        mana -= 50;
        int dmg = attackPower * 3;
        System.out.println(name + " tung \"Hỏa cầu\" lên " + target.getName()
                + ", tốn 50 mana, gây " + dmg + " sát thương!");
        target.takeDamage(dmg);
    }

    @Override
    public void showStatus() {
        System.out.println("- " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}
