import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    String guerry = "kkk";

    @Test
    public void simpleTaskMatchesTrue() {
        SimpleTask simpleTask = new SimpleTask(12, "Название");
        boolean actual = simpleTask.matches("Название");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void simpleTaskMatchesFalse() {
        SimpleTask simpleTask = new SimpleTask(12, "Название");
        boolean actual = simpleTask.matches(guerry);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void epicMatchesTrue() {
        String[] subtasks = {"Название", "kkk", "someoneelse"};
        Epic epic = new Epic(12, subtasks);
        boolean actual = epic.matches(guerry);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void epicMatchesFalse() {
        String[] subtasks = {"Название", "someoneelse"};
        Epic epic = new Epic(12, subtasks);
        boolean actual = epic.matches(guerry);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchesTrueTopic() {
        Meeting meeting = new Meeting(12, "kkk", "project", "12.08.23 12:00");
        boolean actual = meeting.matches(guerry);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchesTrueProject() {
        Meeting meeting = new Meeting(12, "topic", "kkk", "12.08.23 12:00");
        boolean actual = meeting.matches(guerry);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void meetingMatchesFalse() {
        Meeting meeting = new Meeting(12, "topic", "project", "12.08.23 12:00");
        boolean actual = meeting.matches(guerry);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);

    }


}
