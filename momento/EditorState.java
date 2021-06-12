package momento;


// this class is responsible for describe the content of each state in the editor

public class EditorState {

    private final String title;
    private final String content;

    //constructor
    public EditorState(String title, String content) {
        this.title = title;
        this.content = content;
    }



    // Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }









}
