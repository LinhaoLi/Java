import java.util.*;

public class CoffeeBot{
    public static void main(String[] args){
        if(args.length<1){
            System.out.println("No arguments. System terminating.");
            System.exit(1);
        }
        else if(args.length<2){
            System.out.println("Not enough arguments. System terminating.");
            System.exit(1);
        }
        else if(args.length>2){
            System.out.println("Too many arguments. System terminating.");
            System.exit(1);
        }

        int cups = Integer.parseInt(args[0]);
        int shots = Integer.parseInt(args[1]);

        if(( shots < 0 ) && ( cups < 0)){
            System.out.println("Negative supply chain. System terminating.");
            return;
        }
        else if(shots < 0){
            System.out.println("Negative supply of coffee shots. System terminating.");
            return;
        }
        else if(cups < 0){
            System.out.println("Negative supply of coffee cups. System terminating.");
            return;
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, what's your name? ");
        String name = keyboard.nextLine();
<<<<<<< HEAD
		String choice;
        while(true){
            System.out.print("Would you like to order some coffee, "+ name +"? (y/n) ");
            choice = keyboard.next();
=======

        while(true){
            System.out.print("Would you like to order some coffee, "+ name +"? (y/n) ");
            String choice = keyboard.next();
>>>>>>> fbb939f476624b4ba3b451d60632c7728c793f12

            if(choice.equals("y")){
                System.out.println("Great! Let's get started.\n");
                break;
            }
            else if(choice.equals("n")){
                System.out.println("Come back next time, " + name + ".");
                System.exit(1);
                }
            else{
                System.out.println("Invalid response. Try again.");
            }
        }
        System.out.println("Order selection");
        System.out.println("---------------\n");
		if(cups == 1){
			System.out.println("There is "+cups+" coffee cup in stock and each costs $2.00.");
		}
		else{
			System.out.println("There are "+cups+" coffee cups in stock and each costs $2.00.");

		}
		if(shots == 1){
			System.out.println("There is "+shots+" coffee shot in stock and each costs $1.00.\n");
		}
        else{
			System.out.println("There are "+shots+" coffee shots in stock and each costs $1.00.\n");

		}

        System.out.print("How many cups of coffee would you like? ");
        int userCup = keyboard.nextInt();
		System.out.println("");
        if(userCup == 0){
            System.out.println("No cups, no coffee. Goodbye.");
            return;
        }
        else if(userCup > cups){
            System.out.println("Not enough stock. Come back later.");
            return;
        }
        else if(userCup < 0){
            System.out.println("Does not compute. System terminating.");
            return;
        }
        int[] userShots = new int[userCup];
        int sum = 0;
        int i = 0;
        while(i < userCup){
            System.out.print("How many coffee shots in cup " + (i+1) + "? ");
            userShots[i] = keyboard.nextInt();
            if(userShots[i]<0){
                System.out.println("Does not compute. Try again.");
                continue;
            }

            if((sum + userShots[i]) > shots){
				if((shots - sum)==1){
					System.out.println("There is only " + (shots - sum) + " coffee shot left. Try again.");
				}
				else{
                	System.out.println("There are only " + (shots - sum) + " coffee shots left. Try again.");
				}
				continue;
            }
            sum += userShots[i];
            i++;
        }

        System.out.println("\nOrder summary\n-------------\n");
        double price = 0;
		i = 0;
        while(i < userCup){
			String appendix = "s";
            price = price + 2 + userShots[i];
			if(userShots[i]==1){
				appendix = "";
			}
            System.out.println("Cup "+ (i+1) +" has " + userShots[i] + " shot"+ appendix + " and will cost $" +(2+userShots[i])+".00");
        	i++;
			appendix = "s";
		}



        while(true){

			if(userCup == 1){
            	System.out.printf("\n"+ userCup +" coffee to purchase.\nPurchase price is $%.2f\nProceed to payment? (y/n) ",price);
			}
			else{
				System.out.printf("\n"+ userCup +" coffees to purchase.\nPurchase price is $%.2f\nProceed to payment? (y/n) ",price);
			}
			choice = keyboard.next();

			if(choice.equals("y")){
				break;
			}
			else if(choice.equals("n")){
				System.out.println("Come back next time, " + name + ".");
				System.exit(1);
			}
			else{
				System.out.println("Invalid response. Try again.");
			}
        }

        double constPrice = price;
        System.out.println("\nOrder payment\n-------------\n");
<<<<<<< HEAD
        while(true){
=======
        while(price > 0){
>>>>>>> fbb939f476624b4ba3b451d60632c7728c793f12

            System.out.printf("$%.2f remains to be paid. Enter coin or note: ",price);
            String cashOrCoins = keyboard.next();
            //$100.00, $50.00, $20.00, $10.00, $5.00, $2.00, $1.00, $0.50, $0.20, $0.10 and $0.05.
            if(!((cashOrCoins.equals("$100.00"))||(cashOrCoins.equals("$50.00"))||(cashOrCoins.equals("$20.00"))||(cashOrCoins.equals("$10.00"))||(cashOrCoins.equals("$5.00"))||(cashOrCoins.equals("$2.00"))||(cashOrCoins.equals("$1.00"))
            ||(cashOrCoins.equals("$0.50"))||(cashOrCoins.equals("$0.20"))||(cashOrCoins.equals("$0.10"))||(cashOrCoins.equals("$0.05")))){
                System.out.println("Invalid coin or note. Try again.");
                continue;
<<<<<<< HEAD

            }
			cashOrCoins = cashOrCoins.substring(0,0)+' '+cashOrCoins.substring(1);
			double paid = Double.parseDouble(cashOrCoins.trim());
            price -= paid;
			if(price < 0.01 && price > -0.01){
				System.out.printf("\nYou gave $%.2f\nPerfect! No change given.", constPrice - price);
				break;
=======

            }
			cashOrCoins = cashOrCoins.substring(0,0)+' '+cashOrCoins.substring(1);
			double paid = Double.parseDouble(cashOrCoins.trim());
            price -= paid;
			if(price < 0.01 && price > 0){
				System.out.printf("You gave $%.2f\nPerfect! No change given.", constPrice - price);

			}
			else if(price < 0){
                System.out.printf("You gave $%.2f\nYour change:\n", constPrice - price);
                double[] cashes = new double[]{100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05};
                double remainder = -price;
                for(int k = 0; k <11; k ++){
                    int myNumber = (int)(remainder/cashes[k]);
                    if(myNumber == 0){
                        continue;
                    }
                    else{
                        System.out.printf(myNumber+" x "+"$"+"%.2f\n",cashes[k]);
						remainder %= cashes[k];
                    }
                }

			}
			System.out.println("\nThank you, " + name + ".\nSee you next time.");
            System.exit(0);
		}
		/*$4.00 remains to be paid. Enter coin or note: $100.00
You gave $100.00
Your change:
1 x $50.00
2 x $20.00
1 x $5.00
1 x $1.00
Thank you, Scott.
See you next time.
*/


        }
>>>>>>> fbb939f476624b4ba3b451d60632c7728c793f12

			}
			else if(price < 0){
                System.out.printf("\nYou gave $%.2f\nYour change:\n", constPrice - price);
                double[] cashes = new double[]{100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05};
                double remainder = - 100*price;
                for(int k = 0; k <11; k ++){
                    int myNumber = (int)remainder/(int)((cashes[k]*100)-1);
                    if(myNumber == 0){
                        continue;
                    }
                    else{
                        System.out.printf(myNumber+" x "+"$"+"%.2f\n",cashes[k]);
						remainder = remainder - myNumber * cashes[k] * 100;
                    }
                }
				break;

			}

<<<<<<< HEAD
		}
		System.out.println("\nThank you, " + name + ".\nSee you next time.");
        System.exit(0);
    }
=======
>>>>>>> fbb939f476624b4ba3b451d60632c7728c793f12
}
