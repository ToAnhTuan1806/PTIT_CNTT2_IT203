package com.rikkeiedu.arena;

public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;

    public static int count;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    //mọi nv đều có hành vi tấn công
    public abstract void attack(GameCharacter target);

    //nhận sát thương mặc định
    public void takeDamage(int damage) {
        hp -= damage;
        if(hp<=0){
            hp=0;
            System.out.println(name + "đã bị hạ gục");
        }
    }

    public boolean isAlive(){
        return hp>0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    //in tt cơ bản
    public void showStatus(){
        System.out.println("- " + name + " | HP: " + hp);
    }
}
