package asdf

class HomeController {
    def index() {
        [fooList: Foo.list()]
    }
}
