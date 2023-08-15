package sky.pro.coursework2.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sky.pro.coursework2.service.ExaminerServiceImpl;
import sky.pro.coursework2.service.QuestionService;

@ExtendWith(MockitoExtension.class)
public class ExamControllerTest {
    @Mock
    QuestionService question;

    @InjectMocks
    ExaminerServiceImpl examiner;

    /*@BeforeEach
    void init() {
        when(employeeService.findAll()).thenReturn(EMPLOYEES);
    }*/
}
