public class Box{
    public static void main(String[] args){
        int i = 0;
        while (i<5) {
            if (i == 0||i ==4){
                System.out.println("+--------+");
            }
            else{
                System.out.println("|        |");
            }
            i++;
        }
    }
}
