public class Multiples {
    public static void main(String[] args) {
        int index = 0;
        int value = 0;
        while(index < 1000){
            if (index % 3 == 0){
                value++;
            }else if (index % 5 == 0){
                value++;
            }
            index++;
        }
        System.out.println(value);
    }
}
