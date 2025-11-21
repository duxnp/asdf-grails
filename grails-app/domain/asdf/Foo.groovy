package asdf

class Foo {

    String name
    Integer age
    Date dateCreated
    Date lastUpdated
    Boolean active

    static constraints = {
        name(blank: false, maxSize: 100)
        age(min: 0, max: 150)
        active(nullable: false)
    }
}
