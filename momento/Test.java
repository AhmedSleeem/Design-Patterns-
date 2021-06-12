package momento;

public class Test {

    public static void main(String[] args) {
        var editor  = new Editor();

        var history = new History();

        //create a state
        editor.setTitle("ahmed");
        editor.setContent("hello momento 1 pattern");


        // save state in our history class
        history.push(editor.createState());

        editor.setTitle("omar");
        editor.setContent("hello momento 2 pattern");

        history.push(editor.createState());


        editor.setTitle("ziad");
        editor.setContent("hello momento 3 pattern");





        // undo the last change to the previous one
        editor.restore(history.pop());

        System.out.println(editor);



    }
}
