package FamilyTree;

public class Relation {
    //upper
    Relation parent;
    //lower
    Relation child;
    //sibling
    Relation bro;



    public Relation getParent() { return parent;}
    public Relation getChild() { return child; }
    public void setChild(Relation child) { this.child = child; }
    public Relation getBro() { return bro; }
    }
