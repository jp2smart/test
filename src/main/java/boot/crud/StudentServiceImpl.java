package boot.crud;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
 
    @Autowired
    private StudentDAO studentDAO;
 
    @Override
    @Transactional
    public void insert(Student student) {
        studentDAO.insert(student);
    }
 
    @Override
    @Transactional
    public void delete(Integer studentId) {
        studentDAO.delete(studentId);
    }
 
    public Student get(int empid) {
        return studentDAO.get(empid);
    }
 
    public void update(Student student) {
        // TODO Auto-generated method stub
         studentDAO.update(student);
    }
 
    public void setstudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
 
}
