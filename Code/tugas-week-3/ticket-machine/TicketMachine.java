public class TicketMachine

{
    private int price; 

    private int balance;

    private int total;



    /**

     * Constructor for objects of class TicketMachine

     */

    public TicketMachine(int inputPrice)

    {

        if(inputPrice > 0){

            this.price = inputPrice;

        } else {

            this.price = 20;

        }

        this.balance = 0;

        this.total = 0;

    }

    public int getBalance()

    {

        return balance;

    }

    
    public int getPrice()

    {

        return price;

    }

    

    public void insertMoney(int amount)

    {

        if(amount > 0){

            balance = balance + amount;

        }else{

            System.out.println("Use a positive amount: " + amount);

        }

    }

    

    public void print()

    {

        if(balance >= price) {

            System.out.println("#######################");

            System.out.println("# The BlueJ Line");

            System.out.println("# Ticket");

            System.out.println("# " + this.price + " cents.");

            System.out.println("#######################");

            System.out.println();


            total = total + price;

            balance -= price;

        } else {

            System.out.println("You must insert at least: " + 

            (this.price - this.balance) + " more cents.");

        }

    }

}

