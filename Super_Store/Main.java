
import java.util.*;
import module.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Login> users = new ArrayList<>();
        ArrayList<Profile> profile = new ArrayList<>();
        ArrayList<Payment> payment_list=new ArrayList<>();
        TreeMap<String, Item> item = new TreeMap<>();
        int noprofile = 0;
        System.out.println("1->Login 2->Register 3->Exit\n Enter your choice");
        int choice = sc.nextInt();
        while (!(choice >= 3)) {
            if (choice == 1) {
                System.out.println("Enter the username");
                String username = sc.next();
                System.out.println("Enter the password of the user");
                String password = sc.next();
                Login l = new Login();
                String loginop = l.auth(username, password, users);
                String[] status = loginop.split(" ");
                if (status[0].equals("1")) {
                    System.out.println("1->get_profile 2->order_Item 3-> Payment 4->Inventory Management");
                    int user_op = sc.nextInt();
                    switch (user_op) {
                        case 1:
                            Profile pp = new Profile();
                            System.out.println("Fetching Datas of the users");
                            System.out.println(pp.get_profile(username, status[1], profile));
                            break;
                        case 2:
                            System.out.println("User Ordering a Item");
                            System.out.println(" give the name and quantity of item seperated by space");
                            String item_name = sc.next();
                            int quant = sc.nextInt();
                            Item it = new Item();
                            it.order(username,item_name, quant, item,payment_list);
                            break;

                        case 3:
                            System.out.println("Paymant successful");
                            System.out.println("Please enter the customer name,item u ordered,quantity,amount");
                          String custname=sc.next();
                          String itemname=sc.next();
                          int qu=sc.nextInt();
                          int amt=sc.nextInt();
                          Payment po=new Payment();
                          po.make_payment(custname,itemname,qu,amt,payment_list);
                            break;
                        case 4:
                            System.out.println("1-> Adding new Item 2-> Adding stocks to the inventory");
                            int item_add = sc.nextInt();
                            if (item_add == 1) {
                                System.out.println("Enter the details of the new Stock itemname, quantity, price, avalcount");
                                String itemname1 = sc.next();
                                int quantity = sc.nextInt();
                                int price = sc.nextInt();
                                int avalcount = sc.nextInt();
                                Item new_item = new Item(itemname1, quantity, price, avalcount);
                                item.put(itemname1, new_item);
                            } else if (item_add == 2) {
                                System.out.println("Enter the name of the items stock u are going to add");
                                String itemname2 = sc.next();
                                System.out.println("Enter the number of items ur going to add");
                                int count_num = sc.nextInt();
                                item.get(itemname2).avalcount += count_num;
                            }
                            break;

                        default:
                            System.out.println("Login again to continue the process");

                    }

                } else {
                    System.out.println("You must login to use these features If you dont have an account create one using register");
                }

            } else if (choice == 2) {
                System.out.println("Enter the username");
                String username = sc.next();
                System.out.println("Enter the password of the user");
                String password = sc.next();
                System.out.println("Enter the password again to confirm");
                String confirmpass = sc.next();
                System.out.println("Enter the role");
                if (!password.equals(confirmpass)) {
                    System.out.println("The re entered password is wrong");
                    return;
                }
                String role = sc.next();
                users.add(new Login(username, password, role));
                profile.add(new Profile(noprofile++, username, password, role));

            } else {
                return;

            }
            choice = sc.nextInt();
        }
    }
}
