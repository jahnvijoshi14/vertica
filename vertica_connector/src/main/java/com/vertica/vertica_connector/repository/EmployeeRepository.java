package com.vertica.vertica_connector.repository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.vertica.vertica_connector.entity.Employee;

// public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//     // Custom query method to find employee by ID
//     // Optional<Employee> findById(Long id);
// }

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplateOne;
    
    

    
    public int save(Employee employee) {

        
        return jdbcTemplateOne.update(
                "insert into engineering.employee (id,name) values(?,?)",
                employee.getId(),employee.getName());
    }

    public long getId()
    {
      return jdbcTemplateOne.queryForObject("select id from engineering.employee order by id desc limit 1", Long.class);

    }

    public List<Employee> findAll() {
        return jdbcTemplateOne.query("select * from engineering.employee",
        (rs, rowNum) ->
                        new Employee(
                                rs.getLong("id"),
                                rs.getString("name")
                                
                        ));
    }


    // public List < Employee > isData() {

    //     List < Employee > customers = new ArrayList <  > ();

    //     List < Map < String, Object >> rows = jdbcTemplateOne.queryForList("SELECT * FROM engineering.employee");

    //     for (Map < String, Object > row: rows) {
    //         Customer customer = new Customer();

    //         customer.setCustNo((int) row.get("Cust_id"));
    //         customer.setCustName((String) row.get("Cust_name"));
    //         customer.setCountry((String) row.get("Country"));

    //         customers.add(customer);
    //     }

    //     return customers;

    // }

    // public String dsVerification() {

    //     String status = "";

    //     String query = jdbcTemplateTwo.queryForObject("SELECT COUNT(*) FROM DUAL;", String.class);

    //     if (query.equals("1")) {
    //         status = "Datasource connection successful..!";
    //     } else {
    //         status = "Datasource connection failed..!";
    //     }

    //     return status;

    // }
}
