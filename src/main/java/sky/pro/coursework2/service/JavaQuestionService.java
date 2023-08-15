package sky.pro.coursework2.service;

import org.springframework.stereotype.Service;
import sky.pro.coursework2.exceptions.QuestionAlreadyExistsException;
import sky.pro.coursework2.exceptions.QuestionNotFoundException;
import sky.pro.coursework2.model.Question;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JavaQuestionService implements QuestionService {
    private Set<Question> questions = new HashSet<>();

    public Question add(String question, String answer) {
        return add(new Question(question, answer));
    }

    public Question add(Question question) {
        if (questions.add(question)) {
            return question;
        }
        throw new QuestionAlreadyExistsException("Такой вопрос уже есть в хранилище");
    }

    public Question remove(Question question) {
        if (questions.remove(question)) {
            return question;
        }
        throw new QuestionNotFoundException("Запрашиваемый вопрос не найден");
    }

    public Collection<Question> getAll() {
        return questions.stream()
                .collect(Collectors.toUnmodifiableList());
        //return Collections.unmodifiableSet(questions);
    }

    public Question getRandomQuestion() {
        if (questions.isEmpty()) {
            System.out.println("Хранилище не содержит вопросов");
            return null;
        }
        Random random = new Random();
        int index = random.nextInt(questions.size());
        ArrayList<Question> list = new ArrayList<>(questions);
        return list.get(index);
    }
}
