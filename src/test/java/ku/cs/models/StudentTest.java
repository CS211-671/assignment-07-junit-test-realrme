package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test @DisplayName("ทดสอบการเพิ่มคะแนน 50.5 คะแนน")
    void testAddScore(){
        Student s1 = new Student("6610450048", "Army");
        assertEquals(0, s1.getScore());
        s1.addScore(50.5);
        assertEquals(50.5, s1.getScore());
    }

    @Test @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName(){
        Student s1 = new Student("6610450048", "Army");
        s1.changeName("ArmyLnwza");
        assertEquals("ArmyLnwza", s1.getName());
    }

    @Test @DisplayName("ทดสอบ Getter")
    void testGetter(){
        Student s1 = new Student("6610450048", "Army");
        assertEquals("6610450048", s1.getId());
        assertEquals("Army", s1.getName());
        assertEquals(0, s1.getScore());
    }

    @Test @DisplayName("ทดสอบเกรด")
    void testGrade(){
        Student s1 = new Student("6610450048", "Army");
        s1.addScore(80.5);
        assertEquals("A", s1.grade());
    }

    @Test @DisplayName("ทดสอบ ID")
    void testIsID(){
        Student s1 = new Student("6610450048", "Army");
        assertTrue(s1.isId("6610450048"));
    }
}