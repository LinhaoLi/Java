public class CoffeeBot{
    public static void main(String[] args){
        if(args.length<1){
            System.out.println("No arguments. System terminating.");
            return;
        }
        else if(args.length<2){
            System.out.println("Not enough arguments. System terminating.");
            return;
        }
        else if(args.length>2){
            System.out.println("Too many arguments. System terminating.");
            return;
        }

        int cups = Integer.parseInt(args[0]);
        int shots = Integer.parseInt(args[1]);

        if(cups < 0){
            System.out.println("Negative supply of coffee cups. System terminating.");
            return;
        }
        else if(shots < 0){
            System.out.println("Negative supply of coffee shots. System terminating.");
            return;
        }
        else if(( shots < 0 ) && ( cups < 0)){
            System.out.println("Negative supply chain. System terminating.");
            return;
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, what's your name?");
        String name = keyboard.nextLine();
        System.out.print("Would you like to order some coffee, "+ name +"? (y/n)");
        String choice = keyboard.next();
        while(1){

            if(choice.equals("y")){
                System.out.println("Great! Let's get started.\n");
                break;
            }
            else if(choice.equals("n")){
                System.out.println("Come back next time, " + name + ".");
                return;
                }
            else{
                System.out.println("Invalid response. Try again.");
            }
        }
        System.out.println("Order selection");
        System.out.println("---------------\n");
        System.out.println("There is 1 coffee cup in stock and each costs $2.00.");
        System.out.println("There is 1 coffee shot in stock and each costs $1.00.\n");

        System.out.print("How many cups of coffee would you like?");
        int userCup = keyboard.nextInt();

        if(userCup == 0){
            System.out.print("No cups, no coffee. Goodbye.");
            return;
        }
        else if(userCup > cups){
            System.out.print("Not enough stock. Come back later.");
            return;
        }
        else if(userCup < 0){
            System.out.print("Does not compute. System terminating.");
            return;
        }

        






    }
}
