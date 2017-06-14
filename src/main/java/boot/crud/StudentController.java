package boot.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import boot.crud.Student;  

@RestController
public class StudentController {
 
    
 
    public StudentController() {
        System.out.println("StudentController()");
    }
 
    @Autowired
    private StudentService studentService;
 
    
 
 
    @RequestMapping(value = "/get")
    public Student get(@RequestParam("id") int id) {
        Student employee = studentService.get(id);
        return employee;
    }
    
    @RequestMapping(value = "/add")
    public String add(@RequestParam Map<String,String> requestParams) {
        Student employee = new Student();
        employee.setFirstname(requestParams.get("firstname"));
        employee.setLastname(requestParams.get("lastname"));
        employee.setGrade(requestParams.get("grade").charAt(0));
        employee.setCourseid(Integer.parseInt(requestParams.get("courseid")));
        employee.setYearjoined(Integer.parseInt(requestParams.get("yearjoined")));
        employee.setZipcode(Integer.parseInt(requestParams.get("zipcode")));
        studentService.insert(employee);
        return "Added Successfully";
    }
    
    @RequestMapping(value = "/update")
    public String update(@RequestParam Map<String,String> requestParams) {
    	 Student employee = new Student();
         employee.setStudentid(Integer.parseInt(requestParams.get("id")));
         employee.setFirstname(requestParams.get("firstname"));
         employee.setLastname(requestParams.get("lastname"));
         employee.setGrade(requestParams.get("grade").charAt(0));
         employee.setCourseid(Integer.parseInt(requestParams.get("courseid")));
         employee.setYearjoined(Integer.parseInt(requestParams.get("yearjoined")));
         employee.setZipcode(Integer.parseInt(requestParams.get("zipcode")));
        studentService.update(employee);
        return "Updated Successfully";
    }
    
    @RequestMapping(value = "/delete")
    public String delete(@RequestParam("id") int id) {
        studentService.delete(id);
        return "Deleted Successfully";
    }
 
}
