import com.google.common.eventbus.EventBus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GuavaObserverTest {

    public static void main(String[] args) {

        EventBus bus = new EventBus();
        GuavaObserver observer = new GuavaObserver();
        bus.register(observer);
        Question question = new Question();
        question.setStuName("张三");
        question.setTeacherName("Tom");
        question.setContent("未来的IT行业，哪个产品会发展比较好？");
        question.setPublishTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        bus.post(question);
    }
}
