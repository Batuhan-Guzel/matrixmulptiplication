public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut hoca", "505","TRH" );
        Teacher t2 = new Teacher("Volkan hoca", "555","EEE");
        Teacher t3 = new Teacher("Şeyman hoca","534","BIO");



        Course phyQuiz = new Course("Tarih", "101","TRH");
        phyQuiz.addTeacher(t1);

        Course phyExam = new Course("elekt","102", "EEE");
        phyExam.addTeacher(t2);



        Student s1 = new Student("Batu", "400", "12-F",phyQuiz,phyExam);
        s1.addBulkExamNote(60,90);
        s1.isPass();
        s1.printNote();



    }
}
