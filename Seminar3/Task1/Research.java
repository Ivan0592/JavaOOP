package Seminar3.Task1;

import java.util.HashMap;
import java.util.Objects;

public class Research {
    private final HashMap<Node, Node> tree;

    public Research(Repository<Person> geoTree) {
        tree = geoTree.getDs();
    }

    public String findChildren(Father person) {
        StringBuilder result = new StringBuilder();
        for (Node t : tree.keySet()) {
            if (Objects.equals( t.p1.getFirstName(), person.getFirstName() )) {
                result.append( t.p2 ).append( " " );
            }
        }
        return String.format( "Father '%s' has children : '%s'", person, result );
    }

    public String findFather(Children person) {
        StringBuilder result = new StringBuilder();
        for (Node t : tree.values()) {
            if (Objects.equals( t.p1.getFirstName(), person.getFirstName() )) {
                result.append( t.p2 ).append( " " );
            }
        }
        return String.format( "Children '%s'  has father: '%s'", person, result );
    }
}
