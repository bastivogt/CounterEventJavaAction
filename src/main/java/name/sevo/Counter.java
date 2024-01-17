package name.sevo;

public class Counter {


    private int start;



    private int end;
    private int step;
    private int count;








    public int getStart() {
        return this.start;
    }


    public int getEnd() {
        return this.end;
    }

    public int getStep() {
        return this.step;
    }

    public int getCount() {
        return this.count;
    }



    protected CounterAction counterAction;


    public void addCounterAction(CounterAction action) {
        this.counterAction = action;
    }


    public void removeCounterAction() {
        this.counterAction = null;
    }


    protected void emitCounterAction(CounterAction.types type, Counter sender) {
        if(this.counterAction != null) {
            this.counterAction.actionPerformed(type, sender);
        }
    }







    public Counter(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public Counter() {
        this(0, 10, 1);
    }



    public void run() {
        this.count = this.start;
        this.emitCounterAction(CounterAction.types.COUNTER_START, this);
        for(; this.count < this.end; this.count += this.step) {
            this.emitCounterAction(CounterAction.types.COUNTER_CHANGE, this);
        }
        this.emitCounterAction(CounterAction.types.COUNTER_FINISH, this);
    }


}
