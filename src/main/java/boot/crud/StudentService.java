package boot.crud;

public interface StudentService {
    
 
    public void delete(Integer studentId);
 
    public Student get(int studentid);
 
    public void update(Student student);
    
    public void insert(Student student);

}
