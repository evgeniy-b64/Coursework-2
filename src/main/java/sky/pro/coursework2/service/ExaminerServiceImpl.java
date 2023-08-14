package sky.pro.coursework2.service;

import org.springframework.stereotype.Service;
import sky.pro.coursework2.exceptions.TooManyQuestionsRequestedException;
import sky.pro.coursework2.model.Question;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService service;

    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > service.getAll().size())
            throw new TooManyQuestionsRequestedException("Запрошено слишком большое количество вопросов");
        return Stream.generate(service::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toUnmodifiableList());
    }
}
