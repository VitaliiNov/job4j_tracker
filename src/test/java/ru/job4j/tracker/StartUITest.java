package ru.job4j.tracker;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(new String[]{"0", "Test", "1"});
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] action = {new CreateAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker, action);
        assertThat(tracker.findById(1).getName()).isEqualTo("Test");
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), replacedName, "1"});
        Output out = new StubOutput();
        UserAction[] actions = {new EditAction(out), new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    public void whenDeleteItem() {
            Tracker tracker = new Tracker();
            Item item = tracker.add(new Item("Deleted item"));
            Input in = new StubInput(new String[]{"0", String.valueOf(item.getId()), "1"});
            Output out = new StubOutput();
            UserAction[] actions = {new DeleteItem(out), new Exit(out)};
            new StartUI(out).init(in, tracker, actions);
            assertThat(tracker.findById(item.getId())).isNull();
        }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new Exit(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString()).isEqualTo(
                "Menu:" + System.lineSeparator()
                        + "0. Exit Program" + System.lineSeparator()
                        + "=== Exit Program ===" + System.lineSeparator()
        );
    }

    @Test
    public void whenEditItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new EditAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit item" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
    public void whenFindAllItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("New Test Name"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowAll(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + one + ln
                        + two + ln
                        + "Menu:" + ln
                        + "0. Show all items" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
    public void whenFindByNameItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String findName = "test1";
        Input in = new StubInput(
                new String[] {"0", findName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByName(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Find items by name ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find items by name" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }

    @Test
    public void whenFindByIDItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByIDAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Find item by id ===" + ln
                        + one + ln
                        + "Menu:" + ln
                        + "0. Find item by id" + ln
                        + "1. Exit Program" + ln
                        + "=== Exit Program ===" + ln
        );
    }
}