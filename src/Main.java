import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DataGenerator.createCustomer();
//        createProduct();
        DataGenerator.createCategory();
        DataGenerator.createDiscount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select customer: ");
        for (int i = 0; StaticConstants.CUSTOMER_LIST.size() > i; i++) {
            System.out.println("type " + i + " for customer:" + StaticConstants.CUSTOMER_LIST.get(i).getUserName());
        }

        Customer customer = StaticConstants.CUSTOMER_LIST.get(scanner.nextInt());

        while (true) {

            System.out.println("what would you like to do? just type id for selection");

            for (int i = 0; i <prepareMEnuOptions().length ; i++) {
                System.out.println(i+" "+prepareMEnuOptions()[i]);
            }

            int menuselection = scanner.nextInt();
        }
    }
    private static String[] prepareMEnuOptions(){
               return new String[]{
                       "list categories","List products","list discounts","See balance","add balance"
               };
        }


    }

