import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CustomerService {
    //chuyen json sang mang
    public void getCustomerArray() {
        Gson gson = new Gson();


        Customer[] arraycustomer = null;
        try {
            FileReader fileReader = new FileReader("MOCK_DATA.json");
            //dua file vao array
            arraycustomer = gson.fromJson(fileReader, Customer[].class);

        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        }
        for (Customer c : arraycustomer) {
            System.out.println(c);
        }
    }
}
