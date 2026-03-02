package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int b=100;
        demo();
        System.out.println("END");

        // Cách dùng Stack
        Stack<Integer> stack=new Stack<>(); // Lớp
        // Cách phương thức của Stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // ptu tren cung

        // Lấy va xoa ptu tren cung
        System.out.println("Ptu tren cung la: "+ stack.pop());

        System.out.println(stack);

        // lay ptu tren cung nhung khong xoa
        System.out.println("Lay nhung k xoa : "+ stack.peek());

        System.out.println(stack);

        // duyet stack: top-down
        while(!stack.isEmpty()){
            // lay va xu ly ptu tren cung
            Integer top= stack.pop();
            // xu ly top
            System.out.println("top: "+ top);
        }

        // đảo ngược câu cho tiếp việt:
        // Hello các bạn => bạn các Hello : dùng stack
        // Huong làm: String.split -> array
        String seq="Hello các bạn";
        System.out.println(seq);

        String [] arr=seq.split(" ");

//        String<String> stringStack= new Stack<>();
//        // duyet va them vao stack
//        for(String word: arr){
//
//        }
    }
    public static void demo(){
        int a=10;
        for (int i=0; i<a; i++){
            System.out.println(i);
        }
    }
}
