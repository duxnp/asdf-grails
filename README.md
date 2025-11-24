## Grails 6.2.3 Documentation

- [User Guide](https://docs.grails.org/6.2.3/guide/index.html)
- [API Reference](https://docs.grails.org/6.2.3/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

## Feature scaffolding documentation

- [Grails Scaffolding Plugin documentation](https://grails.github.io/scaffolding/latest/groovydoc/)

- [https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html](https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html)

## Feature asset-pipeline-grails documentation

- [Grails Asset Pipeline Core documentation](https://www.asset-pipeline.com/manual/)

## Feature geb documentation

- [Grails Geb Functional Testing for Grails documentation](https://github.com/grails3-plugins/geb#readme)

- [https://www.gebish.org/manual/current/](https://www.gebish.org/manual/current/)



docker build -f Dockerfile.test -t my-grails-tests .

docker run my-grails-tests

docker build --platform=linux/amd64 -f Dockerfile.test -t my-grails-tests .

docker run --platform=linux/amd64 my-grails-tests