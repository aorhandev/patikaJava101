public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali", "0537", "Mat");
        Teacher t2 = new Teacher("Veli", "0537", "Fzk");
        Teacher t3 = new Teacher("Zeki", "0537", "Kmy");

        Course matematik = new Course("Matematik", "101", "Mat");
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "Fzk");
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "103", "Kmy");
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", matematik, fizik, kimya  );
        s1.addBulkExamNote(100,70,50);
        s1.isPass();


        Student s2 = new Student("Güdük Necmi", "123", "4", matematik, fizik, kimya  );
        s2.addBulkExamNote(30,50,40);
        s2.isPass();



    }
}
