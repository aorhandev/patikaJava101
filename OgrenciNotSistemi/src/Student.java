public class Student {
    String name;
    String okulNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name, String okulNo, String classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.okulNo = okulNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.classes= classes;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.not = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.not = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.not = kimya;
        }
    }

    public void isPass() {
        if (this.mat.not == 0 || this.fizik.not == 0 || this.kimya.not == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.not + this.kimya.not + this.mat.not) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.not);
        System.out.println("Fizik Notu : " + this.fizik.not);
        System.out.println("Kimya Notu : " + this.kimya.not);
    }
}
