# Getting Started

### Reference Documentation

Для получения информации ссылки ниже:

* [JPA фильтр](https://github.com/intuit/graphql-filter-java)
* [Spring-graphql](https://docs.spring.io/spring-graphql/docs/current-SNAPSHOT/reference/html/)
 
### Guides

Использование:

* [Стартовая страница](http://localhost:8080/graphiql)

### Пример запроса

{
employees(filter: {
    and: [
        {name: {contains: "1"}},
        {id: {lte: 30}}
    ]
    }) {
        id
        name
    }
}

 

