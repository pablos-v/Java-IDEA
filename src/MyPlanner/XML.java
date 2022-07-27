package MyPlanner;

public class XML implements Doc {

    @Override
    public void start(StringBuilder sb) {
        sb.append("<xml>\n");
    }

    @Override
    public void add(StringBuilder sb, String item) {
        sb.append("    <item>").append(item).append("</item>\n");
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</xml>\n");
    }
}
