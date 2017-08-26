public class Scores{
    public static double calculatePercentage(int score, int total){

        return 100* ((double)score)/((double)total);
    }

    public static void main(String args[]){
        int score = Integer.parseInt(args[0]);
        int total = Integer.parseInt(args[1]);
        System.out.printf("%.2f%%\n", calculatePercentage(score, total));
    }
}
