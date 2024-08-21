package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบเพิ่มนักเรียน")
    void testAddStudent() {
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610450048", " Matoom");
        s1.addNewStudent("6610455555", " Army", 50.0);
        assertEquals("6610450048", s1.findStudentById("6610450048").getId());
        assertEquals("Matoom", s1.findStudentById("6610450048").getName());
        assertEquals(50.0, s1.findStudentById("6610455555").getScore());
    }

    @Test @DisplayName("ทดสอบหานักเรียน")
    void testFindStudentByID(){
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610450048", " Army");
        assertEquals("Army", s1.findStudentById("6610450048").getName());
    }

    @Test @DisplayName("เพิ่มคะแนนด้วย ID")
    void testGiveScoreToId(){
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610450048", " Army");
        s1.giveScoreToId("6610450048", 80.0);
        assertEquals(80.0, s1.findStudentById("6610450048").getScore());
    }

    @Test @DisplayName("ทดสอบดูเกรดจาก ID")
    void testViewGradeOfId(){
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610450048", " Army");
        s1.giveScoreToId("6610450048", 81.0);
        assertEquals("A", s1.findStudentById("6610450048").grade());
    }

    @Test @DisplayName("ทดสอบ Getter")
    void testGetter(){
        StudentList s1 = new StudentList();
        s1.addNewStudent("6610450048", " Army");
        assertEquals("Army", s1.getStudents().get(0).getName());
    }
}