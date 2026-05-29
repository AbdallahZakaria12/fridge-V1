import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    static ArrayList<FridgeItem> fridge = new ArrayList<>();
    public static void AddItem(){
        System.out.println("Please enter the items as: Name,quantity");
        Scanner add = new Scanner(System.in);
        String ItemName=add.nextLine();
        int quantity=add.nextInt();
        FridgeItem item = new FridgeItem();
        item.name=ItemName;
        item.quantity=quantity;
        fridge.add(item);

    }
    public static void ShowItem(){
        if(fridge.size()==0)
            System.out.println("The fridge is empty :( ");
        for(int i=0; i<fridge.size(); i++)
        {
            FridgeItem current = fridge.get(i);
            System.out.println(" Name : "+ current.name +"   Quantity : "+ current.quantity);

        }
    }
    public static void RemoveItem(){
        Scanner remove = new Scanner(System.in);
        String item=remove.nextLine();
        boolean found=false;
        for(int i = 0; i<fridge.size();i++)
        {
            FridgeItem current = fridge.get(i);
            if(current.name.equalsIgnoreCase(item)) {
                fridge.remove(i);
                System.out.println("Item removed Successfully");
                found=true;
                break;
            }
        }
        if(!found)
            System.out.println("Item not found");

    }
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        int op=0 ;
        while(op!=4){
        System.out.println("---Menu---");
        System.out.println("1. Add Item\n" +
                "2. Remove Item\n" +
                "3. Show Items\n" +
                "4. Exit");
        op = s.nextInt();
        if (op == 1)
            AddItem();
        else if (op==2)
            RemoveItem();
        else if (op == 3)
            ShowItem();
        else if (op == 4)
            System.out.println("Thanks for using my application :) ");
    }
}
}