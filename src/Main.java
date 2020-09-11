package transformers.java;

public class Main {

    public static void main(String[] args) {
        private static Scanner scan = new Scanner(System.in);
        private static GroceryList groceryList= new GroceryList();

        public static void main(String[] args) {
            // write your code here
            int choice=0;
            boolean quit=false;
            printInstructions();
            System.out.println(System.out);
            while(!quit){
                System.out.println("Enter your choice: ");
                choice=scan.nextInt();
                scan.nextLine();
                switch (choice){
                    case 0:
                        printInstructions();
                        break;
                    case 1:
                        groceryList.printGroceryList();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        searchItem();
                        break;
                    case 6:
                        processArrayist();
                    case 7:
                        quit=true;
                        break;
                }
            }
        }
        public static void printInstructions(){
            System.out.println("\n Press ");
            System.out.println("0-To print choice options");
            System.out.println("1-To print the list of Grocery items");
            System.out.println("2-To add an item to the list");
            System.out.println("3-To modify an item from the List");
            System.out.println("4-To remove an item from the list");
            System.out.println("5-To search from an item from the list");
            System.out.println("6-To quit");
        }
        public static void addItem(){
            System.out.println("PLease enter the grocery item that you want to add");
            groceryList.addGroceryItem(scan.nextLine());
        }
        public static void modifyItem(){
            System.out.println("Enter item name ");
            String itemName=scan.nextLine();
            System.out.println("Enter replacement item name:");
            String newItem= scan.nextLine();
            //System.out.println("bla bla");
            groceryList.modifyGroceryItem(itemName,newItem);

        }
        public static void removeItem(){
            System.out.println("Enter item name ");
            String itemName=scan.next();
            scan.nextLine();
            groceryList.removeGroceryItem(itemName);
        }
        public static void searchItem(){
            System.out.println("Enter item name to search for:");
            String itemName = scan.nextLine();
            if(groceryList.onFile(itemName)) {
                System.out.println("Found "+itemName+"in the grocery list");
            }else{
                System.out.println(itemName+" not found in the list");
            }
        }
        public static void processArrayist(){
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(groceryList.getGroceryList());
        }
    }
}
