package Seminar3.Task1;

public enum Relationships {
    PARENT( "Parent" ),
    WIFE( "Wife" ),
    HUSBAND( "Husband" ),
    BROTHER( "Brother" ),
    SISTER( "Sister" ),
    FATHER( "Father" ),
    SON( "Сын" ),
    CHILDREN( "Дети" );
    private String description;

    Relationships(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
