public class Reduce {
    public static void main(String[] args) {
        int moves = 0;
        int index = 100;
        while (index != 0){
            moves++;
            if (index % 2 == 0){
                index/=2;
                continue;
            }
            index--;
        }
        System.out.println(moves);
    }
}
