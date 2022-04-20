import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
//        String json="{\"id\":1,\"first_name\":\"Edeline\",\"last_name\":\"Nortunen\",\"email\":\"enortunen0@narod.ru\",\"gender\":\"Female\"}";
//
//        Gson gson=new Gson();
//        Customer customer=gson.fromJson(json,Customer.class);
////        Type obJectype=new TypeToken.
//        System.out.println(customer.getId()+" - "+customer.getFirstName()+" - "+customer.getLastName());
//
//            Customer newCustomer=new Customer(1,"A","b","a@gmail.com","male");
//            String jsonCustomer= gson.toJson(newCustomer);
//        System.out.println(jsonCustomer);
        CustomerService cs=new CustomerService();
        cs.getCustomerArray();
    }
}
