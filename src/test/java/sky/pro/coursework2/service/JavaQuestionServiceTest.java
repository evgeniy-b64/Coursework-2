package sky.pro.coursework2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sky.pro.coursework2.model.Question;

import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceTest {
    JavaQuestionService service = new JavaQuestionService();
    final static Question question1 = new Question("question1", "answer1");
    final static Question question2 = new Question("question2", "answer2");


    @BeforeEach
    void init() {
        service.add(question1);
        service.add(question2);
    }

    @Test
    void addMethodTest() {
        assertEquals(2, service.getAll().size());
        assertTrue(service.getAll().contains(question1));
        assertTrue(service.getAll().contains(question2));
    }

    @Test
    void removeMethodTest() {
        service.remove(question1);
        assertEquals(1, service.getAll().size());
        assertFalse(service.getAll().contains(question1));
    }
}
