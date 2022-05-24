public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String ders;
    int not;

    public Course(String name, String code, String ders) {
        this.name = name;
        this.code = code;
        this.ders = ders;
        this.not = 0;
    }

    public void addTeacher(Teacher teacher){
        if(this.ders.equals(teacher.ders)){
            this.courseTeacher = teacher;
            System.out.println("İşlem Başarılı");
        }else {
            System.out.println(teacher.name + "Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher(){
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
