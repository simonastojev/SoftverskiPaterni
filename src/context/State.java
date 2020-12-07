package context;

/*
 * @author Simona
 */
public abstract class State {

    abstract State paperState(String answer);

    abstract String getState();

}

class Writen extends State {

    @Override
    State paperState(String answer) {
        State s = null;

        if (answer.equals("Write paper")) {
            s = this;
        }
        if (answer.equals("Cancel paper")) {
            s = new Cancelled();
        }

        return s;
    }

    @Override
    String getState() {
        return "Written";
    }
}

class Cancelled extends State {

    @Override
    State paperState(String answer) {
        State s = null;
        if (answer.equals("Cancel paper")) {
            s = this;
        }
        return s;
    }

    @Override
    String getState() {
        return "Canceled"; //To change body of generated methods, choose Tools | Templates.
    }

}

class Reviewed extends State {

    @Override
    State paperState(String answer) {
        State s = null;

        if (answer.equals("Accept paper")) {
            s = new Accepted();
        }

        if (answer.equals("Write paper")) {
            s = new Writen();
        }

        if (answer.equals("Review paper")) {
            s = this;
        }

        if (answer.equals("Reject paper")) {
            s = new Rejected();
        }
        return s;
    }

    String getState() {
        return "Reviewed";
    }

    class Accepted extends State {

        @Override
        State paperState(String answer) {
            State s = null;

            if (answer.equals("Accept paper")) {
                s = this;
            }

            return s;
        }

        @Override
        String getState() {
            return "Accepted";
        }
    }

    class Rejected extends State {

        @Override
        State paperState(String answer) {
            State s = null;

            if (answer.equals("Rejected")) {
                s = this;
            }

            return s;
        }

        @Override
        String getState() {
            return "Rejected";
        }

    }
}
