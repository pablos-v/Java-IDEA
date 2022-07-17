package GenTreeProject;

import java.util.Iterator;

public interface Printer {

    default void printToConsole(GenTree tree) {
        tree.getTree().forEach(System.out::println);
    }

    default void printToConsoleWithIterator(GenTree tree) {
        while (tree.hasNext()) {
            System.out.println(tree.next().toString());
        }
        // чтобы использовать индексы повторно
        tree.index = 0;
        tree.indexNext = 0;
    }

    default void printToConsoleWithIterator2(GenTree tree) {
        Iterator<Node> iterator = tree.getTree().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
