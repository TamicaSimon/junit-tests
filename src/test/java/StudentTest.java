import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    private Student student;

    @Before
    public void setUp() {
        student = new Student("First Last", 111222333444L);
    }

    @Test
    public void testInputNameId() {
        assertEquals("First Last", student.getName());
        assertEquals(111222333444L, student.getId());
        assertEquals(new ArrayList<Integer>(), student.getGrades());
    }

    @Test
    public void


}
