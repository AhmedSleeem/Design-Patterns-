package momento;


import java.util.Stack;

// this class is responsible for managing the previous states of the editor
public class History {

    private Stack<EditorState> states;

    public History() {
        states = new Stack<>();
    }

    public void push(EditorState state){
        states.push(state);
    }

    public EditorState pop(){
        var lastState = states.pop();

        return lastState;
    }




}
