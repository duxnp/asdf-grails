<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
    <h1>Welcome to the Home Page!</h1>
    <p>This is the index view for the HomeController.</p>

    <h2>Foo Records</h2>
    <g:if test="${fooList}">
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Active</th>
                <th>Date Created</th>
                <th>Last Updated</th>
            </tr>
            <g:each in="${fooList}" var="foo">
                <tr>
                    <td>${foo.id}</td>
                    <td data-testid="name">${foo.name}</td>
                    <td>${foo.age}</td>
                    <td>${foo.active}</td>
                    <td>${foo.dateCreated}</td>
                    <td>${foo.lastUpdated}</td>
                </tr>
            </g:each>
        </table>
    </g:if>
    <g:else>
        <p>No Foo records found.</p>
    </g:else>
</body>
</html>
