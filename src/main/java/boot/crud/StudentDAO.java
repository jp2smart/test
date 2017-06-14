package boot.crud;

import boot.crud.Student;
 
public interface StudentDAO {
 
    public void delete(Integer studentId);
 
    public void update(Student student);
 
    public Student get(int studentId);
    
    public void insert(Student student);

}
