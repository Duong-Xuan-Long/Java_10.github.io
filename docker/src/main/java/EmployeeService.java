import java.sql.*;
import java.util.ArrayList;

public class EmployeeService {

    ConnectJDBC connectJDBC;
    public EmployeeService(){
        connectJDBC=new ConnectJDBC();
    }

    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> list=new ArrayList<>();
        Connection connection=connectJDBC.connect();

        String query="SELECT* FROM employee";
        Statement stm=null;

        try {
            //tao doi tuong
            stm=connection.createStatement();
            ResultSet result= stm.executeQuery(query);

            while(result.next()){
                int id=result.getInt("id");
                String fullName=result.getString("full_name");
                Date dob=result.getDate("dob");
                String gender=result.getString("gender");
                String mobile=result.getString("mobile");
                String address=result.getString("address");
                String status=result.getString("status");
                Date createAt=result.getDate("create_at");
                String position=result.getString("position");
                list.add(new Employee(id, fullName, dob, gender, mobile, address,
                        status, createAt, position));

            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<Employee> getEmployeeByGender(String gender){
        ArrayList<Employee> list=new ArrayList<>();
        Connection conn= connectJDBC.connect();
        String query="SELECT * FROM `employee` WHERE gender=?";
        PreparedStatement pstm=null;

        try {
            pstm=conn.prepareStatement(query);
            //gan gia tri cho tham so
            pstm.setString(1,gender);

            ResultSet result=pstm.executeQuery();
            while(result.next()){
                int id=result.getInt("id");
                String fullName=result.getString("full_name");
                Date dob=result.getDate("dob");
                String gender1=result.getString("gender");
                String mobile=result.getString("mobile");
                String address=result.getString("address");
                String status=result.getString("status");
                Date createAt=result.getDate("create_at");
                String position=result.getString("position");
                list.add(new Employee(id, fullName, dob, gender1, mobile, address,
                        status, createAt, position));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addEmployee(){
        Connection conn= connectJDBC.connect();

        String query="INSERT INTO `employee`(`id`, `full_name`, `dob`, `gender`, `mobile`, `address`, `status`, `create_at`, `position`) VALUES (123456789,'Ngoc','1996-08-19','female','0123456789','Ha giang','active',NOW(),'Nhan vien')";
        try {
            Statement stm=conn.createStatement();
            int row=stm.executeUpdate(query);
            if(row!=0){
                System.out.println("Thêm thành công");
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public void addEmployee(Employee employee){
        Connection conn = connectJDBC.connect();

        String query = "INSERT INTO `employee`(`id`, `full_name`, `dob`, `gender`, `mobile`, `address`, `status`, `create_at`, `position`) " +
                "VALUES (?,?,?,?,?,?,?,NOW(),?)";

        try {
            PreparedStatement stm = conn.prepareStatement(query);

            stm.setInt(1, employee.getId());
            stm.setString(2, employee.getFullName());
            stm.setDate(3, employee.getDob());
            stm.setString(4, employee.getGender());
            stm.setString(5, employee.getMobile());
            stm.setString(6, employee.getAddress());
            stm.setString(7, employee.getStatus());
            stm.setString(8, employee.getPosition());

            int row = stm.executeUpdate();
            if(row != 0){
                System.out.println("Thêm thành công");
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        public void upDatePostion(String newPosition,int id){
            Connection conn= connectJDBC.connect();
            String query="UPDATE `employee` SET `position`=? WHERE id=?";
            try {
                PreparedStatement pstm= conn.prepareStatement(query);
                pstm.setString(1,newPosition);
                pstm.setInt(2,id);
                int row= pstm.executeUpdate();
                if(row != 0){
                    System.out.println("Thêm thành công");
                }
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        public void Delete(int id){
        Connection con= connectJDBC.connect();
        String query="DELETE FROM `employee` WHERE id=?";
            try {
                PreparedStatement p= con.prepareStatement(query);
                p.setInt(1,id);
                int row=p.executeUpdate();
                if(row!=0){
                    System.out.println("sucessful!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public void show(ArrayList<Employee> list){
        list.forEach(i-> System.out.println(i.toString()));
    }
}
