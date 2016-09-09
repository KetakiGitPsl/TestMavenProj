package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.psl.entity.Employee;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployeeDAO {
	
	/*private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}*/

	public List<Employee> getAllEmployees() {
		return getJdbcTemplate().query("select * from employee",
				new RowMapper<Employee>(){

			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				return e;
			}
			
		});
	}

	public void addEmployee(Employee e) {
		System.out.println("In dao addEmployee");
		String sql = "insert into employee (id, name) values (" + e.getId() + ", '" + e.getName() + "')";      
		getJdbcTemplate().update(sql);

	}

	
	
	
	
	
	
	
	
	
	
	
}
