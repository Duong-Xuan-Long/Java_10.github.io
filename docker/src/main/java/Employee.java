import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    private int id;
    private String fullName;
    private Date dob;
    private String gender;
    private String mobile;
    private String address;
    private String status;
    private Date createAt;
    private String position;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", createAt=" + createAt +
                ", position='" + position + '\'' +
                '}';
    }
}
