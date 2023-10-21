package OOPS.comparing;

//interfaces
public class Student implements Comparable<Student>{
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }
    public int compareTo(Student o){
        int diff = (int)(this.marks-o.marks);

        //if diff is 0 both are equal if dif is greater than 1 then this is greater
        //else o is greater
        return diff;
    }
}
