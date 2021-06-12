package momento;

public class Editor {

    private String title;
    private String content;


    public EditorState createState(){

        return new EditorState(title,content);
    }

    public void restore(EditorState editorState){
        title = editorState.getTitle();
        content = editorState.getContent();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
