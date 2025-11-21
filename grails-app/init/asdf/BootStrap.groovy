package asdf

import asdf.DbSeedService

class BootStrap {

    def dbSeedService

    def init = { servletContext ->
        // Seed the database with sample Foo records using the service
        dbSeedService.seedFoo()
    }
    def destroy = {
    }
}