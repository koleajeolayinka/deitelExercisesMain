package MementoPattern;

public class Editor {
    private String content;
public EditorState createState(){
    return new EditorState(content);
}
    public String getContent() {
        return content;
    }
public void restore(EditorState state){
    content = state.getContent();
}

    public void setContent(String content) {
        this.content = content;
    }

    public String undo() {
        return content;
    }
}
