import com.rikkeiedu.minipj.Coffee;
import com.rikkeiedu.minipj.Drink;
import com.rikkeiedu.minipj.FruitJuice;
import com.rikkeiedu.minipj.IMixable;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks= new Drink[3];

        drinks[0]=new Coffee("cj01", "Bac Siu", 30000, true);
        drinks[1]=new FruitJuice("fj01", "Nuoc cam", 40000, 10);
        drinks[2]=null;

        for(int i=0; i<drinks.length;i++){
            if(drinks[i]!=null){
                System.out.println("HOA DON");
                drinks[i].displayInfo();

                System.out.println("Thanh tien: "+ drinks[i].calculatePrice());
                if(drinks[i] instanceof IMixable){
                    ((IMixable)drinks[i]).mix();
                }
                System.out.println();
            }
        }


    }
}