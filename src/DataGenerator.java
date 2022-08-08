import Balance.Balance;
import Balance.CustomerBalance;
import Discount.Discount;
import Product.Product;
import catagory.Category;
import catagory.Electronic;
import catagory.Furniture;
import Balance.GiftCard;
import Discount.AmountBAsedDiscount;
import Discount.RateBased;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

   public static void createCustomer(){

       Address address1Customer1 = new Address("7925","jones branch drive","Suite 33030","23310","VA");
       Address address2Customer1 = new Address("792335","jones","Suite 3s300","21110","VA");
       Address address1Customer3 = new Address("7925","jones branch","Suite 3300d","215550","VA");

       ArrayList<Address> customer1AddressList = new ArrayList<>();

       customer1AddressList.add(address1Customer1);
       customer1AddressList.add(address2Customer1);

       Customer customer1 = new Customer(UUID.randomUUID(),"Kramer","brwonkramer63@gmail.com",customer1AddressList);
       Customer customer2 = new Customer(UUID.randomUUID(),"ozzy","ddd@cydeo.com");
       StaticConstants.CUSTOMER_LIST.add(customer1);
       StaticConstants.CUSTOMER_LIST.add(customer2);




   }

   public static void createCategory(){
       Category category1 = new Electronic(UUID.randomUUID(),"ELectronic");
       Category category2 = new Furniture(UUID.randomUUID(),"Furniture");

   }

   public static void createProduct(){

       Product product1 = new Product(UUID.randomUUID(),"PS4",400,7,4,UUID.randomUUID());//should be staticconstants.categorylist.get0.getid

       

   }

   public static void createBalance(){

       Balance customerBalance1 = new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(),30.33);
       Balance customerBalance2giftcard = new GiftCard(StaticConstants.CUSTOMER_LIST.get(1).getId(),30.33);

   }

   public static void createDiscount(){

       Discount amountBaseddiscount = new AmountBAsedDiscount(UUID.randomUUID(),"kramer",240.00);

       Discount Ratebaseddiscount = new RateBased(UUID.randomUUID(),"ozzy",340.00,15.00    );

   }



}
