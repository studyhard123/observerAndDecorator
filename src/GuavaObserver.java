import com.google.common.eventbus.Subscribe;

public class GuavaObserver {

    @Subscribe
    public void noticeTeacher(Question question){
        System.out.println(question.getStuName() + "在" + question.getPublishTime() + "向" + question.getTeacherName() + "提出一个问题，问题的内容是：" + question.getContent());
    }
}
