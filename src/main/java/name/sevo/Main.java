package name.sevo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Counter counter = new Counter();

        /*counter.addCounterAction(new CounterAction() {
            @Override
            public void actionPerformed(types type, Counter sender) {
                if(type == types.COUNTER_START) {
                    System.out.println(type + " count: " + sender.getCount());
                }

                if(type == types.COUNTER_CHANGE) {
                    System.out.println(type + " count: " + sender.getCount());
                }

                if(type == types.COUNTER_FINISH) {
                    System.out.println(type + " count: " + sender.getCount());
                }
            }
        });*/

        counter.addCounterAction((CounterAction.types type, Counter sender) -> {
            if(type == CounterAction.types.COUNTER_START) {
                System.out.println(type + " count: " + sender.getCount());
            }

            if(type == CounterAction.types.COUNTER_CHANGE) {
                System.out.println(type + " count: " + sender.getCount());
            }

            if(type == CounterAction.types.COUNTER_FINISH) {
                System.out.println(type + " count: " + sender.getCount());
            }


        });


        counter.run();

    }
}