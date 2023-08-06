package sky.pro.coursework2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.coursework2.service.JavaQuestionService;

@RestController
@RequestMapping("/exam")
public class JavaQuestionController {
    private final JavaQuestionService service;

    public JavaQuestionController(JavaQuestionService service) {
        this.service = service;
    }

    // возвращает список случайных вопросов-ответов
    @GetMapping("/get/random")
    public Integer getRandom(@RequestParam("firstName") Integer amount) {
        return service.getRandomQuestion();
    }
}
