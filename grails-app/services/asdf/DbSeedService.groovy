package asdf

import grails.gorm.transactions.Transactional

@Transactional
class DbSeedService {

    def serviceMethod() {

    }

    /**
     * Seeds the database with sample Foo records if none exist.
     */
    void seedFoo() {
        if (Foo.count() == 0) {
            new Foo(name: 'Alice', age: 30, active: true).save(flush: true)
            new Foo(name: 'Bob', age: 45, active: false).save(flush: true)
            new Foo(name: 'Charlie', age: 25, active: true).save(flush: true)
        }
    }
}
