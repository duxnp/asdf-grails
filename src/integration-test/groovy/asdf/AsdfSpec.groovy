package asdf
import grails.gorm.transactions.Rollback
import grails.testing.mixin.integration.Integration

import geb.spock.*

/**
 * See https://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class AsdfSpec extends GebSpec {

    void "test something"() {
        when:"The home page is visited"
            go '/'

        then:"The title is correct"
            title == "Welcome to Grails"
    }

    void "test second data-testid name is Bob"() {
        when: "The home page is visited"
            go '/'
            def nameCells = $("td[data-testid='name']")

        then: "The second data-testid=\"name\" cell contains 'Bob'"
            nameCells.size() >= 2
            nameCells[1].text() == 'Bob'
    }

    void "test third data-testid name is Foo"() {
        when: "The home page is visited"
        go '/'
        def nameCells = $("td[data-testid='name']")

        then: "The third data-testid=\"name\" cell contains 'Charlie'"
        nameCells.size() >= 2
        nameCells[1].text() == 'Foo'
    }
}
