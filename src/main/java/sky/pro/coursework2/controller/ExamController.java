package sky.pro.coursework2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.coursework2.model.Question;
import sky.pro.coursework2.service.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    // возвращает список вопросов-ответов
    @GetMapping("/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable(name = "amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
