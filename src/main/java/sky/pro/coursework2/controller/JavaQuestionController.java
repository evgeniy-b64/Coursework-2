package sky.pro.coursework2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.coursework2.model.Question;
import sky.pro.coursework2.service.JavaQuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    private final JavaQuestionService service;

    public JavaQuestionController(JavaQuestionService service) {
        this.service = service;
    }

    // возвращает список случайных вопросов-ответов
    @GetMapping("/get/random")
    public Question getRandom() {
        return service.getRandomQuestion();
    }

    // позволяет добавить новый вопрос
    @GetMapping("/java/add")
    public Question add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return service.add(question, answer);
    }

    // позволяет удалить вопрос из хранилища
    @GetMapping("/java/remove")
    public Question remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return service.remove(new Question(question, answer));
    }

    // позволяет получить полный список вопросов из хранилища
    @GetMapping("/java/getall")
    public Collection<Question> getAll() {
        return service.getAll();
    }

}
