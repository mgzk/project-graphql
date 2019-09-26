# H2 database

http://localhost:8080/h2 

# request
POST http://localhost:8080/graphql
Content-Type application/graphql

`query{
  books(count: 10) {
    id,
    ISBN,
    genre,
    title
	}
}`

#another request body

`query{
  book(id: 2) {
    id,
    title
	}
}`

`mutation{
  createBook(ISBN: "42325-252-25", genre: "thriller", title: "The Silence of the Lambs") {
	id
  }
}`