package name.sevo;

public interface CounterAction {

    enum types {
        COUNTER_START,
        COUNTER_CHANGE,
        COUNTER_FINISH,
    }

    void actionPerformed(types type, Counter sender);


}
