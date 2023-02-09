package JavaBaiscs.advance;
import lombok.Data;
import org.apache.commons.lang3.builder.CompareToBuilder;

@Data
public class Employee implements Comparable<Employee>{
    int age;
    String name;
    String lastname;
    String city;
    public  Employee(int age, String name, String lastname, String city){
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.city = city;
    }

    public int compareTo(Employee emp){
        if(emp == null){
            return -1;
        }
        CompareToBuilder cBuilder = new CompareToBuilder();
        return cBuilder.append(this.age, emp.age).append(this.lastname, emp.lastname).toComparison();
    }


}
